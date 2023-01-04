package buyerportal.dev;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class BuyerPortal_SignInPage {
	private WebDriver driver;
	private ReusableFunction reusable;
	
	//private By joinus=By.xpath("//div[text()='Join Us']");
	//private By joinusnow =By.xpath("//span[text()='Join us now']");
	private By signin=By.xpath("//div[text()='Sign In']");
	private By googlelogin=By.xpath("//p[text()='Continue with Google']");
	private By email=By.xpath("//input[@placeholder=\"Email ID\"]");
	private By password=By.xpath("//input[@type='password']");
	private By checkboxclick=By.xpath("//input[@type='checkbox']");
	private By signinbutton=By.xpath("(//p[text()='Sign - In'])[2]");
	private By close=By.xpath("//*[local-name()='svg' and @data-testid='LogoutIcon']");
	private By logout=By.xpath("//p[text()='Ok']");
	private By assert_business=By.xpath("//span[text()='S04 - 2 Seater']");
	
	public BuyerPortal_SignInPage(WebDriver driver) {
		this.driver=driver;
	    reusable=new ReusableFunction(this.driver);
		}
	
	public void signIn(String name1,String name2,String name3) throws IOException, InterruptedException
	{
	Thread.sleep(3000);	
	reusable.click(signin);
	//reusable.click(googlelogin);
	reusable.insertText(email,name1);
	reusable.insertText(password,name2);
	reusable.click(checkboxclick);
	reusable.click(signinbutton);

   Thread.sleep(5000);
	//reusable.assertion1(assert_business,name3);
	//reusable.click(tableclick);
   
}
	
	public void signIn1(String name1,String name2)
	{
		
	
	reusable.click(signin);
	//reusable.click(googlelogin);
	reusable.insertText(email,name1);
	reusable.insertText(password,name2);
	reusable.click(checkboxclick);
	reusable.click(signinbutton);
	
	reusable.clicking(close);
	reusable.click(logout);
//	try {
//		Thread.sleep(5000);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	//reusable.click(tableclick);
   // reusable.click(close);
}
	
	

}
