package testing.dev;




import java.io.IOException;

import org.testng.annotations.Test;


 public class BuyerPortal_ComparePageTest extends BaseTest{
	
	
	
	@Test	(priority=1)
	public void signUpPageTest1() throws IOException, InterruptedException 
	{
		
		signup.fbsignUp1(properties.getProperty("fb_emailnew"),properties.getProperty("fb_passnew"),properties.getProperty("commercial"),properties.getProperty("terms"),properties.getProperty("privacy"),properties.getProperty("assertfb"));
	    
	}
	
   @Test(priority=2)
	public void comparePage01() throws InterruptedException
	{
		ProductComparePage.comparePage();
		
	}
   
	@Test	(priority=3)
	public void contactSupplier1() throws InterruptedException
	
	{
		
		  contactSupplier.contact_business(properties.getProperty("compan_name"),properties.getProperty("taxid"),properties.getProperty("message"),properties.getProperty("assertcontactsupplier"));
    	
	}
	@Test	(priority=4)
	public void requestQuote() throws InterruptedException
	
	{
		
		  requestQuote.requestQuote(properties.getProperty("quantiti"),properties.getProperty("destinatio"),properties.getProperty("date1"),properties.getProperty("requiremnt"));
    	 
 		}
//@Test	(priority=6)
//public void compare() throws InterruptedException
//	
//	{
//		
//	ProductComparePage.comparePage1();
// 		}
//	
//@Test	(priority=7)
//	public void contactSupplier11() throws InterruptedException
//	
//	{
//		
//		  contactSupplier.contactSupplier(properties.getProperty("enquiry"),properties.getProperty("message"),properties.getProperty("assertcontactsupplier"));
//  	
//	}
//	@Test	(priority=8)
//	public void contactSupplier12() throws InterruptedException
//	
//	{
//		
//		  contactSupplier.contactSupplier1(properties.getProperty("enquiry1"),properties.getProperty("compan_name"),properties.getProperty("countryselect"),properties.getProperty("taxid"),properties.getProperty("message"),properties.getProperty("assertcontactsupplier"));
//  	
//	}
//	@Test	(priority=9)
//	public void requestQuote1() throws InterruptedException
//	
//	{
//		
//		  requestQuote.requestQuote(properties.getProperty("companynam"),properties.getProperty("quantiti"),properties.getProperty("destinatio"),properties.getProperty("requiremnt"));
//  	 
//		}
	}

