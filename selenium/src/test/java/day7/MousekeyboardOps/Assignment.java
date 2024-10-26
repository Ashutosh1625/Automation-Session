package day7.MousekeyboardOps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://www.flipkart.com");

	}

}
/*
TC1:
Open any browser and enter flipkart url
Get the top menu count 
One by one print top menu names and also perform mouse hover operations
*/