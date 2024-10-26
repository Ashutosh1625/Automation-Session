package day7.MousekeyboardOps;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.SeleniumUtil;

public class Example3WithUtil extends SeleniumUtil {

	public static void main(String[] args) {
		Example3WithUtil e1=new Example3WithUtil();
		e1.performCopyPasteOnActitime();
	}
	
	public void performCopyPasteOnActitime() {
		WebDriver driver=setUp("chrome", "https://online.actitime.com/ibm/login.do");
		WebElement username=driver.findElement(By.id("username"));
		WebElement password=driver.findElement(By.name("pwd"));
		performCopyAndPaste(username, "admin01", password);
		password.sendKeys(Keys.ENTER);
	}
}