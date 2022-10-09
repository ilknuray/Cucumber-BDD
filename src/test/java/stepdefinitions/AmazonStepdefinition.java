package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

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
}
