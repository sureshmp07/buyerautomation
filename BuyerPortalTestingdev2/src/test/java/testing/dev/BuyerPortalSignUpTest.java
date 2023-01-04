package testing.dev;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class BuyerPortalSignUpTest  extends BaseTest {
	
	@Test	(priority=1)
	public void signUpPageTest1() throws IOException, InterruptedException 
	{
		
		signup.fbsignUp(properties.getProperty("fb_email"),properties.getProperty("fb_pass"),properties.getProperty("commercial"),properties.getProperty("terms"),properties.getProperty("privacy"),properties.getProperty("actual_fb"));
	    
	}
	
	@Test	(enabled=false)
	public void signUpPageTest2() throws InterruptedException 
	{
		
		signup.googlesignUp(properties.getProperty("google_email"),properties.getProperty("google_pass"));
	    
	}

	
	@Test	(priority=2)
	public void signupPageTest3() throws InterruptedException, IOException 
	{
		
		signup.signUp(properties.getProperty("l_email1"),properties.getProperty("l_first"),properties.getProperty("l_last"),properties.getProperty("l_username"),properties.getProperty("l_password1"),properties.getProperty("actual"));

	}
	
	//without entering username and password
	@Test	(priority=3)
	public void signUpPageTest4() throws IOException 
	{
		
		signup.signUp1(properties.getProperty("buy_email"),properties.getProperty("l_email2"),properties.getProperty("l_password2"),properties.getProperty("actual_f"),properties.getProperty("actual_l"),properties.getProperty("actual_u"),properties.getProperty("actual_p"));
	   
      
	}
	   //without giving password with policy 
        @Test	(priority=4)
    	public void signUpPageTest5() throws IOException, InterruptedException 
    	{
    		
        	signup.signUp01(properties.getProperty("l_email1"),properties.getProperty("l_first"),properties.getProperty("l_last"),properties.getProperty("l_username"),properties.getProperty("l_password3"),properties.getProperty("actual_p1"));
    	   
       
	}
//        //giving already existing mail id
//        @Test	(priority=5)
//    	public void signUpPageTest6() throws IOException 
//    	{
//    		
//        	signup.signUp2(properties.getProperty("buy_email"),properties.getProperty("l_first"),properties.getProperty("l_last"),properties.getProperty("l_username"),properties.getProperty("l_password1"),properties.getProperty("actual_p2"));
//    	}       

}
