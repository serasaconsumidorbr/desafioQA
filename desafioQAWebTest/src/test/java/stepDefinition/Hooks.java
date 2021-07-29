package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import webDriver.WebDriver;

public class Hooks {

    webDriver.WebDriver WebDriver = new WebDriver();

        @Before
        public void iniciaChrome(){
               WebDriver.iniciaChrome();
        }

        @After
        public void closeDriver(){
            WebDriver.fechaChrome();
        }
}
