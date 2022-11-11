package org.setpdefinition;

import org.baseclass.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass{
	
	@Before(order = 5)
	public void preCon2() {
		launchBroswer();
		launchUrl("https://www.facebook.com/");
	}
	
	@Before(order = 10)
	public void preCon1() {
		maximizeWindow();
	}
//In @Before-order will be executed in incremental/Ascending order
//In @After-order will be executed in decremental/descending order
	
	//Tagged-Hooks--Applicable only for Particular feature/scenario for given tag(@Login)
	@After(order=7)
	public void postCon2(Scenario s) {
		//If scenario is failed return true else return false
		if (s.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] a = ts.getScreenshotAs(OutputType.BYTES);
			//embed the screenshot to report
			s.embed(a, "image/png");
			s.embed(a, "image/png", s.getName());
			System.out.println("failed scenario: "+s.getName());
			System.out.println("failed at which line: "+s.getLine());
			System.out.println("scenario status: "+s.getStatus());
		}
	}
	
	@After(order = 5)
	public void postCon1() {
		closeBrowser();
	}
}
