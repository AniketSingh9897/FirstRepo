package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoutPage {
	ChromeDriver driver;
	Properties pr;
	 
	public LogoutPage(ChromeDriver driver,Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
		

	}
	
	

	public void signout() throws InterruptedException 
	{
		WebElement icon=driver.findElement(By.xpath(pr.getProperty("icon")));
		icon.click();
		Thread.sleep(3000);
		WebElement signout=driver.findElement(By.xpath(pr.getProperty("signout")));
		signout.click();
		
		
		
		
	}
	
	
	
}
