package step.defination;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.LaptopNoteBooksPageObject;
import utilities.WebDriverUtility;

public class LaptopNoteBooksStepDefinition extends Base {
	
	LaptopNoteBooksPageObject laptop = new LaptopNoteBooksPageObject();
	
	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		laptop.clickOnLaptopAndNote();
		logger.info("User clicked on Laptop and NoteBook tab");
		
	}

	@When("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() { 
	laptop.clickOnShowAllLaptopsAndNote();
	}

	@When("User click on MacBook  item")
	public void user_click_on_mac_book_item() {
	laptop.userClickOnMacBookItem();
	   WebDriverUtility.hardWait();

		
	}
//	 @And ("User click add to Cart button")
//	 public void User_click_add_to_cart_button() {
//		 laptop.clickAddToCart();
//	 }

	@Then("User should see a message {string}")
	public void user_should_see_a_message(String macBookAdded) {
	//Assert.assertEquals(laptop.successMessageMacBookAdded(),addedToShopptingCart);
	Assert.assertTrue(laptop.isMacBookAddedToShoppingCart(macBookAdded));
	logger.info("User see the success Message");
	WebDriverUtility.takeScreenShot();
   

	}

	@Then("User should see {string}")
	public void user_should_see(String itemPrice) {
	Assert.assertEquals(laptop.ItemAddedAndPriceIsVisiable(itemPrice), itemPrice);
	logger.info("Items and price is visiable");
	}

	@Then("User click on cart option")
	public void user_click_on_cart_option() {
		laptop.userClickOnCartOption();
		logger.info("User click on cart Options");
		WebDriverUtility.takeScreenShot();
		

	}
	@Then("User should see '{int} item\\(s){double}'showed to the cart")
	public void user_should_see_item_s_showed_to_the_cart(Integer int1, Double double1) {
		laptop.isItemRemovedMessageDisplayed();
	 Assert.assertTrue(laptop.isItemRemovedMessageDisplayed());
	 logger.info("The item was removed");
	 WebDriverUtility.hardWait();
	}

	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
	   laptop.clickOnRemoveFromCart();
	}
	@Then("item should be removed and cart should show {int} item\\(s)")
	public void item_should_be_removed_and_cart_should_show_item_s(Integer int1) {
	 laptop.isItemRemovedMessageDisplayed();
	}


	@When("User click on product comparison icon on 'MacBook’")
	public void user_click_on_product_comparison_icon_on_mac_book() {
		laptop.userClickOnCaparisonIcon();
		logger.info("User click on MacBook Comparison Icon");
	}

	@When("User click on product comparison icon on {string}")
	public void user_click_on_product_comparison_icon_on(String string) {
	laptop.clicOnAirMacBookComparison();
	 logger.info("User click on MacBook Air Comparison");
 
	}

	@Then("User should see a message 'Success: You have added MacBook Air to your product comparison!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_air_to_your_product_comparison() {
	laptop.productAddedToCartMessage();
	logger.info("User get message");
	}

	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
	    laptop.clickOnProductComparisonLink();
	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
		laptop.isProductCmparisonChartDisplayed();
		
		WebDriverUtility.takeScreenShot();
	
	}

	@When("User click on heart icon to add {string}")
	public void user_click_on_heart_icon_to_add(String string) {
		laptop.clickOnSonyVaioWishList();
	laptop.clickOnSonyVaioWishList();
	logger.info("User cliked on add to wishlist");

	}

	@Then("User should get a message 'You must login or create an account to save Sony VAIO to your wish list!’")
	public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vaio_to_your_wish_list() {
	  laptop.mustLoginOrCreateAccountMessege();
		laptop.mustLoginOrCreateAccountMessege();
	  Assert.assertTrue(laptop.mustLoginOrCreateAccountMessege());
	  
	}

	@When("User click on {string} item")
	public void user_click_on_item(String string) {
	 laptop.clickOnMacBookProItem();
	}

	@Then("User should see  {string} price tag is present on UI.")
	public void user_should_see_price_tag_is_present_on_ui(String string) {
	    laptop.doublePriceIsPresentOnUI("20,000");
	    
	
	}


}
