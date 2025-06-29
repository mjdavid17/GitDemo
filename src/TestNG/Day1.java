package TestNG;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {
	
	
	
	@Test(groups = {"Smoke"})
	public void demo() {
		
		System.out.println("Hello");
	}
	
	@Test
	public void secondTest() {
		
		System.out.println("bye");
	}
	
	
	@AfterTest
	public void executeLast() {
		
		System.out.println("execute me last");
	}
	

}
