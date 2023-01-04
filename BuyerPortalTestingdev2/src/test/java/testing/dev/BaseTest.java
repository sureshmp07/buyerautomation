package testing.dev;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import buyerportal.dev.BuyerPortal_BusinessOnboardingPage;
import buyerportal.dev.BuyerPortal_FavouritePage;
import buyerportal.dev.BuyerPortal_FinancingPage;
import buyerportal.dev.BuyerPortal_LandingPage;
import buyerportal.dev.BuyerPortal_LoginSearch;
import buyerportal.dev.BuyerPortal_ProductComparePage;
import buyerportal.dev.BuyerPortal_ProductDetail;
import buyerportal.dev.BuyerPortal_ProfileUpdate;
import buyerportal.dev.BuyerPortal_RequestQuote;
import buyerportal.dev.BuyerPortal_SearchPage;
import buyerportal.dev.BuyerPortal_SignInPage;
import buyerportal.dev.BuyerPortal_SignUp;
import buyerportal.dev.BuyerPortal_searchPage1;
import buyerportal.dev.DriverFactory;
import buyerportal.dev.ReusableFunction;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseTest  {
	//protected static ExtentReports extent;
	//protected static ExtentTest test;
	//protected static ExtentTest parentTest;
	
	
	public DriverFactory driverFactory;
	public WebDriver driver;
	public Properties properties;
	public ReusableFunction reusable;
	//public XSSFWorkbook wb;
	
	public  BuyerPortal_SearchPage buyersearch;
	public  BuyerPortal_SignInPage buyersign;
	public  BuyerPortal_LandingPage landinpage;
	public  BuyerPortal_searchPage1 searchpage;
	
	public  BuyerPortal_LoginSearch loginsearch;
	public  BuyerPortal_ProfileUpdate buyerprofileupdate;
	public  BuyerPortal_SignUp   signup;
	public BuyerPortal_ProductDetail contactSupplier;
	public BuyerPortal_RequestQuote requestQuote;
	public BuyerPortal_ProductComparePage ProductComparePage;
	public BuyerPortal_FavouritePage FavouritePage ; 
	public BuyerPortal_BusinessOnboardingPage businessPage ;
	public BuyerPortal_ProfileUpdate profilepage;
	public BuyerPortal_FinancingPage financingPage;
	
	public static String classname=null;
	public static String testname;
	
	protected static ExtentHtmlReporter htmlreports;
	protected static ExtentReports extend;
	protected static ExtentTest test;
	protected static ExtentTest parenttest;
	protected static ExtentTest childtest;
	
	public static WebElement element;
	public static WebDriverWait wait;
	public static List<String> expre;
	
	public  ExtentTest logger;
	
	public static File setuppropfile;
	public static FileReader reader;
	public static Properties prop;
	
	

	@BeforeTest(groups = { "Smoke", "Regression", "Sanity" })
	
	public void setUp() throws IOException
	{
		
		driverFactory=new DriverFactory();
		properties=driverFactory.readproperty();
		driver=driverFactory.int_Browser(driverFactory.readproperty());
		reusable=new ReusableFunction(driver);
	    //globalpassword=new Global_changepassword(driver);
	    
	    
	   buyersearch=new BuyerPortal_SearchPage(driver);
	   buyersign=new BuyerPortal_SignInPage(driver);
	   loginsearch=new BuyerPortal_LoginSearch(driver);
	   buyerprofileupdate=new BuyerPortal_ProfileUpdate(driver);
	   signup=new BuyerPortal_SignUp(driver);
	   contactSupplier=new BuyerPortal_ProductDetail(driver);
	   requestQuote=new BuyerPortal_RequestQuote(driver);
	   ProductComparePage=new BuyerPortal_ProductComparePage(driver);
	   FavouritePage=new BuyerPortal_FavouritePage(driver);
	   businessPage=new BuyerPortal_BusinessOnboardingPage(driver);
	   profilepage=new BuyerPortal_ProfileUpdate(driver);
	   financingPage=new BuyerPortal_FinancingPage(driver);
	   
	   landinpage=new BuyerPortal_LandingPage(driver);
	   searchpage=new BuyerPortal_searchPage1(driver);
		//wb=driverFactory.excelData("Details", 2, 2);
//	    ExtentHtmlReporter extend=new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/Reports/signin.html"));
//	    report=new ExtentReports();
//	    report.attachReporter(extend);
	    
	}

//	@AfterTest
//	public void tearDown() {
//		
//		
//		driver.close();
//	}
//	@BeforeTest
//	@Parameters("browser")
//	public WebDriver setup(String browser) throws Exception{
//		//Check if parameter passed from TestNG is 'firefox'
//		if(browser.equalsIgnoreCase("CHROME")){
//		//create firefox instance
//			WebDriverManager.chromedriver().setup(); 
//			driver=new ChromeDriver();  
//		}
//		//Check if parameter passed as 'chrome'
//		else if(browser.equalsIgnoreCase("IE")){
//			//set path to chromedriver.exe
//			InternetExplorerOptions options = new InternetExplorerOptions();
//			options.ignoreZoomSettings() ;
//			driver = new RemoteWebDriver(new URL("http://localhost:8888/wd/hub"),options);
//			WebDriverManager.iedriver().setup();
//			driver=new InternetExplorerDriver();
//		}
//		//Check if parameter passed as 'Edge'
//				else if(browser.equalsIgnoreCase("EDGE")){
//					//set path to Edge.exe
//					WebDriverManager.edgedriver().setup();
//					//create Edge instance
//					driver = new EdgeDriver();
//				}
//		else{
//			//If no browser passed throw exception
//			throw new Exception("Browser is not correct");
//		}
//		 driver.get(properties.getProperty("url1"));
//		  driver.manage().window().maximize();
//		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		 // driver.manage().deleteAllCookies();
//		  return driver;
//		
//	}
	@BeforeClass(groups = { "Smoke", "Regression", "Sanity" })
	public void setReports() throws IOException
	{
		classname=getClass().getSimpleName();
		System.out.println("class Name : "+classname);
		String filepath=ReusableFunction.dir1(ReusableFunction.dateStamp())+"\\"+classname+ReusableFunction.getTimeStamp1()+".html";
		
		htmlreports=new ExtentHtmlReporter(filepath);
		extend=new ExtentReports();
		extend.attachReporter(htmlreports);
		
		htmlreports.config().setTheme(Theme.STANDARD);	
		
		parenttest=extend.createTest(classname);
		System.out.println("ClassName :"+classname);	
		
		
		
	}
	@BeforeMethod(groups = { "Smoke", "Regression", "Sanity" })
	public void testName(Method method) {
		testname=method.getName();
		System.out.println("Testcase is: "+testname);
		childtest=parenttest.createNode(testname);
	   
	}

	
	@AfterMethod(groups = { "Smoke", "Regression", "Sanity" })
	public void tearDown(ITestResult result) throws IOException
	{
//		if(result.getStatus()==ITestResult.FAILURE)
//		{
//	   
//	    logger.fail("Test Failed",MediaEntityBuilder.createScreenCaptureFromPath(reusable.captureScreenShot(driver)).build());
//		}
//	else if(result.getStatus()==ITestResult.SKIP)
//	{
//		logger.skip("Test pass",MediaEntityBuilder.createScreenCaptureFromPath(reusable.captureScreenShot(driver)).build());
//	}
//		extend.flush();
//	}
//} 
////		
//	
		if(result.getStatus()==result.SUCCESS)
		{
			System.out.println(testname+" : TestCase Passed");
			childtest.log(Status.PASS,"TestCase is Pass : "+testname);
		}
		else if(result.getStatus()==result.FAILURE)
		{
			System.out.println(testname+" : TestCase failed");
			childtest.log(Status.FAIL,"TestCase is Failed : "+testname);
			childtest.addScreenCaptureFromPath(reusable.captureScreenShot(driver));
		}
		else if(result.getStatus()==result.SKIP)
		{
			System.out.println(testname+" : TestCase failed");
			childtest.log(Status.SKIP,"TestCase is Skipped : "+testname);
			childtest.log(Status.SKIP,result.getThrowable());
			childtest.addScreenCaptureFromPath(reusable.captureScreenShot(driver));
		}
		
		
	}
	@AfterTest(groups = { "Smoke", "Regression", "Sanity" })
	public  void closeReport()
	{
		
	extend.flush();
	System.out.println("Test method execution is done :");
		driver.quit();
	
	}
	
}
