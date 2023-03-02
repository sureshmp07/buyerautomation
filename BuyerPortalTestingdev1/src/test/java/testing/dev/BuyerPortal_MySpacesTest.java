package testing.dev;

import java.io.IOException;

import org.testng.annotations.Test;

public class BuyerPortal_MySpacesTest extends BaseTest{
	
	@Test	(priority=1)
	public void signInPageTest1() 
	{
    	buyersign.signIn1(properties.getProperty("buy_email"),properties.getProperty("buy_password"));
      
	}
	@Test	(priority=2)
	public void MySpaces() throws IOException, InterruptedException 
	{
    	MySpaces.MySpaces(properties.getProperty("assertspaces"));
      
	}

}
