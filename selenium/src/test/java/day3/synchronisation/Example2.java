package day3.synchronisation;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//to avoid NoSuchElementException which is coming due to sync we will use implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://online.actitime.com/qk/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin01");//0-30 sec
		driver.findElement(By.name("pwd")).sendKeys("admin01");//0-30 sec
		driver.findElement(By.id("loginButton")).click();//0-30 sec
		
		String expectedtTitle="actiTIME - Enter Time-Track";
		
		//implement conditional wait to wait till required page title is not getting displayed with in given timeout
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleIs(expectedtTitle));
		
		String currentTitle=driver.getTitle();//0-30 sec
		System.out.println("After login, Current Title is: "+currentTitle);
		System.out.println("Is login successful? "+currentTitle.equals(expectedtTitle));
		//wait till logout link is not clickable
		wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutlink")));
		
		driver.findElement(By.id("logoutLink")).click();
		driver.close();
	}
}