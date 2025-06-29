import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.driver.chrome", "/Users/admin/Desktop/My Learning/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		
		
		driver.findElement(By.xpath("//a[@class='blinkingText'][1]")).click();
		
		
		Set<String> windows = driver.getWindowHandles();
		
			
		Iterator<String> itr = windows.iterator();
		
		String parent = itr.next();
		
		String child = itr.next();
		
		
		driver.switchTo().window(child);
		
		
		
		String a = driver.findElement(By.xpath("//a[text()='mentor@rahulshettyacademy.com']")).getText();
		
		System.out.println(a);
		
		
		
		
		
		

		
		
	}

}
