Feature: Electronics
#@sanity @regerssion
Scenario: User should verifyUserShould Navigate To CellPhonesPage Successfully

Given I am on homepage
  When I can MouseHover on “Electronics” Tab
  And I can Mouse Hover on “Cell phones” and click
  Then I can Verify the text “Cell phones”

@smoke @regression
Scenario: User should verify That TheProduct Added Successfully And Place Order Successfully
  Given I am on homepage
  When  I can MouseHover on “Electronics” Tab
  And I can Mouse Hover on “Cell phones” and click
  Then I can Verify the text “Cell phones”
  And I can Click on List View Tab
  And Click on product name “Nokia Lumia 1020” link
  Then I can Verify the text “Nokia Lumia 1020”
  Then I can Verify the price “$349.00”
  And I can Change quantity to 2
  And I can Click on “ADD TO CART” tab
  Then I can Verify the Message "The product has been added to your shopping cart" on Top green Bar
  Then I can MouseHover on "Shopping cart" and Click on "GO TO CART" button
  Then I can Verify the message "Shopping cart"
  Then I can Verify the quantity is 2
  Then I can Verify the Total $698.00
  And I can click on checkbox “I agree with the terms of service”
  And I can Click on “CHECKOUT”
  Then I can Verify the Text “Welcome, Please Sign In!”
  And I can Click on “Login” tab
  And I can Fill the mandatory fields
  And I can Click on “Continue” Button
  And I can Click on Radio Button “2nd Day Air ($0.00)”
  And I can Click on “CONTINUE”
  And I can Select Radio Button “Credit Card”
  And I can Select “Visa” From Select credit card dropdown
  And I can Fill all the details
  And I can Click on “CONTINUE”
  Then I can Verify “Payment Method” is “Credit Card”
  Then I can Verify “Shipping Method” is “2nd Day Air”
  Then I can Verify Total is “$698.00”
  And I can p[Click on “CONFIRM”
  Then I can Verify the Text “Thank You”
  Then  I can Verify the message “Your order has been successfully processed!”
  And I can Click on “CONTINUE”
  Then I can Verify the text “Welcome to our store”
  And I can Click on “Logout” link
  Then I can Verify the URL is “https://demo.nopcommerce.com/”

