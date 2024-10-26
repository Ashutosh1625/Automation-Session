package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;

public class assignment1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		String actualTitle = driver.getTitle();
		System.out.println("Title name is  =" + actualTitle + " length of Title =" + actualTitle.length());
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://demowebshop.tricentis.com/login";
		System.out.println("is correct page opened or not?" + actualUrl.contains(expectedUrl));

		// driver.findElement(By.id("Email")).sendKeys("tester01@vomoto.com");
		// driver.findElement(By.name("Password")).sendKeys("Abc@12345");
		// driver.findElement(By.id("Login")).click();
		WebElement usernameInputField = driver.findElement(By.id("Email"));
		usernameInputField.sendKeys("tester01@vomoto.com");
		driver.findElement(By.name("Password")).sendKeys("Abc@12345");
		// driver.findElement(By.class("loginButton")).click();
		//WebElement loginbutton = driver.findElement(By.id("Log in"));
		//loginbutton.click();
		driver.findElement(By.className("login-button")).click();
		driver.findElement(By.className("ico-logout")).click();
	}

}
