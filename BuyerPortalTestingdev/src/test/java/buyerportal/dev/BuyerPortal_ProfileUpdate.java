package buyerportal.dev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class BuyerPortal_ProfileUpdate {
	
	private WebDriver driver;
	private ReusableFunction reusable;
	
	private By profileicon=By.xpath("//div[@class='MuiAvatar-root MuiAvatar-circular css-9l7pa9-MuiAvatar-root']");
	private By profile =By.xpath("//li[text()='Profile']");
	private By edit=By.xpath("//div[text()='Edit']");
	private By firstname=By.xpath("//input[@name='first_name']");
	private By lastname=By.xpath("//input[@name='last_name']");
	private By countrycodeclick=By.xpath("//button[@type='button' and @title='Open']");
	private By countrycodeselect=By.xpath("//*[@id='autocomplete']");
	private By mobilenumber=By.xpath("//input[@name='phone_number']");
	private By save=By.xpath("//p[text()='Save']");
	private By addnew=By.xpath("//div[text()='+Add new']");
	private By email=By.xpath("//input[@name='email']");
	private By add_fname=By.xpath("//input[@name='first_name' and @type='text']");
	private By add_lname=By.xpath("//input[@name='last_name' and @type='text']");
	private By designation=By.xpath("//input[@name='designation' and @type='text']");
	private By adminchechbox=By.xpath("//input[@name='is_admin']");
	private By addnewsave=By.xpath("//button[@type='submit']");
	private By businessbuyerclick=By.xpath("//p[text()='Become a Business Buyer']");
	private By currentemail=By.xpath("(//input[@class='MuiOutlinedInput-input MuiInputBase-input css-1t8l2tu-MuiInputBase-input-MuiOutlinedInput-input'])[1]");
	private By organizationemail=By.xpath("//input[@placeholder='Business Email Address*']");
	private By organizationpassword=By.xpath("//input[@placeholder='Password*']");
	private By companyname=By.xpath("//input[@placeholder='Company Name*']");
	private By companyregistrationclick=By.xpath("(//span[@class='MuiTouchRipple-root css-8je8zh-MuiTouchRipple-root'])[3]");
	private By companyregistration=By.xpath("//input[@id='autocomplete' and @type='text']");
	private By taxid=By.xpath("//input[@placeholder='Tax ID*']");
	private By countrycodeclick1=By.xpath("(//span[@class='MuiTouchRipple-root css-8je8zh-MuiTouchRipple-root'])[5]");
	private By countrycode=By.xpath("(//input[@id='autocomplete'])[2]");
	private By companycontac=By.xpath("//input[@placeholder='Contact number*']");
	private By businesscheckbox=By.xpath("(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[1]");
	private By terms=By.xpath("(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[2]");
	private By convert=By.xpath("//p[text()='Convert']");
	
	

	public BuyerPortal_ProfileUpdate(WebDriver driver) {
		this.driver=driver;
	    reusable=new ReusableFunction(this.driver);
		}
	

	public void profileUpdate(String name1,String name2,String name3,String name4,String name5,String name6,String name7, String name8)
	{
		reusable.click(profileicon);
		reusable.click(profile);
		reusable.click(edit);
		reusable.insertText(firstname, name1);
		reusable.insertText(lastname, name2);
		reusable.click(countrycodeclick);
		reusable.insertText(countrycodeselect, name8);
		reusable.arrowUp(countrycodeselect);
		reusable.insertText(mobilenumber, name3);
		reusable.click(save);
		reusable.click(addnew);
		reusable.insertText(email, name4);
		reusable.insertText(add_fname, name5);
		reusable.insertText(add_lname, name6);
		reusable.insertText(designation, name7);
		reusable.click(adminchechbox);
		reusable.click(addnewsave);
	}
		public void becomeBusinessbuyer(String name9,String name10,String name11,String name12,String name13,String name14,String name15, String name16)	
		{
		reusable.click(businessbuyerclick);
		reusable.insertText(currentemail,name9);
		reusable.insertText(organizationemail,name10);
		reusable.insertText(organizationpassword,name11);
		reusable.insertText(companyname,name12);
		reusable.click(companyregistrationclick);
		reusable.insertText(companyregistration,name13);
		reusable.arrowdown(companyregistration);
		
		reusable.insertText(taxid,name14);
		reusable.click(countrycodeclick1);
		reusable.insertText(countrycode,name15);
		reusable.arrowdown(countrycode);
		reusable.insertText(companycontac,name16);
		reusable.click(businesscheckbox);
		reusable.click(terms);
		reusable.click(convert);
}
}
