package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDriver {
    public static org.openqa.selenium.WebDriver driver;

    public org.openqa.selenium.WebDriver iniciaChrome(){

        String path = System.getProperty("user.dir");
        String driverpath = path + "\\src\\test\\resources\\Driver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",driverpath );

        ChromeOptions options = new ChromeOptions();
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        options.addArguments("--kiosk");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        driver =  new ChromeDriver(options);
        return driver;
    }

    public static void fechaChrome() {
        driver.close();
        driver.quit();
    }

    public org.openqa.selenium.WebDriver webdriver(){
        return this.driver;
    }




}
