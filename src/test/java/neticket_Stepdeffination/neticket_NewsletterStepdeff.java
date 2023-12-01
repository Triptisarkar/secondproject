package neticket_Stepdeffination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import neticket_Utility.neticket_Base;

public class neticket_NewsletterStepdeff extends neticket_Base {
	@Given("^Launch<\"([^\"]*)\"> netapp$")
	public void launch_netapp(String URL) throws Throwable {
		NetLaunchURL(URL); 
	}

	@Then("^Scroll down till subscribe to newsletter$")
	public void scroll_down_till_subscribe_to_newsletter() throws Throwable {
		
	}

	@Then("^Verify subscribe to newsletter is in the homepage footer$")
	public void verify_subscribe_to_newsletter_is_in_the_homepage_footer() throws Throwable {
	    
	}


}
