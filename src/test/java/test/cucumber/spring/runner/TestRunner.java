package test.cucumber.spring.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:jenkins",
        glue = {"test.cucumber.spring.step", "test.cucumber.spring.spring"}
)
public class TestRunner {
}
