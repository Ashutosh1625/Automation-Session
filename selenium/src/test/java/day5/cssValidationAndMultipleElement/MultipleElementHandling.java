package day5.cssValidationAndMultipleElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElementHandling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//to open browser on full screen
		driver.manage().window().maximize();
		//to avoid NoSuchElementException which is coming due to sync we will use implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.demoblaze.com/");
		//get all links from page
		List<WebElement> linkList=driver.findElements(By.tagName("a"));
		System.out.println("Total link in page : "+linkList.size());
		for(int i=0;i<linkList.size();i++) {
			WebElement element=linkList.get(i);
			String href=element.getAttribute("href");
			System.out.println(href);
		}
	}

}
/*
get all links count and print there href

*/