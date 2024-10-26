package day5.cssValidationAndMultipleElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		// open browser
		WebDriver driver = new ChromeDriver();
//maximize window
		driver.manage().window().maximize();
// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
// get url
		driver.get("https://www.gsmarena.com");

		WebElement link = driver.findElement(By.linkText("SAMSUNG"));
		link.click();
		// get css
		List<WebElement> list = driver.findElements(By.cssSelector(".makers>ul>li>a"));
		System.out.println("total device " + list.size());
		for (int i = 0; i < list.size(); i++) {
			// WebElement linkList = list.get(i);
			// String name = linkList.getText();
			// System.out.println(name);
			// or
			System.out.println(list.get(i).getText());

		}
	}
}
/*
 * https://www.gsmarena.com/
 * 
 * click on SAMSUNG clink present inside PhoneFinder
 * 
 * get SAMSUNG device count and print there names
 */