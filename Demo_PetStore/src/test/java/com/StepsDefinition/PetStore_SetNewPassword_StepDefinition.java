package com.StepsDefinition;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.pages.PetStore_SetNewPassword_page;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PetStore_SetNewPassword_StepDefinition {
	WebDriver driver;
	
	PetStore_SetNewPassword_page NewPassword = new PetStore_SetNewPassword_page(driver);
	
	public static Logger logger = LogManager.getLogger(PetStore_SetNewPassword_StepDefinition.class.getName());
	
	@Given("^the user luanch the chrome application$")
	public void the_user_launch_the_chrome_application () {
 // Write code here that turns the phrase above into concrete actions
		NewPassword.url("chrome");
		
		logger.info("Launches the browser");
	    
	}

	@When("^the user open the petstore Home Page$")
	public void the_user_open_the_petstore_Home_Page ()  {
// Write code here that turns the phrase above into concrete actions
	    NewPassword.LoginPage();
	    
	    logger.debug("opens the Home page of the petstore website");
	}

	@And("^the user set New Password with Valid Credentials$")
	public void the_user_set_New_Password_with_Valid_Credentials() throws IOException , InterruptedException{
// Write code here that turns the phrase above into concrete actions
	    NewPassword.PasswordDetails();
	    
	    NewPassword.screenshot("src/test/resources/screenshot/NewPassword.png");
	    
	    logger.warn("Warns to enter same password");
	}

	@Then("^click on SaveInformation button to save Password in PetStore$")
	public void click_on_SaveInformation_button_to_save_Password_in_PetStore () throws Exception {
// Write code here that turns the phrase above into concrete actions
	    NewPassword.closeBrowser();
	}

}
