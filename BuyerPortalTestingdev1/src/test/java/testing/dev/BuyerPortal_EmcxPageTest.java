package testing.dev;

import java.io.IOException;

import org.testng.annotations.Test;

public class BuyerPortal_EmcxPageTest extends BaseTest{ 
	
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
	public void emcxPage() throws InterruptedException, IOException 
	{
    EmcxPage.EmcxPage(properties.getProperty("assert_emcx"),properties.getProperty("assert_wise"),properties.getProperty("assert_thunes"),properties.getProperty("assert_liquid"));
      
	}	
}
