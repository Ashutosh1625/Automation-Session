package tricentiswebpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class TricentisLoginPage extends SeleniumUtility{

	public TricentisLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * Emailid input field -tester01@vomoto.com
	 * Password input field - Abc@12345
	 * Login button
	 * 
	 * related method
	 */
}