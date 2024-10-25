Feature: Automation Exercise

  Background: 
    Given User Verify that home page is visible successfully

  @test1
  Scenario: SignUp Account Successful
    When User should Click on SignUp or Login button
    Then Verify the New User SignUp! is visible
    When Enter the Name and Email address of User
    And User Click SignUp button
    Then Verify that ENTER ACCOUNT INFORMATION is visible
    When User fill details:Title,Name,Email,Password,Date of birth
    And Select checkbox SignUp for our newsletter!
    And Select checkbox Receive special offers from our partners!
    And Fill details: First name,Last name,Company,Address,Address2,Country,State,City,Zipcode,Mobile Number
    And Click Create Account button
    Then Verify that ACCOUNT CREATED! is visible
    When User Click Continue button
    Then User Verify that Logged in as Username is visible
    When User Click Delete Account button
    Then Verify that ACCOUNT DELETED! is visible and Click Continue button

  @test2
  Scenario: Login User with correct email and password
    When User should Click on Signup or Login button
    Then Verify Login to your account is visible
    When User Enter correct email address and password
    And Click login button
    Then Verify that Logged in as username is visible
    When User Click Delete Account button
    Then Verify that ACCOUNT DELETED! is visible

  @test3
  Scenario: Login User with incorrect email and password
    When User Click on Signup or Login button
    Then User Verify that Login to your account is visible
    When User Enter incorrect email address and password
    Then User Verify error message as Your email or password is incorrect! is visible

  @test4
  Scenario: Logout User Successful
    When User Click Logout button
    Then User Verify that user is navigated to login page

  @test5
  Scenario: Register User with existing email
    When User Enter the name and already registered email address
    And Click Signup button
    Then Verify the error Email Address already exist! is visible

  @test6
  Scenario: Contact Us Form
    When User Click on Contact Us button
    Then Verify GET IN TOUCH is visible
    When User Enter the name, email, subject and message
    And User should Upload the file
    And User should Click Submit button
    And User Click OK button
    Then User Verify the success message Success! Your details have been submitted successfully. is visible
    And User should Click Home button and verify that landed to home page successfully

  @test7
  Scenario: Verify Test Cases Page
    When User Click on Test Cases button
    Then User Verify user is navigated to test cases page successfully

  @test8
  Scenario: Verify All Products and product detail page
    When User Click on Products button
    Then User Verify user is navigated to ALL PRODUCTS page successfully
    And User check The products list is visible
    When User Click on View Product of first product
    And User is landed to product detail page
    Then User Verify that detail is visible: product name, category, price, availability, condition, brand

  @test9
  Scenario: Search Product
    When User Enter product name in search input and click search button
    Then User should Verify SEARCHED PRODUCTS is visible
    And User Verify all the products related to search are visible

  @test10
  Scenario: Verify Subscription in home page
    When User Scroll down to footer
    Then User should Verify text 'SUBSCRIPTION'
    When User Enter the email address in input and click arrow button
    Then Usershould Verify the success message 'You have been successfully subscribed!' is visible

  @test11
  Scenario: Verify Subscription in Cart page
    When User Click Cart button and Verify success message 'You have been successfully subscribed!' is visible

  @test12
  Scenario: Add Products in Cart
    Click 'Products' button

    When User Hover over first product and click Add to cart
    And User should Click Continue Shopping button
    And User Hover over second product and click Add to cart
    And User Click View Cart button
    Then User should Verify both products are added to Cart
    And User should Verify their prices, quantity and total price

  @test13
  Scenario: Verify Product quantity in Cart
    When User Click View Product for any product on home page
    Then User should Verify product detail is opened
    When User Increase quantity to "4"
    And User should Click Add to cart button
    And Click View Cart button
    Then User should Verify that product is displayed in cart page with exact quantity

  @test14
  Scenario: Place Order: Register while Checkout
    When User Add products to cart
    And User should Click Cart button
    Then User should Verify that cart page is displayed
    When User Click Proceed To Checkout
    And User should Click Register or Login button
    And Fill all details in Signup and create account
    Then User should Verify ACCOUNT CREATED! and click Continue button
    And User Verify Logged in as username at top
    When User Click Cart button
    And Click Proceed To Checkout button
    Then User should Verify Address Details and Review Your Order
    When User Enter description in comment text area and click Place Order
    And User Enter payment details: Name on Card, Card Number, CVC, Expiration date
    And User Click Pay and Confirm Order button
    Then User should Verify success message "Your order has been placed successfully!"
    Then User should Verify ACCOUNT DELETED! and click Continue button

  @test15
  Scenario: Place Order: Register before Checkout
    When User Click Signup or Login button
    And Enter payment details: Name on Card, Card Number, CVC, Expiration date
    Then User should Verify success message Your order has been placed successfully!

  @test16
  Scenario: Place Order: Login before Checkout
    When User should Click Signup or Login button
    And User Fill email, password and click Login button

  @test17
  Scenario: Remove Products From Cart
    When User Click X button corresponding to particular product
    Then User should Verify that product is removed from the cart

  @test18
  Scenario: View Category Products
    Then User should Verify that categories are visible on left side bar
    When User Click on Women category
    And User should Click on any category link under Women category, for example: Dress
    Then User should Verify that category page is displayed and confirm text WOMEN - TOPS PRODUCTS
    When User see On left side bar, click on any sub-category link of Men category
    Then User should Verify that user is navigated to that category page

  @test19
  Scenario: View & Cart Brand Products
    When User Click on Productss button
    Then User Verify that Brands are visible on left side bar
    When User Click on any brand name
    Then User should Verify that user is navigated to brand page and brand products are displayed
    When User see On left side bar, click on any other brand link
    Then User should Verify that user is navigated to that brand page and can see products

  @test20
  Scenario: Search Products and Verify Cart After Login
    Then User should Verify user is navigated to ALL PRODUCTS page successfully
    When User Add those products to cart
    And User Again, go to Cart page
    Then User should Verify that those products are visible in cart after login as well

  @test21
  Scenario: Add review on product
    When User Click on View Product button
    Then User should Verify Write Your Review is visible
    When User Enter name, email and review

  @test22
  Scenario: Add to cart from Recommended items
    Then User should Verify RECOMMENDED ITEMS are visible
    When User Click on Add To Cart on Recommended product
    Then User should Verify that product is displayed in cart page

  @test23
  Scenario: Verify address details in checkout page
    When User Fill all details in Signup and create account
      | Firstname    | Madhu                      |
      | Lastname     | Arun                       |
      | Company      | Axess Technology           |
      | Address1     | Street no.4,Periyar Nagar, |
      | Address2     | Velachery, Chennai-100     |
      | City         | Chennai                    |
      | State        | TamilNadu                  |
      | Zipcode      |                     600100 |
      | Country      | India                      |
      | Mobilenumber |                 9587463241 |
    Then User should Verify that the delivery address is same address filled at the time registration of account
    And User should Verify that the billing address is same address filled at the time registration of account

  @test24
  Scenario: Download Invoice after purchase order
    When User Click Register or Login button
    And User should Fill all details in Signup and create account
    And User should Click Proceed To Checkout button
    When User Click Download Invoice button and verify invoice is downloaded successfully.
    And User should Click Continue button
    And User should Click Delete Account button

  @test25
  Scenario: Verify Scroll Up using Arrow button and Scroll Down functionality
    When User Click on arrow at bottom right side to move upward
    Then User should Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen

  @test26
  Scenario: Verify Scroll Up without Arrow button and Scroll Down functionality
    When User Scroll up page to top
