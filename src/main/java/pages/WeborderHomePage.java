package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WeborderHomePage extends BasePage {

	@FindBy(linkText = "view all orders")
	private WebElement viewAllOrdersLink;

	@FindBy(linkText = "view all products")
	private WebElement viewAllProductsLink;

	@FindBy(linkText = "Order")
	private WebElement orderLink;

	public WeborderHomePage() {
		super();
	}

	public void navigateToViewAllOrders() {
		viewAllOrdersLink.click();
	}

	public void navigateToOrder() {
		orderLink.click();
	}

	public void navigateToViewAllProducts() {
		viewAllProductsLink.click();
	}

}
