package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.CdiscountPage;
import utilities.Driver;

public class CdiscountStepdefinition {
    CdiscountPage cdiscountPage=new CdiscountPage();

    @And("kullanici cerezleri onaylar")
    public void kullaniciCerezleriOnaylar() {
        cdiscountPage.cerezler.click();

    }

    @And("kullanici arama kutusuna bilgisayar yazar")
    public void kullaniciAramaKutusunaBilgisayarYazar() {
        cdiscountPage.aramaKutusu.sendKeys("ordinateur portable"+ Keys.ENTER);
    }

    @And("kullanici cikan ilk urunu secer")
    public void kullaniciCikanIlkUrunuSecer() {
        cdiscountPage.ilkResim.click();
    }

    @And("kullanici urunu sepete ekler")
    public void kullaniciUrunuSepeteEkler() {
        cdiscountPage.sepeteEkle.click();
    }

    @And("kullanici tekar siteye doner")
    public void kullaniciTekarSiteyeDoner() {
        Driver.getDriver().navigate().back();
    }

    @And("kullanici arama kutusuna telefon yazar")
    public void kullaniciAramaKutusunaTelefonYazar() {
        cdiscountPage.aramaKutusu.sendKeys("iphone");
    }

    @Then("ikinci urunu tiklar")
    public void ikinciUrunuTiklar() {
    }

    @And("sepete ekler")
    public void sepeteEkler() {
    }

    @And("kullanici sepete gider")
    public void kullaniciSepeteGider() {
    }

    @And("kullanici sepeti siler")
    public void kullaniciSepetiSiler() {
    }
}
