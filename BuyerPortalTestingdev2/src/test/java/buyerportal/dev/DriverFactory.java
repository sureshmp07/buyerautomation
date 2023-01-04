
package buyerportal.dev;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
//import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	WebDriver driver;
	Properties properties;
	
	  public  WebDriver int_Browser(Properties properties)
	  {
		  
		  switch(properties.getProperty("browsername").toUpperCase()) {
		  case"CHROME":
			
		   ChromeOptions options = new ChromeOptions();
//			options. addArguments("--disable-web-security");
//			options.addArguments("--user-data-dir=C:\\Users\\Administrator\\AppData\\Local\\Google\\Chrome\\User Data");
//			options. addArguments("--allow-running-insecure-content");
		
			options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors","--disable-extensions","--no-sandbox","--disable-dev-shm-usage");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver(options);  
		    break;
		  case"EDGE":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
		  case"FF":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		  case"IE":
				WebDriverManager.iedriver().setup();
				DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
				caps.setCapability("ignoreZoomSetting", true);
				driver = new InternetExplorerDriver(caps);
				
		  }
	  
	  driver.get(properties.getProperty("url2"));
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 // driver.manage().deleteAllCookies();
	  return driver;
	}

	

//public void  readproperty() throws IOException
	public  Properties readproperty() throws IOException
	{
//		File file1=new File("./ConfigurationProperties/config.properties");
//		FileInputStream fis=null;
//		try {
//			fis=new FileInputStream(file1);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		 properties=new Properties();
		//
		 if(!System.getProperty("os.name").startsWith("Windows")){
				
				FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + File.separator +
			    File.separator + "ConfigurationProperties" + File.separator + "config.properties");
				properties.load(ip);
				}else{
					FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + File.separator +
							"ConfigurationProperties" + File.separator + "config.properties");
					properties.load(ip);
//		try {
//			properties.load(fis);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		
				
	//return properties ;
				
	}
		return properties;	
		
}
}
