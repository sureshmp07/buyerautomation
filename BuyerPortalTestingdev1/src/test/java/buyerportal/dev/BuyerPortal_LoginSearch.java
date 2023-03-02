package buyerportal.dev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class BuyerPortal_LoginSearch {
	
	private WebDriver driver;
	private ReusableFunction reusable;
	
	private By search =By.xpath("//input[@class='z-index-hero']");
	private By searchclick=By.xpath("//p[text()='Search']");
	private By tableclick=By.xpath("//img[@class='card-image cursor-pointer']");
	//private String heading = driver.findElement(By.xpath("//div[@class='text']//h2")).getText();
	

	public BuyerPortal_LoginSearch(WebDriver driver) {
		this.driver=driver;
	    reusable=new ReusableFunction(this.driver);
		}
	

	public void loginsearch(String buyersearch) throws InterruptedException
	{
	reusable.insertText(search, buyersearch);
	Thread.sleep(3000);
	reusable.clickOn(searchclick);
	Thread.sleep(3000);
	
	reusable.click(tableclick);
}
}