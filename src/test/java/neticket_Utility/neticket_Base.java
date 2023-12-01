package neticket_Utility;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;



public class neticket_Base {
public static WebDriver driver;
public static Properties netpro;
public neticket_Base() {
	try {
		FileInputStream netfile = new FileInputStream(System.getProperty("user.dir")+("//src//test//java//neticket_Conffig//neticket_config.properties"));
				netpro= new Properties();
				netpro.load(netfile);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println("Please,look the code");
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public void NetBrowser() {
String NetAllBrowser =	netpro.getProperty("NetBrowser1");
if(NetAllBrowser.equalsIgnoreCase("Chrome")) {
	System.setProperty("Webdriver.chrome.driver",System.getProperty("user.dir")+("//neticket_ChromeDriver//chromedriver.exe"));
	ChromeOptions team = new ChromeOptions();
		team.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();	
		
}
else if(NetAllBrowser.equalsIgnoreCase("Edge")) {
	System.setProperty("Webdriver.edge.driver",System.getProperty("user.dir")+("//neticket_EdgeDriver//msedgedriver.exe"));
	EdgeOptions group = new EdgeOptions();
		group.addArguments("--remote-allow-origins=*");
		driver = new EdgeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(neticket_utilityclass.pageLoadTimeout));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(neticket_utilityclass.implicitlyWait));
		driver.manage().window().maximize();	
		
}
}
public static void NetLaunchURL(String URL) {
	driver.get(netpro.getProperty("NetURL"));
}

}

