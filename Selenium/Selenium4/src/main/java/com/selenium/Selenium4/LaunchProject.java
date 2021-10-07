package com.selenium.Selenium4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchProject {
public static void main(String args[]) throws InterruptedException  
		{login();	}

	public static void login() throws InterruptedException {
			System.out.println("Page is Loading");
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver_win32/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			String url = "https://demo.opencart.com/";
			driver.get(url);
			System.out.println("Page is opened");
			sleep(1000);
			driver.manage().window().maximize();
			sleep(3000);
			WebElement myaccount = driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a"));
			myaccount.sendKeys(Keys.RETURN);
			sleep(3000);
			WebElement login1 = driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[2]/a"));
			login1.sendKeys(Keys.RETURN);
			sleep(3000);
			WebElement username = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div[1]/input"));
			sleep(2000);
			username.sendKeys("diptanudnath@rediffmail.com");
			sleep(2000);
			WebElement password = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
			sleep(1000);
			password.sendKeys("puma1996");
			sleep(1000);
			WebElement loginbtn = driver.findElement(By.id("input-password"));
			loginbtn.sendKeys(Keys.RETURN);
			System.out.println("Login button has been clicked");
			sleep(3000);
			WebElement searchbox = driver.findElement(By.xpath("//*[@id=\"search\"]/input"));
			searchbox.sendKeys("monitors");
			searchbox.sendKeys(Keys.RETURN);
			WebElement component = driver.findElement(By.xpath("/html/body/div[1]/nav/div[2]/ul/li[3]/a"));
			component.sendKeys(Keys.RETURN);
			sleep(2000);
			WebElement phones = driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[6]/a"));
			phones.click();
			sleep(2000);
			WebElement sortby = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[3]/div/select"));
			sortby.click();
			sleep(2000);
			WebElement phonesortHigh = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[3]/div/select/option[5]"));
			phonesortHigh.click();
			sleep(2000);
			System.out.println("Done");
			WebElement addcompare1 = driver.findElement(By.cssSelector("#content > div:nth-child(3) > div:nth-child(1) > div > div:nth-child(2) > div.button-group > button:nth-child(3)"));
			addcompare1.click();
			System.out.println("Done addcompare1");
			sleep(2000);
			WebElement addcompare2 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[2]/div/div[2]/div[2]/button[3]"));
			addcompare2.click();
			sleep(2000);
			WebElement addcompare3 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[2]/button[3]"));
			addcompare3.click();
			sleep(2000);
			WebElement prodcompare = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div/a"));
			prodcompare.click();
			sleep(2000);
			WebElement firstphone = driver.findElement(By.xpath("/html/body/div[2]/div/div/table/tbody[1]/tr[1]/td[2]/a"));
			firstphone.click();
			sleep(2000);
			WebElement addtocart = driver.findElement(By.cssSelector("#button-cart"));
			addtocart.click();
			sleep(2000);
			WebElement cart = driver.findElement(By.cssSelector("#cart-total"));
			cart.click();
			sleep(2000);
			WebElement checkout = driver.findElement(By.cssSelector("#cart > ul > li:nth-child(2) > div > p > a:nth-child(2) > strong"));
			checkout.click();
			sleep(2000);
			WebElement clearcart = driver.findElement(By.cssSelector("#content > form > div > table > tbody > tr > td:nth-child(4) > div > span > button.btn.btn-danger"));
			clearcart.click();
			sleep(2000);
			WebElement home = driver.findElement(By.cssSelector("#logo > h1 > a"));
			home.click();
			sleep(2000);
			WebElement myaccount1 = driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a"));
			myaccount1.sendKeys(Keys.RETURN);
			sleep(2000);
			WebElement orderhistory = driver.findElement(By.cssSelector("#top-links > ul > li.dropdown.open > ul > li:nth-child(2) > a"));
			orderhistory.click();
			sleep(2000);
			WebElement newsletter = driver.findElement(By.cssSelector("#column-right > div > a:nth-child(12)"));
			newsletter.click();
			sleep(2000);
			WebElement newsletteryes = driver.findElement(By.cssSelector("#content > form > fieldset > div > div > label:nth-child(1)"));
			newsletteryes.click();
			sleep(2000);
			WebElement continue1 = driver.findElement(By.cssSelector("#content > form > div > div.pull-right > input"));
			continue1.click();
			sleep(2000);
			WebElement extras = driver.findElement(By.cssSelector("body > footer > div > div > div:nth-child(3) > ul > li:nth-child(4) > a"));
			extras.click();
			sleep(2000);
			WebElement extrasgrid = driver.findElement(By.cssSelector("#grid-view"));
			extrasgrid.click();
			sleep(2000);
			WebElement myaccount2 = driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a"));
			myaccount2.sendKeys(Keys.RETURN);
			sleep(2000);
			WebElement logout = driver.findElement(By.cssSelector("#top-links > ul > li.dropdown.open > ul > li:nth-child(5) > a"));
			logout.sendKeys(Keys.RETURN);
	}
	
	public static void sleep(int m) throws InterruptedException {
		Thread.sleep(m);
	}

}
