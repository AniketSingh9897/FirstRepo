package org.testing.Base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public ChromeDriver driver;
	public Properties pr;
	@BeforeMethod
	public void url() throws IOException, InterruptedException
	{
		File f=new File("../YTFRAMEWORK/object.Properties");
		FileReader fr=new FileReader(f);
		pr=new Properties();
		pr.load(fr);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aniket.singh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.setBinary("C:\\Users\\aniket.singh\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		 driver=new ChromeDriver(op);
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement signin=driver.findElement(By.xpath(pr.getProperty("signin")));
		signin.click();
		Thread.sleep(2000);
	}
	@AfterMethod
	public void quit()
	{
driver.quit();		
	
}
}