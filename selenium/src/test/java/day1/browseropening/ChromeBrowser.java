package day1.browseropening;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class ChromeBrowser {

	public static void main(String[] args) {
		ChromeDriver cdriver=new ChromeDriver();
		cdriver.get("https://www.google.com");
		String actualTitle=cdriver.getTitle();
		String expectedTitle="google";
		System.out.println("actualTitle is ="+actualTitle+"char in actual title"+actualTitle.length());
		System.out.println("is google search opened page?"+actualTitle.equals(expectedTitle));
	    
		String actualUrl=cdriver.getCurrentUrl();
	    String expectedUrl = "www.google.com";
	    System.out.println("actual URL"+actualUrl);
	    System.out.println("is url match with required URL="+actualUrl.contains(expectedUrl));
	    cdriver.close();
	}
	
	
	

}
