package tricentiswebpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class TricentisUserProfilePage extends SeleniumUtility{

	public TricentisUserProfilePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	/*
	 * Orders Link
	 */
}