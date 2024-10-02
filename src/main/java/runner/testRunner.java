package runner;


import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/java/features"
                ,glue={"stepDefinition"}
)
public class testRunner {

}
