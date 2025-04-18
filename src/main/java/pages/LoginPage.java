package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
    	WebElement user = driver.findElement(By.cssSelector("input[placeholder='Username']"));
    	user.sendKeys("Admin");
    }

    public void enterPassword(String password) {
    	WebElement pass = driver.findElement(By.cssSelector("input[placeholder='Password']"));
    	pass.sendKeys("admin123");
    }

    public void clickLogin() {
    WebElement click = driver.findElement(By.cssSelector("button[type='submit']"));
    click.click();
    }

    public String getErrorMessage() {
    	WebElement Msg = driver.findElement(By.cssSelector(".oxd-alert-content-text"));
    	return Msg.getText(); 
    }

    public boolean isDashboardVisible() {
        return driver.getCurrentUrl().contains("dashboard");
    }

    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }
}

/*
By usernameField = By.cssSelector("input[placeholder='Username']");
By passwordField = By.cssSelector("input[placeholder='Password']");
By loginButton = By.cssSelector("button[type='submit']");
By messageBox = By.cssSelector(".oxd-alert-content-text");
*/