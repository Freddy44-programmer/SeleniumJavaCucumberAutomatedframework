package runner;


import io.cucumber.junit.CucumberOptions;

@CucumberOptions(
        features = "src/main/java/features"
                ,glue={"utility", "stepDefinition"},
                 plugin = {"pretty","html:target/cucumber-html-report","json:cucumber."}


)


public class TestRunner {

}
