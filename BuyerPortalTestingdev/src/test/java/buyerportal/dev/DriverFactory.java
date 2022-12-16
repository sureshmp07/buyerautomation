
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
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
//import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class DriverFactory {
	WebDriver driver;
	Properties properties;
	
	  public  WebDriver int_Browser(Properties properties)
	  {
		  
		  switch(properties.getProperty("browsername").toUpperCase()) {
		  case"CHROME":
			WebDriverManager.chromedriver().setup(); 
			driver=new ChromeDriver();  
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

	public  Properties readproperty()
	{
		File file1=new File("./ConfigurationProperties/config.properties");
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(file1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 properties=new Properties();
		
		try {
			properties.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return properties ;
		
	}	
}
