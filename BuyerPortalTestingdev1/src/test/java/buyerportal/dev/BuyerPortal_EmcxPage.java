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
	private By transact4=By.xpath("(//div[text()='Transact Now'])[4]");
	private By ghaniancedi=By.xpath("//span[text()='Ghanaian Cedi']");
	private By unitedstaes=By.xpath("//span[text()='US Dollar']");
	private By philippine=By.xpath("//span[text()='Philippine Peso']");
	private By home_dropdown=By.xpath("(//div[@role=\"button\"])[12]");
	
	private By from_dropdown=By.xpath("//label[@id=\"From\"]/following::div");
	private By drop_ghaniancedi=By.xpath("//li[@data-value=\"GHS\"]");
	private By drop_usdollar=By.xpath("//li[@data-value=\"USD\"]");
	private By drop_php=By.xpath("//li[@data-value=\"PHP\"]");
	
	
	//private By home_dropdown=By.xpath("//div[@role=\"button\"]");
	private By assert_emcx=By.xpath("//div[text()='FX Rates']");
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
		reusable.switchTo(assert_wise,1);
		reusable.click(transact2);
		reusable.switchTo(assert_thunes,1);
		reusable.click(transact3);
		reusable.switchTo(assert_liquid,1);
		reusable.click(unitedstaes);
		reusable.click(transact1);
		reusable.switchTo(assert_worldfirst,1);
		reusable.click(transact2);
		reusable.switchTo(assert_wise,1);
		reusable.click(transact3);
		reusable.switchTo(assert_thunes,1);
		reusable.click(transact4);
		reusable.switchTo(assert_liquid,1);
		reusable.click(philippine);
		reusable.click(transact1);
		reusable.switchTo(assert_worldfirst,1);
		reusable.click(transact2);
		reusable.switchTo(assert_wise,1);
		reusable.click(transact3);
		reusable.switchTo(assert_thunes,1);
		reusable.click(transact4);
		reusable.switchTo(assert_liquid,1);
        reusable.assertion1(assert_emcx,name1);
	
		reusable.clicking(from_dropdown);
		reusable.click(drop_ghaniancedi);
		reusable.click(transact1);
		reusable.switchTo(assert_liquid,1);
		reusable.click(unitedstaes);
		reusable.click(transact1);
		reusable.switchTo(assert_liquid,1);
		reusable.clicking(from_dropdown);
		reusable.click(drop_usdollar);
		reusable.click(transact1);
		reusable.switchTo(assert_worldfirst,1);
		reusable.click(transact2);
		reusable.switchTo(assert_wise,1);
		reusable.click(transact3);
		reusable.switchTo(assert_liquid,1);
		reusable.click(ghaniancedi);
		reusable.click(transact1);
		reusable.switchTo(assert_wise,1);
		reusable.click(transact2);
		reusable.switchTo(assert_thunes,1);
		reusable.click(transact3);
		reusable.switchTo(assert_liquid,1);
		reusable.click(philippine);
		reusable.click(transact1);
		reusable.switchTo(assert_worldfirst,1);
		reusable.click(transact2);
		reusable.switchTo(assert_wise,1);
		reusable.click(transact3);
		reusable.switchTo(assert_thunes,1);
		reusable.click(transact4);
		reusable.switchTo(assert_liquid,1);
		reusable.clicking(from_dropdown);
		reusable.click(drop_php);
		reusable.click(transact1);
		reusable.switchTo(assert_liquid,1);
		reusable.click(unitedstaes);
		reusable.switchTo(assert_liquid,1);
     }
}