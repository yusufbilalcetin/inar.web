package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    //Locators
    private By WebOrderLink = new By.ByLinkText("Weborder");

    private By WebAutomationLink = new By.ByLinkText("Webautomation");

    private By TargetMarketLink = new By.ByLinkText("Target Market");

    private By BookingLink = new By.ByLinkText("Booking");

    private By HandlingCertificationLink = new By.ByLinkText("Handling Certifications");

    private By FileUploadingLink = new By.ByLinkText("File Uploading");

    private By exploreInarTestingWorldTitleText = By.cssSelector("h1.display-1.text-fifth");


    //Constructor

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //Page Actions with java Mehthods
    public WeborderLoginPage clickOnWebOrder(){
        driver.findElement(WebOrderLink).click();
        return new WeborderLoginPage(driver);
    }

    public void clickWebAutomationLink(){
        driver.findElement(WebAutomationLink).click();
    }

    public void clickTargetMarketLink(){
        driver.findElement(TargetMarketLink).click();
    }

    public void clickBookingLink(){
        driver.findElement(BookingLink).click();
    }
    public void clickHandlingCertificationLink(){
        driver.findElement(HandlingCertificationLink).click();
    }

    public void clickFileUploadingLink(){
        driver.findElement(exploreInarTestingWorldTitleText).click();
    }

    public String getWelcomeText(){
        return driver.findElement(exploreInarTestingWorldTitleText).getText();
    }
    public void refreshPage(){
        driver.navigate().refresh();
    }

}
