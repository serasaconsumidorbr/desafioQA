package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/java/features",
        plugin = {"io.qameta.allure.cucumberjvm.AllureCucumberJvm", "pretty"},
        glue = "stepDefinition",
        tags = "@login")

public class RunnerTest {


}
