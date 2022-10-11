package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.jodah.failsafe.internal.util.DelegatingExecutorService;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import pages.YoutubePage;
import utilities.Driver;

public class YoutubeStepdefinition {


    YoutubePage youtubePage = new YoutubePage();


    @Given("kullanici cerezleri kabul eder")
    public void kullanici_cerezleri_kabul_eder() {
        youtubePage.cerezKabulEt.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @Then("kullanici istedigi sarkiyi aratir")
    public void kullanici_istedigi_sarkiyi_aratir() {

        youtubePage.aramaKutusu.sendKeys("neredesin sen");
        youtubePage.ara.click();

    }

    @Then("kullanici sarkiya tiklar")
    public void kullanici_sarkiya_tiklar() {
    //   Driver.getDriver().switchTo().frame(youtubePage.iframe);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(youtubePage.sarkiyaTik).perform();
        youtubePage.sarkiyaTik.click();
       // Driver.getDriver().switchTo().defaultContent();


    }

    @Then("reklami gecer")
    public void reklami_gecer() {
        if (youtubePage.reklamiAtla.isDisplayed()){
            youtubePage.reklamiAtla.click();
        }else{
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }



    }

    @Then("sayfayi tam ekran yapar")
    public void sayfayi_tam_ekran_yapar() {
        youtubePage.tamEkran.click();
        //Driver.getDriver().manage().window().maximize();

    }

    @Then("kullanici {string} sn bekler")
    public void kullanici_sn_bekler(String string) {
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


}