package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:json/cucumber.json"},
        features = {"src/test/resources/features"},
        glue = {"steps"},
        tags = "@teste")

public class RunTest {

}
