package day5.cssValidationAndMultipleElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElementHandling3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//to open browser on full screen
		driver.manage().window().maximize();
		//to avoid NoSuchElementException which is coming due to sync we will use implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.gsmarena.com/");
		//get all links from page
		List<WebElement> deviceList=driver.findElements(By.cssSelector(".brandmenu-v2>ul>li>a"));
		System.out.println("Total devies in page : "+deviceList.size());
		for(int i=0;i<deviceList.size();i++) {
//			WebElement element=deviceList.get(i);
//			String name=element.getText();
//			System.out.println(name);
					//or
			System.out.println(deviceList.get(i).getText());
		}
	}

}
/*
get all links count and print there href

*/