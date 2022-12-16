package buyerportal.dev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuyerPortal_FinancingPage {
	
	
	private WebDriver driver;
	private ReusableFunction reusable;
	
	private By companylogo=By.xpath("//div[@class=\"upload-logo\"]");
	private By applybutton=By.xpath("//button[text()='Apply']");
	private By changebutton=By.xpath("//span[text()='Change Photo']");
	private By coverphoto=By.xpath("//button[text()='EDIT']");
	
	public BuyerPortal_FinancingPage(WebDriver driver) {
		this.driver=driver;
	    reusable=new ReusableFunction(this.driver);
		}
	

	public void favPage() throws InterruptedException
	{   
		reusable.selectCheckboxes(favoriteicon);
		Thread.sleep(2000);
		reusable.click(pagination);
		Thread.sleep(2000);
}
