Feature: ComputerMenu
#@sanity @regression
  Scenario: User should verify Product ArrangeInAlphaBaticalOrder
    Given I am on homepage
    When I can click on computer tab
    And I can click on desktop
    And I can Select Sort By position "Name: Z to A"
    Then I can Verify the Product will arrange in Descending order
#
#@smoke @regression
  Scenario: User should verify Product Added To ShoppingCartSuccessFully
    Given I am on homepage
    When I click on computer tab
    And I can click on desktop
    And I can Select Sort By position "Name: A to Z"
    And I can click on add to cart
    Then User can Verify the Text "Build your own computer"
    And I can Select Processor "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
    And I can Select "8GB [+$60.00]" using Select class
    And I can Select HDD radio "400 GB [+$100.00]"
    And I can Select OS radio "Vista Premium [+$60.00]"
    And I can Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
    And I can Verify the price "$1,475.00"
    And I can Click on "ADD TO CARD" Button
    Then I can Verify the Message "The product has been added to your shopping cart" on Top green Bar
    And I click on Cross
    And I can MouseHover on "Shopping cart" and Click on "GO TO CART" button
    Then Verify the message "Shopping cart"
    And I can Change the Qty to "2" and Click on "Update shopping cart"
    Then I Verify the Total"$2,950.00"
    And I can click on checkbox “I agree with the terms of service”
    And I can Click on “CHECKOUT”
    Then I can Verify the Text “Welcome, Please Sign In!”
    And I can Click on “CHECKOUT AS GUEST” Tab
    And I can Fill the all mandatory field
    And I can Click on “CONTINUE”
    And I acn Click on Radio Button “Next Day Air($0.00)”
    And I can Click on “CONTINUE”
    And I can Select Radio Button “Credit Card”
    And I can Select “Master card” From Select credit card dropdown
    And I can Fill all the details
    And I can Click on “CONTINUE”
    Then I can Verify “Payment Method” is “Credit Card”
    Then I can Verify “Shipping Method” is “Next Day Air”
    And I can Verify Total is “$2,950.00”
    And I can Click on “CONFIRM”
    Then I can Verify the Text “Thank You”
    Then I can Verify the message “Your order has been successfully processed!”
    And I can Click on “CONTINUE”
    Then I can Verify the text “Welcome to our store”







