package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TutorialPage {
    public TutorialPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Phones & PDAs']")
    public WebElement phonesPda;

    @FindBy(tagName = "//h4")
    public List<WebElement> telefonMarkalari;

    @FindBy(xpath = "//*[text()='Add to Cart']")
    public List<WebElement>sepeteEkle;

    @FindBy(xpath = "//*[text()=' 3 item(s) - $583.19']")
    public WebElement sepeteTikla;

    @FindBy(xpath = "//*[@class='text-left']")
    public List<WebElement>sepetListesi;
}
