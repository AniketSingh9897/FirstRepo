package org.testing.testscripts;

import org.testing.Base.Base;
import org.testing.Pages.LoginPage;
import org.testing.Pages.LogoutPage;
import org.testing.Pages.VideoPlayPage;
import org.testng.annotations.Test;

public class TC5 extends Base {
		
			@Test
			public void video() throws InterruptedException
			{
				
				
				LoginPage login=new LoginPage(driver,pr);
				login.signin("selinium669897@gmail.com","Dejavu@2023");
				VideoPlayPage video=new VideoPlayPage(driver,pr);
				video.videoplay();
				video.subscribebutton();
				LogoutPage logout=new LogoutPage(driver,pr);
				logout.signout();

				
				
				
				
		
				
				
			}
			
}
