@Retail
Feature: Retail Page

  Background: 
    Given User is on Retail website
    And User click  on MyAccount Option
    When User click on Login
    And User enter username "a12@gmail.com" and password "1234"
    And User click on Login button
    Then User should be logged in to MyAccount dashboard

  @RegisterAsAffiliate
  Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click on Register for an Affiliate Account link
    And User fill affiliate form with below information
      | company | website      | taxID | Payment Method | Payee Name |
      | TEK     | tekschool.us |  1558 | Cheque         | Tek School |
    #And User check on Abbout us check box
    And User click on Continue button
    Then User should see a success messag

  @EditRegisterAffiliateLink
  Scenario: Edit your affiliate information from cheque payment method to Bank Transfter
    When User click on Edit your affiliate informationlink
    And User click on Bank Transfer radio button
    And User fill Bank information with below information
      | bankName | abaNumber | swiftCode | accountName | accountNumber |
      | US Bank  |     15889 |     55879 | James       |        889977 |
    And User click on Continue button
    Then User should see a success message

  @UpdateBankAccount
  Scenario: Edidt your account information
    When User click on Edit your account information link
    And User modify below information
      | firstName | lastName | email         | telephone |
      | Jack      | Ma       | a12@gmail.com | 123456789 |
    And User click on continue button
    Then USer should see a message 'success: Your account has been successfully updated.'
