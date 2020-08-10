#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Adopt Puppy
  User should be able to adopt one or more puppies


  Background:
    Given User is on Home page

  #Test Case 1 pero falla por problemas de la página
  Scenario: Adopt a puppy
    When User select a puppy
    When User click on Adopt Me! button
    #Then "cart" page should be displayed
    #When User click on Complete the Adoption button
    #Then "Checkout" page should be displayed
#    When User enter details
#    And User click on "Place Order" button
#    Then Message "Thank you for adopting a puppy!" should be displayed

  Scenario: Puppies list displayed correctly
    Then Puppy list should be displayed

  #TestCase 10 Listo
  Scenario: Validate Menu
    Then User should see "Adopt a Puppy" option displayed
    And User should see "Learn" option displayed
    And User should see "Animal Shelters" option displayed
    And User should see "Classifieds" option displayed
    And User should see "Message Boards" option displayed
    And User should see "Pet News" option displayed
