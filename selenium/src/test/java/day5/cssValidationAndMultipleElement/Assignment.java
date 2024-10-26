package day5.cssValidationAndMultipleElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment {

	public static void main(String[] args) {
		// browser opening
		WebDriver driver = new ChromeDriver();
		// maximize window
		driver.manage().window().maximize();
		// give implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// get the url
		driver.get("https://demowebshop.tricentis.com/register");
		// click on register
		driver.findElement(By.className("ico-register")).click();
		// click on register without entering info 
		driver.findElement(By.id("register-button")).click();
		//
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.textToBe(By.id("First Name"), "First name is required"));
		
		WebElement errorMsg=driver.findElement(By.className("First Name"));

		System.out.println("error msg color is "+errorMsg.getCssValue("color"));
		System.out.println("error msg family "+errorMsg.getCssValue("font-family"));
		System.out.println("error msg font "+errorMsg.getCssValue("font-size"));
	}

}
/*
 * https://demowebshop.tricentis.com/register
 * 
 * click on register
 * 
 * validate error msg for each field color font font family position against
 * element
 */