package NadSoftPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    private WebDriver driver;

    private By addToCartButton = By.id("button-cart");
    private By successAlert = By.cssSelector("div.alert-success");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addToCart() {
        driver.findElement(addToCartButton).click();
    }

    public String getSuccessMessage() {
        return driver.findElement(successAlert).getText();
    }
}
