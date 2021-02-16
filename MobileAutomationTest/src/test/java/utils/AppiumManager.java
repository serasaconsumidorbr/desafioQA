package utils;

import capabilities.AndroidDevicesCapabilities;
import capabilities.IOSDevicesCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumManager {

    private static AppiumDriver<?> appiumDriver;
    private static AppiumServiceBuilder builder = new AppiumServiceBuilder();
    private static DesiredCapabilities cap = new DesiredCapabilities();

    public static AppiumDriver<?> startDriverByMavenParameter(String mavenDevice) {
        if (appiumDriver == null) {
            try {
                if (mavenDevice.contains("ANDROID")) {
                    appiumDriver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), AndroidDevicesCapabilities.valueOf(mavenDevice).getAndroidCapabilitiesFromEnvironment());
                } else if (mavenDevice.contains("IPHONE")) {
                    appiumDriver = new IOSDriver<>(new URL("http://localhost:4723/wd/hub"), IOSDevicesCapabilities.valueOf(mavenDevice).getIOSCapabilitiesFromEnvironment());
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        return appiumDriver;
    }

    public static AppiumDriver<?> getDriver() {
        return appiumDriver;
    }

    public static void quitDriver() {
        if (appiumDriver != null) {
            appiumDriver.quit();
            appiumDriver = null;
        }
    }

    public static void startServer() {
        cap.setCapability("noReset", "false");
        builder.withIPAddress("0.0.0.0");
        builder.usingPort(4723);
        builder.withCapabilities(cap);
        builder.withArgument(GeneralServerFlag.SESSION_OVERRIDE);
        builder.withArgument(GeneralServerFlag.LOG_LEVEL,"error");
        AppiumDriverLocalService.buildService(builder).start();
    }

    public static void stopServer(){
        Runtime runtime = Runtime.getRuntime();
        try {
            runtime.exec("killall node");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}