package testing.dev;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

public class BuyerPortal_DashboardPageTest extends BaseTest {
	@Test	(priority=1)
	public void signUpPageTest1() throws IOException, InterruptedException 
	{
		
		signup.fbsignUp1(properties.getProperty("fb_email"),properties.getProperty("fb_pass"),properties.getProperty("commercial"),properties.getProperty("terms"),properties.getProperty("privacy"),properties.getProperty("assertfb"));
	    
	}
	@Test	(priority=2)
	public void dashboardPageTest1() throws IOException, InterruptedException, AWTException 
	{
		DashboardPage.DashboardPage(properties.getProperty("Assert_verifyyourbusiness"),properties.getProperty("Assert_finance"),properties.getProperty("Assert_seller"),properties.getProperty("Assert_emptyenquiries"),properties.getProperty("s1"),properties.getProperty("s2"),properties.getProperty("filepath1"),properties.getProperty("Assert_upload_po"));
	}
	@Test	(priority=3)
	public void dashboardPageTest2() throws IOException, InterruptedException, AWTException 
	{
		DashboardPage.createPo(properties.getProperty("yourcompany"),properties.getProperty("yourname"),properties.getProperty("Tin"),properties.getProperty("c_address1"),properties.getProperty("city_state"),properties.getProperty("country"),properties.getProperty("c_legalname"),properties.getProperty("c_address2"),properties.getProperty("city_state1"),properties.getProperty("country1"),properties.getProperty("phone"), properties.getProperty("c_legalname1"),properties.getProperty("yourname1"),properties.getProperty("phone1"), properties.getProperty("c_address3"),properties.getProperty("city_state2"),properties.getProperty("country2"), properties.getProperty("po_number"), properties.getProperty("product_name"), properties.getProperty("quantity"),properties.getProperty("price"),properties.getProperty("Terms"),properties.getProperty("comments"),properties.getProperty("signed"), null);
	}

}
