package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DatabasePage;
import utilities.Driver;

public class Databasestepdefinition {
    DatabasePage databasePage=new DatabasePage();
    @When("kullanici {string} adresine gider")
    public void kullaniciAdresineGider(String istenenUrl) {
        Driver.getDriver().get(istenenUrl);
    }

    @Then("new butonuna basar")
    public void newButonunaBasar() {
        databasePage.newButonu.click();
    }

    @And("{string} girer")
    public void girer(String firstname) {
        databasePage.name.sendKeys(firstname);

    }

    @And("Create tusuna basar")
    public void createTusunaBasar() {
    }

    @Then("isim bolumunde isminin oldugunu dogrular")
    public void isimBolumundeIsmininOldugunuDogrular() {
    }
}
