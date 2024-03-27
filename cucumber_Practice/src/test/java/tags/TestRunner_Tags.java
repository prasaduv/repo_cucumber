package tags;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features_Tags",
					glue = {"stepDefinitions"},
					tags = "@smoke and @regression"	
		)
public class TestRunner_Tags {
	
	

}
