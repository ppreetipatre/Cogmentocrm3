package Testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith (Cucumber.class)
@CucumberOptions(
		features = {"Allfeatures"},
		glue = {"Stepdefination"},
		dryRun= false
		
		)


public class Testrunner 
{

	
}
