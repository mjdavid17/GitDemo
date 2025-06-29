package TestNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	
	@Test
	public void beta1() {
		
		System.out.println("beta1");
	}
	
	@Test
	public void beta2() {
		
		System.out.println("beta2");
	}
	
	@BeforeTest
	public void executeFirst() {
		
		System.out.println("Execute me first");
	}

}
