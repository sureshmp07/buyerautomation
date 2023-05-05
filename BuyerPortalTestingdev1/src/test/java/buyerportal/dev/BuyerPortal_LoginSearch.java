package buyerportal.dev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class BuyerPortal_LoginSearch {
	
	private WebDriver driver;
	private ReusableFunction reusable;
	
	private By search =By.xpath("//input[@class='z-index-hero']");
	private By searchclick=By.xpath("//button[text()='Search']");
	private By tableclick=By.xpath("//img[@class='card-image cursor-pointer']");
	//private String heading = driver.findElement(By.xpath("//div[@class='text']//h2")).getText();
	

	public BuyerPortal_LoginSearch(WebDriver driver) {
		this.driver=driver;
	    reusable=new ReusableFunction(this.driver);
		}
	

	public void loginsearch(String buyersearch) throws InterruptedException
	{
	reusable.insertText(search, buyersearch);
	reusable.clickOn(searchclick);	
	reusable.click(tableclick);
}
	public void loginsearch1(String buyersearch) throws InterruptedException
	{
	reusable.insertText(search, buyersearch);
	reusable.clickOn(searchclick);	
	
}
}