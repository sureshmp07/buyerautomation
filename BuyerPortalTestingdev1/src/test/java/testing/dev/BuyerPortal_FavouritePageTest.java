package testing.dev;

import java.io.IOException;

import org.testng.annotations.Test;



public class BuyerPortal_FavouritePageTest extends BaseTest{
	
//	@Test	(priority=1)
//	public void signInPageTest() throws IOException, InterruptedException
//	
//	{
//		
//		buyersign.signIn(properties.getProperty("dev_email"),properties.getProperty("dev_pass"),properties.getProperty("assert_business"));
//
//	}
	@Test	(priority=1)
	public void signUpPageTest1() throws IOException, InterruptedException 
	{
		
		signup.fbsignUp1(properties.getProperty("fb_email"),properties.getProperty("fb_pass"),properties.getProperty("commercial"),properties.getProperty("terms"),properties.getProperty("privacy"),properties.getProperty("assertfb"));
	    
	}

	@Test	(priority=2)
	public void loginsearchPageTest() throws InterruptedException
	
	{
	
	  
	loginsearch.loginsearch1(properties.getProperty("buyersearch"));
	
	}
	@Test	(priority=3)
public void favPage1() throws InterruptedException
	
	{
	
	FavouritePage.favPage();   
	}
//	 @Test	(priority=4)
//		public void contactSupplier() throws InterruptedException
//		
//		{
//			
//			  contactSupplier.contactSupplier(properties.getProperty("enquiry"),properties.getProperty("message"),properties.getProperty("assertcontactsupplier"));
//	    	
//		}
//		@Test	(priority=5)
//		public void contactSupplier1() throws InterruptedException
//		
//		{
//			
//			  contactSupplier.contactSupplier1(properties.getProperty("enquiry1"),properties.getProperty("compan_name"),properties.getProperty("countryselect"),properties.getProperty("taxid"),properties.getProperty("message"),properties.getProperty("assertcontactsupplier"));
//	    	
//		}
//		@Test	(priority=6)
//		public void requestQuote() throws InterruptedException
//		
//		{
//			
//			  requestQuote.requestQuote(properties.getProperty("companynam"),properties.getProperty("quantiti"),properties.getProperty("destinatio"),properties.getProperty("requiremnt"));
//	    	 
//	 		}

}
