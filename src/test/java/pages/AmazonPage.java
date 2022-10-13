package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {  public AmazonPage() {
    PageFactory.initElements(Driver.getDriver(), this);
}

    @FindBy(id = "twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement aramaSonucuElementi;
    @FindBy(xpath = "//*[@id='nav-link-accountList-nav-line-1']")
    public WebElement signinTik;
    @FindBy(xpath = "//input[@id='ap_email']")
    public WebElement email;
    @FindBy(xpath = "//*[@id='continue' and @class='a-button a-button-span12 a-button-primary']")
    public WebElement devamTik;
    @FindBy(xpath = "//h4")
    public WebElement alert;

    @FindBy(xpath = "//*[@class='a-expander-prompt']")
    public WebElement help;
    @FindBy(xpath = "//*[@id='auth-fpp-link-bottom']")
    public WebElement forgatPassword;

    @FindBy(xpath = "//h1")
    public WebElement passwordAsistan;
    @FindBy(xpath = "//*[@id='createAccountSubmit']")
    public WebElement createYourAccountTik;
    @FindBy(xpath = "//h1")
    public WebElement createAcountText;

}
