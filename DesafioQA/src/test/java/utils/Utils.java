package utils;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;



public class Utils {

    public static WebDriver driver;

    public String USUARIO = "SEU_USUARIO";
    public String SENHA = "SUA_SENHA";

    public WebDriver inicial(){
        System.setProperty("webdriver.chrome.driver", ("$SEU_CAMINHO\\DesafioQA\\src\\test\\resources\\chromedriver.exe"));
        ChromeOptions options = new ChromeOptions();
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        options.addArguments("--kiosk");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.addArguments("--disable-gpu");
//              options.addArguments("--headless");
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);

        driver =  new ChromeDriver(options);
        return driver;
       }

       public static void webDriverFechar() {
        driver.close();
        driver.quit();
      }

      public WebDriver webdriver(){
        return this.driver;
      }

      public void url(){
          webdriver().get("https://www.serasa.com.br/");
      }


}
