package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import pages.TutorialPage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TutorialStepDefination {
    TutorialPage tutorialPage=new TutorialPage();


    @And("Phones & PDAs'a tıklar")
    public void phonesPDAsATiklar() {
        tutorialPage.phonesPda.click();
    }

    @Then("Telefonların markalarını alır")
    public void telefonlarinMarkalariniAlir() {
        List<String>markalar=new ArrayList<>();
        for (WebElement w:tutorialPage.telefonMarkalari) {
            markalar.add(w.getText());


        }
        markalar.stream().forEach(t-> System.out.println(t));

    }

    @And("Tüm öğeleri sepete ekler")
    public void tumogeleriSepeteEkler() {
        List<WebElement>sepet=tutorialPage.sepeteEkle;
        for (WebElement w:sepet) {
            w.click();

        }
    }

    @And("Sepete tıklar")
    public void sepeteTiklar() {
        tutorialPage.sepeteTikla.click();
    }
    @And("Sepetteki isimleri alır")
    public void sepettekiIsimleriAlir() {
        List<String>sepettekiMarkalar=new ArrayList<>();
        for (WebElement w: tutorialPage.sepetListesi
             ) {
            sepettekiMarkalar.add(w.getText());
            
        }
        sepettekiMarkalar.stream().forEach(t-> System.out.println(t));
    }

    @And("Sepetteki ve sayfadaki ürünlerin doğru olduğunu karşılaştırır")
    public void sepettekiVeSayfadakiurunlerinDogruOldugunuKarsilastirir() {

    }
}
