package testing.dev;

import java.awt.AWTException;

import org.testng.annotations.Test;

public class BuyerPortal_ProfilePageTest extends BaseTest{
	
	@Test	(priority=1)
	public void signInPageTest1() 
	{
    	buyersign.signIn1(properties.getProperty("buy_email"),properties.getProperty("buy_password"));
      
	}	
	@Test	(priority=2)
	public void profilepagetest() throws InterruptedException, AWTException 
	{
    	ProfilePage.profileUpdate(properties.getProperty("filepath"),properties.getProperty("firstname"),properties.getProperty("lastname"),properties.getProperty("designation"),properties.getProperty("aboutme"),properties.getProperty("countrycode"),properties.getProperty("contactnember"),properties.getProperty("onlinepage"));
      
	}	
	
	

}
