package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.findElement(By.name("username")).sendKeys("Admin");
driver.findElement(By.name("password")).sendKeys("admin123");
driver.findElement(By.className("orangehrm-login-button")).click();
//click on PIM and Add EMPLOYEE
driver.findElement(By.linkText("PIM")).click();
driver.findElement(By.linkText("Add Employee")).click();
//Fill the details
driver.findElement(By.name("firstName")).sendKeys("Ashutosh");
driver.findElement(By.name("lastName")).sendKeys("Ghyar");
// epmloyee id and save
//driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")).clear();
driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
// edit PIM
driver.findElement(By.xpath("//span[text()='PIM']")).click();	
driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Ashutosh Ghyar");
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@type='submit']")).click();
// click on checkbox
WebElement checkBox=driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[1]/div/div"));
System.out.println("is checkbox displayed "+checkBox.isDisplayed());
System.out.println("is checkbox clickable "+checkBox.isEnabled());
checkBox.click();
System.out.println("is chekbox selected "+checkBox.isSelected());
// click on edit buttton
driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[9]/div/button[1]")).click();
// edit the info
driver.findElement(By.className("orangehrm-middlename")).sendKeys("Shivhari");
driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/input")).sendKeys("MH12W5595");
//driver.findElement(By.cssSelector(".oxd-select-text-input")).click();

WebElement RadioButton=driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/label"));
System.out.println("is RadioButton displayed "+RadioButton.isDisplayed());
System.out.println("is RadioButton clickable "+RadioButton.isEnabled());
	
RadioButton.click();
System.out.println("is RadioButton selected "+checkBox.isSelected());
Thread.sleep(2000);
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("document.getElementsByClassName('/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/button')[0].click();");

	}

}
