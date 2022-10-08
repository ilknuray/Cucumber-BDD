package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {
    /*
    pom da Driver icin testBase classina extends etmek yerine driver classindan static methodlar kullanarak
    driver olusturulup ilgili ayarlarin yapilmasi ve en
    sonda driver in kapatilmasi tercih edilmistir.

    pom da driver classindaki driver methodunun obje olusturularak kullanilmasini engellemek icin Singleton pattern kullanimi benimsenmistir.
    (tekli kullanim)bir classsin farkli classlardan obje olusturularak kullanimini engellemek icin kullanilir.
    bunu saglamak icin yapmamiz gereken cok basittir.obje olusturulmak icin yapilan driveri private yaptigimizda diger classlardan
    obje olusturulamaz
     */
  private Driver(){

    }
    static  WebDriver driver;

    public static WebDriver getDriver(){

       if(driver==null) {
           switch (ConfigReader.getProperty("browser")){
               case "chrome" :
                   WebDriverManager.chromedriver().setup();
                   driver = new ChromeDriver();
                   break;
               case "safari" :
                   WebDriverManager.safaridriver().setup();
                   driver=new SafariDriver();
                   break;
               case "firefox" :
                   WebDriverManager.firefoxdriver().setup();
                   driver=new FirefoxDriver();
                   break;
               default:
                   WebDriverManager.chromedriver().setup();
                   driver=new ChromeDriver();

           }


           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

       }
        return driver;

    }
    public static void closeDriver(){
      if(driver!=null){
      driver.close();
      driver=null;
      }
    }

    public static void quitDriver() {
    }
}
