package com.selenium.start;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver_win32/chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	String url =  "https://www.google.com";
    	driver.get(url);
    	Thread.sleep(3000);
    	driver.manage().window().maximize();
    	WebElement searchbox = driver.findElement(By.name("q"));
    	Thread.sleep(3000);
    	searchbox.sendKeys("Wipro limited");
    	driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
    	takess(driver, "screenshot.png");
    	
    }
    
    public static void takess(WebDriver driver, String path) throws IOException {
    	TakesScreenshot ss = (TakesScreenshot) driver;
    	File src = ss.getScreenshotAs(OutputType.FILE);
    	File dest = new File(path);
    	FileUtils.copyFile(src, dest);
    }
}
