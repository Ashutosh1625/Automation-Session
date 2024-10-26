package day8.screenshotAndJS;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtil;

public class Scrolling extends SeleniumUtil{
	
	public static void main(String[] args) throws InterruptedException {
		Scrolling e1=new Scrolling();
		e1.testCase1();
	}

	public void testCase1() throws InterruptedException {
		WebDriver driver=setUp("chrome", "https://www.amazon.in");
		JavascriptExecutor js=(JavascriptExecutor)driver;
//		//vertical scrolling
//		js.executeScript("window.scrollBy(0,2500)");
//		setSleepTime(1000);
//		js.executeScript("window.scrollBy(0,-2500)");
		
		//scroll till bottom of the page
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");

		
		//Horizontal scrolling
		//js.executeScript("window.scrollBy(500,0)");
		
		System.out.println("Done...");
	}
}