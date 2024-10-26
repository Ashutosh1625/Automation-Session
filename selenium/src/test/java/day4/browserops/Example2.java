package day4.browserops;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		// to open browser on maximize screen
		driver.manage().window().maximize();
		// to avoid NoSuchElementException which is coming dute to sync we will use
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.className("ico-register")).click();
		driver.navigate().back();
		String actualTitle = driver.getTitle();
		String expectedtitle = "Demo Web Shop";
		System.out.println("actualTitle is =" + actualTitle + "char in actual title" + actualTitle.length());
		System.out.println("is the correct Title displys ?" + actualTitle.equals(expectedtitle));
		// ckick again on registration page
		driver.findElement(By.className("ico-register")).click();
		// enter first name
		driver.findElement(By.name("FirstName")).sendKeys("Ashutosh");
		// reload the page
		driver.navigate().refresh();
		// navigate to log in
		driver.navigate().to("https://demowebshop.tricentis.com/login");
		driver.close();

		/*
		 * open https://demowebshop.tricentis.com/ maximize browser window click on
		 * registration come back to home page and get the title goto registration page
		 * again enter firstname reload the page navigate to login page
		 */
	}
}
