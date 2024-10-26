package day4.browserops;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//to avoid NoSuchElementException which is coming due to sync we will use implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//to open browser on full screen
		driver.manage().window().maximize();
		//to set browser window based on need
		driver.manage().window().setSize(new Dimension(600,700));
		//to minimize browser window
		driver.manage().window().minimize();
		//to open browser on full screen
		driver.manage().window().maximize();
		driver.findElement(By.className("orangehrm-login-forgot-header")).click();
		
		//to come back to previous page
		driver.navigate().back();
		//to goto next page
		driver.navigate().forward();
		//to move to different URL
		driver.navigate().to("https://www.google.com");
		//to refresh current page
		driver.navigate().refresh();
	}
}
