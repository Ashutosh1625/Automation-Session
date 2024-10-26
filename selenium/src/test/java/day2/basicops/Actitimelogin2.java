 package day2.basicops;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimelogin2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://online.actitime.com/qk/login.do");
//		//first identify the username input field before you perform any operation on it
//		WebElement usernameInputField=driver.findElement(By.id("username"));
//		//perform required operation like type username as admin01
//		usernameInputField.sendKeys("admin01");
						//or
		//if you need an element only once dn no need to store in WebElement
		driver.findElement(By.id("username")).sendKeys("admin01");
		
		//first identify the password input field dn perform required operation
		driver.findElement(By.name("pwd")).sendKeys("admin01");
		
		//first identify login button dn perform required operation
		driver.findElement(By.id("loginButton")).click();
		
		driver.close();
	}

}
/**
 * to identify any element from application we use 
 * 			WebElement element=driver.findElement(By.locators(""));
 * 
Step1: identify the required element using findElement(By)

findElement(By)- use to identify the element using "By" class and this class has predefined methods 
which are also known as locators and return the WebElement.

WebElement element=driver.findElement(By.id(""));
										.name(""));
										.linkText(""));
										.className(""));
										.partialLinkText(""));
										.tagName(""));
										.cssSelector(""));
										.xpath(""));
										
Step2: once you identify the WebElement you can perform required operation it
	a. type text  			----> element.sendkeys("");
	b. delete existing text ----> element.clear();
	c. click on element     ----> element.click();
	
	element.sendkeys("amdin");
	element.clear();
	element.click();
 */

/*
open required browser
enter app url
enter user name as admin01
enter password as admin01
click login button
close the browser
*/