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
	private By message=By.xpath("//textarea[@class='MuiOutlinedInput-input MuiInputBase-input MuiInputBase-inputMultiline css-1sqnrkk-MuiInputBase-input-MuiOutlinedInput-input']");
	private By send=By.xpath("//p[text()='Send']");
	
	private By company=By.xpath("(//input[@class='MuiOutlinedInput-input MuiInputBase-input css-1t8l2tu-MuiInputBase-input-MuiOutlinedInput-input'])[1]");
	private By countryclick=By.xpath("//input[@id='custom-input-demo']");
	private By taxid=By.xpath("(//input[@class='MuiOutlinedInput-input MuiInputBase-input css-1t8l2tu-MuiInputBase-input-MuiOutlinedInput-input'])[2]");
	
	public BuyerPortal_ProductDetail(WebDriver driver) {
		this.driver=driver;
	    reusable=new ReusableFunction(this.driver);
		}
	

	public void contactSupplier(String name1,String name2)
	{
	reusable.click(contactsupplier);
	reusable.clicking(enquiry);
	reusable.click(individual);
    reusable.insertText(message, name2);
    reusable.click(send);
	
}
	public void contactSupplier1(String name1,String name2,String name3,String name4,String name5)
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
	
}
	
	
	
}
