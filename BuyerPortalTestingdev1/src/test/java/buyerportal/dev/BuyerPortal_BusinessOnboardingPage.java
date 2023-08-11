package buyerportal.dev;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuyerPortal_BusinessOnboardingPage {
    
	private WebDriver driver;
	private ReusableFunction reusable;
	
	private By businessbtn=By.xpath("(//div[@class='MuiListItemIcon-root css-1ddsiuw-MuiListItemIcon-root'])[2]");
	
	private By upgrade=By.xpath("//button[text()='Upgrade']");
	
	private By f_name=By.xpath("//input[@id=\"first_name\"]");
	private By l_name=By.xpath("//input[@id=\"last_name\"]");
	private By code=By.xpath("//input[@id=\"country_code\"]");
	private By phone=By.xpath("//input[@id=\"phone\"]");
	private By verify=By.xpath("//div[text()='Verify']");
	private By otp=By.xpath("//input[@autocomplete=\"one-time-code\"]");
	private By company_legal=By.xpath("(//input[@id=\"corporate_name\"])[2]");
	private By country_incorp=By.xpath("(//input[@id=\"country_of_incorporation\"])[2]");
	private By designation=By.xpath("//input[@id=\"designation\"]");
	private By checkbox=By.xpath("(//input[@type=\"checkbox\"])[2]");
	private By next=By.xpath("(//button[text()='Next'])[2]");
	
	private By assert_businessprofile=By.xpath("//h3[contains(text(),'Basic Business Details')]");

	
	private By companylogo=By.xpath("//div[@class=\"upload-logo\"]");
	private By applybutton=By.xpath("//button[text()='Apply']");
	private By removebutton=By.xpath("//button[text()='Remove']");
	private By deletebutton=By.xpath("//button[text()='Yes, Delete It']");
	
	private By coverphoto=By.xpath("//button[text()='EDIT']");
	
    private By editicon=By.xpath("(//*[local-name()='svg' and @data-testid=\"EditIcon\"])[1]");
	
//	private By entityname=By.xpath("//input[@id=\"corporate_name\"]");
//	private By countryofincorporation=By.xpath("//input[@id=\"country_of_incorporation\"]");
	private By CountryofOperation=By.xpath("//input[@id=\"country_of_operation\"]");
	private By tin=By.xpath("//input[@id=\"tax_id\"]");
	private By Registrationcheckbox=By.xpath("//span[text()='Registration Number same as Tax ID']");
	private By EntityRegistrationNumber=By.xpath("//input[@id=\\\"registration_number\\\"]");
	private By doi=By.xpath("//input[@id=\"date_of_incorporation\"]");
	private By companywebsite=By.xpath("//input[@id=\"website\"]");
	private By PrimaryIndustry=By.xpath("(//input[@aria-autocomplete=\"list\"])[4]");
	private By SecondaryIndustry=By.xpath("(//input[@role=\"combobox\"])[5]");
	private By TypeofEntity=By.xpath("//input[@id=\"entity_type\"]");
	private By NoofEmployees=By.xpath("//input[@id=\"company_size\"]");
	private By AnnualTurnover=By.xpath("//input[@id=\"revenue_range\"]");
	private By OnlinePages=By.xpath("//input[@name=\"social_presence[0]\"]");
	private By companydescription=By.xpath("//textarea[@id=\"outlined-multiline-flexible\"]");
	private By nextbutton=By.xpath("//button[text()='Next']");
	
	private By assert_ContactDetails=By.xpath("//h3[text()='Contact Details']");	
	
//	private By updatebutton=By.xpath("//button[text()='Update']");
//	
	private By location=By.xpath("//input[@id='address']");
	private By city=By.xpath("//input[@id=\"city\"]");
	private By	backbutton=By.xpath("//button[text()='Back']");
	private By	nextbutton1=By.xpath("//button[text()='Next']");
	
	private By assert_OtherInformation=By.xpath("//h3[contains(text(),'Other Information')]");
//	private By mailingaddress=By.xpath("//span[text()='I have a different mailing address']");
//	
//	private By code=By.xpath("//input[@id='primary_country_code']");
//	private By phone=By.xpath("//input[@id='primary_phone']");
////			+symbol=(//*[local-name()='svg' and @data-testid="AddCircleIcon"])[1]
//	private By checkbox=By.xpath("//span[text()='I would like to set main working hours for my business.']");
//    private By	nextbutton1=By.xpath("//button[text()='Next']");    		
//    private By	backbutton=By.xpath("//button[text()='Back']");
//
      private By awardbutton=By.xpath("//button[text()='Add Award']");
      private By awardname=By.xpath("//input[@name='awarding_organization_award_name']");
//    private By awardcategory=By.xpath("//input[@id='award_category']");
//    private By awarddescription=By.xpath("//textarea[@name='award_description']");
//    private By awardlinks=By.xpath("//input[@id='award_news_links']");
      private By saveaward=By.xpath("//button[text()='Save Award']");
//
      private By news=By.xpath("//button[text()='Add News']");
      private By headline=By.xpath("//input[@name='headline']");
//    private By newsdescription=By.xpath("//textarea[@name='news_description']");		
//    private By newslink=By.xpath("//input[@id='news_links']");		
      private By savenews=By.xpath("//button[text()='Save News']");		
//	
//    
      private By link1=By.xpath("//a[text()='1.SME Financial Empowerment Foundational Financial Literacy']");	
      private By link2=By.xpath("//a[text()='2.SME Financial Empowerment Global Financial Literacy']");
      private By link3=By.xpath("//a[text()='3.SME Financial Empowerment Green Financing for SMEs']");
      
      private By assert_finish=By.xpath("//div[text()='Congratulations']");
      
      private By add_staff=By.xpath("//button[text()='Add Staff']");
      private By assert_staff=By.xpath("//h3[text()='Staff']");
      
//     private By attachment=By.xpath("//div[@class='brows-text']");		
//    private By designation=By.xpath("//input[@id='designation']");		
//   
//    private By assert_ContactDetails=By.xpath("//h3[text()='Contact Details']");			
//    private By assert_OtherInformation=By.xpath("//h3[text()='Other Information']");
    
	public BuyerPortal_BusinessOnboardingPage(WebDriver driver) {
		this.driver=driver;
	    reusable=new ReusableFunction(this.driver);
		}
	
	public void  BusinessProfilePage(String s1,String s2,String s3,String s4,String s5,String s6,String s7,String s8,String s9) throws InterruptedException, AWTException, IOException
	{   

		reusable.click(businessbtn);
		reusable.click(upgrade);
		reusable.sendkeyss(f_name,s1);
		reusable.sendkeyss(l_name,s2);
		reusable.sendkeyss(code,s3);
		reusable.arrowdown(code);
		reusable.sendkeyss(phone,s4);
		reusable.click(verify);
		reusable.sendkeyss(otp,s5);
		reusable.sendkeyss(company_legal,s6);
		reusable.sendkeyss(country_incorp,s7);
		reusable.arrowdown(country_incorp);
		reusable.sendkeyss(designation,s8);
		reusable.click(checkbox);
		reusable.click(next);
		reusable.assertion(assert_businessprofile, s9);
	}
	public void basicBusinessDetailsPage(String filepath,String b1,String b2,String b3,String b4,String b5) throws InterruptedException, AWTException, IOException
	{   
		
		
	//	reusable.clicking(companylogo);
	//	reusable.uploadrobot( filepath);
//		reusable.click(applybutton);
//		reusable.click(companylogo);
//		reusable.click(removebutton);
//		reusable.click(deletebutton);
//		
//		reusable.clicking(coverphoto);
//		reusable.uploadrobot( filepath);
//		reusable.click(applybutton);
//		reusable.click(coverphoto);
//		reusable.click(removebutton);
//		reusable.click(deletebutton);
				
		reusable.sendkeyss(tin,b1);
		reusable.clicking(Registrationcheckbox);
		reusable.sendkeyss(doi, b2);
		reusable.sendkeyss(companywebsite, b3);
		reusable.sendkeyss(PrimaryIndustry,b4);
		reusable.multipleArrowDown(PrimaryIndustry);
		reusable.click(nextbutton);	
		reusable.assertion(assert_ContactDetails,b5);
	}
	public void contactDetailsPage(String text1,String text2,String text3) throws InterruptedException, AWTException, IOException
	{   

		reusable.sendkeyss(location,text1);
	    reusable.arrowdown(location);
		reusable.sendkeyss(city,text2);
		reusable.click(backbutton);
//		reusable.click(nextbutton);
//		reusable.arrowdown(phone);
//		reusable.click(checkbox);
		reusable.click(nextbutton1);
		reusable.click(nextbutton1);
		reusable.assertion(assert_OtherInformation, text3);
		
	}
	public void OtherInformationPage(String text1,String text2,String text3,String text4) throws InterruptedException, AWTException
	{
		reusable.click(awardbutton);
	    reusable.sendkeyss(awardname,text1);
//		reusable.sendkeyss(awardcategory,text2);
//		reusable.sendkeyss(awarddescription,text3);
//		reusable.sendkeyss(awardlinks,text4);
		reusable.click(saveaward);
		reusable.click(news);
		reusable.sendkeyss(headline,text2);
//		reusable.sendkeyss(newsdescription,text6);
//		reusable.sendkeyss(newslink,text7);
		reusable.click(savenews);
		
		reusable.click(link1);
		reusable.parentWindow(0);
		reusable.click(link2);
		reusable.parentWindow(0);
		reusable.click(link3);
		reusable.parentWindow(0);
//		reusable.click( attachment);
//		reusable.uploadrobot( filepath1);
	//	reusable.click(designation);
		reusable.click(nextbutton);
		reusable.assertion(assert_finish, text3);
		reusable.click(add_staff);
		reusable.assertion(assert_staff, text4);
	}
	

}