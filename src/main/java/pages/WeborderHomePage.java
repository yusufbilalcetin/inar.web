package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WeborderHomePage {

    private WebDriver driver;

    private By viewAllOrdersLink = By.id("view-orders-tab");

    private By viewAllProductsLink = By.id("view-products-tab");

    private By orderLink = By.id("order-tab");


    public WeborderHomePage(WebDriver driver){
        this.driver = driver;
    }

    public viewAllOrdersPage navigateToViewAllOrders() {
        driver.findElement(viewAllOrdersLink).click();
        return new viewAllOrdersPage(driver);
    }
    public viewAllProductsPage navigateToViewAllProducts() {
        driver.findElement(viewAllProductsLink).click();
        return new viewAllProductsPage(driver);
    }
    public OrderPage navigateToOrder() {
        driver.findElement(orderLink).click();
        return new OrderPage(driver);
    }

}

