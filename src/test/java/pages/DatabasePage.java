package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DatabasePage {
    public DatabasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//button[@class='dt-button buttons-create']")
    public WebElement newButonu;
    @FindBy(css = "#DTE_Field_first_name")
    public WebElement name;
}
