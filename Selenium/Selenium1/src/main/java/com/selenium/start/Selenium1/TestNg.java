package com.selenium.start.Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNg extends GetExcelData{
	
	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demo.opencart.com/index.php?route=account/login");		
	}
	
	@Test(dataProvider="excel-data" , dataProviderClass = GetExcelData.class)
	public void signIn(String username, String password) throws InterruptedException {	
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);
		Thread.sleep(3000);
		//login
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/input")).click();
		Thread.sleep(2000);
		//logout
		driver.findElement(By.xpath("/html/body/div[2]/div/aside/div/a[13]")).click();
		Thread.sleep(2000);
	}

	@AfterTest
	public void closeBrowser() {		
		driver.quit();
	}
	
}