package Stepdef;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CCheckout extends Utilities.common_methods{
	@Given("user selects checkbox button")
	public void user_selects_checkbox_button() {
	    // Write code here that turns the phrase above into concrete actions
		p.locator("#termsofservice").check();
         
	}
	@When("user click checkout button")
	public void user_click_checkout_button() {
	    // Write code here that turns the phrase above into concrete actions
		p.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Checkout")).click();
	}
	@Then("billing page is displayed")
	public void billing_page_is_displayed() {
		p.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Checkout"));
	}
}
