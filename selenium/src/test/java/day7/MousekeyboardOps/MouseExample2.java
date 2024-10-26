package day7.MousekeyboardOps;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MouseExample2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		// to open browser on full screen
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.automationtesting.in/Register.html");
		//create an instance of actions class and pass driver instance to its constructor
		Actions action=new Actions(driver);
		
		List<WebElement> mainMenuList=driver.findElements(By.cssSelector(".navbar-nav>li>a"));
		
		//hover on HOME link
		//action.moveToElement(mainMenuList.get(0)).perform();
		
		//action.moveToElement(mainMenuList.get(2),100,0).perform();
		
		for(int i=0;i<mainMenuList.size();i++) {
			action.moveToElement(mainMenuList.get(i)).perform();
			Thread.sleep(1000);
		}
	}
}

