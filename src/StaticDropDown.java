import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.driver.chrome", "/Users/admin/Desktop/My Learning/Selenium/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/dropdownsPractise");

		Thread.sleep(3000);

		WebElement staticDropdown = driver
				.findElement(By.xpath("//select[@name='ctl00$mainContent$DropDownListCurrency']"));

		Select dropdown = new Select(staticDropdown);

		dropdown.selectByIndex(3);

		System.out.println(dropdown.getFirstSelectedOption().getText());

	}

}
