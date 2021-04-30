package runner;


import io.cucumber.java.et.Ja;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:json/cucumber.json"},
        features = {"src/test/resources/features"},
        glue = {"steps"},
        tags = "@teste")

public class RunTest {

    @AfterClass
    public static void report() throws IOException {
        Runtime.getRuntime().exec("cmd.exe /c mvn cluecumber-report:reporting");
    }

}
