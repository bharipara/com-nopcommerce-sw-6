package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class ComputerMenuSteps {
    @When("^I click on computer tab$")
    public void iClickOnComputerTab() {
        new HomePage().clickOnComputerTab();
    }

    @And("^I can click on desktop$")
    public void iCanClickOnDesktop() {
        new ComputerPage().clickOnDesktop();
    }

    @And("^I can Select Sort By position \"([^\"]*)\"$")
    public void iCanSelectSortByPosition(String arg0) {
        new DesktopPage().sortByPositionByNameZtoA();

    }

    @Then("^I can Verify the Product will arrange in Descending order$")
    public void iCanVerifyTheProductWillArrangeInDescendingOrder() {

    }

    @And("^I can click on add to cart$")
    public void iCanClickOnAddToCart() throws InterruptedException {
        Thread.sleep(2000);
        new DesktopPage().clickOnAddToCart();
    }

    @Then("^User can Verify the Text \"([^\"]*)\"$")
    public void userCanVerifyTheText(String arg0) {
        String expectedMessage = "Build your own computer";
        String actualMessage = new AddToCartPage().verifyBuildYourOwnComputerText();
        Assert.assertEquals(expectedMessage, actualMessage, "Msg not displayed");
        new AddToCartPage().verifyBuildYourOwnComputerText();

    }

    @And("^I can Select Processor \"([^\"]*)\" using Select class$")
    public void iCanSelectProcessorUsingSelectClass(String arg0) {
        new AddToCartPage().selectProcessor();
    }

    @And("^I can Select \"([^\"]*)\" using Select class$")
    public void iCanSelectUsingSelectClass(String arg0) {
        new AddToCartPage().selectRam();


    }

    @And("^I can Select HDD radio \"([^\"]*)\"$")
    public void iCanSelectHDDRadio(String arg0) {
        new AddToCartPage().selectHDD();

    }

    @And("^I can Select OS radio \"([^\"]*)\"$")
    public void iCanSelectOSRadio(String arg0) {
        new AddToCartPage().selectOS();

    }

    @And("^I can Check Two Check boxes \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iCanCheckTwoCheckBoxesAnd(String arg0, String arg1) {
        new AddToCartPage().selectSoftware();
    }

    @And("^I can Verify the price \"([^\"]*)\"$")
    public void iCanVerifyThePrice(String arg0) {
        new AddToCartPage().verifyThePrice();
    }

    @And("^I can Click on \"([^\"]*)\" Button$")
    public void iCanClickOnButton(String arg0) {
        new AddToCartPage().clickOnAddToCart();
    }

    @Then("^I can Verify the Message \"([^\"]*)\" on Top green Bar$")
    public void iCanVerifyTheMessageOnTopGreenBar(String arg0) {
        String expectedMessage = "The product has been added to your shopping cart";
        String actualMessage = new AddToCartPage().verifyAddToCartSuccessfully();
        Assert.assertEquals(expectedMessage, actualMessage, "Msg not displayed");
        new AddToCartPage().verifyAddToCartSuccessfully();
    }

    @And("^I click on Cross$")
    public void iClickOnCross() {
        new AddToCartPage().clickOnCrossButton();
    }


    @And("^I can MouseHover on \"([^\"]*)\" and Click on \"([^\"]*)\" button$")
    public void iCanMouseHoverOnAndClickOnButton(String arg0, String arg1) throws InterruptedException {
        Thread.sleep(2000);
        new AddToCartPage().mouceHoverToShopingCart();
        new AddToCartPage().clickOnGoToCart();

    }

    @Then("^Verify the message \"([^\"]*)\"$")
    public void verifyTheMessage(String arg0) {
        String expectedMessage = "Shopping cart";
        String actualMessage = new ShoppingCartPage().verifyShoppingCartText();
        Assert.assertEquals(expectedMessage, actualMessage, "Msg not displayed");
        new ShoppingCartPage().verifyShoppingCartText();
    }

    @And("^I can Change the Qty to \"([^\"]*)\" and Click on \"([^\"]*)\"$")
    public void iCanChangeTheQtyToAndClickOn(String arg0, String arg1) throws InterruptedException {
        Thread.sleep(2000);
        new ShoppingCartPage().changeTheQuantity();



    }

    @Then("^I Verify the Total\"([^\"]*)\"$")
    public void iVerifyTheTotal(String arg0) {
        String expectedMessage = "$2,950.00";
        String actualMessage = new ShoppingCartPage().verifyTotalPrice();
        Assert.assertEquals(expectedMessage, actualMessage, "Msg not displayed");
        new ShoppingCartPage().verifyTotalPrice();
    }

    @And("^I can click on checkbox “I agree with the terms of service”$")
    public void iCanClickOnCheckboxIAgreeWithTheTermsOfService() {
        new ShoppingCartPage().clickOnCheckBox();
    }

    @And("^I can Click on “CHECKOUT”$")
    public void iCanClickOnCHECKOUT() {
        new ShoppingCartPage().clickOnCheckBox();
    }

    @Then("^I can Verify the Text “Welcome, Please Sign In!”$")
    public void iCanVerifyTheTextWelcomePleaseSignIn() {
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = new CheckOutPage().verifyWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage, "Msg not displayed");
        new CheckOutPage().verifyWelcomeText();

    }

    @And("^I can Click on “CHECKOUT AS GUEST” Tab$")
    public void iCanClickOnCHECKOUTASGUESTTab() {
        new CheckOutPage().clickOnCheckOutAsGuest();
    }

    @And("^I can Fill the all mandatory field$")
    public void iCanFillTheAllMandatoryField() {
        new GuestCheckOutPage().enterDetails();
    }

    @And("^I can Click on “CONTINUE”$")
    public void iCanClickOnCONTINUE() {
        new GuestCheckOutPage().clickOnContinue();
    }

    @And("^I acn Click on Radio Button “Next Day Air\\(\\$(\\d+)\\.(\\d+)\\)”$")
    public void iAcnClickOnRadioButtonNextDayAir$(int arg0, int arg1) {
        new GuestCheckOutPage().clickOnNextDayAir();
    }

    @And("^I can Select Radio Button “Credit Card”$")
    public void iCanSelectRadioButtonCreditCard() {
        new GuestCheckOutPage().clickOnCreditCard();
    }

    @And("^I can Select “Master card” From Select credit card dropdown$")
    public void iCanSelectMasterCardFromSelectCreditCardDropdown() {
        new GuestCheckOutPage().selectMasterCard();
    }

    @And("^I can Fill all the details$")
    public void iCanFillAllTheDetails() {
        new GuestCheckOutPage().enterDetailsOfCard();
    }

    @Then("^I can Verify “Payment Method” is “Credit Card”$")
    public void iCanVerifyPaymentMethodIsCreditCard() {
        String expectedMessage = "Payment Method” is “Credit Card";
        String actualMessage = new GuestCheckOutPage().verifyCreditCardPaymentMethod();
        Assert.assertEquals(expectedMessage, actualMessage, "Msg not displayed");
        new GuestCheckOutPage().verifyCreditCardPaymentMethod();
    }

    @Then("^I can Verify “Shipping Method” is “Next Day Air”$")
    public void iCanVerifyShippingMethodIsNextDayAir() {
        String expectedMessage = "Shipping Method” is “Next Day Air";
        String actualMessage = new GuestCheckOutPage().verifyShippingMethod();
        Assert.assertEquals(expectedMessage, actualMessage, "Msg not displayed");
        new GuestCheckOutPage().verifyShippingMethod();
    }

    @And("^I can Verify Total is “\\$(\\d+),(\\d+)\\.(\\d+)”$")
    public void iCanVerifyTotalIs$(int arg0, int arg1, int arg2) {
        new GuestCheckOutPage().verifyTotalPrice();
    }

    @And("^I can Click on “CONFIRM”$")
    public void iCanClickOnCONFIRM() {
        new GuestCheckOutPage().clickOnConfirm();
    }

    @Then("^I can Verify the Text “Thank You”$")
    public void iCanVerifyTheTextThankYou() {
        String expectedMessage = "Thank You";
        String actualMessage = new GuestCheckOutPage().verifyThankYouMessage();
        Assert.assertEquals(expectedMessage, actualMessage, "Msg not displayed");
        new GuestCheckOutPage().verifyThankYouMessage();
    }

    @Then("^I can Verify the message “Your order has been successfully processed!”$")
    public void iCanVerifyTheMessageYourOrderHasBeenSuccessfullyProcessed() {
        String expectedMessage = "Your order has been successfully processed!";
        String actualMessage = new GuestCheckOutPage().verifyOrderPlacedSuccessfullyText();
        Assert.assertEquals(expectedMessage, actualMessage, "Msg not displayed");
        new GuestCheckOutPage().verifyOrderPlacedSuccessfullyText();
    }

    @Then("^I can Verify the text “Welcome to our store”$")
    public void iCanVerifyTheTextWelcomeToOurStore() {
        String expectedMessage = "Welcome to our store";
        String actualMessage = new CheckOutPage().verifyWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage, "Msg not displayed");
        new CheckOutPage().verifyWelcomeText();
    }


    @When("^I can click on computer tab$")
    public void iCanClickOnComputerTab() {
    }


}
