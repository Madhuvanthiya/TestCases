package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"Features/RegisterUser.feature"},
		dryRun = !true,
		glue="stepdefinition",
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
	    plugin = {"pretty","html:reports/myreport.html","json:reports/myreports.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				},
	    //tags = "@test16",
		//tags="@test1 and @test3 and not @test2"
		//tags="@test15,@test14" 
		publish=true
		
		)
public class TestRunner {

}
