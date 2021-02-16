package capabilities;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

public enum IOSDevicesCapabilities {

    IPHONE("src/test/java/capabilities/devices/IphoneDevice.json");

    private String path;

    IOSDevicesCapabilities(String path) {
        this.path = path;
    }

    public DesiredCapabilities getIOSCapabilitiesFromEnvironment() {

        if (System.getProperty("environment").contains("HML")) {
            DesiredCapabilities iosCapabilities =  LoadCapabilities.pathToDesiredCapabilitites(this.path);
            iosCapabilities.setCapability("app", new File("PATH TO HML .APP").getAbsolutePath());
            return iosCapabilities;
        }

        else if (System.getProperty("environment").contains("PRD")) {
            DesiredCapabilities iosCapabilities =  LoadCapabilities.pathToDesiredCapabilitites(this.path);
            iosCapabilities.setCapability("app", new File("PATH TO PRD .APP").getAbsolutePath());
            return iosCapabilities;
        }
        else if (System.getProperty("environment").contains("DEV")) {
            DesiredCapabilities iosCapabilities =  LoadCapabilities.pathToDesiredCapabilitites(this.path);
            iosCapabilities.setCapability("app", new File("PATH TO DEV .APP").getAbsolutePath());
            return iosCapabilities;
        }

        return null;


    }

}
