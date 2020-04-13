@PetStore
Feature: PetStore Website
@TC01_PetStore
Scenario Outline: Login the petstore
Given the user launch the chrome application
When the user open the Petstore Home page 
And The user login the home page using "<username>" and "<password>"
Then click on the login button user nagivate to the next page
Examples:
|		username		|		password		|
|		rkram049    |   ram12345    |

@TC02_PetStore
Scenario: Set New Password for petstore
Given the user luanch the chrome application
When the user open the petstore Home Page
And the user set New Password with Valid Credentials
Then click on SaveInformation button to save Password in PetStore