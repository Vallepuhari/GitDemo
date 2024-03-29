import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Filters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		
		List<WebElement> Veggies = driver.findElements(By.xpath("//tr/td[1]"));
		
		 List<WebElement> filteredList = Veggies.stream().filter(veggie->veggie.getText().contains("Rice")).collect(Collectors.toList());	
		
		Assert.assertEquals(Veggies.size(), filteredList.size());
		
		System.out.println(Veggies.size());
		System.out.println(filteredList.size());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
