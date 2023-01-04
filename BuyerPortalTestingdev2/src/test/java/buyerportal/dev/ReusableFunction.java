package buyerportal.dev;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.Console;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.NewSessionPayload;
import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.Status;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;

import io.github.bonigarcia.wdm.online.HttpClient;
import testing.dev.BaseTest;




public class ReusableFunction extends BaseTest {
public static WebDriver driver;
public static  FileInputStream fileInputStream;
public static  XSSFWorkbook workbook;
public static  XSSFSheet sheet;
public static  XSSFCell cell;
public static  File file;

//autoit
	private static ProcessBuilder pb;
	private static String autoitexe;
	private static String filepaths;
	
	
	
	
    public ReusableFunction(WebDriver driver)
    {
    	this.driver=driver;
    }
    
    //finding element
    public WebElement findElement(By locator)
    {
    	
    	return driver.findElement(locator);
    	
    }
  
  //sending text  
	public  void sendkeyss(By locator,String text)
	{
	
	try {
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement element=findElement(locator);
		element.sendKeys(text);
		System.out.println("Enter a value : " + text) ;
		childtest.log(Status.PASS,"Enter a value : "+ text);
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("unable to perform sendkeys on : "+text);
		childtest.log(Status.INFO,"unable to perform sendkeys on "+text);
	}
	
	}
	
	
	//click by action class
	public void actions(By locator) {
		
		try {
			Actions a = new Actions(driver);
			WebElement optionsList = driver.findElement(locator);
			a.moveToElement(optionsList).
			click().build().perform();
			System.out.println("clicked :");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("unable to perform click on : ");
			childtest.log(Status.INFO,"unable to perform click on ");
		}
		}
	
    //normal click
	public  boolean clicking(By locator)
	{
		boolean result=false;
		int attempts=0;
		while(attempts<2) {
		
		try {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        findElement(locator);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator)).click();
        childtest.log(Status.PASS,"Clicked on ");
        System.out.println("Clicked on ");
        result=true;
        break;
		} catch (Exception e) {
			// TODO Auto-generated catch block
		childtest.log(Status.INFO,"element not found ,unable to click on ");
		}
		attempts++;
			}
		return result;
	}
	
	
	//
	public void imageverify(By locator) {
	WebElement i = driver.findElement(locator);
		      
		      // Javascript executor to check image
	          Boolean p = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i);

		      //verify if status is true
		      if (p) {
		    	  childtest.log(Status.PASS,"image present ");
		      } else {
		    	  childtest.log(Status.FAIL,"image not present ");
		      }
	}
	//clicking all elements
	public void clickingallelements(By locator) {
	try {
		ArrayList<WebElement> element = (ArrayList<WebElement>) driver.findElements(locator);	
		int count =0;
		 for ( WebElement elements: element) { 
		     System.out.println("element clicked");
		     elements.click();
		    count++;
		 }
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("element not clicked");
		e.printStackTrace();
	}    
	}
	//click by  javascript
	public boolean click(By locator) 
	{
	
	boolean result=false;
	int attempts=0;
	while(attempts<2) {
	
		
	try {
	WebElement element= driver.findElement(locator);
    String s=element.getText();
	WebDriverWait wait = new WebDriverWait(driver, 7000);
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()",element);
	childtest.log(Status.PASS,"Clicked on "+s);
	System.out.println("Clicked on "+s);
	result=true;
	break;
	} catch (Exception e) {
				// TODO Auto-generated catch block
	childtest.log(Status.FAIL,"element not found ,unable to click on ");
	System.out.println("element not found ,unable to click on ");
	}
	attempts++;
	}
    return result;
	}
	//scroll into view
	public void scrollByVisibilityOfElement(By locator) {
		try {
			WebElement i = driver.findElement(locator);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", i);
			childtest.log(Status.PASS,"scroll into view ");
			System.out.println("scroll into view ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			childtest.log(Status.FAIL,"element not found ,unable to scroll into view ");
			System.out.println("element not found ,unable to scroll into view ");
		}

	}
	
	//comparing actual and expected assertion
	public String  assertion(By locator, String value) {
		
    try {
	WebElement click= driver.findElement(locator);
    String s=click.getText();
	WebDriverWait wait = new WebDriverWait(driver, 7000);
	wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
  // String	expectedUrl = driver.getCurrentUrl();
	Assert.assertEquals(s, value);
	childtest.log(Status.PASS,"text verified "+s);
	} catch (Exception e) {
		 	
		
	// TODO Auto-generated catch block
	childtest.log(Status.FAIL,"text not verified ");
	
	}
    return value;
    }
    

    // take screenshoot
    //Assert.assertTrue(expectedUrl.equals(value));
	private static FluentWait<WebDriver> WebDriverWait(WebDriver driver2, int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public static String calendarTime()
	{
		
    String datestamp= new SimpleDateFormat("MM/dd/yyyy hh:mm").format(new Date());
	return datestamp;
		
	}
	
	
	public static String nextCalendarTime()
	{
	String datestamp= new SimpleDateFormat("MM/dd/"+1+"/yyyy hh:mm:ss").format(new Date());
	return datestamp;	
	}
	
	
	
	public static void read_File_Data(File csvFile) {
		
	try {
	expre= new ArrayList<String>();
	BufferedReader br=new BufferedReader(new FileReader(csvFile));
	String line="";
	StringTokenizer st=null;
	while((line=br.readLine()) !=null) {
	st=new StringTokenizer(line,",");
	while(st.hasMoreTokens()) {
    String sd=st.nextToken()+" ";
	if(sd !=null) {
	expre.add(sd);
					}
					
				}
			}
	System.out.println("Expected : " + expre);
	System.out.println();
	childtest.log(Status.INFO, " "+ expre);
	} catch (Exception e) {
			// TODO Auto-generated catch block
	e.printStackTrace();
		
	}
		
	}
	
	//move to next window 
	public void switchTo(By locator, int value)
	{
	driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	ArrayList<String> windowHandles = new ArrayList<String> (driver.getWindowHandles());
	driver.switchTo().window(windowHandles.get(value));
	childtest.log(Status.PASS,"moved on ");
		 
	System.out.println("moved");
	WebElement click= driver.findElement(locator);
	     
			//WebElement click= driver.findElement(locator);
	String expected=click.getText();
			//driver.switchTo().newWindow(WindowType.TAB);
	WebDriverWait wait = new WebDriverWait(driver, 7000);
	wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	Assert.assertEquals(true, click.isDisplayed());
			//Boolean p = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i);

		      //verify if status is true
     if (expected != null) {
	 childtest.log(Status.PASS,"text present "+expected);
	 System.out.println("text present");
     } else {
     childtest.log(Status.FAIL,"text not present ");
	 System.out.println("text not present");
	 }
	 driver.switchTo().window(windowHandles.get(0));	
	 } 
	
	public void switchToPrevious(By locator, int value) {
		ArrayList<String> windowHandles = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(windowHandles.get(value));
		 driver.switchTo().window(windowHandles.get(0));	
	}
	
	
	public static String dir1(String secpath)throws IOException{
		File file=new File(System.getProperty("user.dir")+"\\Reports\\"+secpath);
		if(!file.exists())
		{
			if(file.mkdirs())
			{
				System.out.println("created");
			}
			else {
				System.out.println("notcreated");
			}
			
		}
		String filepath=System.getProperty("user.dir")+"\\Reports\\"+secpath;
		return filepath;
	}
	public static String dateStamp() {
		String timestamp=new SimpleDateFormat("dd-MM-yyyy").format(new Date());
		return timestamp;
	}
	public static String getTimeStamp1() {
		String timestamp=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		return timestamp;
		
		
	}
	
	
	
	public static boolean elementIsVisible(WebElement element) {
		boolean b=true;
		 try {
			b=element.isDisplayed()  ? true:false;
			 childtest.log(Status.PASS,"isDisplayed : "+ b);
		      System.out.println("isDisplayed ");
		     
		} catch (Exception e) {
			// TODO Auto-generated catch block
			childtest.log(Status.FAIL,"element not Displayed : "+ b);
		      System.out.println("element not Displayed ");
		     
		}		
		return b;
	}
	
	public  String getPopupMessage(final WebDriver driver) {
		String message = null;
		try {
		Alert alert = driver.switchTo().alert();
		message = alert.getText();
		alert.accept();
		} catch (Exception e) {
		message = null;
		}
		System.out.println("message"+message);
		return message;
		}
	
	public  String cancelPopupMessageBox(final WebDriver driver) {
		String message = null;
		try {
		Alert alert = driver.switchTo().alert();
		message = alert.getText();
		alert.dismiss();
		} catch (Exception e) {
		message = null;
		}
		return message;
		}
	
public   void assertion11 (By locator) throws IOException, InterruptedException{
	
	
	 
	 WebElement click= driver.findElement(locator);
     
		//WebElement click= driver.findElement(locator);
		String expected=click.getText();
		//driver.switchTo().newWindow(WindowType.TAB);
		WebDriverWait wait = new WebDriverWait(driver, 7000);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		Assert.assertEquals(true, click.isDisplayed());
		//Boolean p = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i);

	      //verify if status is true
	      if (expected != null) {
	    	  childtest.log(Status.PASS,"text present "+expected);
	    	  System.out.println("text present");
	      } else {
	    	  childtest.log(Status.FAIL,"text not present ");
	    	  System.out.println("text not present");
	      }
	
}
	//assertion
	public   void assertion1(By locator, String expected) throws IOException{
		
//		WebDriverWait wait = new WebDriverWait(driver, 7000);
//		  wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
			WebElement ac= driver.findElement(locator);
			String actual=ac.getText();
			WebDriverWait wait = new WebDriverWait(driver, 7000);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			if(actual.equalsIgnoreCase(expected)) {
				  
				childtest.log(Status.PASS,"Actual Text: " + actual + " and Expected Text: " + expected + " are Matched");	
				
			}
			else {
				childtest.log(Status.FAIL, actual +" and " + expected +" not matched");
			
				childtest.addScreenCaptureFromPath(captureScreenShot(driver));	
			}
		
		}
public static void uploadFileAutoit(String filepath) {
		autoitexe=System.getProperty("user.dir") +"\\autoit\\autoit.exe";
		try {
			pb=new ProcessBuilder(autoitexe,filepath);
			pb.start();
			childtest.log(Status.INFO,"uploaded filepath : " + filepath);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
//upload file using sendkeys 
public  void uploadSendkeyss(By locator,String text)
{

try {
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.visibilityOf(element)); 
	WebElement chooseFile = driver.findElement(locator);
	chooseFile.sendKeys(text);
	
	System.out.println("Enter a value : " + text) ;
	childtest.log(Status.PASS,"Enter a value : "+ text);
	
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	System.out.println("unable to perform sendkeys on : "+text);
	childtest.log(Status.INFO,"unable to perform sendkeys on "+text);
}}
//upload file using robot class
public  void uploadrobot(String text) throws InterruptedException, AWTException
{
//WebElement browse = driver.findElement(locator);
//// using linkText, to click on browse element 
//browse.click(); // Click on browse option on the webpage
//Thread.sleep(2000); // suspending execution for specified time period

// creating object of Robot class
Robot rb = new Robot();

// copying File path to Clipboard
StringSelection str = new StringSelection(text);
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

// press Contol+V for pasting
rb.keyPress(KeyEvent.VK_CONTROL);
rb.keyPress(KeyEvent.VK_V);

// release Contol+V for pasting
rb.keyRelease(KeyEvent.VK_CONTROL);
rb.keyRelease(KeyEvent.VK_V);

// for pressing and releasing Enter
rb.keyPress(KeyEvent.VK_ENTER);
rb.keyRelease(KeyEvent.VK_ENTER);
}
//inserting new text	
	public void insertText(By locator, String value) {
		try {
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.findElement(locator).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE),value);
			childtest.log(Status.PASS,"entered :"+value);
			System.out.println("entered :"+value);
		} catch (Exception e) {
			childtest.log(Status.FAIL,"text not entered:"+value);
			System.out.println("text not entered"+value);
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		WebElement field = driver.findElement(locator);
//		field.clear();
//		field.sendKeys(value);
		}
	//getting attribute value
	public  String tooltipText( By locator){
		String tooltip = driver.findElement(locator).getAttribute("title");
		return tooltip;
		}
	public static void moveToElement(String loctype,String locvalue,String elementvalue) {
		try {
			element=identifyElement(loctype,locvalue);
			Actions action=new Actions(driver);
			wait=new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOf(element));
			action.moveToElement(element).build().perform();
			childtest.log(Status.PASS,"drag and drop performed ");
			System.out.println("drag and drop performed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			childtest.log(Status.FAIL,"drag and drop not performed");
			System.out.println("drag and drop not performed");
		}
		
		
	}
	
//	@DataProvider
// public static Object[][] readExcelFile(String resultFile,int number) throws InvalidFormatException, IOException {
//        FileInputStream fis = new FileInputStream(resultFile);
//        XSSFWorkbook wb = new XSSFWorkbook(fis);
//        XSSFSheet sh = wb.getSheetAt(number);
//
//        System.out.println(sh.getPhysicalNumberOfRows());
//        System.out.println(sh.getRow(0).getPhysicalNumberOfCells());
//        int RowNum = sh.getPhysicalNumberOfRows();
//        int ColNum = sh.getRow(0).getPhysicalNumberOfCells();
//
//        String[][] xlData = new String[RowNum-1][ColNum];
//
//        for (int i = 0; i < RowNum - 1; i++) 
//        {
//            XSSFRow row = sh.getRow(i + 1);
//            for (int j = 0; j < ColNum; j++) 
//            {
//                if (row == null)
//                    xlData[i][j] = "";
//                else {
//                    XSSFCell cell = row.getCell(j);                 
//                    if (cell == null)
//                        xlData[i][j] = ""; 
//                    else {
//                        String value = formatter.formatCellValue(cell);
//                        xlData[i][j] = value.trim();                        
//                    }
//                }
//            }
//        }       
//        return xlData;
//    }   

	
	
private static WebElement identifyElement(String loctype, String locvalue) {
		// TODO Auto-generated method stub
		return null;
	}
	//	public void selectRadioButton( By locator, String value)
//	{ List select = driver.findElements(locator);
//	for (WebElement element : select)
//	{
//	if (element.getAttribute("value").equalsIgnoreCase(value)){
//	element.click();
//	}
//	}
//	}
//	
public void selectCheckboxes(By locator)
{
	List <WebElement> listofItems = driver.findElements(locator);
    WebDriverWait wait = new WebDriverWait(driver, 20); //Wait time of 20 seconds

for (int i=1; i<=listofItems.size(); i++)
{ 
    
    listofItems = driver.findElements(locator);

    wait.until(ExpectedConditions.visibilityOf(listofItems.get(i-1)));
 
    listofItems.get(i-1).click();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    System.out.print(i + " element clicked\t--"); 
}
}
//	
//	public  void downloadFile(String href, String fileName) throws Exception{
//		URL url = null;
//		URLConnection con = null;
//		int i;
//		url = new URL(href);
//		con = url.openConnection();
//		// Here we are specifying the location where we really want to save the file.
//		File file = new File(".//OutputData//" + fileName);
//		BufferedInputStream bis = new BufferedInputStream(con.getInputStream());
//		BufferedOutputStream bos = new BufferedOutputStream(
//		new FileOutputStream(file));
//		while ((i = bis.read()) != -1) {
//		bos.write(i);
//		}
//		bos.flush();
//		bis.close();
//		}
//	
//	public void action() {
//	Actions builder = new Actions(driver);
//	builder.keyDown(Keys.CONTROL).click(someElement).click(someOtherElement).keyUp(Keys.CONTROL).build().perform();
//	}
	//drag and drop
	public void DragDrop() {
	WebElement element = driver.findElement(By.name("source"));
	WebElement target = driver.findElement(By.name("target"));
	(new Actions(driver)).dragAndDrop(element, target).perform();
    }
    //selecting iframe
	public void selectIFrameUsingIndex(By locator, int index) {   
		 
	    try {
	    	WebElement element = driver.findElement(locator);
			driver.switchTo().frame(index);
			childtest.log(Status.PASS,"switched to frame");
			System.out.println("switched to frame");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			childtest.log(Status.FAIL,"unable to switch to frame");
			System.out.println("unable to switch to frame");
		}
	}
	
	public void selectIFrameUsingIndex( String name) {
		 
	    driver.switchTo().frame(name);
	}
	 
	public void selectIFrameUsingIndex(WebDriver driver, WebElement element) {
		 
	    driver.switchTo().frame(element);
	}
	//selecting single dropdown
		public  void selectDropdown(By locator, String value)
		{
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			};
//			//WebDriverWait wait=new WebDriverWait(driver,30);
			//wait.until(ExpectedConditions.invisibilityOfElementWithText(locator, value));
			List<WebElement> fe = driver.findElements(locator);
			for(WebElement f:fe) {
			if(f.getText().contentEquals(value)) {
			f.click();
			System.out.println(fe);
			break;
					
			}
		    WebDriverWait wait=new WebDriverWait(driver,30);
		    wait.until(ExpectedConditions.invisibilityOfElementWithText(locator, value));
				
			}
		    }
		
		
			public void clickOn(By locator)
			{
			    WebDriverWait wait = new WebDriverWait(driver, 30);
			    wait.until(ExpectedConditions.refreshed(
			        ExpectedConditions.elementToBeClickable(locator)));
			    driver.findElement(locator).click();
			   
			}
			

	public String getTitle1(By locator) {
		 return     driver.getTitle();
	}
	public void keysEnter(By locator) {
		 driver.findElement(locator).sendKeys(Keys.ENTER);
		
	}
	//selecting search values
	public  void selectSearchDropdown( By locator, String value){
		driver.findElement(locator).click();
		driver.findElement(locator).sendKeys(value);
		driver.findElement(locator).sendKeys(Keys.TAB);
		}
	
	public  void selectDropdown1( By locator, int value){
		//Select dropdown = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(locator)));
		//dropdown.selectByVisibleText(value);
		WebElement element = driver.findElement(locator);
		Select foo = new Select(element);
		foo.selectByIndex(value); 
		}
	
	public void uploadFile( By locator)
	{
////		driver.findElement(locator).sendKeys(path);
////		}
//	{
//		 try {
//			Runtime.getRuntime().exec("‪‪C:\\Users\\Dell\\Desktop\\Screenshot (5).png");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		  System.out.println("2");
//		  try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		 
//		  WebElement upload = driver.findElement(locator);            //Upload button
//		   upload.click();
//		   System.out.println("3");   
//		
//	}
		
		//JavascriptExecutor js = (JavascriptExecutor) driver; 
		//js.executeScript("arguments[0].setAttribute('style', arguments[1])", driver.findElement(locator), "0");
	//	js.executeScript("arguments[0].setAttribute('class', arguments[1])", driver.findElement(By.xpath("//input[@type='file']/../../div[2]")), "a");
		//driver.findElement(locator).sendKeys(path);
		
		Robot rb = null;
		try {
			rb = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    rb.delay(2000);
		
		 
	    // copying File path to Clipboard
	    StringSelection str = new StringSelection("C:\\Users\\Dell\\Desktop\\Screenshot (2).exe");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	 
	     // press Contol+V for pasting
	     rb.keyPress(KeyEvent.VK_CONTROL);
	     rb.keyPress(KeyEvent.VK_V);
	 
	    // release Contol+V for pasting
	    rb.keyRelease(KeyEvent.VK_CONTROL);
	    rb.keyRelease(KeyEvent.VK_V);
	   
	    // for pressing and releasing Enter
	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER);
		
	}		
//	{		
//WebElement UploadImg = driver.findElement(locator);
//	  UploadImg.click();
//	  WebElement frame =driver.switchTo().activeElement();
//	  frame.sendKeys("‪C:\\Users\\Dell\\Desktop\\Screenshot (5).png");
//	  frame.click();
//	}
//	public static String getUserDir()
//	{
//		String userDir=System.getProperty("user.dir");
//		return userDir;	
//	}
//	public static  GetElement(int a,String locatorvalue)
//	{
//		switch(a)
//		{
//		case 1:
//			return Browser.driver.f
//		
//		
//		}
//		
//		
	
	 public static String captureScreenShot(WebDriver driver)throws IOException {

		 TakesScreenshot tks=(TakesScreenshot)driver;
		 File temp=tks.getScreenshotAs(OutputType.FILE);
		 String screenshotpath=System.getProperty("user.dir")+"./screenshot/signin"+".png";
		 File perm=new File(screenshotpath);
		 try {
			FileUtils.copyFile(temp,perm);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return screenshotpath;
	 }
    public void driverclose() {
	    driver.close();
		
	 }
	 public String getTimeStamp() {
		 
		 String timestamp=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		 return timestamp;  
	 }
	public String excel(String filepath,String sheet,int rownum,int cellnum) throws IOException
	{
		
//		        WebElement element = driver.findElement(locator);
				fileInputStream =new FileInputStream(filepath);
			    workbook = new XSSFWorkbook(fileInputStream);
	        	cell = workbook.getSheet(sheet).getRow(rownum).getCell(cellnum);
		        DataFormatter dataFormatter=new DataFormatter();
		        System.out.println("data :"+cell);
		        return dataFormatter.formatCellValue(cell);
	        	
	}
	
    
	
	//navigate back
   public void navigate(WebDriver driver ) {
	   try {
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);  
		driver.navigate().back();
		System.out.println("navigate back :");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		 
}
   //scrolldown to bottom
   public void scrollDown(WebDriver driver) {
	   JavascriptExecutor j = (JavascriptExecutor)driver;
	   j.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	  
		 
}
 //switching to parent window  
public void parentWindow(int index) {
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
String parent=driver.getWindowHandle();

Set<String>s=driver.getWindowHandles();

ArrayList<String> al = new ArrayList<>(s);

driver.switchTo().window(al.get(index));


System.out.println(driver.switchTo().window(al.get(index)).getTitle());
}

//getting text
public static String getText() {
	
	String text=null;
	wait=new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.visibilityOf(element));
	text=element.getText();
	System.out.println(text);
	childtest.log(Status.INFO,"Text Data : " + text);
	return text;
	
}

//selecting values using action class
public void selectdropdownaction(By locator,By locator1,String value)
{
Actions action = new Actions(driver);    
WebElement optionsList = driver.findElement(locator);
action.moveToElement(optionsList).build().perform();

List<WebElement> options = driver.findElements(locator1);
for(WebElement option : options) {
if (option.getText().equals(value)) {
option.click();
        //System.out.println(option.getText());
}
System.out.println(option.getText());
}
}

public void findElementsss(By locator) 
{	
driver.findElement(locator).sendKeys("+358");	
}
//selecting dropdown valus from up
public void arrowUp(By locator) {
	
try {
driver.findElement(locator).sendKeys(Keys.ARROW_UP);
driver.findElement(locator).sendKeys(Keys.ENTER);
} catch (Exception e) {
		// TODO Auto-generated catch block
e.printStackTrace();
}
}
//selecting dropdown valus from down
public  void arrowdown (By locator) {
	
try {
driver.findElement(locator).sendKeys(Keys.ARROW_DOWN);
driver.findElement(locator).sendKeys(Keys.ENTER);
} catch (Exception e) {
		// TODO Auto-generated catch block
e.printStackTrace();
}
}

public  void multipleArrowDown (By locator) {
	
try {
driver.findElement(locator).sendKeys(Keys.ARROW_DOWN);
driver.findElement(locator).sendKeys(Keys.ENTER);
driver.findElement(locator).sendKeys(Keys.ARROW_DOWN);
driver.findElement(locator).sendKeys(Keys.ARROW_DOWN);
driver.findElement(locator).sendKeys(Keys.ENTER);
driver.findElement(locator).sendKeys(Keys.ARROW_DOWN);
driver.findElement(locator).sendKeys(Keys.ARROW_DOWN);
driver.findElement(locator).sendKeys(Keys.ENTER);
driver.findElement(locator).sendKeys(Keys.ARROW_DOWN);
driver.findElement(locator).sendKeys(Keys.ARROW_DOWN);
driver.findElement(locator).sendKeys(Keys.ENTER);
} catch (Exception e) {
		// TODO Auto-generated catch block
e.printStackTrace();
}
}
 //selecting all check box
public  void allcheckboxselect (By locator) {
List <WebElement> AllCheckboxes =  driver.findElements(locator);
  
int size = AllCheckboxes.size();
System.out.println(size);
  
  
for(int i = 0; i<size; i++) {
      
AllCheckboxes.get(i).click();    
}
}
  
  
//navigate back using javascript executor  
public void navigateback() {
	// TODO Auto-generated method stub
JavascriptExecutor js = (JavascriptExecutor) driver; 
js.executeScript("window.history.go(-1)");
  
}
//image is displayed on page  
public void imageDisplayed(By locator) {

WebElement element = driver.findElement(locator);
Boolean p = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", element);

if (p) {
   System.out.println("image is present");
} else {
   System.out.println("image is not present");
}
}
//broken image method 1
//public void brokenImage1(By locator) {
//try{
//	
//List<WebElement> image_list = driver.findElements(locator);
///* Print the total number of images on the page */
//System.out.println("The page under test has " + image_list.size() + " images");
//for (WebElement img : image_list)
//{
//    if (img != null)
//    {
//        HttpClient client = HttpClientBuilder.create().build();
//        HttpGet request = new HttpGet(img.getAttribute("src"));
//        HttpResponse response = client.execute(request);
//        /* For valid images, the HttpStatus will be 200 */
//        if (response.getStatusLine().getStatusCode() != 200)
//        {
//            System.out.println(img.getAttribute("outerHTML") + " is broken.");
//            iBrokenImageCount++;
//        }
//    }
//}
//}
//catch (Exception e)
//{
//e.printStackTrace();
//status = "failed";
//System.out.println(e.getMessage());
//}
//status = "passed";
//System.out.println("The page " + URL + " has " + iBrokenImageCount + " broken images");
//}
//}

//broken image method 2
//public void brokenImage2(By locator) {
//try
//{
//    
//    List<WebElement> image_list = driver.findElements(By.tagName("img"));
//    /* Print the total number of images on the page */
//    System.out.println("The page under test has " + image_list.size() + " images");
//    for (WebElement img : image_list)
//    {
//        if (img != null)
//        {
//            if (img.getAttribute("naturalWidth").equals("0"))
//            {
//                System.out.println(img.getAttribute("outerHTML") + " is broken.");
//                iBrokenImageCount++;
//            }
//        }
//    }
//}
//catch (Exception e)
//{
//    e.printStackTrace();
//    status = "failed";
//    System.out.println(e.getMessage());
//}
//status = "passed";
//System.out.println("The page " + URL + " has " + iBrokenImageCount + " broken images");
//}
//}
}
