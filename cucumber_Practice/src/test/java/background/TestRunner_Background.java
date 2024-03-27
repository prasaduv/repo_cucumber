package background;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

 @RunWith(Cucumber.class)
 @CucumberOptions(
		 features = "src/test/resources/Features_Background",
		 glue = {"background"},
		 monochrome = true,
		 plugin = {"pretty" , "json:target/JSONReports/reports.json" ,
		 		  	"pretty" , "html:target/HTMLReports/reports.html" ,
		 		  	"pretty" , "junit:target/JUNITReports/reports.xml"
		 		  }
		 		)
public class TestRunner_Background {

}
