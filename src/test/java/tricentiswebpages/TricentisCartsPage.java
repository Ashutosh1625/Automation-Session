package tricentiswebpages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class TricentisCartsPage extends SeleniumUtility{

	public TricentisCartsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	/*
	 * ProductName
	 * ProductPrice
	 * Agreement Checkbox
	 * Checkout
	 */
}