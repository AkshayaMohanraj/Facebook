Feature: End to End scenario for Facebook Application

@smoketest
  Scenario: Login to a Facebook Application
    Given User is on Facebook Application
    When User Enterr the UserName in "akshayaraj7778@gmail.com" Field
    Then User Enter Password in "mohanapk@11" Field
    
    
@sanitytest   
  Scenario: Create A Account in Facebook Application
    When User Enter Create Account Button to Create New Account
    And User select First Name in firstname Field
    And User Enter Last Name in lastname Field
    And User Enter new mobile No/mail Id in respective Field
    And User Gentrated New Password in newpassword Field
    And User Select Birth Date in day Field
    And User Enter Birth Month in month Field
    And User Choose Birth Year in year Field
    Then User Choose Gender Options in Respective Field 
    