package pageFactory;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features_PF",
					glue = {"pageFactory"},
					monochrome =true,
					plugin = {"pretty", "json:target/JSONReports/reports.json",
							"pretty", "html:target/HTMLReports/reports.html",
							"pretty", "junit:target/JUnitReports/reports.xml"					
					}
		)
public class TestRunner_PF {

}
