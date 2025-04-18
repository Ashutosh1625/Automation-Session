package NadSoftPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;

    private By unitPrice = By.cssSelector("table tbody tr td:nth-child(5)");
    private By totalPrice = By.cssSelector("table tbody tr td:nth-child(6)");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openCart() {
        driver.findElement(By.cssSelector("#top-links a[title='Shopping Cart']")).click();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public double getUnitPrice() {
        String text = driver.findElement(unitPrice).getText().replace("$", "").trim();
        return Double.parseDouble(text);
    }

    public double getTotalPrice() {
        String text = driver.findElement(totalPrice).getText().replace("$", "").trim();
        return Double.parseDouble(text);
    }
}
