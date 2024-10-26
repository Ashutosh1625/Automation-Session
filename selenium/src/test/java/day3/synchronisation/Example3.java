package day3.synchronisation;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Example3 {

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
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
		.withTimeout(Duration.ofSeconds(20))//total time to be taken for element allocation
		.pollingEvery(Duration.ofSeconds(5))//time that will use to re-try the element
		.ignoring(NoSuchElementException.class);//to avoid exception which might come during re-try
		
		
		wait.until(ExpectedConditions.titleIs(expectedtTitle));
		String currentTitle=driver.getTitle();//0-30 sec
		System.out.println("After login, Current Title is: "+currentTitle);
		System.out.println("Is login successful? "+currentTitle.equals(expectedtTitle));
		//wait till logout link is not clickable
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("logoutLink"))));
		
		driver.findElement(By.id("logoutLink")).click();
		driver.close();
	}
}