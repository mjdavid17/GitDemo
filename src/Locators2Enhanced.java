import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2Enhanced {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.driver.chrome", "/Users/admin/Desktop/My Learning/Selenium/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
	
		
		
		String username = "rahul";
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(getPassword(driver));
		
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		
		
			
		
	}
	
	
	
	static String getPassword(WebDriver driver) throws InterruptedException {
		
	
		
		driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		
		
		//Validate warning message
		String name1 = driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
		String[] name2 = name1.split("'");
		Assert.assertEquals(name2[0], "Please use temporary password ");
		
		
		
		String[] name3 = name2[1].split("'");
		
		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		
		return name3[0];
		
		
		
	}

}
