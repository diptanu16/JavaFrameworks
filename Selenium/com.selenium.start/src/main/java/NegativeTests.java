import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeTests {

	//@Test
	public void incorrectUsername() throws InterruptedException {
		System.out.println("starting incorrect username");
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
		sleep(2000);
		//verifications
		WebElement errorMessage = driver.findElement(By.id("flash"));
		String expectedErrorMessage = "Your username is invalid!";
		String actualErrorMessage= errorMessage.getText();
		Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage), "Actual error message does not contain expected:"
		+ " \nActualMessage= "+actualErrorMessage+"expectedErrorMessage:" + expectedErrorMessage);
		
		sleep(3000);
		driver.close();
		System.out.println("Logged out successfully");
	}
	//VERIFICATION FOR WRONG PASSWORD
	@Test
	public void incorrectPassword() throws InterruptedException {
		System.out.println("starting incorrect password");
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
		password.sendKeys("SuperSecretPassword");
		sleep(1000);
		WebElement loginbtn = driver.findElement(By.tagName("button"));
		loginbtn.sendKeys(Keys.RETURN);
		sleep(2000);
			WebElement errorMessage = driver.findElement(By.id("flash"));
			String expectedErrorMessage = "Your password is invalid!";
			String actualErrorMessage= errorMessage.getText();
			Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage), "Actual error message does not contain expected:"
			+ " \nActualMessage= "+actualErrorMessage+"expectedErrorMessage:" + expectedErrorMessage);
			
			sleep(2000);
			driver.close();
	}	
			
	public void sleep(int m) throws InterruptedException {
		Thread.sleep(m);
	}
}
