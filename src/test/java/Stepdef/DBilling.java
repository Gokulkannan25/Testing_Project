package Stepdef;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DBilling extends Utilities.common_methods{

 
	@When("user selects billing address and clicks continue button")
	public void user_selects_billing_address_and_clicks_continue_button() {
	    // Write code here that turns the phrase above into concrete actions
		p.locator("//input[@onclick='Billing.save()']").click();
	}
	@Then("user selects shipping address and clicks continue button")
	public void user_selects_shipping_address_and_clicks_continue_button() {
	    // Write code here that turns the phrase above into concrete actions
		p.locator("//input[@onclick='Shipping.save()']").click();
	}
	@Then("user selects shipping method and clicks continue button")
	public void user_selects_shipping_method_and_clicks_continue_button() {
	    // Write code here that turns the phrase above into concrete actions
		p.locator("//input[@onclick='ShippingMethod.save()']").click();
	}
	@Then("user payment method and clicks continue button")
	public void user_payment_method_and_clicks_continue_button() {
	    // Write code here that turns the phrase above into concrete actions
		p.locator("//input[@onclick='PaymentMethod.save()']").click();
	}
	@Then("payment information will be displayed and user click continue button")
	public void payment_information_will_be_displayed_and_user_click_continue_button() {
	    // Write code here that turns the phrase above into concrete actions
		p.locator("//input[@onclick='PaymentInfo.save()']").click();
	}
	@Then("user verify product details and clicks confirm button")
	public void user_verify_product_details_and_clicks_confirm_button() {
	    // Write code here that turns the phrase above into concrete actions
		p.locator("//input[@onclick='ConfirmOrder.save()']").click();
	}
	@Then("order placed successfully message will be displayed and order id will be displayed")
	public void order_placed_successfully_message_will_be_displayed_and_order_id_will_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		assertThat(p.getByText("Your order has been")).isVisible();
        assertThat(p.getByText("Order number:")).isVisible();
        String order_id=p.getByText("Order number:").textContent();
        System.out.print(order_id);
        p.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue")).click();
        p.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Log out")).click();
	}

}
