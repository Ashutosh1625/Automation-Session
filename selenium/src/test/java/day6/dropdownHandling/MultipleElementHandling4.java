package day6.dropdownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElementHandling4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//to open browser on full screen
		driver.manage().window().maximize();
		//to avoid NoSuchElementException which is coming due to sync we will use implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://thompsonsj.com/bootstrap-select-dropdown/");
		
		driver.findElement(By.cssSelector(".btn-primary")).click();
		
		//identify suggestions
		List<WebElement> optionList=driver.findElements(By.cssSelector(".dropdown-menu-right.show>div>a"));
		System.out.println("optionList count: "+optionList.size());
		for(int i=0;i<optionList.size();i++) {
			System.out.println(optionList.get(i).getText());
		}
		//selecting 3rd suggestion 
		optionList.get(2).click();
		
	}
}