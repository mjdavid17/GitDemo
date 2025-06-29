import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	System.setProperty("webdriver.driver.chrome", "/Users/admin/Desktop/My Learning/Selenium/chromedriver");
	WebDriver driver = new ChromeDriver();
	
	
	driver.get("https://magento.softwaretestingboard.com/");
	
	Actions action = new Actions(driver);
	
	
	
	WebElement element1 = driver.findElement(By.xpath("//span[text()='Gear']"));
	
	action.moveToElement(element1).build().perform();
	
	
	
	
	
	
	

	}

}
