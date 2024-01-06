package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class OrderPage extends BasePage {

	// Product information
	@FindBy(id = "productSelect")
	private WebElement ProductDropdownElement;

	@FindBy(id = "quantityInput")
	private WebElement quantityInputField;

	@FindBy(id = "unitPriceInput")
	private WebElement unitPriceField;

	@FindBy(id = "discountInput")
	private WebElement discountInputField;

	@FindBy(id = "totalInput")
	private WebElement totalPriceField;

	@FindBy(xpath = "//button[text()='Calculate']")
	private WebElement calculateButton;

	// Customer information
	@FindBy(id = "name")
	private WebElement nameInputField;

	@FindBy(id = "street")
	private WebElement streetInputField;

	@FindBy(id = "city")
	private WebElement cityInputField;

	@FindBy(id = "state")
	private WebElement stateInputField;

	@FindBy(id = "zip")
	private WebElement zipCodeInputField;

	// Payment information
	@FindBy(id = "visa")
	private WebElement visaCheckBox;

	@FindBy(id = "mastercard")
	private WebElement masterCardCheckBox;

	@FindBy(id = "amex")
	private WebElement americanExpressCheckBox;

	@FindBy(id = "cardNumber")
	private WebElement cardNumberInputField;

	@FindBy(id = "expiryDate")
	private WebElement expiryDateInputField;

	@FindBy(xpath = "//button[text()='Process']")
	private WebElement progressButton;

	public OrderPage() {
		super();
	}

	// Product information
	public void selectProduct(String selectProduct) {
		Select productDropdown = new Select(ProductDropdownElement);
		productDropdown.selectByVisibleText(selectProduct);
	}

	public void enterQuantity(String quantity) {
		quantityInputField.clear();
		quantityInputField.sendKeys(quantity);
	}

	public void enterDiscount(String discount) {
		discountInputField.clear();
		discountInputField.sendKeys(discount);
	}

	public void clickOnCalculateButton() {
		calculateButton.click();
	}

	public String calculatePrice(String productName, String quantity, String discount) {
		selectProduct(productName);
		enterQuantity(quantity);
		enterDiscount(discount);
		clickOnCalculateButton();
		return totalPriceField.getAttribute("value");
	}

	public void enterProduct(String productName, String quatity, String discount) {
		selectProduct(productName);
		enterQuantity(quatity);
		enterDiscount(discount);
		clickOnCalculateButton();
	}

	// Customer information

	public void enterCustomerInfo(String name, String street, String city, String state, String zip) {
		enterName(name);
		enterStreet(street);
		enterCity(city);
		enterState(state);
		enterZipCode(zip);
	}

	public void enterName(String name) {
		nameInputField.clear();
		nameInputField.sendKeys(name);
	}

	public void enterStreet(String street) {
		streetInputField.clear();
		streetInputField.sendKeys(street);
	}

	public void enterCity(String city) {
		cityInputField.clear();
		cityInputField.sendKeys(city);
	}

	public void enterState(String state) {
		stateInputField.clear();
		stateInputField.sendKeys(state);
	}

	public void enterZipCode(String zipCode) {
		zipCodeInputField.clear();
		zipCodeInputField.sendKeys(zipCode);
	}

	public void selectPaymentMethod(String paymentMethod) {
		switch (paymentMethod.toLowerCase()) {
			case "visa" -> clickCheckBox(visaCheckBox);
			case "mastercard" -> clickCheckBox(masterCardCheckBox);
			case "amex" -> clickCheckBox(americanExpressCheckBox);
			default -> System.out.println("Payment method doesn't exist");
		}
	}

	public void clickProgress() {
		progressButton.click();
	}

	private void clickCheckBox(WebElement checkBox) {
		if (!checkBox.isSelected()) {
			checkBox.click();
		}
	}

	public void enterCardNumber(String cardNumber) {
		cardNumberInputField.clear();
		cardNumberInputField.sendKeys(cardNumber);
	}

	public void enterExpiryDate(String expiryDate) {
		expiryDateInputField.clear();
		expiryDateInputField.sendKeys(expiryDate);
	}

	public void enterPaymentInformation(String paymentMethod, String carNumber, String expiryDate) {
		selectPaymentMethod(paymentMethod);
		enterCardNumber(carNumber);
		enterExpiryDate(expiryDate);
	}

}