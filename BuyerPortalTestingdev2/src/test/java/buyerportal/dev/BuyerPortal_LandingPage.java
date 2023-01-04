package buyerportal.dev;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class BuyerPortal_LandingPage {
	
	private WebDriver driver;
	private ReusableFunction reusable;
	
	private By about=By.xpath("//*[text()='About']");
	private By searchbox=By.xpath("//div[@role=\"combobox\"]/input[@class=\"z-index-hero w-full\"]");
	private By searchclick =By.xpath("(//span[@class='MuiTouchRipple-root css-8je8zh-MuiTouchRipple-root'])[2]");
	private By foodclick=By.xpath("//div[text()='Popular:']/following::div[text()='Food']");
	private By apparelclick=By.xpath("//div[text()='Popular:']/following::div[text()='Apparel']");
	private By Beautyclick=By.xpath("//div[text()='Popular:']/following::div[text()='Beauty']");
	private By Furnitureclick=By.xpath("//div[text()='Popular:']/following::div[text()='Furniture']");

	private By categoriesleft=By.xpath("(//div[@class=\"left-arrow-category cursor-pointer\"])[1]");
	private By categoriesright=By.xpath("(//div[@class=\"right-arrow-category cursor-pointer\"])[1]");
	
	private By food_and_beverageclick=By.xpath("//div[text()='Food and Beverage']");
	private By textileclick=By.xpath("(//div[text()=\"Textiles\"])[2]");
	private By chemicalsclick=By.xpath("(//div[text()=\"Chemicals\"])[2]");
	private By Agricultureclick=By.xpath("(//div[text()=\"Agriculture\"])[2]");
	private By machineryclick=By.xpath("(//div[text()=\"Machinery\"])[2]");
	
	private By testimonialsleft=By.xpath("(//div[@class=\"left-arrow-category cursor-pointer\"])[2]");
	private By testimonialsright=By.xpath("(//div[@class=\"right-arrow-category cursor-pointer\"])[2]");
	
	private By expandclick=By.xpath("//*[local-name()='svg' and @data-testid=\"ExpandMoreIcon\"]");
	private By connect=By.xpath("//span[text()='Connect']");
	private By protect=By.xpath("//span[text()='Protect']");
	private By Finance=By.xpath("//span[text()='Finance']");
	private By OurCompany=By.xpath("//span[text()='Our Company']");
	private By covid19=By.xpath("//span[text()='Fight against Covid-19']");
	private By SMEs=By.xpath("//span[text()='SMEs']");
	private By Marketplaces=By.xpath("//span[text()='Marketplaces']");
	private By TradeAssociations=By.xpath("//span[text()='Trade Associations']");
	private By ServiceProviders=By.xpath("//span[text()='Service Providers']");
	private By Investors=By.xpath("//span[text()='Investors']");
	private By Employees=By.xpath("//span[text()='Employees']");
	private By Blog=By.xpath("//span[text()='Blog']");
	private By News=By.xpath("//span[text()='News']");
	
	private By linkedin=By.xpath("(//*[local-name()='svg' and @class=\"cursor-pointer\" ])[3]");
	
	private By twitter=By.xpath("	");
	private By youtibe=By.xpath("(//*[local-name()='svg' and @class=\"cursor-pointer\" ])[5]");
	private By fb=By.xpath("(//*[local-name()='svg' and @class=\"cursor-pointer\" ])[6]");
	
	private By terms=By.xpath("//span[text()='Terms of Use']");
	private By NetworkTerms =By.xpath("//span[text()='Network Terms of Use']");
	private By PrivacyPolicy =By.xpath("//span[text()='Privacy Policy']");

	private By connect1=By.xpath("//p[text()='Our Connection to the World']");
	private By protect1=By.xpath("//div[text()='Discover, Trade and Pay Seamlessly and Securely']");
	private By Finance1=By.xpath("//p[text()='SME Financing Made Easy']");
	private By OurCompany1=By.xpath("//div[text()='Connecting the World’s SMEs to Each Other']");
	private By covid191=By.xpath("//div[text()='Change the Way You Procure Medical Supplies']");
	private By SMEs1=By.xpath("//p[text()='Source Globally, Sell Internationally']");
	private By Marketplaces1=By.xpath("//div[text()='Boost Your Expansion,']");
	private By TradeAssociations1=By.xpath("//div[text()='Kickstart Your Own Digital Marketplace']");
	private By ServiceProviders1=By.xpath("//p[text()='Discover, Be Discovered']");	
	private By Investors1=By.xpath("//div[text()='Join in our SME Empowerment Vision']");
	private By Employees1=By.xpath("//p[text()='Own your work, kick start a career filled with endless possibilities']");
	private By Blog1=By.xpath("//b[text()='Blogs']");
	private By News1=By.xpath("//b[text()='News']");
			
	private By linkedin1=By.xpath("//span[contains(text(),'We empower B2B eCommerce platforms with broader access to global trade')]");
	private By twitter1=By.xpath("//span[text()='We empower B2B eCommerce platforms with broader access to global trade and innovative digital solutions.']");		
	private By youtibe1=By.xpath("//yt-formatted-string[text()='Proxtera Pte Ltd']");		
	private By fb1=By.xpath("//h1[text()='Proxtera']");				
			
	private By terms1=By.xpath("//div[text()='Proxtera Website – Terms of Use']");	
	private By NetworkTerms1=By.xpath("//p[text()='Proxtera Network – Terms of Use']");
	private By PrivacyPolicy1=By.xpath("//h1[text()='Privacy Policy']");
			
	public BuyerPortal_LandingPage(WebDriver driver) {
		this.driver=driver;
	    reusable=new ReusableFunction(this.driver);
		}
	

	public void landingpage(String name1) throws InterruptedException
	{   
		reusable.click(about);
		Thread.sleep(2000);
	    reusable.navigate(driver);
		reusable.insertText(searchbox, name1);
		reusable.click(searchclick);
	    Thread.sleep(3000);
		//reusable.navigate(driver);
	}
		public void landingpage1() throws InterruptedException 
		{		
		reusable.click(foodclick);
		Thread.sleep(2000);
		reusable.scrollDown(driver);
		Thread.sleep(2000);
		reusable.navigate(driver);
		reusable.click(apparelclick);
		Thread.sleep(2000);
		reusable.navigate(driver);
		reusable.click(Beautyclick);
		Thread.sleep(2000);
		reusable.navigate(driver);
		reusable.click(Furnitureclick);
		Thread.sleep(2000);
		reusable.navigate(driver);
		}
		
		public void landingpage2() throws InterruptedException 
		{		
		reusable.scrollByVisibilityOfElement(categoriesright);
		reusable.click(categoriesright);
		Thread.sleep(2000);
		reusable.click(categoriesleft);
		reusable.click(food_and_beverageclick);
		Thread.sleep(2000);
		reusable.scrollDown(driver);
		Thread.sleep(2000);
		reusable.navigate(driver);
		reusable.click(textileclick);
		Thread.sleep(2000);
		reusable.scrollDown(driver);
		Thread.sleep(2000);
		reusable.navigate(driver);
		reusable.click(chemicalsclick);
		Thread.sleep(2000);
		reusable.scrollDown(driver);
		Thread.sleep(2000);
		reusable.navigate(driver);
		reusable.click(Agricultureclick);
		Thread.sleep(2000);
		reusable.scrollDown(driver);
		Thread.sleep(2000);
		reusable.navigate(driver);
		reusable.click(machineryclick);
		Thread.sleep(2000);
		reusable.scrollDown(driver);
		reusable.navigate(driver);
		}
		
		public void testimonials1() throws InterruptedException
		{
			
			reusable.click(testimonialsleft);
		    Thread.sleep(2000);
			reusable.click(testimonialsright);
		}
		public void footer() throws InterruptedException, IOException
		{
			reusable.scrollByVisibilityOfElement(expandclick);
			reusable.click(expandclick);
			reusable.click(connect);
			reusable.switchTo(connect1, 1);
			Thread.sleep(2000);
			reusable.scrollDown(driver);
			reusable.click(protect);
		    reusable.switchTo(protect1, 2);
			Thread.sleep(2000);
			reusable.click(Finance);
			reusable.switchTo(Finance1, 3);
			Thread.sleep(2000);
        	reusable.click(OurCompany);
			reusable.switchTo(OurCompany1, 4);
			Thread.sleep(2000);
			reusable.click(covid19);
			reusable.switchTo(covid191, 5);
			Thread.sleep(2000);
			reusable.click(SMEs);
			reusable.switchTo(SMEs1, 6);
			Thread.sleep(2000);
			reusable.click(Marketplaces);
			reusable.switchTo(Marketplaces1, 7);
			Thread.sleep(2000);
			reusable.click(TradeAssociations);
			reusable.switchTo(TradeAssociations1, 8);
			Thread.sleep(2000);
			reusable.click(ServiceProviders);
			reusable.switchTo(ServiceProviders1, 9);
			Thread.sleep(2000);
			reusable.click(Investors);
			reusable.switchTo(Investors1, 10);
			Thread.sleep(2000);
			reusable.click(Employees);
			reusable.switchTo(Employees1, 11);
			Thread.sleep(2000);
			reusable.click(Blog);
			reusable.switchTo(Blog1, 12);
			Thread.sleep(2000);
			reusable.click(News);
			reusable.switchTo(News1, 13);
			Thread.sleep(2000);
			
			reusable.actions(linkedin);
			reusable.switchTo(linkedin1, 14);
			Thread.sleep(2000);
			reusable.actions(twitter);
			reusable.switchTo(twitter1, 15);
			Thread.sleep(2000);
			reusable.actions(twitter);
			reusable.switchTo(twitter1, 16);
			Thread.sleep(2000);
			reusable.actions(youtibe);
			reusable.switchTo(youtibe1, 17);
			Thread.sleep(2000);
			reusable.actions(fb);
			reusable.switchTo(fb1, 18);
			Thread.sleep(2000);
		    reusable.click(terms);
			reusable.switchTo(terms1, 19);
			Thread.sleep(2000);
			reusable.click(NetworkTerms);
			reusable.switchTo(NetworkTerms1, 20);
			Thread.sleep(2000);
			reusable.click(PrivacyPolicy);
			reusable.switchTo(PrivacyPolicy1, 21);
			reusable.driverclose();
		

	}
}

	

