package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CdiscountPage {
    public CdiscountPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//button[@id='footer_tc_privacy_button_2']")
    public WebElement cerezler;
    @FindBy(xpath = "//input[@type='search']")
    public WebElement aramaKutusu;
    @FindBy(xpath = "//img[@class='prdtBImg' and @src='https://www.cdiscount.com/pdt2/7/2/3/1/300x300/win0791809529723/rw/pc-portable-vastking-k100-14-fhd-ips-intel.jpg']")
    public WebElement ilkResim;
    @FindBy(xpath = "//input[@id='fpAddBsk']")
    public WebElement sepeteEkle;


}
