package buyerportal.dev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class BuyerPortal_ProductDetail {
	
	private WebDriver driver;
	private ReusableFunction reusable;
	
	private By contactsupplier =By.xpath("//p[text()='Contact Supplier']");
	private By enquiry=By.xpath("//label[text()='Select']/following::div[@role=\"button\"]");
	private By individual=By.xpath("//li[text()='Individual']");
	private By business=By.xpath("//li[text()='Business']");
	private By message=By.xpath("//textarea[@placeholder=\"Type your message here\"]");
	private By send=By.xpath("//p[text()='Send']");
	
	private By company=By.xpath("//input[@placeholder=\"Company Name\"]");
	private By countryclick=By.xpath("//input[@id='custom-input-demo']");
	private By taxid=By.xpath("//input[@placeholder=\"Tax ID\"]");
	
	public BuyerPortal_ProductDetail(WebDriver driver) {
		this.driver=driver;
	    reusable=new ReusableFunction(this.driver);
		}
	

	public void contactSupplier(String name1,String name2) throws InterruptedException
	{
	reusable.click(contactsupplier);
	reusable.clicking(enquiry);
	reusable.click(individual);
    reusable.insertText(message, name2);
    reusable.click(send);
	Thread.sleep(3000);
}
	public void contactSupplier1(String name1,String name2,String name3,String name4,String name5) throws InterruptedException
	{
	reusable.click(contactsupplier);
	reusable.clicking(enquiry);
	reusable.click(business);
	reusable.insertText(company, name2);
	reusable.clicking(countryclick);
	reusable.insertText(countryclick,name3);
	reusable.arrowdown(countryclick);
	reusable.insertText(taxid, name4);
    reusable.insertText(message, name5);
    reusable.click(send);
	Thread.sleep(2000);
}
	
	
	
}
