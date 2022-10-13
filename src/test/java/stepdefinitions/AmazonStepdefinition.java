package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.Reusablemethods;

import java.io.IOException;

public class AmazonStepdefinition {
    AmazonPage amazonPage=new AmazonPage();
    @Given("kullanici amazon anasayfasina gider")
    public void kullaniciAmazonAnasayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @Then("kullanici nutella aratir")
    public void kullaniciNutellaAratir() {
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
    }

    @And("arama sonuclarini test eder")
    public void aramaSonuclariniTestEder() {
        String actual=amazonPage.aramaSonucuElementi.getText();
        Assert.assertTrue(actual.contains("Nutella"));
    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() throws InterruptedException {
        Thread.sleep(3000);
        Driver.closeDriver();
    }

    @Then("kullanici java aratir")
    public void kullaniciJavaAratir() {
        amazonPage.aramaKutusu.sendKeys("Java"+Keys.ENTER);
    }

    @And("arama sonuclarini java test eder")
    public void aramaSonuclariniJavaTestEder() {
        String actualText=amazonPage.aramaSonucuElementi.getText();
        Assert.assertTrue(actualText.contains("Java"));
    }

    @Then("kullanici selenyumu aratir")
    public void kullaniciSelenyumuAratir() {
        amazonPage.aramaKutusu.sendKeys("Selenium"+Keys.ENTER);
    }

    @And("sonuclarin selenyum icerdigini test eder")
    public void sonuclarinSelenyumIcerdiginiTestEder() {
        String actualYazi=amazonPage.aramaSonucuElementi.getText();
        Assert.assertTrue(actualYazi.contains("Selenium"));
    }

    @Then("kullanici iphone aratir")
    public void kullaniciIphoneAratir() {
        amazonPage.aramaKutusu.sendKeys("iphone"+Keys.ENTER);
    }

    @And("sonuclarin iphone icerdigini test eder")
    public void sonuclarinIphoneIcerdiginiTestEder() {
        String actualYazi=amazonPage.aramaSonucuElementi.getText();
        Assert.assertTrue(actualYazi.contains("iphone"));
    }

    @And("kullanici {string} aratir")
    public void kullaniciAratir(String istenenKelime) {
        amazonPage.aramaKutusu.sendKeys(istenenKelime + Keys.ENTER);
    }

    @And("arama sonuclarinin {string} icerdegini test eder")
    public void aramaSonuclarininIcerdeginiTestEder(String istenenKelime) {
        String actualText=amazonPage.aramaSonucuElementi.getText();
        Assert.assertTrue(actualText.contains(istenenKelime));
    }

    @Given("kullanici {string} sayfasinda")
    public void kullaniciSayfasinda(String istenenUrl) {
      Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }



    @And("url in {string} icerdigini test eder")
    public void urlInIcerdiginiTestEder(String istenenKelime) {
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(istenenKelime));
    }

    @Then("kullanici {int} sn bekler")
    public void kullaniciSnBekler(int istenenSaniye) {
        try {
            Thread.sleep(istenenSaniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("kulanici {string} sayfasini yeniler")
    public void kulaniciSayfasiniYeniler(String istenenYenileme) {
        Driver.getDriver().get(istenenYenileme);
        Driver.getDriver().navigate().refresh();
    }

    @When("sign in butonuna tiklar")
    public void signInButonunaTiklar() {
        amazonPage.signinTik.click();

    }

    @And("faker kullanarak e-posta gonderir")
    public void fakerKullanarakEPostaGonderir() {

        amazonPage.email.sendKeys(Reusablemethods.getFaker().internet().emailAddress());

    }

    @And("gonderdigi e-postanın ekran goruntusunu alir")
    public void gonderdigiEPostaninEkranGoruntusunuAlir() throws IOException {
        Reusablemethods.getScreenshotWebElement("email",amazonPage.email);

    }

    @And("continiue'a tiklar")
    public void continiueATiklar() {
        amazonPage.devamTik.click();
    }

    @Then("There was a problem mesajini dogrular")
    public void thereWasAProblemMesajiniDogrular() {
        Assert.assertTrue(amazonPage.alert.isDisplayed());
    }

    @And("Need help e tiklar")
    public void needHelpETiklar() {
        amazonPage.help.click();
    }

    @And("forgot your password e tiklar")
    public void forgotYourPasswordETiklar() {
        amazonPage.forgatPassword.click();

    }

    @Then("Password assistance metnini dogrular")
    public void passwordAssistanceMetniniDogrular() {
       // String actualText=amazonPage.passwordAsistan.getText();
        Assert.assertTrue(amazonPage.passwordAsistan.isDisplayed());
    }

    @And("Geri gider")
    public void geriGider() {
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();


    }

    @And("Create your account butonuna tiklar")
    public void createYourAccountButonunaTiklar() {
        amazonPage.createYourAccountTik.click();
    }

    @Then("Create account metnini dogrular")
    public void createAccountMetniniDogrular() {
        Assert.assertTrue(amazonPage.createAcountText.isDisplayed());
    }
}
