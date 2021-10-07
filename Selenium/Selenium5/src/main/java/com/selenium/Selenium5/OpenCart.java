package com.selenium.Selenium5;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenCart {
	static WebDriver driver;
	@BeforeTest
	public void prepare() {
		System.out.println("Test is starting");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void setup() throws InterruptedException, FileNotFoundException {
		// TODO Auto-generated method stub
		
		String url = "https://demo.opencart.com/";
		driver.get(url);
		System.out.println("Page is opened");
		WebElement myaccount = driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a"));
		myaccount.sendKeys(Keys.RETURN);
		Thread.sleep(3000);
		WebElement login1 = driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[2]/a"));
		login1.sendKeys(Keys.RETURN);
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div[1]/input"));
		Thread.sleep(2000);
		username.sendKeys("diptanudnath@rediffmail.com");
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
		Thread.sleep(1000);
		password.sendKeys("puma1996");
		Thread.sleep(1000);
		WebElement loginbtn = driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
		loginbtn.sendKeys(Keys.RETURN);
		System.out.println("Login button has been clicked");
		Thread.sleep(3000);
		WebElement searchbox = driver.findElement(By.xpath("//*[@id=\"search\"]/input"));
		searchbox.sendKeys("Canon EOS 5D");
		searchbox.sendKeys(Keys.RETURN);
		Thread.sleep(3000);
		WebElement description = driver.findElement(By.cssSelector("#content > div:nth-child(8) > div > div > div:nth-child(2) > div.caption > h4 > a"));
		description.click();
		Thread.sleep(3000);
		WebElement quantity = driver.findElement(By.cssSelector("#input-quantity"));
		quantity.sendKeys("1");
		Thread.sleep(3000);
		WebElement addcart = driver.findElement(By.cssSelector("#button-cart"));
		addcart.click();
		WebElement shoppingcart = driver.findElement(By.cssSelector("#top-links > ul > li:nth-child(4) > a > span"));
		shoppingcart.click();
		WebElement checkout = driver.findElement(By.cssSelector("#cart > ul > li:nth-child(2) > div > p > a:nth-child(2) > strong"));
		checkout.click();
		Thread.sleep(2000);
		String total_price = driver.findElement(By.cssSelector("#content > div.row > div > table > tbody > tr:nth-child(2) > td:nth-child(2)")).getText();
		PrintWriter out = new PrintWriter("total_price.txt");
		out.println(total_price);
		boolean flag = false;
		String price = total_price.substring(1,total_price.length());
		double price_double = Double.parseDouble(price);
		if(price_double<200) {
			flag = true;
		}
		if(flag) {
			WebElement continueshopping = driver.findElement(By.cssSelector("#content > div.buttons.clearfix > div.pull-left > a"));
			continueshopping.click();
			
			
		} else {
			WebElement logout = driver.findElement(By.cssSelector("#top-links > ul > li.dropdown.open > ul > li:nth-child(5) > a"));
			logout.click();
			
		}
		
	}	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
}
