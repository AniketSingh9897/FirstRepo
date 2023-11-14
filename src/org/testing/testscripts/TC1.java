package org.testing.testscripts;



import java.io.IOException;
import org.testing.Base.Base;
import org.testing.Pages.HomePage;
import org.testing.Pages.LoginPage;
import org.testing.Pages.LogoutPage;
import org.testing.utilities.CurrentTime;
import org.testing.utilities.LogCapture;
import org.testing.utilities.ScreenshotCapture;
import org.testng.annotations.Test;

public class TC1 extends Base
{

	
	@Test
	public void video() throws InterruptedException, IOException
	{
		//Logger log=Logger.getLogger("TC1");
		//PropertyConfigurator.configure("log4j.properties");
		
		//log.info("username and password");

		LoginPage login=new LoginPage(driver,pr);
		login.signin("selinium669897@gmail.com","Dejavu@2023");
		LogCapture.loggenrator("TC1","LOGIN SUCESSFULLY");
		//log.info("screenshot is captured");
		ScreenshotCapture.Screenshot(driver, "C://screenshots//TC_1"+CurrentTime.getTime()+".png");	
		
		HomePage home=new HomePage(driver,pr);
		
		
		home.clickTrending();
		//log.info("trending click");
		
		LogoutPage logout=new LogoutPage(driver,pr);
		logout.signout();
		LogCapture.loggenrator("TC1","PASS");
		//log.info("logout check");
	

	//	ScreenshotCapture.Screenshot(driver, "C://screenshots//TC_1"+CurrentTime.getTime().replaceAll(" ","").replaceAll("/", "").replaceAll(":","")+".png");	
		
	System.out.println("test");
	System.out.println("test");
	}
	
	
	
	
	
	
	
}
