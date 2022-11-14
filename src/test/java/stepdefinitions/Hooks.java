package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    /*
    Cucumber da stepdefinitions package i icerisinde before after gibi bir notasyon varsa  extends testBase dememize gerek kalmadan
     her scenario dan once ve sonra
    bu methodlar calisacaktir
     */
    @After
    public void tearDown(Scenario scenario){
        final byte[] screenshot= ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()){
            scenario.attach(screenshot,"image/png","screenshot");
        }
        Driver.closeDriver();
    }
}
