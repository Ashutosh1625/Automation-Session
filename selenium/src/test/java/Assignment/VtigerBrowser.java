package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import day1.browseropening.ChromeBrowser;

public class VtigerBrowser {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		String actualurl = driver.getCurrentUrl();
		String expectedurl = "https://demo.vtiger.com/vtigercrm/index.php";
		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		WebElement Password = driver.findElement(By.id("password"));
		Password.clear();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
	    driver.findElement(By.className("button")).click();
	}

}
