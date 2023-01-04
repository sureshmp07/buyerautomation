package buyerportal.dev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuyerPortal_ProductComparePage {
	

	private WebDriver driver;
	private ReusableFunction reusable;
	
	private By proxteraicon=By.xpath("//img[@class=\"cursor-pointer\"]");
	private By beauty=By.xpath("//div[text()='Beauty']");
	
	
	private By comapareclick1=By.xpath("(//input[@type=\"checkbox\"])[1]");
	private By comapareclick2=By.xpath("(//input[@type=\"checkbox\"])[2]");
	private By comapareclic3=By.xpath("(//input[@type=\"checkbox\"])[3]");
	
	private By searchclick =By.xpath("(//span[@class='MuiTouchRipple-root css-8je8zh-MuiTouchRipple-root'])[2]");
	private By foodclick=By.xpath("//div[text()='Popular:']/following::div[text()='Food']");
	
	private By compareclick=By.xpath("//button[text()='Compare']");
	private By compareimage1=By.xpath("//img[@class='img']");
	
	private By imageclose=By.xpath("(//*[local-name()='svg' and @fill='gray']/*[local-name()='path'])[1]");
	public BuyerPortal_ProductComparePage(WebDriver driver) {
		this.driver=driver;
	    reusable=new ReusableFunction(this.driver);
		}
	

	public void comparePage() throws InterruptedException
	{   
		reusable.click(proxteraicon);
		Thread.sleep(3000);
		reusable.click(beauty);
		Thread.sleep(3000);
		reusable.click(comapareclick1);
		Thread.sleep(3000);
		reusable.click(comapareclick2);
		Thread.sleep(3000);
		reusable.click(comapareclic3);
		Thread.sleep(3000);
		reusable.click(compareclick);
		Thread.sleep(3000);	
}
	public void comparePage1() throws InterruptedException
	{
		
		Thread.sleep(3000);
		reusable.clicking(imageclose);
		Thread.sleep(3000);
		reusable.clicking(imageclose);
		Thread.sleep(3000);
		reusable.click(compareimage1);
		Thread.sleep(3000);
	}
}