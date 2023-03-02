package buyerportal.dev;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    public class BuyerPortal_Trusted_EucationPage {
	
	private WebDriver driver;
	private ReusableFunction reusable;
	
	private By trusted=By.xpath("(//div[@role=\"button\"])[4]");
	private By demo=By.xpath("//div[text()='Demo']");
	
	private By education=By.xpath("(//div[@role=\"button\"])[8]");
	private By login=By.xpath("//button[text()='Log In']");
	
	public BuyerPortal_Trusted_EucationPage(WebDriver driver) {
		this.driver=driver;
		
	    reusable=new ReusableFunction(this.driver);
		}
	public void trustedPage() throws IOException, InterruptedException
	{
	reusable.click(trusted);
	Thread.sleep(2000);
	reusable.click(demo);
    }
	public void educationPage() throws IOException, InterruptedException
	{
	reusable.click(education);
	Thread.sleep(2000);
	reusable.click(login);
	
    }
    }