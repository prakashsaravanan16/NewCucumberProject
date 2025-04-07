package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",glue="org.step",dryRun=false,strict=true,monochrome=true)

public class TestRunnerClass {
	
	@AfterClass
	private void jvmReportClass() {
		
		System.out.println("JVM report has been changed");
	}

}
