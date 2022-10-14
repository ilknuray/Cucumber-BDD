package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class Gurustepdefinition {
    GuruPage guruPage = new GuruPage();

    @When("cerezleri onaylar.")
    public void cerezleriOnaylar() {
        Driver.getDriver().switchTo().frame(guruPage.iframe);
        guruPage.acceptCookies.click();
        Driver.getDriver().switchTo().defaultContent();

    }

    @And("{string} sutunundaki tum degerleri yazdirir")
    public void sutunundakiTumDegerleriYazdirir(String istenenbaslik) {
        List<WebElement> baslikListesi = guruPage.tumBasliklar;
        //listemiz web elementlerden olusuyor bu web elementlerden hangisi istenen sutun basligini tasiyor bilemeyiz
        int istenenBaslikIndexi=-3;
        for (int i = 0; i < baslikListesi.size(); i++) {
            if (baslikListesi.get(i).getText().equals(istenenbaslik)){
                istenenBaslikIndexi=i=1;
                break;
            }
        }
        //forloop ile tum sutun basliklarini bana verilen istenen baslik ile karsilastirdim loop bittiginde basligin bulunup bulunmadigini
        //kontrol etmek ve bulundu ise yoluma dvm etmeliyim
        if (istenenBaslikIndexi!=-3){//baslik bulundu

          List<WebElement>istenenSutundakiElementler=Driver.getDriver().findElements(By.xpath("//tbody//tr//td["+istenenBaslikIndexi+"]"));
          istenenSutundakiElementler.stream().forEach(t-> System.out.println(t.getText()));

        }else {
            System.out.println("istenen baslik bulunamadi");
        }


    }
}
