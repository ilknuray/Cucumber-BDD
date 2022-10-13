package stepdefinitions;

import com.beust.ah.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AutomationPage;
import utilities.Driver;
import utilities.Reusablemethods;

import java.io.IOException;

public class AutomationExStepdefinition {
    AutomationPage automationPage=new AutomationPage();
    @Given("Tarayıcıyı başlatarak {string} url'sine gidin")
    public void tarayiciyiBaslatarakUrlSineGidin(String istenenUrl) {
        Driver.getDriver().get(istenenUrl);
    }

    @Then("Ana sayfanın başarıyla görünür olduğunu doğrulayın")
    public void anaSayfaninBasariylaGorunurOldugunuDogrulayin() {
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrl="automationexercise";
        Assert.assertTrue(actualUrl.contains(expectedUrl));
    }

    @And("Test Case buttonu na tıklayın")
    public void testCaseButtonuNaTiklayin() {
        automationPage.testCaseTik.click();

    }

    @Then("Kullanıcının test case sayfasına başarıyla yönlendirildiğini doğrulayın")
    public void kullanicininTestCaseSayfasinaBasariylaYonlendirildiginiDogrulayin() {
        Assert.assertTrue(automationPage.testCaseGorunuyorMu.isDisplayed());
    }

    @And("İlgili sayfanın ekran görüntüsünü alın")
    public void ilgiliSayfanniEkranGoruntusunuAlin() throws IOException {
        Reusablemethods.getScreenshot("test case");

    }
}
