package neticket_TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import neticket_Utility.neticket_Base;


@CucumberOptions(features = {"src/test/resources/neticket_Feature"},
plugin = {"json:target/cucumber.json"},// He is responsible for generate HTML reports 
glue = "neticket_Stepdeffination")//tags = {""})
public class neticket_TestRunnerClass extends AbstractTestNGCucumberTests {
@BeforeTest
public void netstartURL() {
	neticket_Base net = new neticket_Base();
			net.NetBrowser();		
}
@AfterTest
public void netcloseURL() {
	neticket_Base net = new neticket_Base();
	net.driver.quit();
}
}
