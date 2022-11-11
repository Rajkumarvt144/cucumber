package org.setpdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	
	public static void jvmReportGeneration(String jsonPath) {
		//1. Mention the Jvm report folder location
		File f = new File(System.getProperty("user.dir")+"\\Reports\\JVM_report");
		
		//2.add details
		Configuration c = new Configuration(f, "Facebook Application");
		c.addClassifications("JDK version: ", "1.8");
		c.addClassifications("Platfrom: ", "Windows");
		c.addClassifications("Selenium Component: ", "WebDriver");
		
		//3.Add Json path
		List<String> li = new ArrayList<String>();
		li.add(jsonPath);
		
		//4.object creation for report builder class
		ReportBuilder r = new ReportBuilder(li, c);
		r.generateReports();
		
	}

}
