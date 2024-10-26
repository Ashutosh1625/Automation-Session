package day6.dropdownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StdDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//to open browser on full screen
		driver.manage().window().maximize();
		//to avoid NoSuchElementException which is coming due to sync we will use implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.automationtesting.in/Register.html");
		
		//Step1: identify required dropdown
		WebElement dropdown=driver.findElement(By.id("Skills"));
		//step2: create instance of Select class and pass above dropdown in its constructor
		Select select=new Select(dropdown);
		//now you can perform any required operations
		System.out.println("Is dropdown allowed to select multiple option? "+select.isMultiple());
		
		System.out.println("Default value displayed in dropdown: "+select.getFirstSelectedOption().getText());
		
		List<WebElement> optionList=select.getOptions();
		System.out.println("Option count: "+optionList.size());
		
		for(WebElement element: optionList) {
			System.out.println(element.getText());
		}
		
		//select option
		select.selectByIndex(1);
		System.out.println("Option selected from index1 : "+select.getFirstSelectedOption().getText());
		Thread.sleep(1000);
		select.selectByValue("Android");
		System.out.println("Option selected using value : "+select.getFirstSelectedOption().getText());
		Thread.sleep(1000);
		select.selectByVisibleText("Backup Management");
		System.out.println("Option selected using visible text : "+select.getFirstSelectedOption().getText());
	}

}