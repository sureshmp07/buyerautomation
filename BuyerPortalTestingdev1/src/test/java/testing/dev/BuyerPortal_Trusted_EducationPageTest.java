package testing.dev;

import java.io.IOException;

import org.testng.annotations.Test;

public class BuyerPortal_Trusted_EducationPageTest extends BaseTest
{
	
	@Test	(priority=1)
	public void signInPageTest1() throws InterruptedException 
	{
    	buyersign.signIn1(properties.getProperty("buy_email"),properties.getProperty("buy_password"), properties.getProperty("assertfb"));
      
	}	
	@Test	(priority=2)
	public void TrustedPage() throws IOException, InterruptedException 
	{
		Trusted_EucationPage.trustedPage(properties.getProperty("asserttrusted"));      
	}	
	@Test	(priority=3)
	public void EucationPage() throws IOException, InterruptedException 
	{
    Trusted_EucationPage.educationPage();   
	}
}
