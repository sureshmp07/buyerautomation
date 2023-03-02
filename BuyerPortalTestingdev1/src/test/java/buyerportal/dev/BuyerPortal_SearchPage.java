package buyerportal.dev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class BuyerPortal_SearchPage {
	private WebDriver driver;
	private ReusableFunction reusable;
	
	private By search =By.xpath("//input[@id='search']");
	private By searchclick=By.xpath("//p[text()='Search']");
	private By tableclick=By.xpath("//img[@class='card-image cursor-pointer']");
	private By profileicon=By.xpath("//div[@class='MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-gsvcde-MuiAvatar-root']");
	private By logout=By.xpath("//li[text()='Logout']");
	//private String heading = driver.findElement(By.xpath("//div[@class='text']//h2")).getText();
	

	public BuyerPortal_SearchPage(WebDriver driver) {
		this.driver=driver;
	    reusable=new ReusableFunction(this.driver);
		}
	

	public void search(String name)
	{
	reusable.click(profileicon);
	reusable.click(logout);
	reusable.sendkeyss(search, name);
	reusable.clicking(searchclick);
	reusable.clicking(tableclick);

}
}