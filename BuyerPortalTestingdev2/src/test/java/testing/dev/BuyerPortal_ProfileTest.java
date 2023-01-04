package testing.dev;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

public class BuyerPortal_ProfileTest extends BaseTest{
	
	@Test	(priority=1)
	public void signInPageTest() throws IOException, InterruptedException
	
	{
		
		buyersign.signIn(properties.getProperty("buy_email"),properties.getProperty("buy_password"),properties.getProperty("assert_signin"));


	}

	@Test	(priority=2)
	public void profilepage() throws InterruptedException, IOException, AWTException
	
	{
		profilepage.profileUpdate(properties.getProperty("filepath"),properties.getProperty("update_firstname"), properties.getProperty("update_lasttname"),properties.getProperty("designation"),properties.getProperty("about"),properties.getProperty("update_mobilecode"), properties.getProperty("online1"), properties.getProperty("online2"),properties.getProperty("online3"));

	}
	

}
