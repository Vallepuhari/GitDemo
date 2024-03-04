package Test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {

	@AfterTest
	public void lastexecution() {
		System.out.println("It will execute last");

	}

	@Test
	public void Demo() {
		System.out.println("hello");
		Assert.assertTrue(true);
	}

	@AfterSuite
	public void Afsuite() {
		System.out.println("I am no 1 from last");

	}

	@Test
	public void SecondTest() {
		System.out.println("Bye1");
		System.out.println("Bye2");
		System.out.println("Bye3");
		System.out.println("Bye4");
		
	}
}
