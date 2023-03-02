package buyerportal.dev;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuyerPortal_MySpaces {
	
	private WebDriver driver;
	private ReusableFunction reusable;
	
	private By spaces=By.xpath("(//div[@role=\"button\"])[3]");
	private By assertspaces=By.xpath("//div[text()='My Spaces Feature Coming Soon!']");
	
	
	
	public BuyerPortal_MySpaces(WebDriver driver) {
		this.driver=driver;
	    reusable=new ReusableFunction(this.driver);
		}
	public void MySpaces(String assert1) throws IOException, InterruptedException
	{
		reusable.click(spaces);
		Thread.sleep(3000);
		reusable.assertion1(assertspaces,assert1);
		
}
}