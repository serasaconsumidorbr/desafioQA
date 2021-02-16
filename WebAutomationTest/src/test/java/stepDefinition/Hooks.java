package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import enums.Browsers;

public class Hooks {

    @Before
    public void visitUrl(){
        if (Browsers.webDriver == null) {
            Browsers.setWebDriver();
        }
    }

    @After
    public void closeDriver(){
        Browsers.quitDriver();
    }
}
