import Utils.BrowserUtils;
import Utils.Driver;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;

import pages.HomePage;
import pages.OrderPage;
import pages.WeborderHomePage;
import pages.WeborderLoginPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class WebOrderTest extends Hooks {

	@Test
	void testSeleniumWebDriver() throws InterruptedException {
		HomePage HomePage = new HomePage();
		HomePage.clickOnWebOrder();
		WeborderLoginPage weborderLoginPage = new WeborderLoginPage();
		weborderLoginPage.login("Inar", "Academy");
		WeborderHomePage weborderHomePage = new WeborderHomePage();
		weborderHomePage.navigateToOrder();
		OrderPage orderPage = new OrderPage();
		Thread.sleep(2000);
		orderPage.enterProduct("Books", "10", "10");
		orderPage.enterCustomerInfo("Inar Academy", "Main", "New York", "NW", "1004");

		BrowserUtils.scrollDown();
		Thread.sleep(1000);

		orderPage.enterPaymentInformation("amex", "342738261027163", "11/20");
		orderPage.clickProgress();
		WebElement orderSuccessAlert = Driver.getDriver()
			.findElement(By.xpath("//div[text()='New order has been successfully added.']"));
		assertTrue(orderSuccessAlert.isDisplayed());
		Thread.sleep(5000);

	}

}
