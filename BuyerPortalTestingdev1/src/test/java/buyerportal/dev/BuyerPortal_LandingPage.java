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
	
	private By foodandbeverage=By.xpath("//div[text()='Food and Beverage']");
	private By textile=By.xpath("//div[text()=\"Textiles\"]");
	private By chemicals=By.xpath("(//div[text()=\"Chemicals\"])[2]");
	private By Agriculture=By.xpath("(//div[text()=\"Agriculture\"])[2]");
	private By machinery=By.xpath("(//div[text()=\"Machinery\"])[2]");
	
	private By testimonialsleft=By.xpath("(//div[@class=\"left-arrow-category cursor-pointer\"])[2]");
	private By testimonialsright=By.xpath("(//div[@class=\"right-arrow-category cursor-pointer\"])[2]");
	
	private By aboutus=By.xpath("//div[text()='About Us']");
	private By solutions=By.xpath("//div[text()='Solutions']");
	private By news=By.xpath("//div[text()='News']");
	private By contactus=By.xpath("//div[text()='Contact Us']");
	private By sfe=By.xpath("//div[text()='SFE']");
	private By tradehub=By.xpath("//div[text()='Trade Hub']");
	private By tradefinancing=By.xpath("//div[text()='Trade Financing']");
	private By emcx=By.xpath("//div[text()='EMCX']");
	private By ifes=By.xpath("//div[text()='IFEs']");
	
	private By terms=By.xpath("//div[text()='Terms & Conditions']");
	private By PrivacyPolicy =By.xpath("(//div[text()='Privacy Policy'])[1]");
	private By  faqs=By.xpath("//div[text()='FAQs']");
	
	private By linkedin=By.xpath("(//*[local-name()='svg' and @class=\"cursor-pointer opacity-7\" ])[1]");	
	private By linkedinclose=By.xpath("(//*[local-name()='svg' and @class=\"artdeco-icon lazy-loaded\"])[12]");
	private By twitter=By.xpath("(//*[local-name()='svg' and @class=\"cursor-pointer opacity-7\" ])[2]");
	private By youtibe=By.xpath("(//*[local-name()='svg' and @class=\"cursor-pointer opacity-7\" ])[3]");
	private By fb=By.xpath("(//*[local-name()='svg' and @class=\"cursor-pointer opacity-7\" ])[4]");
	
	private By termsofuse=By.xpath("//div[text()='Terms of Use']");
	private By privacy=By.xpath("(//div[text()='Privacy Policy'])[2]");

	private By aboutus1=By.xpath("//strong[text()='About Us']");
	private By solutions1=By.xpath("//strong[text()='Solutions']");
	private By news1=By.xpath("//strong[text()='Our News']");
	private By contactus1=By.xpath("//strong[text()='Contact']");
	private By sfe1=By.xpath("//div[text()='Content brought to you by']");
	private By tradehub1=By.xpath("//span[text()='meta-hub']");
	private By tradefinancing1=By.xpath("//div[@data-id=\"d2e2932\"]");
	private By emcx1=By.xpath("//div[@data-id=\"f727073\"]");
	private By ifes1=By.xpath("//h4[@class=\"breadcrumb-content words lines splitting\"]");	
			
	private By linkedin1=By.xpath("//h2[normalize-space()=\"Sign in to see who you already know at Proxtera\"]");
	private By twitter1=By.xpath("//span[text()='We empower B2B eCommerce platforms with broader access to global trade and innovative digital solutions.']");		
	private By youtibe1=By.xpath("//yt-formatted-string[text()='Proxtera Pte Ltd']");		
	private By fb1=By.xpath("//h1[text()='Proxtera']");				
			
	private By terms1=By.xpath("//h2[text()='TERMS & CONDITIONS']");	
	private By PrivacyPolicy1=By.xpath("//h2[text()=\"PRIVACY POLICY\"]");
	private By faqs1=By.xpath("//div[@data-id=\"3854979\"]");
	
	private By termsofuse1=By.xpath("//h2[text()='TERMS & CONDITIONS']");
	private By privacy1=By.xpath("//h2[text()=\"PRIVACY POLICY\"]");
	
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
			
		reusable.click(categoriesright);
		reusable.click(categoriesleft);
		reusable.click(foodandbeverage);
		Thread.sleep(2000);
		reusable.scrollDown(driver);
		Thread.sleep(2000);
		reusable.navigate(driver);
		reusable.click(textile);
		Thread.sleep(2000);
		reusable.scrollDown(driver);
		Thread.sleep(2000);
		reusable.navigate(driver);
		reusable.click(chemicals);
		Thread.sleep(2000);
		reusable.scrollDown(driver);
		Thread.sleep(2000);
		reusable.navigate(driver);
		reusable.click(Agriculture);
		Thread.sleep(2000);
		reusable.scrollDown(driver);
		Thread.sleep(2000);
		reusable.navigate(driver);
		reusable.click(machinery);
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
			
			reusable.click(aboutus);
			reusable.switchTo(aboutus1, 1);
			Thread.sleep(2000);
			reusable.scrollDown(driver);
			reusable.click(solutions);
		    reusable.switchTo(solutions1, 2);
			Thread.sleep(2000);
			reusable.click(news);
			reusable.switchTo(news1, 3);
			Thread.sleep(2000);
        	reusable.click(contactus);
			reusable.switchTo(contactus1, 4);
			Thread.sleep(2000);
			reusable.click(sfe);
			reusable.switchTo(sfe1, 5);
			Thread.sleep(2000);
			reusable.click(tradehub);
			reusable.switchTo(tradehub1, 6);
			Thread.sleep(2000);
			reusable.click(tradefinancing);
			reusable.switchTo(tradefinancing1, 7);
			Thread.sleep(2000);
			reusable.click(emcx);
			reusable.switchTo(emcx1, 8);
			Thread.sleep(2000);
			reusable.click(ifes);
			reusable.switchTo(ifes1, 9);
			Thread.sleep(2000);
			reusable.click(terms);
			reusable.switchTo(terms1, 10);
			Thread.sleep(2000);
			reusable.click(PrivacyPolicy);
			//reusable.switchTo(PrivacyPolicy1, 11);
			Thread.sleep(2000);
			reusable.click(faqs);
			//reusable.switchTo(faqs1, 12);
			Thread.sleep(2000);
			
			reusable.actions(linkedin);
			Thread.sleep(5000);
			//reusable.navigate(driver);
			//reusable.actions(linkedinclose);
			//reusable.switchTo(linkedin1, 14);
			//Thread.sleep(2000);
			reusable.actions(twitter);
			//reusable.switchTo(twitter1, 15);
			Thread.sleep(2000);
			reusable.actions(youtibe);
			//reusable.switchTo(youtibe1, 13);
			Thread.sleep(2000);
			reusable.actions(fb);
			//reusable.switchTo(fb1, 14);
			Thread.sleep(2000);
			
		    reusable.click(termsofuse);
			//reusable.switchTo(termsofuse1, 12);
			Thread.sleep(2000);
			reusable.click(privacy);
			//reusable.switchTo(privacy1, 13);
			Thread.sleep(2000);
			
		

	}
}

	

