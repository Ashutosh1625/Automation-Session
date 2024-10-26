package day8.TestNGBasics;

import org.testng.annotations.Test;

import utilities.SeleniumUtil;

public class Example1 extends SeleniumUtil {
	
	@Test
	public void testGoogle() {
		setUp("Chrome", "https://www.google.com");
		
	}
}