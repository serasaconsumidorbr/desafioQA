package br.com.serasaexperian.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
				features = "src/test/resources/features",
				glue = {"br.com.serasaexperian.steps", "br.com.serasaexperian.factory"},
				plugin={"pretty","html:target/cucumber"})

public class TestRunner {
}
