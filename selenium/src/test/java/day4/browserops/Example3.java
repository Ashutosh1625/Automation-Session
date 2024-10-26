package day4.browserops;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//to open browser on full screen
		driver.manage().window().maximize();
		//to avoid NoSuchElementException which is coming due to sync we will use implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demowebshop.tricentis.com/register");
		
		WebElement fistNameInputField=driver.findElement(By.id("FirstName"));
		System.out.println("is FirstNameInputField displayed? "+fistNameInputField.isDisplayed());
		System.out.println("is FirstNameInputField editable? "+fistNameInputField.isEnabled());
		
		WebElement maleRadioButton=driver.findElement(By.id("gender-male"));		
		System.out.println("is maleRadioButton displayed? "+maleRadioButton.isDisplayed());
		System.out.println("is maleRadioButton clickable? "+maleRadioButton.isEnabled());
		System.out.println("is maleRadioButton selected before click? "+maleRadioButton.isSelected());
		maleRadioButton.click();
		System.out.println("is maleRadioButton selected after click? "+maleRadioButton.isSelected());
		
		WebElement registrationButton=driver.findElement(By.id("register-button"));
		System.out.println("is registrationButton displayed? "+registrationButton.isDisplayed());
		System.out.println("is registrationButton clickable? "+registrationButton.isEnabled());
		System.out.println("RegistrationButton name "+registrationButton.getAttribute("value"));
		
		WebElement registerLink=driver.findElement(By.linkText("Register"));
		System.out.println("is registerLink displayed? "+registerLink.isDisplayed());
		System.out.println("is registerLink clickable? "+registerLink.isEnabled());
		System.out.println("registerLink name "+registerLink.getText());
	}
}
/*
 * FirstName:  
 * 	visibility- isDisplayed() 
 * 	editable - isEnabled()
 * 
 * Male radio button: visibility, clickable, by default seleted or not, after selection
 * 	visibility- isDisplayed() 
 * 	clickable - isEnabled()
 * 	selection - isSelected()
 * 
 * Registration button:
 * 	visibility- isDisplayed() 
 * 	clickable - isEnabled()
 * 	name	  - getAttribute()
 * 
 * Register link: 
 * 	visibility- isDisplayed() 
 * 	clickable - isEnabled()
 * 	name	  - getText();
 * 
 * 
 * 
 */