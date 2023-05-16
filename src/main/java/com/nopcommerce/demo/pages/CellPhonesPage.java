package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellPhonesPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public CellPhonesPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Cell phones')]")
    WebElement getTextCellPhone;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement listView;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Nokia Lumia 1020')]")
    WebElement nokiaLumia1020;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Nokia Lumia 1020')]")
    WebElement getTextNokia;

    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-20']")
    WebElement getPrice;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_enteredQuantity_20']")
    WebElement changeQty;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-20']")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//p[text()='The product has been added to your ']")
    WebElement addToCartSuccessfully;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]")
    WebElement crossButton;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement shoppingCart;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement goToCart;


    public String verifyTextCellPhone() {

        log.info("Get Text Cell Phone" + getTextCellPhone.toString());
        return getTextFromElement(getTextCellPhone);
    }

    public void clickOnListView() {

        clickOnElement(listView);
        log.info("Click on List View" + listView.toString());
    }

    public void clickOnNokiaLumia1020() {

        clickOnElement(nokiaLumia1020);
        log.info("Click on NokiaLumia1020" + nokiaLumia1020.toString());
    }

    public String verifyTextNokiaLumia1020() {

        log.info("Verify text Nokia" + getTextNokia.toString());
        return getTextFromElement(getTextNokia);
    }

    public String verifyPrice() {

        log.info("Get Price Text" + getPrice.toString());
        return getTextFromElement(getPrice);
    }

    public void changeThatQty() {
        log.info("Change Qty" + changeQty.toString());
        clickOnElement(changeQty);
        changeQty.clear();
        sendTextToElement(changeQty, "2");

    }

    public void clickOnAddToCart() {
        log.info("Click on Add to Cart" + addToCart.toString());
        clickOnElement(addToCart);

    }

    public String verifyAddToCartSuccessfully() {
        log.info("Get text Add to Cart Successfully" + addToCartSuccessfully.toString());
        return getTextFromElement(addToCartSuccessfully);
    }

    public void clickOnCrossButton() {
        log.info("Click on Cross Button" + crossButton.toString());
        clickOnElement(crossButton);

    }

    public void mouseHoverToShoppingCart() {
        log.info("Mouse hover to Shopping cart" + goToCart.toString());
        mouseHoverToElement(shoppingCart);
        clickOnElement(goToCart);

    }

}
