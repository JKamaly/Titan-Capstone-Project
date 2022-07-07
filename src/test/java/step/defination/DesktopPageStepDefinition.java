package step.defination;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.DesktopPageObject;
import utilities.WebDriverUtility;

public class DesktopPageStepDefinition extends Base {

	DesktopPageObject desktop = new DesktopPageObject();

	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		desktop.clickOnDesktopsTab();
		logger.info("user clicked on Desktops tab");
		WebDriverUtility.takeScreenShot();

	}

	@When("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		desktop.clickOnShowAllDesktops();

	}
    // step 1: we need to store the element in a list 
	// step 2 we need to iterate through the list 
	// step 3 we need to wirte an assertion to validate each element (index) is present 
	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
		List<WebElement> items = desktop.desktopItem();
		for (WebElement element : items) {
			Assert.assertTrue(element.isDisplayed());
			logger.info(element.getAttribute("title") + "is present in this page");

		}
		WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait();

	}

	@When("User click  ADD TO CART option on HP LP3065item")
	public void user_click_add_to_cart_option_on_hp_lp3065item() {
		desktop.clickOnHPLP3065AndAddToCard();
		logger.info("User clicked HP Laptop add to cart");

	}

	@When("User selects quantity {string}")
	public void user_selects_quantity(String quantitySelected) {
		desktop.userSelectQuantity(quantitySelected);

	}

	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		desktop.clickAddToCartHP();
		logger.info("User clicked on add to cart button");
		WebDriverUtility.hardWait();

	}

	@Then("User should see a message 'Success: you have added HP LP3065 to your Shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_hp_lp3065_to_your_shopping_cart() {
        //Assert.assertEquals(desktop.SuccessMessageHPLAdded(), expectedSuccessMessage);
		Assert.assertTrue(desktop.isSuccessMessagePresent());
		//logger.info(expectedSuccessMessage + "equals to" +desktop.SuccessMessageHPLAdded());
		WebDriverUtility.takeScreenShot();
		
	}
	
	@When("User click  ADD TO CART option on Canon EOS 5Ditem")
	public void user_click_add_to_cart_option_on_canon_eos_5ditem() {
		desktop.userClickOnCanonEOSAddToCart();
		logger.info("User click on add to cart option of Canon Camera");
		WebDriverUtility.takeScreenShot();

	}

	@When("User select color from dropdown Red")
	public void user_select_color_from_dropdown_red() {
		desktop.selectColorFromDropdown();
		logger.info("User select red color from dropdown list");
		WebDriverUtility.takeScreenShot();
	}

	@When("User select quantity {string}")
	public void user_select_quantity(String string) {
		desktop.userSelelcQuanityOfCamera();
    
	}


	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		desktop.ClickOnCanonEOS5DItem();

	}

	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		desktop.ClickOnWriteReviewLink();

	}

	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> review = dataTable.asMaps(String.class, String.class);
		desktop.inputYourNameField(review.get(0).get("yourname"));
		desktop.writesReview(review.get(0).get("yourReview"));
		desktop.selectRating(review.get(0).get("Bad or good"));
		

	}

	@When("User click on Continue Button")
	public void user_click_on_continue_button() {
		desktop.clickOnReviewContinueButton();

	}

	@Then("User should see a message 'Success: You have added Canon EOS 5D to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart() {
		System.out.println(desktop.reviewText()+ " from print ");

	}
	@Then("User should see a message with {string}")
	public void user_should_see_a_message_with(String string) {
	 System.out.println(desktop.reviewText() + "  from print");

	}
}


