$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/Feature/TestCases.feature");
formatter.feature({
  "line": 2,
  "name": "PetStore Website",
  "description": "",
  "id": "petstore-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@PetStore"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Login the petstore",
  "description": "",
  "id": "petstore-website;login-the-petstore",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@TC01_PetStore"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "the user launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "the user open the Petstore Home page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "The user login the home page using \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "click on the login button user nagivate to the next page",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "petstore-website;login-the-petstore;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 10,
      "id": "petstore-website;login-the-petstore;;1"
    },
    {
      "cells": [
        "rkram049",
        "ram12345"
      ],
      "line": 11,
      "id": "petstore-website;login-the-petstore;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Login the petstore",
  "description": "",
  "id": "petstore-website;login-the-petstore;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@TC01_PetStore"
    },
    {
      "line": 1,
      "name": "@PetStore"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "the user launch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "the user open the Petstore Home page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "The user login the home page using \"rkram049\" and \"ram12345\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "click on the login button user nagivate to the next page",
  "keyword": "Then "
});
formatter.match({
  "location": "PetStore_Login_StepDefinition.the_user_launch_the_chrome_application()"
});
formatter.result({
  "duration": 127261920941,
  "status": "passed"
});
formatter.match({
  "location": "PetStore_Login_StepDefinition.the_user_open_the_Petstore_Home_page()"
});
formatter.result({
  "duration": 12543481829,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rkram049",
      "offset": 36
    },
    {
      "val": "ram12345",
      "offset": 51
    }
  ],
  "location": "PetStore_Login_StepDefinition.the_user_login_the_home_page_using_and(String,String)"
});
formatter.result({
  "duration": 64739006439,
  "status": "passed"
});
formatter.match({
  "location": "PetStore_Login_StepDefinition.click_on_the_login_button_user_navigate_to_the_next_page()"
});
formatter.result({
  "duration": 10672550608,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Set New Password for petstore",
  "description": "",
  "id": "petstore-website;set-new-password-for-petstore",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@TC02_PetStore"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "the user luanch the chrome application",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "the user open the petstore Home Page",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "the user set New Password with Valid Credentials",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "click on SaveInformation button to save Password in PetStore",
  "keyword": "Then "
});
formatter.match({
  "location": "PetStore_SetNewPassword_StepDefinition.the_user_launch_the_chrome_application()"
});
formatter.result({
  "duration": 19570864171,
  "status": "passed"
});
formatter.match({
  "location": "PetStore_SetNewPassword_StepDefinition.the_user_open_the_petstore_Home_Page()"
});
formatter.result({
  "duration": 4335904147,
  "status": "passed"
});
formatter.match({
  "location": "PetStore_SetNewPassword_StepDefinition.the_user_set_New_Password_with_Valid_Credentials()"
});
formatter.result({
  "duration": 23697980116,
  "status": "passed"
});
formatter.match({
  "location": "PetStore_SetNewPassword_StepDefinition.click_on_SaveInformation_button_to_save_Password_in_PetStore()"
});
formatter.result({
  "duration": 8063447590,
  "status": "passed"
});
});