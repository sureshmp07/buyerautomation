package buyerportal.dev;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class BuyerPortal_ProfilePage {
	
	private WebDriver driver;
	private ReusableFunction reusable;
	
	private By profileicon=By.xpath("(//div[@role=\"button\"])[9]");
	private By profilepic=By.xpath("(//*[local-name()='svg' and @data-testid=\"CameraAltIcon\"])[1]");
	private By profilepic_apply=By.xpath("//button[text()='Apply']");
	private By profilepic_remove=By.xpath("//button[text()='Remove']");
	private By profilepic_delete=By.xpath("//button[text()='Yes, Delete It']");
	
	private By coverpic=By.xpath("//div[@class=\"change-cover\"]");
	private By coverpic_apply=By.xpath("//button[text()=\"Apply\"]");
	private By coverpic_remove=By.xpath("//button[text()='Remove']");
	private By coverpic_delete=By.xpath("//button[text()='Yes, Delete It']");
	
	private By firstname=By.xpath("//input[@name='first_name']");
	private By lastname=By.xpath("//input[@name='last_name']");
	private By designation=By.xpath("//input[@id=\"designation\"]");
	private By aboutme=By.xpath("//textarea[@id=\"about_me\"]");
	
	private By countrycodeclick=By.xpath("//input[@id=\"country_code\"]");
	private By contactnumber=By.xpath("//input[@id=\"phone_number\"]");
	private By onlinepages=By.xpath("//input[@name=\"social_presence[0]\"]");
	private By onlinepagesadd=By.xpath("//*[local-name()=\"svg\" and @data-testid=\"AddCircleIcon\"]");
	private By onlinepages1=By.xpath("//input[@name=\"social_presence[1]\"]");
	
	private By finish=By.xpath("//button[@type=\"submit\"]");
	
	

	public BuyerPortal_ProfilePage(WebDriver driver) {
		this.driver=driver;
	    reusable=new ReusableFunction(this.driver);
		}
	

	public void profileUpdate(String filepath,String name1,String name2,String name3,String name4,String name5,String name6,String name7) throws InterruptedException, AWTException
	{
		reusable.clickOn(profileicon);
		Thread.sleep(2000);
		reusable.clickOn(profilepic);
		Thread.sleep(2000);
		reusable.uploadrobot(filepath);
		Thread.sleep(2000);
		reusable.clickOn(profilepic_apply);
		Thread.sleep(5000);
		reusable.clickOn(profilepic);
		Thread.sleep(2000);
		reusable.clickOn(profilepic_remove);
		Thread.sleep(2000);
		reusable.clickOn(profilepic_delete);
		Thread.sleep(2000);
		
		reusable.clickOn(coverpic);
		Thread.sleep(2000);
		reusable.uploadrobot(filepath);
		Thread.sleep(2000);
		reusable.clickOn(coverpic_apply);
		Thread.sleep(5000);
		reusable.clickOn(coverpic);
		Thread.sleep(2000);
		reusable.clickOn(coverpic_remove);
		Thread.sleep(2000);
		reusable.clickOn(coverpic_delete);
		Thread.sleep(2000);
		reusable.insertText(firstname, name1);
		Thread.sleep(2000);
		reusable.insertText(lastname, name2);
		Thread.sleep(2000);
		reusable.insertText(designation, name3);
		Thread.sleep(2000);
		reusable.insertText(aboutme,name4);
		Thread.sleep(2000);
		reusable.insertText(countrycodeclick,name5);
		Thread.sleep(2000);
    	reusable.arrowdown(countrycodeclick);
    	Thread.sleep(2000);
		reusable.insertText(contactnumber, name6);
		Thread.sleep(2000);
		reusable.insertText(onlinepages, name7);
		Thread.sleep(2000);
		reusable.click(finish);

	}
		}
