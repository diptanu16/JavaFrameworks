package com.selenium.start;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Emon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com/");
		WebElement textBox = driver.findElement(By.name("q"));
		textBox.sendKeys("What is Selenium");
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
