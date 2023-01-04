package buyerportal.dev;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuyerPortal_searchPage1 {

	
	private WebDriver driver;
	private ReusableFunction reusable;
	
	private By foodclick=By.xpath("//div[text()='Popular:']/following::div[text()='Food']");
	private By searchbox=By.xpath("//input[@type=\"text\"]");
	private By searchclick=By.xpath("//p[text()=\"Search\"]");
	
	private By proxteraicon=By.xpath("//img[@class=\"cursor-pointer\"]");
	
	private By developericonclick=By.xpath("(//*[local-name()='svg' and @class=\\\"cursor-pointer\\\" ])[1]");
	private By developerclick=By.xpath("//div[text()='Developer']");
	private By developersignup=By.xpath("//li[text()='Sign up']");
	private By developersignin=By.xpath("//li[text()='Sign in']");
	private By developerAPI=By.xpath("//li[text()='API Documentation']");
	
	private By Favourites=By.xpath("//div[text()='Favourites']");
	private By Favouritesselect=By.xpath("//*[local-name()='svg' and @class='fav-button']");
	private By PersonIcon=By.xpath("//*[local-name()='svg' and @data-testid=\"PersonIcon\"]");
	
	private By food =By.xpath("//a[text()=\"Food\"]");
	private By apparel=By.xpath("//a[text()=\"Apparel\"]");
	private By Furniture=By.xpath("//a[text()=\"Furniture\"]");
	private By Packaging=By.xpath("//a[text()=\"Packaging\"]");
	private By Textiles=By.xpath("//a[text()=\"Textiles\"]");
	private By Agriculture=By.xpath("//a[text()=\"Agriculture\"]");
	private By ElectricalTools=By.xpath("//a[text()=\"Electrical Tools\"]");
	
	private By partnerplatformclick=By.xpath("//div[@role=\"button\"]");
	private By country=By.xpath("//ul[@role=\"listbox\"]");
	
	private By comparecheckbox=By.xpath("//input[@type=\"checkbox\"]");
	private By favourite=By.xpath("(//*[local-name()='svg' and @class=\"fav-button\" ])[1]");
	
	private By arrowright=By.xpath("//*[local-name()='svg' and @data-testid='NavigateNextIcon']");
	
	private By comparebutton=By.xpath("//button[text()='Compare']");
	private By contactsupplier=By.xpath("//p[text()='Contact Supplier']");
	private By requestquote =By.xpath("//p[text()='Request Quote']");
	private By signintext =By.xpath("//p[text()='Sign - In']");
	
	private By signinbutton =By.xpath("//div[text()='Sign In']");
	private By joinusbutton =By.xpath("//div[text()='Join Us']");
	
	private By signuptext =By.xpath("//p[text()='Sign - Up']");
	
	
	
	private By compareerrormsg =By.xpath("//div[text()='You can not compare more than 3 products']");
	public BuyerPortal_searchPage1(WebDriver driver) {
		this.driver=driver;
	    reusable=new ReusableFunction(this.driver);
		}
	

	public void searchpage2(String name1,String name2,String s2,String s3,String path,String p1,int v1,int v2) throws InterruptedException
	{   
		reusable.click(foodclick);
		Thread.sleep(2000);
		try {
			reusable.insertText(searchbox, reusable.excel(path, p1, v1, v2));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread.sleep(2000);	
		reusable.click(searchclick);
		Thread.sleep(5000);
		reusable.actions(arrowright);
	    reusable.actions(proxteraicon);
	    Thread.sleep(2000);
	    reusable.navigateback();
	   
	    //Thread.sleep(2000);
	   // reusable.allcheckboxselect(Favouritesselect);
	   // Thread.sleep(2000);
		reusable.click(developerclick);
		Thread.sleep(5000);
	    reusable.click(developersignup);
	    Thread.sleep(2000);
	    reusable.navigate(driver);
	    Thread.sleep(2000);
	    reusable.click(developerclick);
	    Thread.sleep(5000);
	    reusable.click(developersignin);
	    Thread.sleep(2000);
	    reusable.navigate(driver);
	    Thread.sleep(2000);
	    reusable.click(developerclick);
	    Thread.sleep(5000);
	    reusable.click(developerAPI);
	    Thread.sleep(2000);
	    reusable.navigate(driver);
	    Thread.sleep(2000);
	    reusable.clickOn(partnerplatformclick);
	    Thread.sleep(2000);
	    reusable.clickingallelements(country);
		Thread.sleep(2000);
		reusable.clickingallelements(comparecheckbox);
		reusable.assertion(compareerrormsg, s3);
		reusable.click(comparebutton);
		reusable.click(contactsupplier);
		reusable.assertion(signintext, name2);
		reusable.navigateback();
		reusable.click(requestquote);
		reusable.assertion(signintext, s2);
}
}