package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public CheckOutPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement getWelcomeText;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Checkout as Guest')]")
    WebElement checkOutAsGuest;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement loginLink;


    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordLink;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;

    @CacheLookup
    @FindBy(id = "termsofservice")
    WebElement checkOutBox;

    @CacheLookup
    @FindBy(id = "checkout")
    WebElement checkOutButton;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_City")
    WebElement cityName;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement address;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement postCode;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumber;
    @CacheLookup
    @FindBy(name = "save")
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement countrySelection;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_StateProvinceId")
    WebElement stateSelection;
    @CacheLookup
    @FindBy(id = "shippingoption_2")
    WebElement radioButton;
    @CacheLookup
    @FindBy(xpath = "//div[@id='shipping-method-buttons-container']/button")
    WebElement continueButton1;
    @CacheLookup
    @FindBy(id = "paymentmethod_1")
    WebElement creditCard;
    @CacheLookup
    @FindBy(id = "CreditCardType")
    WebElement cardType;

    @CacheLookup
    @FindBy(id = "CardholderName")
    WebElement cardHolderName;
    @CacheLookup
    @FindBy(id = "CardNumber")
    WebElement cardNumber;
    @CacheLookup
    @FindBy(id = "ExpireMonth")
    WebElement month;
    @CacheLookup
    @FindBy(id = "ExpireYear")
    WebElement year;
    @CacheLookup
    @FindBy(id = "CardCode")
    WebElement cvvCode;
    @CacheLookup
    @FindBy(xpath = "//div[@id='payment-info-buttons-container']/button")
    WebElement continueButton2;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]")
    WebElement continueButton3;
    @CacheLookup
    @FindBy(xpath = "//div[@class='payment-method-info']/ul/li")
    WebElement paymentMethod;
    @CacheLookup
    @FindBy(xpath = "//div[@class='shipping-method-info']/ul/li")
    WebElement shippingMethod;
    @CacheLookup
    @FindBy(xpath = "//tr[@class ='order-total']/td[2]/span//strong[text()='$698.00']")
    WebElement totalPrice;
    @CacheLookup
    @FindBy(xpath = "//div[@id='confirm-order-buttons-container']//button")
    WebElement confirmButton;
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Thank you']")
    WebElement getThankYouText;
    @CacheLookup
    @FindBy(xpath = "//strong[text()='Your order has been successfully processed!']")
    WebElement getOrderPlacedText;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 order-completed-continue-button']")
    WebElement continueButton4;
    @CacheLookup
    @FindBy(xpath = "//h2[text()='Welcome to our store']")
    WebElement getWelcomeToOurStore;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logoutLink;
    @CacheLookup
    @FindBy(xpath = "//button[@onclick='Billing.save()']")
    WebElement continue5;

    public String verifyWelcomeText() {

        log.info("Get text Welcome" + getWelcomeText.toString());
        return getTextFromElement(getWelcomeText);
    }

    public void clickOnCheckOutAsGuest() {
        log.info("Click on checkout automation" + checkOutAsGuest.toString());
        clickOnElement(checkOutAsGuest);
    }

    public void enterLogindetailsAndClickOnLoginButton() {
        log.info("Enter login details" + loginLink.toString());
        sendTextToElement(loginLink, "Jharris123@gmail.com");
        log.info("Enter password details" + passwordLink.toString());
        sendTextToElement(passwordLink, "abc123");
        log.info("Click on Login button" + loginButton.toString());
        clickOnElement(loginButton);

    }

    public void clickOnCheckOutBox() {
        log.info("Click on Check Out Box" + checkOutBox.toString());
        clickOnElement(checkOutBox);

    }

    public void clickOnCheckOutButton() {
        log.info("Click on Check Out Button" + checkOutButton.toString());
        clickOnElement(checkOutButton);

    }

    public void enterMandatoryDetails() {
        log.info("Select Country" + countrySelection.toString());
        selectByVisibleTextFromDropDown(countrySelection, "United States");

        log.info("Select State" + stateSelection.toString());
        selectByVisibleTextFromDropDown(stateSelection, "AA (Armed Forces Americas)");

        log.info("Select City" + cityName.toString());
        sendTextToElement(cityName, "WashingtonDC");

        log.info("Enter Address" + address.toString());
        sendTextToElement(address, "121,Boho Road");

        log.info("Enter Post Code" + postCode.toString());
        sendTextToElement(postCode, "A123TQ");

        log.info("Enter Phone Number" + phoneNumber.toString());
        sendTextToElement(phoneNumber, "1234567890");

        clickOnElement(continue5);

    }

    public void clickOnContinue() {
        log.info("Click on Continue Button" + continueButton.toString());
        clickOnElement(continueButton);

    }

    public void clickOnradioButton() {
        log.info("Click on Radio Button" + radioButton.toString());
        clickOnElement(radioButton);

    }

    public void clickOnContinueButton() {
        log.info("Click on Continue Button" + continueButton1.toString());
        clickOnElement(continueButton1);

    }

    public void clickOnCreditCard() {
        log.info("Click on Credit card option" + creditCard.toString());
        clickOnElement(creditCard);

    }

    public void selectCardType() {
        log.info("Select Card Type" + cardType.toString());
        selectByVisibleTextFromDropDown(cardType, "Visa");

    }

    public void enterCardDetails() {
        log.info("Select Card Holder name" + cardHolderName.toString());
        sendTextToElement(cardHolderName, "Jess Harris");

        log.info("Enter Card number" + cardNumber.toString());
        sendTextToElement(cardNumber, "5555 5545 5565 4444");

        log.info("Enter month" + month.toString());
        selectByVisibleTextFromDropDown(month, "04");

        log.info("Select year" + year.toString());
        selectByVisibleTextFromDropDown(year, "2025");

        log.info("Enter CVV" + cvvCode.toString());
        sendTextToElement(cvvCode, "123");

    }

    public void clickOnContinueButton2() {
        log.info("Click on Continue Button" + continueButton2.toString());
        clickOnElement(continueButton2);

    }

    public void clickOnContinueButton3() {
        log.info("Click on Continue Button" + continueButton3.toString());
        clickOnElement(continueButton3);

    }

    public String verifyPaymentMethod() {
        log.info("Get Text Payment Method" + paymentMethod.toString());
        return getTextFromElement(paymentMethod);
    }

    public String verifyShippingMethod() {
        log.info("Get Text Shipping Method" + shippingMethod.toString());
        return getTextFromElement(shippingMethod);
    }

    public String verifyTotalPrice() {
        log.info("Get Text Total Price" + totalPrice.toString());
        return getTextFromElement(totalPrice);
    }

    public void clickOnConfirm() {
        log.info("Click on Confirm button" + confirmButton.toString());
        clickOnElement(confirmButton);

    }

    public String verifyThankYouMessage() {
        log.info("Get Text Thank You" + getThankYouText.toString());
        return getTextFromElement(getThankYouText);
    }

    public String verifyOrderPlacedMessageText() {
        log.info("Get Text Order Placed" + getOrderPlacedText.toString());
        return getTextFromElement(getOrderPlacedText);
    }

    public void clickOnContinueButton4() {
        log.info("Click on continue button" + continueButton4.toString());
        clickOnElement(continueButton4);



  }
}