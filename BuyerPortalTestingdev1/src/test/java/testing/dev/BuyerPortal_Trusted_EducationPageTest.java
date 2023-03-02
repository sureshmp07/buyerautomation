package testing.dev;

import java.io.IOException;

import org.testng.annotations.Test;

public class BuyerPortal_Trusted_EducationPageTest extends BaseTest
{
	
	@Test	(priority=1)
	public void signInPageTest1() 
	{
    	buyersign.signIn1(properties.getProperty("buy_email"),properties.getProperty("buy_password"));
      
	}	
	@Test	(priority=2)
	public void TrustedPage() throws IOException, InterruptedException 
	{
		Trusted_EucationPage.trustedPage();      
	}	
	@Test	(priority=3)
	public void EucationPage() throws IOException, InterruptedException 
	{
    Trusted_EucationPage.educationPage();   
	}
}
