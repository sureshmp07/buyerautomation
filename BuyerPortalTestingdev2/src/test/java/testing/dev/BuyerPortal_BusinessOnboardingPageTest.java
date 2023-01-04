package testing.dev;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

public class BuyerPortal_BusinessOnboardingPageTest extends BaseTest{
	@Test	(priority=1)
	public void signInPageTest() throws InterruptedException, IOException
	
	{
		buyersign.signIn(properties.getProperty("dev_email"),properties.getProperty("dev_pass"),properties.getProperty("assert_business"));

	}
	
	@Test	(priority=2)
	public void basicBusinessDetails() throws InterruptedException, AWTException, IOException
	
	{
		businessPage.basicBusinessDetailsPage(properties.getProperty("filepath"),properties.getProperty("filepath"),properties.getProperty("tin"),properties.getProperty("CountryofIncorporation"),properties.getProperty("CountryofIncorporation"),properties.getProperty("doi"),properties.getProperty("companywebsite"),properties.getProperty("assert_ContactDetails"));

	}
	@Test	(priority=3)
	public void contactDetails() throws InterruptedException, AWTException, IOException
	
	{
		businessPage.contactDetailsPage(properties.getProperty("location"),properties.getProperty("code1"),properties.getProperty("phone1"),properties.getProperty("assert_OtherInformation"));
	}
	
	@Test	(priority=4)
	public void otherInformation() throws InterruptedException, AWTException
	
	{
		businessPage.OtherInformationPage(properties.getProperty("awardname"),properties.getProperty("awardcategory"),properties.getProperty("awardescription"),properties.getProperty("awardlinks"),properties.getProperty("headline"),properties.getProperty("newsdecription"),properties.getProperty("newslink"),properties.getProperty("filepath"));

	}
}
