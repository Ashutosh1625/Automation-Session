package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.LoginPage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoginTest {
    WebDriver driver;
    LoginPage loginPage;
    Properties props = new Properties();

    @BeforeClass
    public void loadData() throws IOException {
        FileInputStream fis = new FileInputStream("C:\\AUTOMATION\\WORKSPACE\\21stPOM\\src\\test\\resources\\testdata.properties");
        props.load(fis);
    }

    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testValidLogin() throws InterruptedException {
        loginPage.login(props.getProperty("valid.username"), props.getProperty("valid.password"));
        Thread.sleep(3000); // Wait for dashboard to load
        Assert.assertTrue(loginPage.isDashboardVisible(), "Dashboard should be visible after login");
    }

    @Test
    public void testInvalidLogin() throws InterruptedException {
        loginPage.login(props.getProperty("invalid.username"), props.getProperty("invalid.password"));
        Thread.sleep(2000); // Wait for error to show
        Assert.assertEquals(loginPage.getErrorMessage(), "Invalid credentials");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
