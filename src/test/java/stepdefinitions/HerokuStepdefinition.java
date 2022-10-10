package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HerokuPage;
import utilities.Driver;

import java.time.Duration;
import java.util.function.Function;

public class HerokuStepdefinition {
    HerokuPage herokuPage = new HerokuPage();

    @Given("add element butonuna basar")
    public void add_element_butonuna_basar() {
        herokuPage.addButtonu.click();

    }

    @Given("delete butonu gorunur oluncaya kadar bekler")
    public void delete_butonu_gorunur_oluncaya_kadar_bekler() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        WebElement delete = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Delete']")));


    }

    @Given("delete butonunun gorunur oldugunu test eder")
    public void delete_butonunun_gorunur_oldugunu_test_eder() {
       Assert.assertTrue(herokuPage.deleteButtonu.isDisplayed());

    }

    @Then("delete butonuna basar")
    public void delete_butonuna_basar() {
       herokuPage.deleteButtonu.click();

    }

    @Then("delete butonunun gorunmedigini test eder")
    public void delete_butonunun_gorunmedigini_test_eder() {
       // Assert.assertTrue(herokuPage.deleteButtonu.isDisplayed());


    }


}
