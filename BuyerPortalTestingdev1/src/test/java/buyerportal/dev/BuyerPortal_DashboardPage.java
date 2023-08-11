package buyerportal.dev;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuyerPortal_DashboardPage {
	
	private WebDriver driver;
	private ReusableFunction reusable;	
	
	private By dashboard=By.xpath("(//div[@role=\"button\"])[1]");
	private By get_finance=By.xpath("//button[text()='Get Finance']");
	private By payment_providers=By.xpath("//div[text()='Connect to Payment Providers']");
	private By connect_stripe=By.xpath("//li[@data-value='STRIPE']");
	private By seller=By.xpath("//button[text()='Choose a Seller']");
	private By enquiries=By.xpath("//div[text()='Enquiries']");
	private By exporttable=By.xpath("//button[text()='Export Table']");
	private By purchaseorder=By.xpath("//div[text()='Purchase Orders']");
	private By uploadpurchaseorder=By.xpath("//button[text()='Upload Purchase Order']");
	private By suppliername=By.xpath("//input[@name=\"supplier_name\"]");
	private By amount=By.xpath("//input[@name=\"amount\"]");
	private By add_attachment=By.xpath("//div[text()='Add Attachments (pdf)']");
	private By upload=By.xpath("//button[text()=\"Upload\"]");
	
	private By po=By.xpath("//div[text()='Purchase Orders']");
	private By create_po=By.xpath("//button[text()='Create Purchase Order']");
	private By yourcompany=By.xpath("//input[@placeholder=\"Your Company\"]");
	private By yourname1=By.xpath("//input[@placeholder=\"Your name\"]");
	private By tin=By.xpath("//input[@placeholder=\"Tax Identification Number\"]");
	private By c_address1=By.xpath("//input[@placeholder=\"Company’s Address\"]");
	private By city_1=By.xpath("(//input[@placeholder=\"City, State Zip\"])[1]");
	private By country_1=By.xpath("(//input[@placeholder=\"Country\"])[1]");
	private By company_1=By.xpath("(//input[@placeholder=\"Company Legal Name\"])[1]");
	private By c_address2=By.xpath("(//input[@placeholder=\"Company’s Address\"])[2]");
	private By city_2=By.xpath("(//input[@placeholder=\"City, State Zip\"])[2]");
	private By country_2=By.xpath("(//input[@placeholder=\"Country\"])[2]");
	private By phone1=By.xpath("(//input[@placeholder=\"Phone Number\"])[1]");
	private By company_2=By.xpath("(//input[@placeholder=\"Company Legal Name\"])[2]");
	private By yourname2=By.xpath("//input[@placeholder=\"Your Name\"]");
	private By phone2=By.xpath("(//input[@placeholder=\"Phone Number\"])[2]");
	private By address=By.xpath("//input[@placeholder=\"Address\"]");
	private By city_3=By.xpath("(//input[@placeholder=\"City, State Zip\"])[3]");
	private By country_3=By.xpath("(//input[@placeholder=\"Country\"])[3]");
	private By po_number=By.xpath("//input[@placeholder=\"PO Number#\"]");
	private By po_date=By.xpath("(//input[@placeholder=\"Phone Number\"])[2]");
	
	
	private By product_name=By.xpath("//input[@placeholder=\"Enter item name/description\"]");
	private By quantity=By.xpath("//input[@placeholder=\"Quantity\"]");
	private By price=By.xpath("//input[@placeholder=\"Price\"]");
	private By Terms_Conditions=By.xpath("//input[@placeholder=\"Terms and Conditions\"]");
	private By comments=By.xpath("//input[@placeholder=\"Comments\"]");
	private By uploadsign=By.xpath("//div[text()='Upload Signature']");
	private By signby=By.xpath("//input[@placeholder=\"Signed By\"]");
	private By save=By.xpath("//button[text()='Save']");
	
	private By Assert_verifyyourbusiness=By.xpath("//button[text()='Verification coming soon']");
	private By Assert_finance=By.xpath("//h3[text()='My Financing Applications']");
	private By Assert_stripe=By.xpath("//span[text()='PROXTERA PTE. LTD. partners with Stripe for secure payments and financial services.']");
	private By Assert_seller=By.xpath("//div[text()='Sign up with one of our Seller Platforms']");
	private By Assert_emptyenquiries=By.xpath("//div[text()='You dont have any data on your table']");
	private By Assert_upload_po=By.xpath("//div[text()='Purchase order uploaded successfully']");
	
	public BuyerPortal_DashboardPage(WebDriver driver) {
		this.driver=driver;
	    reusable=new ReusableFunction(this.driver);
		}
	public void DashboardPage(String s1,String s2,String s3,String s4,String s5,String s6,String filepath,String s7) throws InterruptedException, IOException, AWTException
	{
		reusable.click(dashboard);
		reusable.assertion(Assert_verifyyourbusiness,s1);
		reusable.click(get_finance);
		reusable.assertion(Assert_finance,s2);
		reusable.navigateback();
		reusable.clicking(payment_providers);
		reusable.click(connect_stripe);
		//reusable.switchTo(Assert_stripe,1);
		reusable.click(seller);
		reusable.assertion(Assert_seller,s3);
		reusable.navigateback();
		reusable.click(enquiries);
		reusable.click(exporttable);
		reusable.assertion(Assert_emptyenquiries,s4);
		reusable.click(purchaseorder);
		reusable.click(exporttable);
		reusable.click(purchaseorder);
		reusable.click(uploadpurchaseorder);
		reusable.sendkeyss(suppliername, s5);
		reusable.sendkeyss(amount, s6);
		reusable.click(add_attachment);
		reusable.uploadrobot(filepath);
		reusable.click(upload);
		reusable.assertion(Assert_upload_po,s7);
	}
	public void createPo(String s1,String s2,String s3,String s4,String s5,String s6,String s7,String s8,String s9,String s10,String s11,String s12,String s13,String s14,String s15,String s16,String s17,String s18,String s19,String s20,String s21,String s22,String s23,String s24,String s25) throws InterruptedException, IOException, AWTException
	{
		reusable.click(po);
		reusable.click(create_po);
		reusable.sendkeyss(yourcompany, s1);
		reusable.sendkeyss(yourname1, s2);
		reusable.sendkeyss(tin, s3);
		reusable.sendkeyss(c_address1, s4);
		reusable.sendkeyss(city_1, s5);
		reusable.sendkeyss(country_1, s6);
		reusable.sendkeyss(company_1, s7);
		reusable.sendkeyss(c_address2, s8);
		reusable.sendkeyss(city_2, s9);
		reusable.sendkeyss(country_2, s10);
		reusable.sendkeyss(phone1, s11);
		reusable.sendkeyss(company_2, s12);
		reusable.sendkeyss(yourname2, s13);
		reusable.sendkeyss(phone2, s13);
		reusable.sendkeyss(address, s14);
		reusable.sendkeyss(city_3, s15);
		reusable.sendkeyss(country_3, s16);
		reusable.sendkeyss(po_number, s17);
		reusable.sendkeyss(po_date, s18);
		reusable.sendkeyss(product_name,s19);
		reusable.sendkeyss(quantity, s20);
		reusable.sendkeyss(price, s21);
		reusable.sendkeyss(Terms_Conditions, s22);
		reusable.sendkeyss(comments, s23);
		reusable.sendkeyss(uploadsign, s24);
		reusable.sendkeyss(signby, s25);
		reusable.click(save);
		
	}
	
}
