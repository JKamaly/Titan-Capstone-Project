package step.defination;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.HomePageObject;
import utilities.WebDriverUtility;

public class HomePageStepDefinition extends Base{
	
	HomePageObject homePO = new HomePageObject();
	
	
	@When("User click on Currency")
	public void user_click_on_currency() {
	 homePO.clickOnCurrency();
	}

	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		homePO.choseEuro();

	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
	 homePO.isCurrencyValueCHangedToEuro();
	 Assert.assertTrue(homePO.isCurrencyValueCHangedToEuro());
	logger.info("Currency value changed to Euro");
	WebDriverUtility.takeScreenShot();
	WebDriverUtility.hardWait();
	}
	

	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		homePO.clickOnShoppingCart();
	 
	}

	@Then("{string} message should display")
	public void message_should_display(String expectedText) {
		homePO.shoppingCartMessage();
		Assert.assertEquals(homePO.shoppingCartMessage(), expectedText);
		WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait();
	   
	}

}
