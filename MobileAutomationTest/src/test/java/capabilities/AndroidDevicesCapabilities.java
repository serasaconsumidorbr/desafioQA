package capabilities;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

public enum AndroidDevicesCapabilities {


    ANDROID("src/test/java/capabilities/devices/AndroidDevice.json");



    private String path;

    AndroidDevicesCapabilities(String path) {
        this.path = path;
    }

    public DesiredCapabilities getAndroidCapabilitiesFromEnvironment() {
        DesiredCapabilities androidCapabilities = LoadCapabilities.pathToDesiredCapabilitites(this.path);

        if (System.getProperty("environment").contains("HML")) {
            androidCapabilities.setCapability("app", new File("PATH TO HML .APK").getAbsolutePath());
            return androidCapabilities;
        }
        else if (System.getProperty("environment").contains("PRD")) {
            androidCapabilities.setCapability("app", new File("src/test/resources/apps/Android/Serasa_base.apk").getAbsolutePath());
            return androidCapabilities;
        }
        else if (System.getProperty("environment").contains("DEV")) {
            androidCapabilities.setCapability("app", new File("PATH TO DEV .APK").getAbsolutePath());
            return androidCapabilities;
        }
        System.out.println("This is not a valid environment");

        return null;

    }

}