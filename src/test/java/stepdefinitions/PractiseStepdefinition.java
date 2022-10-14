package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.HerokuPage;
import utilities.Reusablemethods;

import java.util.List;

public class PractiseStepdefinition {
    HerokuPage herokuPage=new HerokuPage();
    @When("{int} defa click me ye tiklayin")
    public void defaClickMeYeTiklayin(int istenenSayi) {
        int sayac=0;
        istenenSayi=50;
        for (int i = 0; i <=istenenSayi ; i++) {
            herokuPage.clickMe.click();
            sayac++;

        }
    }

    @And("{int} defa Space dugmesine basin")
    public void defaSpaceDugmesineBasin(int istenensayi) {
        istenensayi=50;
        for (int i = 0; i <=istenensayi ; i++) {
        Reusablemethods.getActions().sendKeys(Keys.SPACE).click().perform();

    }
    }

    @And("Down yazisindaki iki basamakli sayilarin hepsini toplayin")
    public void downYazisindakiIkiBasamakliSayilarinHepsiniToplayin() {

        List<WebElement>toplam=herokuPage.toplamDown;
        for (WebElement w:toplam) {
            w.getText().replaceAll(" [^0-9]","");


        }


    }

    @And("Tum click metinlerinin uzunlugunun toplamini onceki toplamdan cikarin")
    public void tumClickMetinlerininUzunlugununToplaminiOncekiToplamdanCikarin() {

    }

    @Then("sonucun {int} oldugunu dogrulayin")
    public void sonucunOldugunuDogrulayin(int arg0) {
    }
}
