package org.testing.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DynamicWebtable {
	public static ChromeDriver driver;
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException

	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\aniket.singh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	ChromeOptions op=new ChromeOptions();
	op.setBinary("C:\\Users\\aniket.singh\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
	 driver=new ChromeDriver(op);
	 driver.get("https://freecrm.com/");
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
	 Thread.sleep(4000);
	 driver.findElement(By.name("email")).sendKeys("yuviyuvi338@gmail.com");
	 driver.findElement(By.name("password")).sendKeys("Dejavu@1996");
	 driver.findElement(By.xpath("//div[text()='Login']")).click();
	 Thread.sleep(2000);
	 WebElement ele=driver.findElement(By.xpath("//div[@id='main-nav']"));
	 Actions ac=new Actions(driver);
	 ac.moveToElement(ele).perform()  ;
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
	 ac.moveByOffset(300,0).perform();
	 Thread.sleep(2000);
	 // Method 2
	//driver.findElement(By.xpath("//a[text()='test1 test1']/parent::td//preceding-sibling::td//div[@class='ui fitted read-only checkbox']")).click();
	// method 1

	// /html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]
	//  /html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/a[1]
	//		 /html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[3]/tr[3]/td[2]/a[1]
	// /html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/a[1]
	 String before_xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[";
		String after_xpath = "]/td[2]/a[1]";
		
		for(int i=1; i<=4; i++){
			String name = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
			System.out.println(name);
			if(name.contains("test qwerty")){ //i=6
				//*[@id='vContactsForm']/table/tbody/tr[6]/td[1]/input
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div")).click();
										//	/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/label[1]
			}
		}
		
	}
}