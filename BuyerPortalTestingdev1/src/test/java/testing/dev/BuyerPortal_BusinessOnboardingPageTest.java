package testing.dev;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

public class BuyerPortal_BusinessOnboardingPageTest extends BaseTest{

		@Test	(priority=1)
		public void signUpPageTest1() throws IOException, InterruptedException 
		{
			
			signup.fbsignUp1(properties.getProperty("fb_email"),properties.getProperty("fb_pass"),properties.getProperty("commercial"),properties.getProperty("terms"),properties.getProperty("privacy"),properties.getProperty("assertfb"));
		    
		}
	@Test	(priority=2)
	public void basicBusinessDetails() throws InterruptedException, AWTException, IOException
	
	{
		businessPage.BusinessProfilePage(properties.getProperty("fname"),properties.getProperty("lname"),properties.getProperty("b_code"),properties.getProperty("b_phone"),properties.getProperty("otp"),properties.getProperty("company_legal"),properties.getProperty("country_incorp"),properties.getProperty("deisgnation"),properties.getProperty("assert_businessprofile"));

	}
	@Test	(priority=3)
	public void basicBusinessDetails1() throws InterruptedException, AWTException, IOException
	
	{
		businessPage.basicBusinessDetailsPage(properties.getProperty("filepath"),properties.getProperty("tin"),properties.getProperty("doi"),properties.getProperty("companywebsite"),properties.getProperty("primary"),properties.getProperty("assert_ContactDetails"));

	}
	@Test	(priority=4)
	public void contactDetails() throws InterruptedException, AWTException, IOException
	
	{
		businessPage.contactDetailsPage(properties.getProperty("c_location"),properties.getProperty("c_city"),properties.getProperty("assert_OtherInformation"));
	}
	
	@Test	(priority=4)
	public void otherInformation() throws InterruptedException, AWTException
	
	{
		businessPage.OtherInformationPage(properties.getProperty("other_awardnm"),properties.getProperty("other_news"),properties.getProperty("assert_finish"),properties.getProperty("assert_staff"));

	}
}
