package day8.TestNGBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.devtools.v119.domsnapshot.model.StringIndex;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.SeleniumUtil;

public class OrangeHRMTestNG extends SeleniumUtil {
	@Test
	public void OrangeHRMLoginpagewithAssert() {
		setUp("Chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		typeRequiredInput(driver.findElement(By.name("username")), "Admin");
		typeRequiredInput(driver.findElement(By.name("password")), "admin123");
		clickOnElement(driver.findElement(By.className("orangehrm-login-button")));
		String expectedTitle = "OrangeHRM";
		String atualTitle = getAppTitle(expectedTitle);
		Assert.assertEquals(atualTitle, expectedTitle, "Log in failed");
		clickOnElement(driver.findElement(By.linkText("PIM")));
		clickOnElement(driver.findElement(By.linkText("Add Employee")));
		typeRequiredInput(driver.findElement(By.name("firstName")), "Ashutosh");
		typeRequiredInput(driver.findElement(By.name("lastName")), "Ghyar");
		clickOnElement(driver.findElement(By.xpath("//button[@type='submit']")));
	}

}
