import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdhocTest01 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.driver.chrome", "'/Users/admin/Desktop/My Learning/Selenium/chromedriver'");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("http://www.wwe.com");
		
		WebElement shows = driver.findElement(By.xpath("//a[text()='Superstars']"));
		
		
		shows.click();
		
		Thread.sleep(3000);
		
		
		
		driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();
		
		
		
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
		
		
		
		WebElement superstars= driver.findElement(By.xpath("//img[@alt='John Cena']"));
		
		
		w.until(ExpectedConditions.visibilityOf(superstars));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
