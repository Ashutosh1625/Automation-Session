package day7.MousekeyboardOps;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		// to open browser on full screen
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://online.actitime.com/ibm/login.do");
		
		//type user name as admin01
		driver.findElement(By.id("username")).sendKeys("admin01");
		
		Thread.sleep(1000);
		driver.findElement(By.name("pwd")).sendKeys(Keys.F5);

	}

}