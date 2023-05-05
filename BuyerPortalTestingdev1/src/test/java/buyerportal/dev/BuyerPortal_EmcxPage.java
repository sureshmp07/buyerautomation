package buyerportal.dev;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuyerPortal_EmcxPage {
	private WebDriver driver;
	private ReusableFunction reusable;
	
	private By emcxicon=By.xpath("(//div[@role=\"button\"])[6]");
	private By transact1=By.xpath("(//div[text()='Transact Now'])[1]");
	private By transact2=By.xpath("(//div[text()='Transact Now'])[2]");
	private By transact3=By.xpath("(//div[text()='Transact Now'])[3]");
	private By ghaniancedi=By.xpath("//span[text()='United States Dollar']");
	private By unitedstaes=By.xpath("//span[text()='United States Dollar']");
	private By philippine=By.xpath("//span[text()='Philippine Peso']");
	private By home_dropdown=By.xpath("(//div[@role=\"button\"])[12]");
	//private By home_dropdown=By.xpath("//div[@role=\"button\"]");
	private By assert_emcx=By.xpath("//div[@class=\"text\"]");
	private By assert_wise=By.xpath("//p[text()='Wise Products']");
	private By assert_thunes=By.xpath("//span[contains(text(),' Thunes © 2023 - preproduction ')]");
	private By assert_liquid=By.xpath("//p[contains(text(),'Your B2B Trade Payment platform')]");
	private By assert_worldfirst=By.xpath("//h2[contains(text(),'WorldFirst solutions for businesses')]");
	
	public BuyerPortal_EmcxPage(WebDriver driver) {
		this.driver=driver;
	    reusable=new ReusableFunction(this.driver);
		}
	public void EmcxPage(String name1,String name2,String name3,String name4) throws InterruptedException, IOException
	{   
		reusable.click(emcxicon);
		reusable.assertion(assert_emcx,name1);
		reusable.click(transact1);
		reusable.assertion(assert_wise, name2);
		reusable.click(transact2);
		reusable.assertion(assert_thunes,name3);
		reusable.click(transact3);
		reusable.assertion(assert_liquid,name4);
		reusable.click(home_dropdown);
		reusable.click(home_dropdown);
		reusable.click(unitedstaes);
		//reusable.assertion1(assert_emcx,name1);
     }
}