package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HerokuPage {
    public HerokuPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//button[text()='Add Element']")
    public WebElement addButtonu;

    @FindBy(xpath = "//button[text()='Delete']")
    public WebElement deleteButtonu;

    @FindBy(xpath = "//input[@id='button']")
    public WebElement clickMe;

    @FindBy(xpath = "//*[.=' down 32']")
    public List<WebElement>toplamDown;


}
