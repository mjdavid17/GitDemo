import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.driver.chrome", "/Users/admin/Desktop/My Learning/Selenium/chromedriver");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		
		driver.findElement(By.className("signInBtn")).click();
		
		
		
		
		//System.out.println(driver.findElement(By.className("error")).getText());
		
		//Thread.sleep(5000);
		
		System.out.println(driver.findElement(By.cssSelector("p[class='error']")).getText());
		
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		
		
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
		
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Arcila");
		
		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("Allen");
		
		
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("mjdavid_17@yahoo.com");
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//form/div/button[2]")).click();
		
		
		System.out.println(driver.findElement(By.xpath("//p[contains(@class,'infoM')]")).getText());
		
		
		//driver.quit();
		
		
		

	}

}
