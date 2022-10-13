package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationPage {
    public AutomationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

@FindBy(xpath = "(//*[@class='fa fa-list'])[1]")
    public WebElement testCaseTik;
    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement testCaseGorunuyorMu;
}
