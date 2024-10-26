package day6.dropdownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) {
// Open browser
		WebDriver driver = new ChromeDriver();
		// maximize window
		driver.manage().window().maximize();
		// implicitly time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// get the URL
		driver.get("https://demowebshop.tricentis.com/customer/orders");
		// click on log on
		driver.findElement(By.className("ico-login")).click();
		// enter email
		WebElement emailField = driver.findElement(By.id("Email"));
		emailField.sendKeys("tester01@vomoto.com");
		// enter password
		WebElement passField = driver.findElement(By.id("Password"));
		passField.sendKeys("Abc@12345");
		// click on log in button
		driver.findElement(By.className("login-button")).click();
		// place the order now click on book
		driver.findElement(By.linkText("Books")).click();
		// selct book and click on it
		driver.findElement(By.linkText("Computing and Internet")).click();
		// add to cart this book
		driver.findElement(By.id("add-to-cart-button-13")).click();
		// click on cart
		driver.findElement(By.className("cart-label")).click();
		// step 1--> identify required dropdown
		WebElement dropdown = driver.findElement(By.id("CountryId"));
		// step 2--> create an instance of select class
		Select select = new Select(dropdown);
		// now performed required operation
		System.out.println("is dropdown allowed multiple select" + select.isMultiple());

		System.out.println("default value peresent in dropdown" + select.getFirstSelectedOption().getText());
		// print options
		List<WebElement> optionList = select.getOptions();
		System.out.println("option count " + optionList.size());
		for (WebElement element : optionList) {
			System.out.println(element.getText());
			// select checkbox
			WebElement checkBox = driver.findElement(By.id("termsofservice"));
			checkBox.click();
			// click on checkouut
			driver.findElement(By.id("checkout")).click();
            // dropdown operations
			WebElement billDropdown = driver.findElement(By.id("billing-address-select"));
            // create instance of select class
			Select bill = new Select(billDropdown);
			System.out.println("default adress peresent in dropdown " + bill.getFirstSelectedOption().getText());
			driver.findElement(By.className("new-address-next-step-button")).click();
			driver.findElement(By.id("PickUpInStore")).click();
			driver.findElement(By.cssSelector("input[onclick='Shipping.save()']")).click();
			// payment method
			driver.findElement(By.id("paymentmethod_0")).click();
			driver.findElement(By.cssSelector("input[onclick= 'PaymentMethod.save()']")).click();
			// payment info
			driver.findElement(By.className("payment-info-next-step-button")).click();
			// confirm order
			driver.findElement(By.className("confirm-order-next-step-button")).click();
			// validate order
			driver.findElement(By.className("order-completed-continue-button")).click();
			// go to profile
			driver.findElement(By.linkText("tester01@vomoto.com")).click();
			// go to order
			driver.findElement(By.linkText("Orders")).click();
			// validate order
			System.out.println("order successfully validate");
			// log out
			driver.findElement(By.className("ico-logout")).click();
			// close
			driver.close();

		}
	}
}
/*
 * Task1: https://demowebshop.tricentis.com/customer/orders place order and
 * validate from order page
 * 
 * Task2: Open browser enter actitime url validate login page enter username and
 * password click on login button validate Home page click Task tab select
 * "New Task " from "Add New" button Fill the required details and click create
 * task button validate new task is created or not select newly created task
 * click delete link Once task is deleted again validate it whether task is
 * deleted or not logout from the application and close the browser
 */