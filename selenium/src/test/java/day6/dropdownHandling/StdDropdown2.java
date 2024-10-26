package day6.dropdownHandling;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StdDropdown2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//to open browser on full screen
		driver.manage().window().maximize();
		//to avoid NoSuchElementException which is coming due to sync we will use implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://omayo.blogspot.com/");
		
		//Step1: identify required dropdown
		WebElement dropdown=driver.findElement(By.id("multiselect1"));
		//step2: create instance of Select class and pass above dropdown in its constructor
		Select select=new Select(dropdown);
		//now you can perform any required operations
		System.out.println("Is dropdown allowed to select multiple option? "+select.isMultiple());
		
		List<WebElement> optionList=select.getOptions();
		System.out.println("Option count: "+optionList.size());
		
		List<String> actualOptions=new ArrayList<String>();
		for(int i=0;i<optionList.size();i++) {
			WebElement option=optionList.get(i);
			actualOptions.add(option.getText());
			System.out.println(option.getText());
		}
		//validate dropdown options
		List<String> expectedOptions= new ArrayList<String>();
		expectedOptions.add("Volvo");
		expectedOptions.add("Swift");
		expectedOptions.add("Hyundai");
		expectedOptions.add("Audi");
		System.out.println("Are dropdown values getting displayed as expected? "+actualOptions.equals(expectedOptions));
		
		//select option
		select.selectByIndex(0);
		select.selectByValue("swiftx");
		select.selectByVisibleText("Audi");
		//total selected option
		System.out.println("Selected option count: "+select.getAllSelectedOptions().size());
		
//		select.deselectByIndex(0);
//		select.deselectByValue("swiftx");
//		select.deselectByVisibleText("Audi");
			//or
		select.deselectAll();
		
	}

}