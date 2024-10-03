package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/features"
                ,glue={"utility", "stepDefinition"},
                 plugin = {"pretty","html:target/cucumber-html-report","json:cucumber."}


)


public class TestRunner {

}
