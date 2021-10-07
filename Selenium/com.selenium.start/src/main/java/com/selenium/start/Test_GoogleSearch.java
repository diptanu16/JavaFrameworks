package com.selenium.start;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_GoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		googlesearch();
		

	}
	public static void googlesearch() {
		System.setProperty("webdriver.chrome.driver" , "./driver/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//goto google.com
		driver.get("https://google.com/");
		driver.findElement(By.name("btNk")).sendKeys(Keys.RETURN);
		driver.close();

		
	}
}
