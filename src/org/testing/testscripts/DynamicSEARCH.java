package org.testing.testscripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DynamicSEARCH {

	public static ChromeDriver driver;
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aniket.singh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.setBinary("C:\\Users\\aniket.singh\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		 driver=new ChromeDriver(op);
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://www.youtube.com/");
		 Thread.sleep(2000);
		 //driver.findElement(By.xpath("//a[@aria-label='Sign in'][1]")).click();
		// Thread.sleep(2000);
		// driver.findElement(By.xpath("//input[@type='email']")).sendKeys("selinium669897@gmail.com");
		// driver.findElement(By.xpath("//span[text()='Next']")).click();
		// Thread.sleep(2000);
		//findElement(By.xpath("//input[@type='password']")).sendKeys("Dejavu@2023");
		// driver.findElement(By.xpath("//span[text()='Next']")).click();
		// Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='search']")).sendKeys("naveen");
		 driver.findElement(By.xpath("//button[@aria-label='Clear search query']")).click();
		//driver.navigate().refresh();
         driver.findElement(By.xpath("//input[@id='search']")).sendKeys("naveen automation");
         Thread.sleep(2000);
		 List<WebElement> list=driver.findElements(By.xpath("//ul[@class='sbsb_b']//li/descendant::div[@class='sbqs_c']")); 
		 System.out.println("no of result"+ list.size());
		 for (int i=0;i<list.size();i++)
		 {
			 
			 System.out.println(list.get(i).getText());
			 if(list.get(i).getText().equals("naveen automation"))
			 {
				 list.get(i).click();
				 break;
				 
				 
			 }
			 
		 }
         
         
		 }
	

}
