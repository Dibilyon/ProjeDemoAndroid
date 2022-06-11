Feature: Test

  @positive
  Scenario: Onboarding
    When Arrow button is clicked
    And Arrow button is clicked in second page
    And Arrow button is clicked in third page
    And Arrow button is clicked in fourth page
    And Arrow button is clicked in fifth page
    Then User Demo Scenario completed


  @positive

  Scenario: Login
    When Login button is clicked
    And  E-mail screen is displayed
    And Email textbox is filled
    And Checkboxes are clicked
    And  Continue button is clicked
    And Password is filled
    And Otp screen is displayed
    And Otp is filled in
    And Continue button2 is clicked
    Then Login is completed
  @positive
  Scenario: Create Category
    When Others page button is clicked
    And Create Category Button is clicked
    And Category name is filled in
    And Icon select button is clicked
    And Icon is selected randomly
    And Back button is clicked
    And Color select button is clicked
    And Color is selected Randomly
    And Back button is clicked
    Then Save button is clicked
  @positive
  Scenario: ContactCreation
    When Contacts button is clicked
    And Create contacts button is clicked
    And Name text field is filled in
    And Surname text field is filled in
    And Email text is filled in
    And Scrolled to Account info section
    And Country code is verified
    And Phone number text is filled in
    And Iban number is filled im
    And Norma Number is filled in
    And Scroll to Invoice Info
    And Tc No is filled in
    And City dropdown is clicked
    And City is selected
    And District Dropdown is clicked
    And District is selected
    And Address is filled im
    And Create button is clicked
