package Stepdef;



//import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
//
//import com.microsoft.playwright.Locator;
//import com.microsoft.playwright.Page;
//import com.microsoft.playwright.options.AriaRole;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ALoginsteps extends Utilities.common_methods{
	@Given("Login Page Displayed")
	public void login_page_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		 Launch_chrome("https://demowebshop.tricentis.com/login");
	}
	@When("User enter the email_id")
	public void user_enter_the_email_id() {
	    // Write code here that turns the phrase above into concrete actions
		p.locator("xpath=//input[@id='Email']").fill("asdf@gmal.com");
	}
	@Then("User enter the password")
	public void user_enter_the_password() {
	    // Write code here that turns the phrase above into concrete actions
		p.locator("xpath=//input[@id='Password']").fill("123456");
	}
	@When("User click login and home page is displayed")
	public void user_click_login_and_home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		p.locator("//input[@value='Log in']").click();
	}
}
