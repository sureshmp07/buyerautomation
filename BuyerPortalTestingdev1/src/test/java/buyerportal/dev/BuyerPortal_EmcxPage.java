package buyerportal.dev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuyerPortal_EmcxPage {
	private WebDriver driver;
	private ReusableFunction reusable;
	
	private By emcxicon=By.xpath("(//div[@role=\"button\"])[6]");
	private By transact1=By.xpath("(//div[text()='Transact Now'])[1]");
	private By transact2=By.xpath("(//div[text()='Transact Now'])[2]");
	private By transact3=By.xpath("(//div[text()='Transact Now'])[3]");
	private By ghaniancedi=By.xpath("//span[text()='United States Dollar']");
	private By unitedstaes=By.xpath("//span[text()='United States Dollar']");
	private By philippine=By.xpath("//span[text()='Philippine Peso']");
	private By home_dropdown=By.xpath("(//div[@role=\"button\"])[12]");
	//private By home_dropdown=By.xpath("//div[@role=\"button\"]");
	
	
	public BuyerPortal_EmcxPage(WebDriver driver) {
		this.driver=driver;
	    reusable=new ReusableFunction(this.driver);
		}
	public void EmcxPage() throws InterruptedException
	{   
		reusable.click(emcxicon);
		Thread.sleep(2000);
		reusable.click(transact1);
		Thread.sleep(2000);
		reusable.click(transact2);
		Thread.sleep(2000);
		reusable.click(transact3);
		Thread.sleep(2000);
		reusable.click(home_dropdown);
		Thread.sleep(2000);
		reusable.click(home_dropdown);
		Thread.sleep(2000);
		reusable.click(unitedstaes);
				
}
}