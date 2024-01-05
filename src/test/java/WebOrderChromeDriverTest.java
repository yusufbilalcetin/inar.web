import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.HomePage;
import pages.OrderPage;
import pages.WeborderHomePage;
import pages.WeborderLoginPage;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WebOrderChromeDriverTest {
    WebDriver driver;

    @BeforeEach
    void setUpTestEnvironment() {
        driver = new ChromeDriver(new ChromeOptions().addArguments("--start-maximized"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    void testSeleniumWebDriver() throws InterruptedException {
        driver.get("https://InarAcademy:Fk160621.@test.inar-academy.com");

        HomePage HomePage = new HomePage(driver);

        WeborderLoginPage weborderLoginPage = HomePage.clickOnWebOrder();
        WeborderHomePage weborderHomePage = weborderLoginPage.login("Inar", "Academy");
        OrderPage orderPage = weborderHomePage.navigateToOrder();

        orderPage.calculatePrice("Books", "10", "10");
        orderPage.enterCustomerInfo("Inar Academy", "Main", "New York", "NW", "1004");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,1000)");
        Thread.sleep(2000);

        orderPage.enterPaymentInfo("amex", "342738261027163", "11/20");


        WebElement orderSuccessAlert = driver.findElement(By.xpath("//div[text()='New order has been successfully added.']"));
        assertTrue(orderSuccessAlert.isDisplayed());
        Thread.sleep(5000);

    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
