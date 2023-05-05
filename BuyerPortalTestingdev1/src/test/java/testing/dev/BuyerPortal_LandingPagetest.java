package testing.dev;

import java.io.IOException;


import org.testng.annotations.Test;


public class BuyerPortal_LandingPagetest extends BaseTest {
	
	
	@Test(priority=1)
public void search() throws InterruptedException
	
	{
		
		landinpage.landingpage(properties.getProperty("buyersearch"));

	}
//	@Test(priority=2)
//	
//	public void popularSearch() throws InterruptedException
//	
//	{
//		landinpage.landingpage1();
//
//}
//	@Test(priority=3)
//	public void categories() throws InterruptedException
//	
//	{
//		landinpage.landingpage2();
//}
//	
//	@Test(priority=4)
//	public void testimonials() throws InterruptedException
//	
//	{
//		landinpage.testimonials1();
//}
	@Test(priority=5)
	public void footer1() throws InterruptedException, IOException
	
	{
		landinpage.footer();
}
//	@Test(priority=6)
//	public void searchpage() throws InterruptedException
//	
//	{
//		searchpage.searchpage2(properties.getProperty("buyersearch"), properties.getProperty("name2"),properties.getProperty("name2"),properties.getProperty("s3"), properties.getProperty("path"), properties.getProperty("sheet"), 1, 0);
//	}
}