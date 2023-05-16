package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class ElectronicsSteps {
    @When("^I can MouseHover on “Electronics” Tab$")
    public void iCanMouseHoverOnElectronicsTab() {
        new HomePage().setMouseHoverToElectronic();
    }

    @And("^I can Mouse Hover on “Cell phones” and click$")
    public void iCanMouseHoverOnCellPhonesAndClick() {
        new HomePage().setGetMouseHoverToElectronicAndClickOnCellPhone();
    }

    @Then("^I can Verify the text “Cell phones”$")
    public void iCanVerifyTheTextCellPhones() {
        String expectedMessage = "Cell phones";
        String actualMessage = new CellPhonesPage().verifyTextCellPhone();
        Assert.assertEquals(expectedMessage, actualMessage, "Msg not displayed");
        new CellPhonesPage().verifyTextCellPhone();
    }

    @And("^I can Click on List View Tab$")
    public void iCanClickOnListViewTab() {
        new CellPhonesPage().clickOnListView();
    }

    @And("^Click on product name “Nokia Lumia (\\d+)” link$")
    public void clickOnProductNameNokiaLumiaLink(int arg0) throws InterruptedException {
        Thread.sleep(2000);
        new CellPhonesPage().clickOnNokiaLumia1020();
    }

    @Then("^I can Verify the text “Nokia Lumia (\\d+)”$")
    public void iCanVerifyTheTextNokiaLumia(int arg0) {
        String expectedMessage = "Nokia Lumia 1020";
        String actualMessage = new CellPhonesPage().verifyTextNokiaLumia1020();
        Assert.assertEquals(expectedMessage, actualMessage, "Msg not displayed");

    }

    @Then("^I can Verify the price “\\$(\\d+)\\.(\\d+)”$")
    public void iCanVerifyThePrice$(int arg0, int arg1) {
        String expectedMessage = "$349.00";
        String actualMessage = new CellPhonesPage().verifyPrice();
        Assert.assertEquals(expectedMessage, actualMessage, "Price not displayed");

    }

    @And("^I can Change quantity to (\\d+)$")
    public void iCanChangeQuantityTo(int arg0) {
        new CellPhonesPage().changeThatQty();
    }

    @And("^I can Click on “ADD TO CART” tab$")
    public void iCanClickOnADDTOCARTTab() {
        new CellPhonesPage().clickOnAddToCart();
    }

    @Then("^I can Verify the message \"([^\"]*)\"$")
    public void iCanVerifyTheMessage(String arg0)  {
        String expectedMessage = "The product has been added to your shopping cart";
        String actualMessage = new CellPhonesPage().verifyAddToCartSuccessfully();
        Assert.assertEquals(expectedMessage, actualMessage, "Msg not displayed");


    }

    @Then("^I can Verify the quantity is (\\d+)$")
    public void iCanVerifyTheQuantityIs(int arg0) {
        new ShoppingCartPage().verifyQty();
    }

    @Then("^I can Verify the Total \\$(\\d+)\\.(\\d+)$")
    public void iCanVerifyTheTotal$(int arg0, int arg1) {
        new ShoppingCartPage().verifyTotalPrice();
    }

    @And("^I can Click on “Login” tab$")
    public void iCanClickOnLoginTab() {
        new CheckOutPage().enterLogindetailsAndClickOnLoginButton();
    }

    @And("^I can Fill the mandatory fields$")
    public void iCanFillTheMandatoryFields() {
        new CheckOutPage().enterMandatoryDetails();
    }

    @And("^I can Click on “Continue” Button$")
    public void iCanClickOnContinueButton() {
        new CheckOutPage().clickOnContinue();
    }

    @And("^I can Click on Radio Button “(\\d+)nd Day Air \\(\\$(\\d+)\\.(\\d+)\\)”$")
    public void iCanClickOnRadioButtonNdDayAir$(int arg0, int arg1, int arg2) {
        new CheckOutPage().clickOnradioButton();
    }

    @And("^I can Select “Visa” From Select credit card dropdown$")
    public void iCanSelectVisaFromSelectCreditCardDropdown() {
        new CheckOutPage().selectCardType();
    }

    @Then("^I can Verify “Shipping Method” is “(\\d+)nd Day Air”$")
    public void iCanVerifyShippingMethodIsNdDayAir(int arg0) {
        String expectedMessage = "Shipping Method” is “2nd Day Air";
        String actualMessage = new CheckOutPage().verifyShippingMethod();
        Assert.assertEquals(expectedMessage, actualMessage, "Msg not displayed");
     

    }

    @Then("^I can Verify Total is “\\$(\\d+)\\.(\\d+)”$")
    public void iCanVerifyTotalIs$(int arg0, int arg1) {
        String expectedMessage = "$698.00";
        String actualMessage = new CheckOutPage().verifyTotalPrice();
        Assert.assertEquals(expectedMessage, actualMessage, "Msg not displayed");
        new CheckOutPage().verifyTotalPrice();

    }

    @And("^I can p\\[Click on “CONFIRM”$")
    public void iCanPClickOnCONFIRM() {
        new CheckOutPage().clickOnConfirm();
    }

    @And("^I can Click on “Logout” link$")
    public void iCanClickOnLogoutLink() {


    }

    @Then("^I can Verify the URL is “https://demo\\.nopcommerce\\.com/”$")
    public void iCanVerifyTheURLIsHttpsDemoNopcommerceCom() {
        String expectedMessage = "https://demo.nopcommerce.com/";
        String actualMessage = new AddToCartPage().verifyBuildYourOwnComputerText();
        Assert.assertEquals(expectedMessage, actualMessage, "Msg not displayed");

    }
}
