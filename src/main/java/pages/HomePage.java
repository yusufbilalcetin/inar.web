package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	@FindBy(linkText = "Weborder")
	private WebElement WebOrderLink;

	@FindBy(linkText = "Webautomation")
	private WebElement WebAutomationLink;

	@FindBy(linkText = "Target Market")
	private WebElement TargetMarketLink;

	@FindBy(linkText = "Booking")
	private WebElement BookingLink;

	@FindBy(linkText = "Handling Certifications")
	private WebElement HandlingCertificationLink;

	@FindBy(linkText = "File Uploading")
	private WebElement FileUploadingLink;

	@FindBy(css = "h1.display-1.text-fifth")
	private WebElement exploreInarTestingWorldTitleText;

	// Constructor

	public HomePage() {
		super();
	}

	// Page Actions with java Mehthods
	public void clickOnWebOrder() {
		WebOrderLink.click();
	}

	public void clickWebAutomationLink() {
		WebAutomationLink.click();
	}

	public void clickTargetMarketLink() {
		TargetMarketLink.click();
	}

	public void clickBookingLink() {
		BookingLink.click();
	}

	public void clickHandlingCertificationLink() {
		HandlingCertificationLink.click();
	}

	public void clickFileUploadingLink() {
		exploreInarTestingWorldTitleText.click();
	}

	public String getWelcomeText() {
		return exploreInarTestingWorldTitleText.getText();
	}

	public void refreshPage() {
		driver.navigate().refresh();
	}

}
