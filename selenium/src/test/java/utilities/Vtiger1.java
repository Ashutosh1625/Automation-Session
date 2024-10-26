package utilities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Vtiger1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");

		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		// keyboard ops
		username.sendKeys("admin", Keys.chord(Keys.CONTROL, "a"), Keys.chord(Keys.CONTROL, "c"));
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys(Keys.CONTROL, "v");
		driver.findElement(By.className("buttonBlue")).click();

		// click on app menu
		driver.findElement(By.className("app-navigator")).click();
		// click from mouse hover ops
		Actions action = new Actions(driver);
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='app-menu']/div/div[2]/div"));
		action.moveToElement(list.get(1)).perform();
		driver.findElement(By.linkText("Leads")).click();
//		driver.findElement(By.xpath("//div[@class='app-menu']/div/div[2]/div[2]/ul/div/div/li[2]")).click();

		driver.findElement(
				By.cssSelector(".col-sm-11>div>div:nth-of-type(2)>div>nav>div>div:nth-of-type(2)>ul>li>button"))
				.click();

		// create leads
		driver.findElement(By.name("firstname")).sendKeys("Ashutosh");
		driver.findElement(By.name("lastname")).sendKeys("Ghyar");
		driver.findElement(By.name("mobile")).sendKeys("8698062424");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		// again click on leads
		driver.findElement(By.className("app-navigator")).click();
		WebElement list1 = driver.findElement(By.xpath("//div[@class='app-menu']/div/div[2]/div[2]"));
		list1.click();
		driver.findElement(By.linkText("Leads")).click();
		//
		driver.findElement(By.name("firstname")).sendKeys("Ashutosh", Keys.ENTER);
		driver.findElement(By.className("inline-search-btn"));

		// checkbox
	//	WebElement checkBox=driver.findElement(By.xpath("//*[@id=\"Leads_listView_row_1\"]/td[1]/div/span[1]/input"));
		//System.out.println("is checkbox displayed "+checkBox.isDisplayed());
		//System.out.println("is checkbox clickable "+checkBox.isEnabled());
		//checkBox.click();
		//System.out.println("is chekbox selected "+checkBox.isSelected());
		
	}
}
