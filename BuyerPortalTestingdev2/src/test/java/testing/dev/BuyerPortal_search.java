package testing.dev;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import buyerportal.dev.ReusableFunction;

public class BuyerPortal_search extends BaseTest{
	
	
	@Test	(priority=1,groups = {"Sanity", "Smoke", "Regression"})
	public void signInPageTest() throws IOException, InterruptedException
	
	{
		
		buyersign.signIn(properties.getProperty("buy_email"),properties.getProperty("buy_password"),properties.getProperty("assert_signin"));
//		String expectedtext = "Food";
//        String actualtext = driver.findElement(By.xpath("//a[text()='Food']")).getText();
//        try {
//			ReusableFunction.assertion(expectedtext, actualtext);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

	@Test	(priority=2,groups = {"Sanity", "Smoke", "Regression"})
	public void loginsearchPageTest() throws InterruptedException
	
	{
	
	  
	loginsearch.loginsearch(properties.getProperty("buyersearch"));
//	String expectedtext = "Apollo Table (Worldwide)";
//       String actualtext = driver.findElement(By.xpath("//div[text()='Apollo Table']")).getText();
//     	try {
//     		ReusableFunction.assertion1(expectedtext, actualtext);
//     	}
//		catch (IOException e) {
//			// TODO Auto-generated catch block
//		e.printStackTrace();
//		}
	   
	}
	
	@Test	(priority=3,groups = {"Sanity", "Smoke", "Regression"})
	public void contactSupplier() throws InterruptedException
	
	
	{
		
		  contactSupplier.contactSupplier(properties.getProperty("enquiry"),properties.getProperty("message"));
     	  //String expectedtext = "Apollo Table (Worldwide)";
          //String actualtext = driver.findElement(By.xpath("//div[text()='Apollo Table']")).getText();
//          try {
//  			ReusableFunction.assertion(expectedtext, actualtext);
//  		} catch (IOException e) {
//  			// TODO Auto-generated catch block
//  			e.printStackTrace();
//  		}
	}
	@Test	(priority=4,groups = {"Sanity", "Smoke", "Regression"})
	public void contactSupplier1() throws InterruptedException
	
	{
		
		  contactSupplier.contactSupplier1(properties.getProperty("enquiry1"),properties.getProperty("compan_name"),properties.getProperty("countryselect"),properties.getProperty("taxid"),properties.getProperty("message"));
     	  //String expectedtext = "Apollo Table (Worldwide)";
          //String actualtext = driver.findElement(By.xpath("//div[text()='Apollo Table']")).getText();
//          try {
//  			ReusableFunction.assertion1(expectedtext, actualtext);
//  		} catch (IOException e) {
//  			// TODO Auto-generated catch block
//  			e.printStackTrace();
//  		}
	}
	@Test	(priority=5,groups = {"Sanity", "Smoke", "Regression"})
	public void requestQuote() throws InterruptedException
	
	{
		
		  requestQuote.requestQuote(properties.getProperty("companynam"),properties.getProperty("quantiti"),properties.getProperty("destinatio"),properties.getProperty("requiremnt"));
     	  //String expectedtext = "Apollo Table (Worldwide)";
          //String actualtext = driver.findElement(By.xpath("//div[text()='Apollo Table']")).getText();
//          try {
//  			ReusableFunction.assertion1(expectedtext, actualtext);
//  		} catch (IOException e) {
//  			// TODO Auto-generated catch block
//  			e.printStackTrace();
//  		}
	}

	
//	@Test	(priority=6)
//	public void searchPageTest()
//	
//	{
//		
//		  buyersearch.search(properties.getProperty("buyersearch"));
//     	  String expectedtext = "Apollo Table (Worldwide)";
//          String actualtext = driver.findElement(By.xpath("//div[text()='Apollo Table']")).getText();
//          try {
//  			ReusableFunction.assertion(expectedtext, actualtext);
//  		} catch (IOException e) {
//  			// TODO Auto-generated catch block
//  			e.printStackTrace();
//  		}
//  	   
//	   
//	}
	
}
