package org.testing.testscripts;

import org.testing.Base.Base;
import org.testing.Pages.HomePage;
import org.testing.Pages.LoginPage;
import org.testing.Pages.LogoutPage;
import org.testng.annotations.Test;

public class TC2 extends Base{

	@Test
	public void video() throws InterruptedException
	{
		
		LoginPage login=new LoginPage(driver,pr);
		login.signin("selinium669897@gmail.com","Dejavu@2023");
		HomePage home=new HomePage(driver,pr);
		home.historyclick();
		LogoutPage logout=new LogoutPage(driver,pr);
		logout.signout();
		
		
	
		
		
	}
	
	
	
}
