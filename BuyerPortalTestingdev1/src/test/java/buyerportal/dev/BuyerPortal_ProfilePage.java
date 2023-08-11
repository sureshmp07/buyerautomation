package buyerportal.dev;

import java.awt.AWTException;
import java.io.IOException;

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
	
	private By coverpic=By.xpath("//div[@class='change-cover']");
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
	private By assert_profile=By.xpath("//div[text()='Profile updated successfully']");
	

	public BuyerPortal_ProfilePage(WebDriver driver) {
		this.driver=driver;
	    reusable=new ReusableFunction(this.driver);
		}
	

	public void profileUpdate(String filepath,String name1,String name2,String name3,String name4,String name5,String name6,String name7,String name8) throws InterruptedException, AWTException, IOException
	{
		reusable.clickOn(profileicon);
//		reusable.clickOn(profilepic);
//		reusable.uploadrobot(filepath);
//		reusable.clickOn(profilepic_apply);
//		reusable.clickOn(profilepic);
//		reusable.clickOn(profilepic_remove);
//		reusable.clickOn(profilepic_delete);
//		
//		reusable.clickOn(coverpic);
//		reusable.uploadrobot(filepath);
//		reusable.clickOn(coverpic_apply);
//		reusable.clickOn(coverpic);
//		reusable.clickOn(coverpic_remove);
//		reusable.clickOn(coverpic_delete);
		
		reusable.insertText(firstname, name1);
		reusable.insertText(lastname, name2);
		reusable.insertText(designation, name3);
		reusable.insertText(aboutme,name4);
		//reusable.insertText(countrycodeclick,name5);
    	//reusable.arrowdown(countrycodeclick);
		//reusable.insertText(contactnumber, name6);
		reusable.insertText(onlinepages, name7);
		reusable.click(finish);
		reusable.assertion(assert_profile,name8);
	}
		}
