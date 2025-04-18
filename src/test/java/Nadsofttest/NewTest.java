package Nadsofttest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

@Test
public class NewTest extends SeleniumUtility {
  public void f() {
	  setUp("Chrome", "https://tutorialsninja.com/demo/index.php?route=common/home");
	  // Search for MacBook
	  driver.findElement(By.name("search")).sendKeys("MacBook");
	  // click on search
      driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();
      // click on Macbook from suggestion list
      driver.findElement(By.xpath("//a[contains(text(),'MacBook')]")).click();
      // add to cart 
      driver.findElement(By.cssSelector("#button-cart")).click();
      driver.findElement(By.cssSelector("#input-quantity")).clear();
      driver.findElement(By.cssSelector("#input-quantity")).sendKeys("1");
      driver.findElement(By.id("button-cart")).click();
      // validate success msg
      String expectedmsg = "Success: You have added MacBook to your shopping cart!";
		String actualmsg = getAppTitle(expectedmsg);
		Assert.assertEquals(actualmsg, expectedmsg, "product is added to cart");
		// click on shopping cart
				
		//String expectedTitle = "OrangeHRM";
		//String atualTitle = getAppTitle(expectedTitle);
		//Assert.assertEquals(atualTitle, expectedTitle, "Log in failed");
	
	

  }

private String getAppTitle(String expectedmsg) {
	return expectedmsg ;
}
}
