package NadSoftPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openHomePage() {
        driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
    }

    public void searchFor(String product) {
        driver.findElement(By.name("search")).sendKeys(product);
        driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();
    }

    public void openProduct() {
        driver.findElement(By.xpath("//a[contains(text(),'MacBook')]")).click();
    
		
	}
}
