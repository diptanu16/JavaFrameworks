package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPage;

public class GoogleSearch_test extends GoogleSearchPage {
	 public static void googleSearch() {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver_win32/chromedriver.exe");
	    	WebDriver driver = new ChromeDriver();
	    	driver.get("https://google.com");
	    	GoogleSearchPage.textbox_search(driver).sendKeys("Automation");
	    	driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	    	driver.close();
	    	
	    	System.out.println("Test completed");
	 }

}
