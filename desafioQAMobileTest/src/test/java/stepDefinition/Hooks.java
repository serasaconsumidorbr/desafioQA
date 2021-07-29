package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import mobileDriver.AndroidAppiumDriver;


import java.net.MalformedURLException;

public class Hooks {

    AndroidAppiumDriver androidAppiumDriver = new AndroidAppiumDriver();

        @Before
        public void iniciaAppium() throws MalformedURLException {
            androidAppiumDriver.iniciaDriver();
        }

        @After
        public void fechaAppium(){
            androidAppiumDriver.fechaDriver();
        }
}
