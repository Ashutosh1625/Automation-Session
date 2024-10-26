package utilities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class vtiger {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		WebElement Password = driver.findElement(By.id("password"));
		Password.clear();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.className("button")).click();
		// click on navigator button and click on marketing dn click on contacts
		driver.findElement(By.id("appnavigator")).click();
		driver.findElement(By.id("MARKETING_modules_dropdownMenu")).click();
		WebElement contactsTab = driver.findElement(By.xpath("//a[contains(@href, 'Contacts')]"));
		contactsTab.click();
		// fill the details
		driver.findElement(By.id("Contacts_listView_basicAction_LBL_ADD_RECORD")).click();
		// dropdown
		//WebElement dropdown = driver.findElement(By.id("s2id_autogen1"));
		//dropdown.click();
		driver.findElement(By.id("Contacts_editView_fieldName_firstname")).sendKeys("Ashutosh");
		driver.findElement(By.id("Contacts_editView_fieldName_lastname")).sendKeys("Ghyar");
		driver.findElement(By.id("Contacts_editView_fieldName_mobile")).sendKeys("8698062424");
		driver.findElement(By.className("saveButton")).click();
		// again click on
		driver.findElement(By.id("appnavigator")).click();
		driver.findElement(By.id("MARKETING_modules_dropdownMenu")).click();
		Actions action = new Actions(driver);
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='app-menu']/div/div[2]/div"));
		action.moveToElement(list.get(2)).perform();
		driver.findElement(By.linkText("Contacts")).click();
		//WebElement contactsTab1 = driver.findElement(By.xpath("//a[contains(@href, 'Contacts')]"));
		//contactsTab1.click();
		// search for info
		driver.findElement(By.name("firstname")).sendKeys("Ashutosh");
		driver.findElement(By.className("inline-search-btn"));
		// click by java scripts
	//	WebElement element=driver.findElement(By.className("listViewEntriesCheckBox"));
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("argument[0].click();",element);
		driver.findElement(By.xpath("//input[@value='28']"));
	}	
}
