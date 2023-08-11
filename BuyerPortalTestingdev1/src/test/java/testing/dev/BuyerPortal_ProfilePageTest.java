package testing.dev;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

public class BuyerPortal_ProfilePageTest extends BaseTest{
	
//	@Test	(priority=1)
//	public void signInPageTest1() throws InterruptedException 
//	{
//    	buyersign.signIn1(properties.getProperty("buy_email1"),properties.getProperty("buy_password"),properties.getProperty("assertfb"));
//      
//	}	
	@Test	(priority=1)
	public void signUpPageTest1() throws IOException, InterruptedException 
	{
		
		signup.fbsignUp1(properties.getProperty("fb_email"),properties.getProperty("fb_pass"),properties.getProperty("commercial"),properties.getProperty("terms"),properties.getProperty("privacy"),properties.getProperty("assertfb"));
	    
	}
	@Test	(priority=2)
	public void profilepagetest() throws InterruptedException, AWTException, IOException 
	{
    	ProfilePage.profileUpdate(properties.getProperty("filepath"),properties.getProperty("firstname"),properties.getProperty("lastname"),properties.getProperty("designation"),properties.getProperty("aboutme"),properties.getProperty("countrycode"),properties.getProperty("contactnember"),properties.getProperty("onlinepage"),properties.getProperty("assert_profile"));
      
	}	
	
	

}
