package tricentiswebpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class TricentisHomePage extends SeleniumUtility{

	public TricentisHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * userprofile
	 * logout
	 * Shipping Cart
	 * ProductName
	 * ProductPrice
	 * Required Product add to cart button
	 * 
	 */
}