package com.StepsDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.BaseClass.Excel_Utility;
import com.pages.PetStore_Login_Page;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class PetStore_Login_StepDefinition {
	
	 WebDriver driver;
	 
     PetStore_Login_Page mylogin = new PetStore_Login_Page(driver);
     
     Excel_Utility excel = new Excel_Utility();
     
     public static Logger logger = LogManager.getLogger(PetStore_Login_StepDefinition.class.getName());
     
     @Given("^the user launch the chrome application$")
     public void the_user_launch_the_chrome_application () {
     // Write code here that turns the phrase above into concrete actions
    	 mylogin = new PetStore_Login_Page(driver);
    	 
 	     mylogin.url("chrome");
    	
    	 logger.info("launch the chrome application" );
    	}
     
     @When("^the user open the Petstore Home page$")
     public void the_user_open_the_Petstore_Home_page() throws Throwable {
     // Write code here that turns the phrase above into concrete actions
         mylogin.LoginPage();
         
         logger.debug("the login page is opened");
        }

     @And("^The user login the home page using \"([^\"]*)\" and \"([^\"]*)\"$")
     public void the_user_login_the_home_page_using_and(String arg1, String arg2) throws Throwable {
     // Write code here that turns the phrase above into concrete actions
       
       //mylogin.Logindetails1(arg1, arg2);
       mylogin.Logindetails1(excel.username(1),excel.password(1));
       
       logger.debug("open the petstore home page");
       
       logger.warn("warns enter your Valid Credentials");
       
       mylogin.screenshot("src/test/resources/screenshot/homepage.png");
    	    
    	}    

     @Then("^click on the login button user nagivate to the next page$")
     public void click_on_the_login_button_user_navigate_to_the_next_page()throws InterruptedException { 
     // Write code here that turns the phrase above into concrete actions
    	   
          mylogin.closeBrowser();
    	
     }
	
	
	
}
