package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GuestCheckOutPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public GuestCheckOutPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_FirstName']")
    WebElement firstNameField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_LastName']")
    WebElement lastNameField;
    @CacheLookup
    @FindBy(name = "BillingNewAddress.Email")
    WebElement emailField;
    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']" )
    WebElement countryField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_City']")
    WebElement cityField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_Address1']")
    WebElement addressField;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement postCodeField;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumberField;
    @CacheLookup
    @FindBy(xpath = "(//button[text()='Continue'])[1]")
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='shippingoption_1']")
    WebElement nextDayAirButton;
    @CacheLookup
    @FindBy(xpath = "//button[@onclick='ShippingMethod.save()']")
    WebElement continueButton1;
    @CacheLookup
    @FindBy(xpath = "//input[@id='paymentmethod_1']")
    WebElement creditCard;
    @CacheLookup
    @FindBy(xpath = "(//button[text()='Continue'])[4]")
    WebElement continueButton2;
    @CacheLookup
    @FindBy(id = "CreditCardType")
    WebElement masterCard;
    @CacheLookup
    @FindBy(name = "CardholderName")
    WebElement cardholderName;
    @CacheLookup
    @FindBy(id = "CardNumber")
    WebElement cardNumber;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireMonth']")
    WebElement month;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireYear']")
    WebElement year;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardCode']")
    WebElement cardCode;
    @CacheLookup
    @FindBy(xpath = "(//button[text()='Continue'])[5]")
    WebElement getContinueButton3;
    @CacheLookup
    @FindBy(xpath = "//li[@class='payment-method']")
    WebElement getTextCreditCard;
    @CacheLookup
    @FindBy(xpath = "//li[@class='shipping-method']")
    WebElement getTextOfShippingethod;
    @CacheLookup
    @FindBy(xpath = "(//strong[text()='$2,950.00'])[2]")
    WebElement getTotalPrice;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Confirm')]")
    WebElement confirmButton;
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Thank you']")
    WebElement getThankYouText;
    @CacheLookup
    @FindBy(xpath = "//strong[text()='Your order has been successfully processed!']")
    WebElement getOrderProcessedText;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 order-completed-continue-button']")
    WebElement continueButton4;

    public void enterDetails() {

        log.info("enter first name" + firstNameField.toString());
        sendTextToElement(firstNameField, "Joy");

        log.info("enter last name" + lastNameField.toString());
        sendTextToElement(lastNameField, "Word");

        log.info("enter email" + emailField.toString());
        sendTextToElement(emailField, "Jword123@gmail.com");

        log.info("enter country" + countryField.toString());
        selectByValueFromDropDown(countryField, "133");

        log.info("enter city" + cityField.toString());
        sendTextToElement(cityField, "Watford");

        log.info("enter address" + addressField.toString());
        sendTextToElement(addressField, "1 High Street");

        log.info("enter postcode" + postCodeField.toString());
        sendTextToElement(postCodeField, "wd198LE");

        log.info("enter phone number field" + phoneNumberField.toString());
        sendTextToElement(phoneNumberField, "1234567890");
    }

    public void clickOnContinueButton() {

        log.info("click on continue button" + continueButton.toString());
        clickOnElement(continueButton);
    }

    public void clickOnNextDayAir() {

        log.info("click on next day air" + nextDayAirButton.toString());
        clickOnElement(nextDayAirButton);
    }

    public void clickOnContinue() {

        log.info("click on continue button" + continueButton.toString());
        clickOnElement(continueButton1);
    }

    public void clickOnCreditCard() {

        log.info("click on credit card" + creditCard.toString());
        clickOnElement(creditCard);
    }

    public void clickOnContinues() {

        log.info("click on continues" + continueButton2.toString());
        clickOnElement(continueButton2);
    }

    public void selectMasterCard() {

        log.info("select master card" + masterCard.toString());
        selectByValueFromDropDown(masterCard, "MasterCard");
    }

    public void enterDetailsOfCard() {

        log.info("enter card holder name" + cardholderName.toString());
        sendTextToElement(cardholderName, "Joy Word");

        log.info("enter card number" + cardNumber.toString());
        sendTextToElement(cardNumber, "5555 5545 5565 4444");

        log.info("enter month" + month.toString());
        selectByVisibleTextFromDropDown(month, "01");

        log.info("enter year" + year.toString());
        selectByVisibleTextFromDropDown(year, "2030");

        log.info("enter card code" + cardCode.toString());
        sendTextToElement(cardCode, "111");
    }
    public void clickOnContinueButton3() {

        log.info("click on continue button3" + getContinueButton3.toString());
        clickOnElement(getContinueButton3);
    }

    public String verifyCreditCardPaymentMethod() {

        log.info("verify credit card payment method" + getTextCreditCard.toString());
        return getTextFromElement(getTextCreditCard);
    }

    public String verifyShippingMethod() {

        log.info("verify shipping method" + getTextOfShippingethod.toString());
        return getTextFromElement(getTextOfShippingethod);
    }

    public String verifyTotalPrice() {

        log.info("verify total price" + getTotalPrice.toString());
        return getTextFromElement(getTotalPrice);
    }

    public void clickOnConfirm() {

        log.info("click on confirm" + confirmButton.toString());
        clickOnElement(confirmButton);
    }

    public String verifyThankYouMessage() {

        log.info("verify thank you message" + getThankYouText.toString());
        return getTextFromElement(getThankYouText);
    }

    public String verifyOrderPlacedSuccessfullyText() {


        log.info("verify order placed successfully text" + getOrderProcessedText.toString());
        return getTextFromElement(getOrderProcessedText);
    }

    public void clickOnContinueButton4() {

        log.info("click on continue button4" + continueButton4.toString());
        clickOnElement(continueButton4);
    }


}
