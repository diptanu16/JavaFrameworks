package com.selenium.start;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import org.testng.Assert;


public class PositiveTests {
	
	@Test
	public void loginTest() throws InterruptedException {
		System.out.println("Test is starting");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://the-internet.herokuapp.com/login";
		driver.get(url);
		System.out.println("Page is opened");
		sleep(1000);
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.name("username"));
		sleep(2000);
		username.sendKeys("tomsmith");
		sleep(2000);
		WebElement password = driver.findElement(By.name("password"));
		sleep(1000);
		password.sendKeys("SuperSecretPassword!");
		sleep(1000);
		WebElement loginbtn = driver.findElement(By.tagName("button"));
		loginbtn.sendKeys(Keys.RETURN);
		System.out.println("Login button has been clicked");
		sleep(3000);
		WebElement logoutbtn = driver.findElement(By.xpath("//*[@id=\"content\"]/div/a"));
		Assert.assertTrue(logoutbtn.isDisplayed(),"Log out button is not visible");
		logoutbtn.sendKeys(Keys.RETURN);
		
		sleep(2000);
		System.out.println("Logged out successfully");
		
		//verifications
		String expectedUrl = "https://the-internet.herokuapp.com/login";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl, "Actual page url is not the same");
		
		
		
		
		
	}
	
	public void sleep(int m) throws InterruptedException {
		Thread.sleep(m);
		
	}

}
