package buyerportal.dev;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuyerPortal_FinancingPage {
	
	
	private WebDriver driver;
	private ReusableFunction reusable;
	
	private By financelogo=By.xpath("(//div[@role=\"button\"])[5]");
	private By getfinance=By.xpath("//button[text()=\"Get Finance\"]");
	private By mydetailsentity=By.xpath("//input[@id=\"corporate_name\"]");
	private By taxid=By.xpath("//input[@id=\"tax_id\"]");
	private By sameastaxid=By.xpath("//input[@name=\"buyer_same_as_business_numer\"]");
	private By registrationaddress=By.xpath("//input[@id=\"address\"]");
	private By state=By.xpath("//input[@id=\"state\"]");
	private By city=By.xpath("//input[@id=\"city\"]");
	private By myrole=By.xpath("(//*[local-name()='svg' and @data-testid=\"ArrowDropDownIcon\"])[2]");
	private By dropdownclick=By.xpath("//li[text()='I’m the Seller and the Borrower']");
	
	private By counter_entityname=By.xpath("//input[@id=\"counterparty_corporate_name\"]");
	private By counter_taxid=By.xpath("//input[@id=\"counterparty_tax_id\"]");
	private By counter_sameastaxid=By.xpath("//input[@name=\"seller_same_as_business_numer\"]");
	private By counter_address=By.xpath("//input[@id=\"counterparty_address\"]");
	private By counter_city=By.xpath("//input[@id=\"counterparty_city\"]");
	
	private By next=By.xpath("//button[text()='Next']");
	
	private By tradedocument=By.xpath("//label[text()='Type of Trade Document*']");
	private By tradedocumentpo=By.xpath("//ul/li[text()='Proforma Invoice']");
	private By tradedocumentfile=By.xpath("(//div[contains(text(),'Browse files')])[1]");
	private By tradedocumenttotal=By.xpath("//input[@id=\"trade_total_amount\"]");
	private By amounttofinance=By.xpath("//input[@id=\"request_amount\"]");
	private By loanmonth=By.xpath("//div[@id=\"mui-component-select-tenure_in_months\"]");
	private By loanmonthselect=By.xpath("//li[@data-value=\"4\"]");
	private By SupportingDocuments=By.xpath("//div[text()='Browse files (Pdf, Word, Excel, PPT, PNG, JPEG) 4MB maximum size per file']");
	private By checkbox=By.xpath("//input[@type=\"checkbox\"]");
	private By submit=By.xpath("//button[text()='Submit']");
	
	public BuyerPortal_FinancingPage(WebDriver driver) {
		this.driver=driver;
	    reusable=new ReusableFunction(this.driver);
		}
	

	public void financePage1(String s1,String s2,String s3,String s4,String s5,String s6,String s7,String s8,String s9) throws InterruptedException
	{   
		reusable.click(financelogo);
		reusable.click(getfinance);
		reusable.insertText(mydetailsentity, s1);
		reusable.insertText(taxid, s2);
		reusable.click(sameastaxid);
		reusable.insertText(registrationaddress, s3);
		reusable.arrowdown(registrationaddress);
		reusable.insertText(state, s4);
		reusable.insertText(city, s5);
		reusable.actions(myrole);
		//reusable.actions(myrole);
		reusable.arrowUp(dropdownclick);
		//reusable.click(dropdownclick);
		reusable.insertText(counter_entityname, s6);
		reusable.insertText(counter_taxid, s7);
		reusable.click(counter_sameastaxid);
		reusable.insertText(counter_address, s8);
		reusable.arrowdown(counter_address);
		reusable.insertText(counter_city,s9);
		reusable.click(next);		
	}
	public void financePage2(String filepath,String s1,String s2) throws InterruptedException, AWTException
	{   
		reusable.actions(tradedocument);
		
		reusable.click(tradedocumentpo);
		reusable.actions(tradedocumentfile);
		reusable.uploadrobot(filepath);
		reusable.insertText(tradedocumenttotal, s1);
		reusable.insertText(amounttofinance, s2);
		reusable.clicking(loanmonth);
		reusable.clicking(loanmonthselect);
		reusable.actions(SupportingDocuments);
		reusable.uploadrobot(filepath);
		reusable.click(checkbox);
		reusable.click(submit);
	}
	}
