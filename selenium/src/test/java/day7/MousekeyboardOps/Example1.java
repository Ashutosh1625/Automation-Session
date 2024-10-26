package day7.MousekeyboardOps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		// to open browser on full screen
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://online.actitime.com/ibm/login.do");
		
		//type user name as admin01 and copy it
		driver.findElement(By.id("username")).sendKeys("admin01",
														Keys.chord(Keys.CONTROL,"a"),
														Keys.chord(Keys.CONTROL,"c"));
		//paste copied value into password field and press enter button
		driver.findElement(By.name("pwd")).sendKeys(Keys.chord(Keys.CONTROL,"v"),
													Keys.ENTER);

	}

}