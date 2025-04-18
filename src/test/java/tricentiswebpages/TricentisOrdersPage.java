package tricentiswebpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class TricentisOrdersPage extends SeleniumUtility{

	public TricentisOrdersPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	/*
	 * Order ID
	 * Date
	 * Price
	 */
}