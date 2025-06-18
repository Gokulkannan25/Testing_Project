package Stepdef;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BAdd_update_delete extends Utilities.common_methods{

	@Given("Select product category")
	public void select_product_category() {
		p.locator("//ul[@class='top-menu']/li/a[@href='/books']").click();
	}
	@When("User click product")
	public void user_click_product() throws InterruptedException {
		p.locator("//h2[@class='product-title']/a[@href='/computing-and-internet']").click();
		Thread.sleep(4000);
		p.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Qty:")).click();
	    p.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Qty:")).fill("10");
	}
	@Then("click add to cart, update and delete product")
	public void click_add_to_cart_update_and_delete_product() {
	    // Write code here that turns the phrase above into concrete actions
		p.locator("//input[@id='add-to-cart-button-13']").click();
	}
	@When("user click shopping cart product is displayed")
	public void user_click_shopping_cart_product_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		p.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Shopping cart").setExact(true)).click();
		Thread.sleep(4000);
		assertThat(p.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Computing and Internet"))).isVisible();
		p.locator("//input[@class='qty-input']").click();
	    p.locator("//input[@class='qty-input']").fill("1");
//		String s=p.locator("//a[@class='product-name']").textContent();
		 p.getByRole(AriaRole.LISTITEM).filter(new Locator.FilterOptions().setHasText("Digital downloads")).click();
	     p.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("3rd Album").setExact(true)).click();
	     p.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Qty:")).click();
	     p.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Qty:")).fill("2");
	     p.locator("#add-to-cart-button-53").click();
	     Thread.sleep(4000);
	     p.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Shopping cart").setExact(true)).click();
//	     assertThat(p.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("3rd Album"))).isVisible();
//	     String s1=p.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("3rd Album")).textContent();
//	     System.out.println("Ordered Products");
//	     System.out.println(s);
//	     System.out.println(s1);
	}

}
