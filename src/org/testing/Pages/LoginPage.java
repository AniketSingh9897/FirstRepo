package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	
	ChromeDriver driver;
	Properties pr;
	 
	public LoginPage(ChromeDriver driver,Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
		

	}
	

	
	public void signin(String username, String password) throws InterruptedException
	{
		WebElement email=driver.findElement(By.xpath(pr.getProperty("email")));
		email.sendKeys(username);
		Thread.sleep(2000);

		WebElement nextbutton=driver.findElement(By.xpath(pr.getProperty("nextbutton")));
		nextbutton.click();
		Thread.sleep(2000);
		WebElement passwd=driver.findElement(By.xpath(pr.getProperty("passwd")));
		passwd.sendKeys(password);
		WebElement nextbutton2=driver.findElement(By.xpath(pr.getProperty("nextbutton2")));
		nextbutton2.click();
		Thread.sleep(3000);
		
		
	}
}
