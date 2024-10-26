package day5.cssValidationAndMultipleElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Books")).click();
		List<WebElement> bookList=driver.findElements(By.cssSelector(".item-box>.product-item>div:nth-of-type(2)>h2"));
		System.out.println("total books in list "+ bookList.size());
		for(int i=0;i<bookList.size();i++) {
		System.out.println(bookList.get(i).getText()+ " ");
		}
	
		}
	}


/*
https://demowebshop.tricentis.com/

click on BOOKs

get books count and print there names
*/