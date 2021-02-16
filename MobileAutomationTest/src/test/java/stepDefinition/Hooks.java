package stepDefinition;

import utils.AppiumManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    @Before
    public static void StartScenario() {
        AppiumManager.startServer();
        AppiumManager.startDriverByMavenParameter(System.getProperty("device"));
    }

    @After
    public void EndScenario() {
        AppiumManager.quitDriver();
        AppiumManager.stopServer();

    }
}
