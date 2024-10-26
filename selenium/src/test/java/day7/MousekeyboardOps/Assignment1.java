package day7.MousekeyboardOps;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.espncricinfo.com/");
		
		List<WebElement> mainList=driver.findElements(By.xpath("//div[3]/div/nav/div/div/div/div[2]/div/div/a"));
		Actions action=new Actions(driver);
		
//		action.moveToElement(mainList.get(3)).perform();
	
		for(int i=0;i<mainList.size();i++) {
			action.moveToElement(mainList.get(i)).perform();
			WebElement names=mainList.get(i);
			String listName=names.getText();
			System.out.println(listName);
			Thread.sleep(2000);
		}
	
	}

}

/*
TC2:
Open any browser and enter https://www.espncricinfo.com/
Get the top menu count 
One by one print top menu names and also perform mouse hover operations
*/