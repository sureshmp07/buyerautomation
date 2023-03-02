package buyerportal.dev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuyerPortal_LogisticsPage {
	
	private WebDriver driver;
	private ReusableFunction reusable;
	
	private By logisticsicon =By.xpath("(//div[@role=\"button\"])[7]");
	private By continueclick=By.xpath("//button[text()='Continue']");
	private By origincompany=By.xpath("//input[@id=\"from_company\"]");
	private By destinationcompany=By.xpath("//input[@id=\"to_company\"]");
	private By width=By.xpath("//input[@name=\"width\"]");
	private By length=By.xpath("//input[@name=\"length\"]");
	private By height=By.xpath("//input[@name=\"height\"]");
	private By weight=By.xpath("//input[@name=\"weight\"]");
	private By shipmentdate=By.xpath("//input[@placeholder=\"dd-mm-yyyy\"]");
	
	private By button=By.xpath("//button[text()='Back']");
	private By next=By.xpath("//button[text()='Next']");
	
	private By checkrates=By.xpath("//button[text()='Check Rates']");
	
	
	
	
	
	
	public BuyerPortal_LogisticsPage(WebDriver driver) {
		this.driver=driver;
	    reusable=new ReusableFunction(this.driver);
		}
	

	public void logisticsPage(String s1,String s2,String s3,String s4,String s5,String s6,String s7) throws InterruptedException
	{
	reusable.click(logisticsicon);
	Thread.sleep(3000);
	reusable.click(continueclick);
	Thread.sleep(3000);
	reusable.insertText(origincompany, s1);
	Thread.sleep(3000);
	reusable.arrowdown(origincompany);
	Thread.sleep(3000);
	reusable.insertText(destinationcompany, s2);
	Thread.sleep(3000);
	reusable.arrowdown(destinationcompany);
	Thread.sleep(3000);
	reusable.insertText(width, s3);
	Thread.sleep(3000);
	reusable.insertText(length, s4);
	Thread.sleep(3000);
	reusable.insertText(height, s5);
	Thread.sleep(3000);
	reusable.insertText(weight, s6);
	Thread.sleep(3000);
	reusable.insertText(shipmentdate, s7);
	Thread.sleep(3000);
	reusable.click(next);
	Thread.sleep(3000);
	reusable.click(checkrates);	
}
}