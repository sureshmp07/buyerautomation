package testing.dev;

import org.testng.annotations.Test;

public class BuyerPortal_EmcxPageTest extends BaseTest{
	
	@Test	(priority=1)
	public void signInPageTest1() throws InterruptedException 
	{
    	buyersign.signIn1(properties.getProperty("buy_email"),properties.getProperty("buy_password"),properties.getProperty("assertfb"));
      
	}	
	

	@Test	(priority=2)
	public void emcxPage() throws InterruptedException 
	{
    EmcxPage.EmcxPage();
      
	}	
}
