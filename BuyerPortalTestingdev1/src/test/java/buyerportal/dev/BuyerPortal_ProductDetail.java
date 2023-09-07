package buyerportal.dev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class BuyerPortal_ProductDetail {
	
	private WebDriver driver;
	private ReusableFunction reusable;
	
	private By contactsupplier =By.xpath("//p[text()='Contact Supplier']");
	private By enquiry=By.xpath("//div[@class='MuiFormControl-root mt-5 mb-5 w-full css-1nrlq1o-MuiFormControl-root']");
	private By individual=By.xpath("//li[text()='Individual']");
	private By business=By.xpath("//li[text()='Business']");
	private By message=By.xpath("//textarea[@placeholder=\"Type your message here\"]");
	private By send=By.xpath("//button[text()='Send']");
	private By close=By.xpath("//*[local-name()='svg' and @height= '14']/*[local-name()='path']");
	
	private By assertcontactsupplier=By.xpath("//div[text()='Your request has been submitted successfully']");
	
	private By company_legalnm=By.xpath("//input[@placeholder=\"Company Legal Name*\"]");
	private By countryclick=By.xpath("//input[@id='custom-input-demo']");
	private By taxid=By.xpath("//label[text()='Tax Identification Number*']/following::input");
	//private By ondc=By.xpath("(//input[@type=\"checkbox\"])[1]");
	
	public BuyerPortal_ProductDetail(WebDriver driver) {
		this.driver=driver;
	    reusable=new ReusableFunction(this.driver);
		}
	
//
//	public void contact_individual(String name1,String name2) throws InterruptedException
//	{
//	reusable.click(contactsupplier);
//	reusable.clicking(enquiry);
//	reusable.click(individual);
//    reusable.insertText(message, name1);
//    reusable.click(send);
//    reusable.assertion(assertcontactsupplier, name2);
//    reusable.click(close);
//}
	public void contact_business(String name1,String name2,String name3,String name4) throws InterruptedException
	{
	reusable.click(contactsupplier);
	reusable.insertText(company_legalnm, name1);
	reusable.insertText(taxid, name2);
    reusable.insertText(message, name3);
    reusable.click(send);
    Thread.sleep(3000);
   // reusable.assertion(assertcontactsupplier, name4);
    reusable.refresh();
    
}
	
	
	
}
