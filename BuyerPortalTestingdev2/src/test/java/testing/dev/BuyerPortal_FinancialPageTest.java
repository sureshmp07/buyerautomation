package testing.dev;

import java.io.IOException;

import org.testng.annotations.Test;

public class BuyerPortal_FinancialPageTest extends BaseTest {
	
	@Test	(priority=1)
	public void signInPageTest() throws IOException, InterruptedException
	
	{
		
		buyersign.signIn(properties.getProperty("dev_email"),properties.getProperty("dev_pass"),properties.getProperty("assert_business"));


	}
	@Test	(priority=2)
	public void financialpagetest1() throws IOException, InterruptedException
	
	{
		
		financingPage.basicBusinessDetailsPage(properties.getProperty("entityname1"),properties.getProperty("tin1"),properties.getProperty("registrationaddress1"),properties.getProperty("state1"),properties.getProperty("city1"),properties.getProperty("entityname2"),properties.getProperty("tin2"),properties.getProperty("registrationaddress2"),properties.getProperty("state2"),properties.getProperty("city2"));

	}

}
