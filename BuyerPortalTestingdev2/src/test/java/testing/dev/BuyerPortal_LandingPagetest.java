package testing.dev;

import java.io.IOException;


import org.testng.annotations.Test;


public class BuyerPortal_LandingPagetest extends BaseTest {
	
	
	@Test(priority=1)
public void search() throws InterruptedException
	
	{
		
		landinpage.landingpage(properties.getProperty("buyersearch"));
//		String expectedtext = "table";
//        String actualtext = driver.findElement(By.xpath("//input[@value='table']")).getText();
//        
//			try {
//				ReusableFunction.assertion(expectedtext, actualtext);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
	}
	@Test(priority=2)
	
	public void popularSearch() throws InterruptedException
	
	{
		landinpage.landingpage1();
//		String expectedtext = "Table";
//        String actualtext = driver.findElement(By.xpath("//a[text()='Table']")).getText();
//        
//			try {
//				ReusableFunction.assertion(expectedtext, actualtext);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
}
	@Test(priority=3)
	public void categories() throws InterruptedException
	
	{
		landinpage.landingpage2();
//		String expectedtext = "Table";
//        String actualtext = driver.findElement(By.xpath("//a[text()='Table']")).getText();
//        
//			try {
//				ReusableFunction.assertion(expectedtext, actualtext);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
}
	
	@Test(priority=4)
	public void testimonials() throws InterruptedException
	
	{
		landinpage.testimonials1();
//		String expectedtext = "Table";
//        String actualtext = driver.findElement(By.xpath("//a[text()='Table']")).getText();
//        
//			try {
//				ReusableFunction.assertion(expectedtext, actualtext);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
}
	@Test(enabled=false)
	public void footer1() throws InterruptedException, IOException
	
	{
		landinpage.footer();
//		String expectedtext = "Table";
//        String actualtext = driver.findElement(By.xpath("//a[text()='Table']")).getText();
//        
//			try {
//				ReusableFunction.assertion(expectedtext, actualtext);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
}
	
	@Test	(priority=6)
	public void signInPageTest() throws IOException, InterruptedException
	
	{
		
		buyersign.signIn(properties.getProperty("buy_email"),properties.getProperty("buy_password"),properties.getProperty("assert_business"));
//		String expectedtext = "Food";
//        String actualtext = driver.findElement(By.xpath("//a[text()='Food']")).getText();
//        try {
//			ReusableFunction.assertion(expectedtext, actualtext);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}
	@Test(priority=7)
	public void searchpage() throws InterruptedException
	
	{
		searchpage.searchpage2(properties.getProperty("buyersearch"), properties.getProperty("name2"),properties.getProperty("name2"),properties.getProperty("s3"), properties.getProperty("path"), properties.getProperty("sheet"), 1, 0);
	}
}