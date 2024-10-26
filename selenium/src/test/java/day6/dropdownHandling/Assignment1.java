package day6.dropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		//open browser
		WebDriver driver=new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		// give implictly time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// vet the URL
		driver.get("https://online.actitime.com/qk/login.do");
		System.out.println("home page is validated");
		// log in username
		WebElement usernameField=driver.findElement(By.id("username"));
		usernameField.sendKeys("admin01");
		WebElement passField=driver.findElement(By.name("pwd"));
		passField.sendKeys("admin01");
		driver.findElement(By.linkText("Login")).click();
		System.out.println("log in page is validated");
		// click on task tab
		driver.findElement(By.linkText("Tasks")).click();
		//select add new
		driver.findElement(By.className("plusIcon")).click();
		//dropdown open
		driver.findElement(By.cssSelector(".addNewMenu>div:nth-of-type(3)")).click();
// dropdown 1
		driver.findElement(By.cssSelector(".customerOrProjectSelector>div>div>div:nth-of-type(3)")).click();
	driver.findElement(By.cssSelector(".selectCustomerRow>td>div>div>div:nth-of-type(2)>div>div>div>div:nth-of-type(5)")).click();
	// dropdown 2
	driver.findElement(By.cssSelector("td>div>div>div>div:nth-of-type(3)")).click();
	
	
	}

}


/*
Task2:
Open browser
enter actitime url
validate login page
enter username and password
click on login button
validate Home page 
click Task tab
select "New Task " from "Add New"  button
Fill the required details and click create task button
validate new task is created or not
select newly created task
click delete link
Once task is deleted again validate it whether task is deleted or not
logout from the application and close the browser

*/