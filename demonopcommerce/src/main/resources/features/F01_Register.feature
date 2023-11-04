@smoke
Feature: F01_Register | users could register with new accounts

  Scenario:guest user could register with valid data successfully
  Given user go to register page
  When user select gender type
  And  user enter first name "Assem" and last name "Ali"
  And user enter date of birth "12" "May" "1990"
  And user enter email "vi@Mailinator.com" field
  And user fills Password fields "Amit@2022" "Amit@2022"
  And user clicks on register button
  Then verify success message is displayed