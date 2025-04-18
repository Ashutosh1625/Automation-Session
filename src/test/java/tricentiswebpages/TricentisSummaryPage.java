package tricentiswebpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class TricentisSummaryPage extends SeleniumUtility{

	public TricentisSummaryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	/*
	 * Success Message
	 * Order Id
	 * Continue button
	 * 
	 */
}