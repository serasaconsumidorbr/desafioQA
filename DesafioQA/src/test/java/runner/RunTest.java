package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


public class RunTest {

    @RunWith(Cucumber.class)
    @CucumberOptions(features= "src/test/java/features/ConsultaCpf.feature", glue = "stepDefinition", tags = "@ConsultaCPF")


    public class RunCucumberTest {


    }
}
