package day2.basicops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		String actualAppTitle = driver.getTitle();
		String expectedAppTitle = "Google";
		System.out.println("Title is=" + actualAppTitle + " Number of chracter in title =" + actualAppTitle.length());
		System.out.println("Is google search page opened ?" + actualAppTitle.equals(expectedAppTitle));
		String actualurl = driver.getCurrentUrl();
		String expectedurl = "www.google.com";
		System.out.println("actual url =" + actualurl);
		System.out.println("is url match with required url=" + actualurl.contains(expectedurl));

		String pagesource = driver.getPageSource();
		System.out.println("number of char in page " + pagesource.length());
		driver.close();
	}

}
