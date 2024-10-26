package day8.TestNGBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utilities.SeleniumUtil;

public class VtigerTestNG extends SeleniumUtil {
  @Test
  public void f() {
	  setUp("Chrome", "https://demo.vtiger.com/vtigercrm/index.php");
	  typeRequiredInput(driver.findElement(By.id("username")), "admin");
	  typeRequiredInput(driver.findElement(By.id("password")), "admin");
	  clickOnElement(driver.findElement(By.className("button")));
	  clickOnElement(driver.findElement(By.id("appnavigator")));
	  clickOnElement(driver.findElement(By.id("MARKETING_modules_dropdownMenu")));
	  clickOnElement(driver.findElement(By.xpath("//a[contains(@href, 'Leads')]")));
	 clickOnElement(driver.findElement(By.id("Leads_listView_basicAction_LBL_ADD_RECORD")));
	 typeRequiredInput(driver.findElement(By.id("Leads_editView_fieldName_firstname")), "Ashutosh");
	 typeRequiredInput(driver.findElement(By.id("Leads_editView_fieldName_lastname")), "Ghyar");
	 typeRequiredInput(driver.findElement(By.id("Leads_editView_fieldName_mobile")), "8698062424");
     clickOnElement(driver.findElement(By.className("saveButton")));
     clickOnElement(driver.findElement(By.id("appnavigator")));
	  clickOnElement(driver.findElement(By.id("MARKETING_modules_dropdownMenu")));
	  // not by using util ?????
	  Actions action = new Actions(driver);
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='app-menu']/div/div[2]/div"));
		action.moveToElement(list.get(1)).perform();
		driver.findElement(By.linkText("Leads")).click();
	// searching
		typeRequiredInput(driver.findElement(By.name("firstname")), "Ashutosh");
		clickOnElement(driver.findElement(By.className("inline-search-btn")));
		clickOnElement(driver.findElement(By.xpath("//table/tbody/tr[1]/td[3]/a"))); // Click on the first lead);
		
}
}