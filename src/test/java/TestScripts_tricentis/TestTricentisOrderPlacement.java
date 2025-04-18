package TestScripts_tricentis;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import tricentiswebpages.TricentisCartsPage;
import tricentiswebpages.TricentisCheckoutPage;
import tricentiswebpages.TricentisHomePage;
import tricentiswebpages.TricentisLoginPage;
import tricentiswebpages.TricentisOrdersPage;
import tricentiswebpages.TricentisSummaryPage;
import tricentiswebpages.TricentisUserProfilePage;
import utilities.SeleniumUtility;

public class TestTricentisOrderPlacement extends SeleniumUtility {
	WebDriver driver;
	TricentisUserProfilePage getTricentisUserProfilePage;
	TricentisLoginPage getTricentisLoginPage;
	TricentisHomePage getTricentisHomePage;
	TricentisOrdersPage getTricentisOrderPage;
	TricentisCartsPage getTricentisCartsPage;
	TricentisCheckoutPage getTricentisCheckoutPage;
	TricentisSummaryPage getTricentisSummaryPage;

	@BeforeMethod
	public void precondition() {
		setUp("Chrome", "https://demowebshop.tricentis.com/login");
		getTricentisUserProfilePage=new TricentisUserProfilePage(driver);
		getTricentisLoginPage=new TricentisLoginPage(driver);
		getTricentisHomePage=new TricentisHomePage(driver);
		getTricentisOrderPage=new TricentisOrdersPage(driver);
		getTricentisCartsPage=new TricentisCartsPage(driver);
		getTricentisCheckoutPage=new TricentisCheckoutPage(driver);
		getTricentisSummaryPage=new TricentisSummaryPage(driver);

	}

}
