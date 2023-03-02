package buyerportal.dev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuyerPortal_FavouritePage {
	
	private WebDriver driver;
	private ReusableFunction reusable;
	
	private By favoriteicon=By.xpath("//div[@class=\"fav-btn-holder\"]");
	private By pagination=By.xpath("(//li/button[@type='button'])[4]");
	private By favorite=By.xpath("(//div[text()='Favourites'])[1]");
	private By imageclick=By.xpath("(//img[contains(@class,'card-image')])[1]");
	
	public BuyerPortal_FavouritePage(WebDriver driver) {
		this.driver=driver;
	    reusable=new ReusableFunction(this.driver);
		}
	

	public void favPage() throws InterruptedException
	{   
		reusable.selectCheckboxes(favoriteicon);
		Thread.sleep(2000);
		reusable.click(pagination);
		Thread.sleep(2000);
		reusable.selectCheckboxes(favoriteicon);
		Thread.sleep(2000);
		reusable.click(favorite);
		Thread.sleep(2000);
		reusable.click(imageclick);
		Thread.sleep(2000);
		
	}
}
