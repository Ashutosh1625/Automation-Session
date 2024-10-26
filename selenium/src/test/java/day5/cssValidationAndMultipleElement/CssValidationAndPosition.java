package day5.cssValidationAndMultipleElement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CssValidationAndPosition {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//to open browser on full screen
		driver.manage().window().maximize();
		//to avoid NoSuchElementException which is coming due to sync we will use implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://online.actitime.com/qk/login.do");
		
		driver.findElement(By.id("loginButton")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.textToBe(By.className("errormsg"), "Username or Password is invalid. Please try again."));
		
		WebElement errorMsg=driver.findElement(By.className("errormsg"));
		//get css properties
		System.out.println("Error Msg color : "+errorMsg.getCssValue("color"));
		System.out.println("Error Msg font size : "+errorMsg.getCssValue("font-size"));
		System.out.println("Error Msg font Family : "+errorMsg.getCssValue("font-family"));
		//get coordinates of error msg
		Point errorPoint=errorMsg.getLocation();
		int error_x=errorPoint.getX();
		int error_y=errorPoint.getY();
		System.out.println("error msg x: "+error_x);
		System.out.println("error msg y: "+error_y);
		
		WebElement usernameInputField=driver.findElement(By.id("username"));
		Point usernamePoint=usernameInputField.getLocation();
		int username_x=usernamePoint.getX();
		int username_y=usernamePoint.getY();
		System.out.println("Username x: "+username_x);
		System.out.println("Username y: "+username_y);
		System.out.println("is error msg getting displayed above username field? "+(error_y<username_y));
	}

}
/*
click on login button without entering username & password

validate:
	Error msg color is in red
	error msg font is 13
	error msg font family
	
	error msg is getting displayed above username input field
*/