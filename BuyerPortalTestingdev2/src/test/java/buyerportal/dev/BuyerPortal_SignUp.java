package buyerportal.dev;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class BuyerPortal_SignUp {
	private WebDriver driver;
	private ReusableFunction reusable;
	
    private By joinus=By.xpath("//div[text()='Join Us']");
    private By signin=By.xpath("//div[text()='Sign In']");
	//private By joinusnow =By.xpath("//span[text()='Join us now']");
    
    private By facebooklogin=By.xpath("//p[text()='Continue with Facebook']");
    private By fb_email=By.xpath("//input[@id=\"email\"]");
    private By fb_pass=By.xpath("//input[@id=\"pass\"]");
    private By fb_submit=By.xpath("//button[@name=\"login\"]");
    
    
    private By logouticon=By.xpath("//*[local-name()='svg' and @data-testid=\"LogoutIcon\"]");
    private By logout=By.xpath("//p[text()='Ok']");
    
    private By googlelogin=By.xpath("//p[text()='Continue with Google']");
    private By google_email=By.xpath("//input[@type=\"email\"]");
    private By google_pass=By.xpath("//input[@type=\"password\"]");
    private By google_next=By.xpath("//span[text()='Next']");
    
    private By commercial=By.xpath("//a[text()='Commercial Agreement & Terms and Conditions.']\r\n");
    private By terms_of_use=By.xpath("//a[text()='Terms of Use.']");
    private By Privacy=By.xpath("//a[text()='Privacy and Security Policies.']\r\n");
    
    
	private By email=By.xpath("//input[@name=\"email\"]");
	private By signup=By.xpath("//p[text()='Sign Up']");
	private By firstname=By.xpath("//input[@name=\"first_name\"]");
	private By lastname=By.xpath("//input[@name=\"last_name\"]");
	private By username=By.xpath("//input[@name='username']");
	private By password=By.xpath("//input[@name='password']");
	private By continuebutton=By.xpath("//p[text()='Continue']");
	
	private By expected_fb=By.xpath("//span[text()='S04 - 3 Seater']");
	private By expected=By.xpath("//div[text()='Email address already exists with another user account']");
	private By expected_f=By.xpath("//div[text()='First Name is required']");
	private By expected_l=By.xpath("//div[text()='Last Name is required']");
	private By expected_u=By.xpath("//div[text()='Username is required']");
	private By expected_p=By.xpath("//div[text()='Password is required']");
	
	private By expected_commercial=By.xpath("//div[text()='Password is required']");
	private By expected_terms=By.xpath("//div[text()='Password is required']");
	private By expected_privacy=By.xpath("//div[text()='Password is required']");
	
	
	private By close=By.xpath("//*[local-name()='svg' and @class=\"float-right cursor-pointer\"]");
	
	private By signupasbusiness=By.xpath("//div[text()='Sign up as a Business ']");
	private By companyname=By.xpath("//input[@name='company_name']");
	private By countryregistration=By.xpath("//input[@id='autocomplete']");
	private By taxid=By.xpath("//input[@name='tax_id']");
	private By countrycode=By.xpath("(//div[@class='MuiAutocomplete-endAdornment css-1q60rmi-MuiAutocomplete-endAdornment'])[2]");
	private By contactnumber=By.xpath("//input[@name='phone_number']");
	
    private By expected1=By.xpath("//p[text()='A minimum of 8 characters. A combination of uppercase and lowercase letters, numbers and special characters is required.']");
	
	
	private By businessemail=By.xpath("//input[@placeholder='Business Email Address*']");
	private By businesspassword=By.xpath("//input[@placeholder='Password*']");
	private By businessemailcheckbox=By.xpath("(//input[@type='checkbox'])[1]");
	private By termsofusecheck=By.xpath("(//input[@type='checkbox'])[2]");
	
	
	public BuyerPortal_SignUp(WebDriver driver) {
		this.driver=driver;
		
	    reusable=new ReusableFunction(this.driver);
		}
	public void fbsignUp(String mail,String pass,String name1,String name2,String name3,String name4) throws IOException, InterruptedException
	{
	reusable.click(joinus);
	
	//reusable.click(commercial);
	//reusable.click(terms_of_use);
	//reusable.click(Privacy);
	
	//reusable.assertion(expected_commercial,name1);
	//reusable.assertion(expected_terms,name2);
	//reusable.assertion(expected_privacy,name3);
	
	reusable.click(facebooklogin);
	reusable.insertText(fb_email,mail);
	reusable.insertText(fb_pass,pass);
	reusable.click(fb_submit);
	Thread.sleep(5000);
	reusable.assertion1(expected_fb, name4);
	reusable.clicking(logouticon);
	reusable.click(logout);
    }
	
	public void fbsignin(String mail,String pass,String name1,String name2,String name3) throws IOException
	{
	reusable.click(signin);
	
	//reusable.click(commercial);
	//reusable.click(terms_of_use);
	//reusable.click(Privacy);
	
	//reusable.assertion(expected_commercial,name1);
	//reusable.assertion(expected_terms,name2);
	//reusable.assertion(expected_privacy,name3);
	
	reusable.click(facebooklogin);
	reusable.insertText(fb_email,mail);
	reusable.insertText(fb_pass,pass);
	reusable.click(fb_submit);
	reusable.clicking(close);
	reusable.click(logout);
    }
	
	public void googlesignUp(String mail,String pass) throws InterruptedException
	{
	reusable.click(joinus);
	reusable.click(googlelogin);
	reusable.insertText(google_email,mail);
	reusable.click(google_next);
	Thread.sleep(3000);
	reusable.insertText(google_pass,pass);
	reusable.click(google_next);
	reusable.click(close);
	reusable.click(logout);
    }
	
	
	public void signUp(String name1,String name2,String name3,String name4,String name5,String name6) throws InterruptedException, IOException
	{
	reusable.click(joinus);
	reusable.insertText(email,name1);
	reusable.click(signup);
	reusable.insertText(firstname, name2);
	reusable.insertText(lastname, name3);
	reusable.insertText(username, name4);
	reusable.insertText(password,name5);
	reusable.click(continuebutton);
	Thread.sleep(3000);
	reusable.assertion(expected, name6);
	reusable.clicking(close);	
    }
	public void signUp01(String name1,String name2,String name3,String name4,String name5,String name6) throws InterruptedException, IOException
	{
	reusable.click(joinus);
	reusable.insertText(email,name1);
	reusable.click(signup);
	reusable.insertText(firstname, name2);
	reusable.insertText(lastname, name3);
	reusable.insertText(username, name4);
	reusable.insertText(password,name5);
	reusable.click(continuebutton);
	Thread.sleep(3000);
	reusable.assertion(expected1, name6);
	reusable.clicking(close);	
    }
	public void signUp02(String name1,String name2,String name3,String name4,String name5,String name6) throws InterruptedException, IOException
	{
	reusable.click(joinus);
	reusable.insertText(email,name1);
	reusable.click(signup);
	reusable.insertText(firstname, name2);
	reusable.insertText(lastname, name3);
	reusable.insertText(username, name4);
	reusable.insertText(password,name5);
	reusable.click(continuebutton);
	Thread.sleep(3000);
	//reusable .assertion(expected2, name6);
	reusable.clicking(close);	
    }
	
	public void signUp1(String name1,String name2,String name3,String name5,String name6,String name7,String name8) throws IOException
	{
    //reusable.clicking(close);	
	reusable.click(joinus);;
	//reusable.click(googlelogin);
	reusable.insertText(email,name1);
	reusable.click(signup);
	reusable.insertText(username, name2);
	reusable.insertText(password,name3);
	//reusable.click(signupbutton);
	reusable.click(continuebutton);

	reusable.assertion(expected_f, name5);
	reusable.assertion(expected_l, name6);
	reusable.assertion(expected_u, name7);
	reusable.assertion(expected_p, name8);
}
	
	public void signUp2(String name1,String name2,String name3) throws IOException
	{
    reusable.clicking(close);	
	reusable.click(joinus);
	//reusable.click(googlelogin);
	reusable.insertText(email,name1);
	reusable.click(signup);
	reusable.insertText(username, name2);
	reusable.insertText(password,name3);
	//reusable.click(signupbutton);
	reusable.click(continuebutton);

//	reusable.assertion(actual_f, name5);
//	reusable.assertion(actual_l, name6);
//	reusable.assertion(actual_u, name7);
//	reusable.assertion(actual_p, name8);
}
}