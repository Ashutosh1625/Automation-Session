package day1.browseropening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
  driver.get("https://www.actitime.com/login-to-product/check-email");
	}

}
