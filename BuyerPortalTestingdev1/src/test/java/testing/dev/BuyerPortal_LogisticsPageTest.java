package testing.dev;

import java.io.IOException;

import org.testng.annotations.Test;


public class BuyerPortal_LogisticsPageTest extends BaseTest{
	
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
	public void logisticspage() throws InterruptedException 
	{
		logisticsPage.logisticsPage(properties.getProperty("origincompany"),properties.getProperty("destinationcompany"),properties.getProperty("width"),properties.getProperty("length"),properties.getProperty("height"),properties.getProperty("weight"),properties.getProperty("shipmentdate"));
      
	}	
	

}
