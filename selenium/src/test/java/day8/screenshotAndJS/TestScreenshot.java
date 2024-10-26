package day8.screenshotAndJS;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtil;

public class TestScreenshot extends SeleniumUtil{

	public static void main(String[] args) throws IOException {
		TestScreenshot ref=new TestScreenshot();
		ref.testScreenshots();
		ref.testScreenshotsWithUtil();
	}
	
	void testScreenshotsWithUtil() {
		WebDriver driver=setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		waitUntilElementPresent(driver.findElement(By.name("username")));
		getScreenshot(".\\screenshots\\beforeUserName.jpg");
		typeRequiredInput(driver.findElement(By.name("username")), "Admin");
		getScreenshot(".\\screenshots\\afterUserName.jpg");
	}

	void testScreenshots() throws IOException {
		WebDriver driver=setUp("chrome", "https://www.google.com");
		//type cast WebDriver instance into TakesScreenshot interface
		TakesScreenshot ts=(TakesScreenshot)driver;
		//now using TakesScreenshot reference get the required page screenshot
		File screenShot=ts.getScreenshotAs(OutputType.FILE);
		//now we can save screenshot into the required location
		FileUtils.copyFile(screenShot,new File(".\\screenshots\\google.jpg"));
	}
}