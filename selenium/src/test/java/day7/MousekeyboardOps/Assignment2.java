package day7.MousekeyboardOps;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://testsheepnz.github.io/BasicCalculator.html");

	}
	

}

/*
TC3:
https://testsheepnz.github.io/BasicCalculator.html
Enter 1st number, copy it
paste it in 2nd number
select operation from dropdown
click on calculate
Print Answer in the console

*/