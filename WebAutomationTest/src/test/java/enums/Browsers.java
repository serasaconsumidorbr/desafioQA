package enums;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.ReadProperties;

import java.io.File;

public enum Browsers {
    CHROME_MAC("webdriver.chrome.driver", "/chromedriver"),
    MOZILLA_MAC("webdriver.gecko.driver", "/geckodriver");

    public static WebDriver webDriver;
    private String browserType;
    private String executable;

    Browsers(String browserType , String executable){
        this.browserType = browserType;
        this.executable = executable;
    }

    public String getBrowserType(){
        return browserType;
    }

    public String getExecutable(){
        return executable;
    }

    public WebDriver createDriverInstance() {
        switch (browserType) {
            case "webdriver.gecko.driver":
                return new FirefoxDriver();
            case "webdriver.chrome.driver":
                ChromeOptions options = new ChromeOptions();
                DesiredCapabilities capabilities = DesiredCapabilities.chrome();
                options.addArguments("--kiosk");
                options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
//              options.addArguments("--disable-gpu");
//              options.addArguments("--headless");
                capabilities.setCapability(ChromeOptions.CAPABILITY, options);

                return new ChromeDriver(options);
            default:
                return null;
        }
    }

    public static void setWebDriver() {
            webDriver = createDriver(System.getProperty("browser"));
            if(System.getProperty("environment").contains("HML")){
                String url = ReadProperties.readValue("url_base_hml");
                webDriver.get(url);
            }
            else if(System.getProperty("environment").contains("PRD")){
                String url = ReadProperties.readValue("url_base_prd");
                webDriver.get(url);
            }
            else if(System.getProperty("environment").contains("DEV")){
                String url = ReadProperties.readValue("url_base_dev");
                webDriver.get(url);
            }
            else{
                System.out.println("Invalid Environment!");
        }
        }

    public static void quitDriver() {
        webDriver.quit();
        webDriver = null;
    }

    public static WebDriver createDriver(String mvnParameter){
        if (mvnParameter == null){
            System.setProperty(Browsers.CHROME_MAC.getBrowserType(),
                    getDriversPath().concat(Browsers.CHROME_MAC.getExecutable()));
            ChromeOptions options = new ChromeOptions();
            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            options.addArguments("--kiosk");
            options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
            capabilities.setCapability(ChromeOptions.CAPABILITY, options);

            return new ChromeDriver(options);
        }
        String browserType = getBrowserTypeFromParameter(mvnParameter);
        System.setProperty(browserType, getDriversPath().concat(getFullExecutableNameFromParameter(mvnParameter)));

        return Browsers.valueOf(mvnParameter).createDriverInstance();
    }
    private static String getBrowserTypeFromParameter(String mvnParameter ){
        return Browsers.valueOf(mvnParameter).getBrowserType();
    }

    private static String getFullExecutableNameFromParameter (String mvnParameter){
        return Browsers.valueOf(mvnParameter).getExecutable();
    }

    protected static String getDriversPath() {
        return new File("src/test/resources/driver/").getAbsolutePath();
    }
}
