package testing.dev;

import java.io.IOException;

import org.testng.annotations.Test;

public class BuyerPortal_FinancingPageTest extends BaseTest {

	@Test	(priority=1)
	public void signInPageTest() throws InterruptedException, IOException
	
	{
		buyersign.signIn(properties.getProperty("dev_email"),properties.getProperty("dev_pass"),properties.getProperty("assert_business"));

	}
	
   @Test(priority=2)
	public void financingpage() throws InterruptedException
	{
	   financepage.financePage(properties.getProperty("detailsname"), properties.getProperty("taxid"), properties.getProperty("registrationaddress"), properties.getProperty("detailsstate"), properties.getProperty("detailscity"), properties.getProperty("countername"), properties.getProperty("countertaxid"), properties.getProperty("counterregistrationaddress"),properties.getProperty("countercity"));
		
	}

}
