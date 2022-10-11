package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class YoutubePage {
    public YoutubePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[text()='Tout accepter']")
    public WebElement cerezKabulEt;
    @FindBy(xpath = "//input[@id='search']")
    public WebElement aramaKutusu;
    @FindBy(xpath = "//button[@id='search-icon-legacy']")
    public WebElement ara;

    @FindBy(xpath = "//*[text()='Neşet ERTAŞ - Neredesin sen']")
    public WebElement sarkiyaTik;

    @FindBy(xpath = "//iframe[@name='passive_signin']")
    public WebElement iframe;

    @FindBy(xpath = "//span[@class='ytp-ad-skip-button-icon']")
    public WebElement reklamiAtla;

    @FindBy(xpath = "//button[@class='ytp-fullscreen-button ytp-button']")
    public WebElement tamEkran;

    @FindBy(xpath = "(//div[@class='yt-spec-touch-feedback-shape__fill'])[24]")
    public WebElement nonMerci;

}
