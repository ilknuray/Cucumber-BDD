package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class EditorPage {
    public EditorPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
@FindBy (xpath = "//*[text()='New']")
    public WebElement newButonu;
    @FindBy(xpath = "//input[@id='DTE_Field_first_name']")
    public WebElement isimButonu;

    @FindBy(xpath = "//input[@id='DTE_Field_last_name']")
    public WebElement soyisimButtonu;

    @FindBy(xpath = "//input[@id='DTE_Field_position']")
    public WebElement positionButtonu;

    @FindBy(xpath = "//input[@id='DTE_Field_office']")
    public WebElement officeButtonu;

    @FindBy(xpath = "//input[@id='DTE_Field_start_date']")
    public WebElement startDateButtonu;

    @FindBy(xpath = "//input[@id='DTE_Field_extn']")
    public WebElement extenButtonu;

    @FindBy(xpath = "//input[@id='DTE_Field_salary']")
    public WebElement salaryButtonu;

    @FindBy(xpath = "//*[text()='Create']")
    public WebElement createButtonu;

    @FindBy(xpath = "//*[@type='search']")
    public WebElement searchBuutonu;

  @FindBy(xpath = "//td[@class='sorting_1']")
  public WebElement ilkIsim;

}

