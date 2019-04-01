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
Feature: Amazon page test

  
  Scenario: Validate first price vs detail price
    Given Samsung Search
    And Select samsung result
    Then first price should match wih current price
    
      Scenario: Validate again, first price vs Car current price
    Given Samsung add to car
    And we got car price
    Then first price should match with car price
    
    
      Scenario: Validate that the Shop car has one as a number
   Given amazon is in car page
    Then shop car has one has a number
    
    Scenario: Verify that the cart number is now two
    Given Search Alien 
    And Select Alien product
    And add alien to car
    Then car numer is now two
   


