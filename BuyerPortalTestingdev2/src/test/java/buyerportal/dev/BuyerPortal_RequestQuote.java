package buyerportal.dev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class BuyerPortal_RequestQuote {

	private WebDriver driver;
	private ReusableFunction reusable;
	

	private By requestquote=By.xpath("//button/p[text()='Request Quote']");
	private By companyname=By.xpath("//input[@placeholder='Company Name' and @type='text']");
	private By quantity=By.xpath("//input[@placeholder=\"Quantity\"]");
	private By incoterms=By.xpath("//div[text()='Incoterms*']/following::div");
	private By incotermsselect=By.xpath("//li[text()='CIF']");
	private By destination=By.xpath("//input[@placeholder=\"Destination\"]");
	private By requirements=By.xpath("//textarea[@placeholder='Type your message here']");
	private By send1=By.xpath("//button/p[text()='Send']");
	
	
	
	
	
	
	
	public BuyerPortal_RequestQuote(WebDriver driver) {
		this.driver=driver;
	    reusable=new ReusableFunction(this.driver);
		}
	
	
	
	public void requestQuote(String companynam,String quantiti,String destinatio,String requiremnt)
	{
	reusable.click(requestquote);
	reusable.insertText(companyname, companynam);
	reusable.insertText(quantity, quantiti);
	reusable.clicking(incoterms);
	reusable.click(incotermsselect);
	//reusable.arrowdown(incoterms);
	reusable.insertText(destination, destinatio);
	reusable.insertText(requirements, requiremnt);
	reusable.click(send1);
	
	}
	
}
