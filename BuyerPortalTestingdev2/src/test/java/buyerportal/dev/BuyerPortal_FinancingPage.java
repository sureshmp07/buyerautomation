package buyerportal.dev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuyerPortal_FinancingPage {
	
	
	private WebDriver driver;
	private ReusableFunction reusable;
	
	private By financelogo=By.xpath("(//div[@role=\"button\"])[5]");
	private By getfinancebutton=By.xpath("//button[text()='Get Finance']");
	private By entityname1=By.xpath("//input[@id='corporate_name']");
	private By tin1=By.xpath("//input[@id=\"tax_id\"]");
	private By registrationnumbercheckbox1=By.xpath("//input[@name=\"buyer_same_as_business_numer\"]");
	private By registrationaddress1=By.xpath("(//input[@id=\"address\"])[1]");
	private By state1=By.xpath("//input[@id=\"state\"]");
	private By city1=By.xpath("//input[@id=\"city\"]");
	private By myrole=By.xpath("//input[@id=\"buyer-select\"]");
	private By entityname2=By.xpath("//input[@id=\"counterparty_corporate_name\"]");
	private By tin2=By.xpath("//input[@id=\"counterparty_tax_id\"]");
	private By registrationnumbercheckbox2=By.xpath("//input[@name=\"seller_same_as_business_numer\"]");
	private By registrationaddress2=By.xpath("(//input[@id=\"address\"])[2]");
	private By state2=By.xpath("//input[@id=\"counterparty_state\"]");
	private By city2=By.xpath("//input[@id=\"counterparty_city\"]");
	private By nextbtn=By.xpath("//button[@id=\"stepper-submit-btn\"]");
	private By backbtn=By.xpath("//button[text()='Back']");
	
	
	
	
	public BuyerPortal_FinancingPage(WebDriver driver) {
		this.driver=driver;
	    reusable=new ReusableFunction(this.driver);
		}
	

	public void basicBusinessDetailsPage(String num1,String num2,String num3,String num4,String num5,String num6,String num7,String num8,String num9,String num10) throws InterruptedException
	{   
		reusable.click(financelogo);
		reusable.click(getfinancebutton);
		reusable.insertText(entityname1, num1);
		reusable.insertText(tin1, num2);
		reusable.click(registrationnumbercheckbox1);
		
		reusable.insertText(registrationaddress1, num3);
		Thread.sleep(7000);
		reusable.arrowdown(registrationaddress1);
		reusable.insertText(state1, num4);
		reusable.insertText(city1, num5);
		
		reusable.insertText(entityname2,num6);
		reusable.insertText(tin2, num7);
		reusable.click(registrationnumbercheckbox2);
		reusable.insertText(registrationaddress2,num8);
		Thread.sleep(7000);
		reusable.arrowdown(registrationaddress2);
		reusable.insertText(state2,num9);
		reusable.insertText(city2,num10);
		reusable.click(nextbtn);

}
}