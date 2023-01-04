package testing.dev;

import java.io.IOException;

import org.testng.annotations.Test;



public class BuyerPortal_FavouritePageTest extends BaseTest{
	
	@Test	(priority=1)
	public void signInPageTest() throws IOException, InterruptedException
	
	{
		
		buyersign.signIn(properties.getProperty("dev_email"),properties.getProperty("dev_pass"),properties.getProperty("assert_business"));
//		String expectedtext = "Food";
//        String actualtext = driver.findElement(By.xpath("//a[text()='Food']")).getText();
//        try {
//			ReusableFunction.assertion(expectedtext, actualtext);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

	@Test	(priority=2)
	public void loginsearchPageTest() throws InterruptedException
	
	{
	
	  
	loginsearch.loginsearch(properties.getProperty("buyersearch"));
	
	}
	@Test	(priority=3)
public void favPage1() throws InterruptedException
	
	{
	
	FavouritePage.favPage();   
	}
	 @Test	(priority=4)
		public void contactSupplier() throws InterruptedException
		
		{
			
			  contactSupplier.contactSupplier(properties.getProperty("enquiry"),properties.getProperty("message"));
	    	
		}
		@Test	(priority=5)
		public void contactSupplier1() throws InterruptedException
		
		{
			
			  contactSupplier.contactSupplier1(properties.getProperty("enquiry1"),properties.getProperty("compan_name"),properties.getProperty("countryselect"),properties.getProperty("taxid"),properties.getProperty("message"));
	    	
		}
		@Test	(priority=6)
		public void requestQuote() throws InterruptedException
		
		{
			
			  requestQuote.requestQuote(properties.getProperty("companynam"),properties.getProperty("quantiti"),properties.getProperty("destinatio"),properties.getProperty("requiremnt"));
	    	 
	 		}

}
