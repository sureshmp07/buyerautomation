package buyerportal.dev;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuyerPortal_BusinessOnboardingPage {
    
	private WebDriver driver;
	private ReusableFunction reusable;
	
	private By businessbtn=By.xpath("(//div[@class='MuiListItemIcon-root css-1ddsiuw-MuiListItemIcon-root'])[2]");
	
	private By companylogo=By.xpath("//img[@class='cursor-pointer']");
	private By applybutton=By.xpath("//button[text()='Apply']");
	private By changebutton=By.xpath("//span[text()='Change Photo']");
	private By coverphoto=By.xpath("//button[text()='EDIT']");
	private By entityname=By.xpath("//input[@id=\"corporate_name\"]");
	private By countryofincorporation=By.xpath("//input[@id=\"country_of_incorporation\"]");
	private By CountryofOperation=By.xpath("//input[@id=\"country_of_operation\"]");
	private By tin=By.xpath("//input[@id=\"tax_id\"]");
	private By Registrationcheckbox=By.xpath("//span[text()='Registration Number same as Tax ID']");
	private By EntityRegistrationNumber=By.xpath("//input[@id=\\\"registration_number\\\"]");
	private By doi=By.xpath("//input[@id=\"date_of_incorporation\"]");
	private By companywebsite=By.xpath("//input[@id=\"website\"]");
	private By PrimaryIndustry=By.xpath("(//input[@aria-autocomplete=\"list\"])[4]");
	private By SecondaryIndustry=By.xpath("//input[@id=\":r61:\"]");
	private By TypeofEntity=By.xpath("//input[@id=\"entity_type\"]");
	private By NoofEmployees=By.xpath("//input[@id=\"company_size\"]");
	private By AnnualTurnover=By.xpath("//input[@id=\"revenue_range\"]");
	private By OnlinePages=By.xpath("//input[@id=\":r6h:\"]");
	private By companydescription=By.xpath("//textarea[@id=\"outlined-multiline-flexible\"]");
	private By nextbutton=By.xpath("//button[text()='Next']");
	
	private By location=By.xpath("//input[@id='address']");
	private By mailingaddress=By.xpath("//span[text()='I have a different mailing address']");
	
	private By code=By.xpath("//input[@id='primary_country_code']");
	private By phone=By.xpath("//input[@id='primary_phone']");
//			+symbol=(//*[local-name()='svg' and @data-testid="AddCircleIcon"])[1]
	private By checkbox=By.xpath("//span[text()='I would like to set main working hours for my business.']");
    private By	nextbutton1=By.xpath("//button[text()='Next']");    		
    private By	backbutton=By.xpath("//button[text()='Back']");

    private By awardbutton=By.xpath("//button[text()='Add Award']");
    private By awardname=By.xpath("//input[@name='awarding_organization_award_name']");
    private By awardcategory=By.xpath("//input[@id='award_category']");
    private By awarddescription=By.xpath("//textarea[@name='award_description']");
    private By awardlinks=By.xpath("//input[@id='award_news_links']");
    private By saveaward=By.xpath("//button[text()='Save Award']");

    private By news=By.xpath("//button[text()='Add News']");
    private By headline=By.xpath("//input[@name='headline']");
    private By newsdescription=By.xpath("//textarea[@name='news_description']");		
    private By newslink=By.xpath("//input[@id='news_links']");		
    private By savenews=By.xpath("//button[text()='Save News']");		
	
    
    private By link1=By.xpath("//a[text()='1.SME Financial Empowerment Foundational Financial Literacy']");	
    private By link2=By.xpath("//a[text()='2.SME Financial Empowerment Global Financial Literacy']");
    private By attachment=By.xpath("//div[@class='brows-text']");		
    private By designation=By.xpath("//input[@id='designation']");		
   
    private By assert_ContactDetails=By.xpath("//h3[text()='Contact Details']");			
    private By assert_OtherInformation=By.xpath("//h3[text()='Other Information']");
    
	public BuyerPortal_BusinessOnboardingPage(WebDriver driver) {
		this.driver=driver;
	    reusable=new ReusableFunction(this.driver);
		}
	

	public void basicBusinessDetailsPage(String filepath,String filepath1,String text1,String text2,String text3,String text4,String text5,String text6) throws InterruptedException, AWTException, IOException
	{   
//		reusable.click(companylogo);
//		Thread.sleep(2000);
//		reusable.click(changebutton);
//		Thread.sleep(2000);
		
		reusable.click(businessbtn);
		Thread.sleep(2000);
		//reusable.click(companylogo);
	//	Thread.sleep(2000);
		reusable.clicking(changebutton);
		Thread.sleep(2000);
		reusable.uploadrobot( filepath);
		Thread.sleep(2000);
		reusable.click(applybutton);
		Thread.sleep(2000);
		reusable.click(coverphoto);
		Thread.sleep(2000);
		reusable.clicking(changebutton);
		Thread.sleep(2000);
		reusable.uploadrobot( filepath1);
		Thread.sleep(2000);
		reusable.click(applybutton);
		Thread.sleep(2000);
		reusable.sendkeyss(entityname,text1);
		Thread.sleep(2000);
		reusable.sendkeyss(countryofincorporation,text2);
		reusable.arrowdown(countryofincorporation);
		Thread.sleep(2000);
		reusable.sendkeyss(CountryofOperation,text3);
		reusable.arrowdown(CountryofOperation);
		Thread.sleep(2000);
		reusable.sendkeyss(tin,text1);
		Thread.sleep(2000);
		reusable.clicking(Registrationcheckbox);
		Thread.sleep(2000);
		reusable.sendkeyss(doi, text4);
		Thread.sleep(2000);
		reusable.sendkeyss(companywebsite, text5);
		Thread.sleep(2000);
		reusable.click(PrimaryIndustry);
		Thread.sleep(2000);
		reusable.multipleArrowDown(PrimaryIndustry);
		Thread.sleep(2000);
		reusable.click(nextbutton);	
		Thread.sleep(2000);
		reusable.assertion1(assert_ContactDetails, text6);
	}
	public void contactDetailsPage(String text1,String text2,String text3,String text4) throws InterruptedException, AWTException, IOException
	{   

		reusable.sendkeyss(location,text1);
		Thread.sleep(3000);
	    reusable.arrowdown(location);
		Thread.sleep(2000);
		reusable.sendkeyss(code,text2);
		Thread.sleep(2000);
		reusable.arrowdown(code);
		Thread.sleep(2000);
		reusable.sendkeyss(phone,text3);
		Thread.sleep(2000);
		reusable.arrowdown(phone);
		Thread.sleep(2000);
		reusable.click(checkbox);
		Thread.sleep(2000);
		reusable.click(nextbutton1);
		Thread.sleep(2000);
		reusable.assertion1(assert_OtherInformation, text4);
		
	}
	public void OtherInformationPage(String text1,String text2,String text3,String text4,String text5,String text6,String text7,String filepath1) throws InterruptedException, AWTException
	{
		reusable.click(awardbutton);
		Thread.sleep(2000);
	    reusable.sendkeyss(awardname,text1);
		Thread.sleep(2000);
		reusable.sendkeyss(awardcategory,text2);
		Thread.sleep(2000);
		reusable.sendkeyss(awarddescription,text3);
		Thread.sleep(2000);
		reusable.sendkeyss(awardlinks,text4);
		Thread.sleep(2000);
		reusable.click(saveaward);
		Thread.sleep(2000);
		reusable.click(news);
		Thread.sleep(2000);
		reusable.sendkeyss(headline,text5);
		Thread.sleep(2000);
		reusable.sendkeyss(newsdescription,text6);
		Thread.sleep(2000);
		reusable.sendkeyss(newslink,text7);
		Thread.sleep(2000);
		reusable.click(savenews);
		
		Thread.sleep(2000);
		reusable.click(link1);
		Thread.sleep(2000);
		reusable.parentWindow(0);
		Thread.sleep(2000);
		reusable.click(link2);
		Thread.sleep(2000);
		reusable.parentWindow(0);
		Thread.sleep(2000);
		reusable.click( attachment);
		Thread.sleep(2000);
		reusable.uploadrobot( filepath1);
		Thread.sleep(2000);
		reusable.click(designation);
		Thread.sleep(2000);
		reusable.click(nextbutton);
		
	}
	

}