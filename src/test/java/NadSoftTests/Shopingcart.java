package NadSoftTests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import NadSoftPages.CartPage;
import NadSoftPages.HomePage;
import NadSoftPages.ProductPage;

public class Shopingcart extends BaseTest {

    @Test
    public void testShoppingCartFlow() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);

        homePage.openHomePage();
        homePage.searchFor("MacBook");
        homePage.openProduct();

        // Add product twice
        productPage.addToCart();
        Thread.sleep(1000); // wait for alert
        productPage.addToCart();
        Thread.sleep(1000); // wait for alert

        // Validate success message
        String successMessage = productPage.getSuccessMessage();
        Assert.assertTrue(successMessage.contains("Success: You have added MacBook"), "Success message not found!");

        // Open cart and validate URL
        cartPage.openCart();
        String currentUrl = cartPage.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("route=checkout/cart"), "Cart URL navigation failed!");

        // Validate pricing
        double unitPrice = cartPage.getUnitPrice();
        double totalPrice = cartPage.getTotalPrice();
        double expectedTotal = unitPrice * 2;

        Assert.assertEquals(totalPrice, expectedTotal, "Total price calculation is incorrect!");
    }
}
