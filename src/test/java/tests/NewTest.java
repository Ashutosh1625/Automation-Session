package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class NewTest extends SeleniumUtility {
  @Test
  public void f() {
	  setUp("Chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  typeInput(driver.findElement(By.name("username")), "Admin");
	  typeInput(driver.findElement(By.name("password")), "admin123");
	  clickOnElement(driver.findElement(By.className("orangehrm-login-button")));
	  String currentUrl=driver.getCurrentUrl();
		System.out.println("Is login successful? "+currentUrl.contains("dashboard"));

	
  }
  @Test
  public void login() {
	  setUp("Chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  typeInput(driver.findElement(By.name("username")), "Admin");
	  typeInput(driver.findElement(By.name("password")), "admin1234");
	  clickOnElement(driver.findElement(By.className("orangehrm-login-button")));
	  String currentUrl=driver.getCurrentUrl();
		System.out.println("Is login successful? "+currentUrl.contains("dashboard"));
     
	  
  }
}
