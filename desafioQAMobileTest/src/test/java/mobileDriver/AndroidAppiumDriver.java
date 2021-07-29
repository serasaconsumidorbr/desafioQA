package mobileDriver;


import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;
import java.net.URL;


public class AndroidAppiumDriver {

    private static AppiumDriver<?> appiumDriver;


        public AppiumDriver<?> iniciaDriver() throws MalformedURLException {

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName","RQ8M301VW1P");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("app", "C:\\Users\\Julio\\IdeaProjects\\desafioQAMobileTest\\src\\test\\resources\\apk\\Serasa_base.apk");
            capabilities.setCapability("noReset", "false");
            capabilities.setCapability("automationName", "UiAutomator2");

            appiumDriver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), capabilities);
            return appiumDriver;
        }

        public static void fechaDriver() {
            appiumDriver.quit();
        }

        public static AppiumDriver<?> driver(){
            return appiumDriver;
        }



}
