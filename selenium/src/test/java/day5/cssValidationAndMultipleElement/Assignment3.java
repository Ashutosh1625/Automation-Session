package day5.cssValidationAndMultipleElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
		//open browser
		WebDriver driver=new ChromeDriver();
		// maximize window
		driver.manage().window().maximize();
		// implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// get url
		driver.get("https://opensource-demo.orangehrmlive.com/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");//0-30 sec
		driver.findElement(By.name("password")).sendKeys("admin123");//0-30 sec
		driver.findElement(By.className("orangehrm-login-button")).click();//0-30 sec
	}

}
/*
https://opensource-demo.orangehrmlive.com/auth/login

get the username and password from login detail section 

enter username you picked from Login details
enter password you picked from Login details
click on login
*/