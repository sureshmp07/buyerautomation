package testing.dev;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import buyerportal.dev.ReusableFunction;



public class BuyerPortalLogin extends BaseTest {
	
	
	//sign up fb 
	@Test	(priority=1,groups = {"Sanity", "Smoke", "Regression"})
	public void signUpPageTest1() throws IOException, InterruptedException 
	{
		
		signup.fbsignUp(properties.getProperty("fb_email"),properties.getProperty("fb_pass"),properties.getProperty("commercial"),properties.getProperty("terms"),properties.getProperty("privacy"),properties.getProperty("actual_fb"));
	    
	}
	//sign in fb
	@Test(enabled=false)	//(priority=2,groups = {"Sanity", "Smoke", "Regression"})
	public void signUpPageTest2() throws IOException 
	{
		
		signup.fbsignin(properties.getProperty("fb_email"),properties.getProperty("fb_pass"),properties.getProperty("commercial"),properties.getProperty("terms"),properties.getProperty("privacy"));
	    
	}
	//sign in email
	@Test	(priority=3,groups = {"Sanity", "Smoke", "Regression"})
	public void signInPageTest3() 
	{
		
    	buyersign.signIn1(properties.getProperty("buy_email"),properties.getProperty("buy_password"));
      //  String actualtext = driver.getTitle();
        //String expectedtext = "Proxtera";
   
	}
	//sign in gmail 
		@Test	(enabled=false)
		public void signInPageTest4() throws InterruptedException 
		{
			
			signup.googlesignUp(properties.getProperty("buy_gmail"),properties.getProperty("buy_gpassword"));
	       String actualtext = driver.getTitle();
	        String expectedtext = "Proxtera";
	   
		}
//	//invalid email and valid password
//	@Test	(priority=4)
//	public void signInPageTest() throws IOException, InterruptedException 
//	{
//		
//		buyersign.signIn(properties.getProperty("l_email1"),properties.getProperty("l_password1"),properties.getProperty("assert_business"));
//	    String actualtext = driver.findElement(By.xpath("//div[@class='Toastify__toast-body']")).getText();
//        String expectedtext = "Please verify your email address before signing in";
//   
////        try {
////			ReusableFunction.assertion1(expectedtext, actualtext);
////		} catch (IOException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
//	    
//	}
//	//without entering username and password
//	@Test	(priority=5)
//	public void signInPageTest1() 
//	{
//		
//		buyersign.signIn1(properties.getProperty("l_email2"),properties.getProperty("l_password2"));
//	    String actualtext = driver.findElement(By.xpath("//div[text()='\"email\" is not allowed to be empty']")).getText();
//        String expectedtext = "\"email\" is not allowed to be empty";
//   
//        
////        try {
////			ReusableFunction.assertion1(expectedtext, actualtext);
////		} catch (IOException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
//        
//	}
//	   //without giving password
//        @Test	(priority=6)
//    	public void signInPageTest2() 
//    	{
//    		
//        	buyersign.signIn1(properties.getProperty("buy_email"),properties.getProperty("l_password2"));
//    	    String actualtext = driver.findElement(By.xpath("//div[text()='\"password\" is not allowed to be empty']")).getText();
//            String expectedtext = "\"password\" is not allowed to be empty";
//       
//            
////            try {
////    			ReusableFunction.assertion1(expectedtext, actualtext);
////    		} catch (IOException e) {
////    			// TODO Auto-generated catch block
////    			e.printStackTrace();
////    		}
////        
//	}
//        //without giving username 
//        @Test	(priority=7)
//    	public void signInPageTest3() 
//    	{
//    		
//        	buyersign.signIn1(properties.getProperty("l_email2"),properties.getProperty("l_password1"));
//            String actualtext = driver.findElement(By.xpath("//div[text()='\"email\" is not allowed to be empty']")).getText();
//            String expectedtext = "\"email\" is not allowed to be empty";
//       
//            
////            try {
////    			ReusableFunction.assertion1(expectedtext, actualtext);
////    		} catch (IOException e) {
////    			// TODO Auto-generated catch block
////    			e.printStackTrace();
////    		}
//        
//}
//      //invalid username and invalid password
//        @Test	(priority=8)
//    	public void signInPageTest4() 
//    	{
//    		
//        	buyersign.signIn1(properties.getProperty("buy_email"),properties.getProperty("l_password1"));
//            String actualtext = driver.findElement(By.xpath("//div[text()='Incorrect username or password.']")).getText();
//            String expectedtext = "Incorrect username or password.";
//       
//            
////            try {
////    			ReusableFunction.assertion1(expectedtext, actualtext);
////    		} catch (IOException e) {
////    			// TODO Auto-generated catch block
////    			e.printStackTrace();
////    		}
//        
//        
//    	}  
//        //valid  username and valid password
//             

}