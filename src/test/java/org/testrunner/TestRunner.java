package org.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.setpdefinition.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\featurefile",glue = "org.setpdefinition",
dryRun=false,monochrome=true,strict=true,tags= {"@Smoke or @Login"},
snippets = SnippetType.UNDERSCORE,				
plugin= {"pretty","html:Reports\\html_report",
		"junit:Reports\\Junit_report\\junit-report.xml",
		"json:Reports\\Json_report\\json-report.json",
		"rerun:Rerun\\Failed-Rerun.txt"})

public class TestRunner {
	@AfterClass
	public static void report() {
		JVMReport.jvmReportGeneration(System.getProperty("user.dir")+"\\Reports\\Json_report\\json-report.json");

	}

}
