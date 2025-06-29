import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SellIntroduction{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.driver.chrome", "/Users/admin/Desktop/My Learning/Selenium/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com");
		
		System.out.println(driver.getTitle());
		
		MethodsDemo m = new MethodsDemo();
		
		m.getData();
		
		
		driver.close();
		driver.quit();
		
		
		

	}

}
