Feature: To Test the Login
   
 @SmokeTest
  Scenario: Check the Login with credentials
  
    
    
    Given user is on login page
    When user enters the username and password
    And clicks login button 
    Then login page is opened