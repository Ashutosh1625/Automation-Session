package day3.synchronisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//to avoid NoSuchElementException which is coming due to sync we will use implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.name("username")).sendKeys("Admin");//0-30 sec
		driver.findElement(By.name("password")).sendKeys("admin123");//0-30 sec
		driver.findElement(By.className("orangehrm-login-button")).click();//0-30 sec
		String currentUrl=driver.getCurrentUrl();//0-30 sec
		System.out.println("Is login successful? "+currentUrl.contains("dashboard"));
		driver.close();
	}
}