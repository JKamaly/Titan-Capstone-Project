package step.defination;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.RetailPageObject;
import utilities.WebDriverUtility;


public class RetailStepDefinition extends Base {

	RetailPageObject retail = new RetailPageObject();
	

	@Given("User is on Retail website")
	public void user_is_on_retail_website()  {
	Assert.assertTrue(retail.isLogoPresent());
	Assert.assertEquals("TEK SCHOOL", retail.getTitle());
	logger.info("User is on Retail WebSite");
	WebDriverUtility.takeScreenShot();
	

	}

	@Given("User click  on MyAccount Option")
	public void user_click_on_my_account() {
		retail.selectMyAccoutnOption();
		logger.info("User clicked my account Option");
	}

	@Given("User click on Login")
	public void user_click_on_login()  {
		retail.clickOnLoginOption();
		logger.info("User click on Login Button");
		
	}

	@Given("User enter username {string} and password {string}")
	public void user_enter_userName_and_password(String userName, String password) {
		retail.enterEmailValue(userName);
		retail.enterPasswordValue(password);
		logger.info("User entered userName and Password");
	}

	@Given("User click on Login button")
	public void user_click_on_login_button() {
		retail.clickOnLoginIcon();
		logger.info("User clicked on login");
	  
	}

	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_into_myAccount_dashboard() {
		Assert.assertTrue(retail.isDashBoardPresent());
		logger.info("User sccessfully registered");
		WebDriverUtility.takeScreenShot();
	}

	@When("User click on Register for an Affiliate Account link")
	public void user_click_on_register_for_an_affiliate_account_link() throws InterruptedException {
		retail.clickOnMyAffiliateLink();
	  Thread.sleep(3000);
	}

	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {
		List<Map<String,String>> info = dataTable.asMaps(String.class, String.class);
		retail.enterCompanyName(info.get(0).get("company"));
		retail.enterCompanyWebsite(info.get(0).get("website"));
		retail.enterInputIntoTaxField(info.get(0).get("taxID"));
		retail.bankPaymentMethod(info.get(0).get("Payment Method"));
		retail.enterPayeeName(info.get(0).get("Payee Name"));
		logger.info("User entered bank account information");
		WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait();
		
			  try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

//	@When("User check on About us check box")
//	public void user_check_on_about_us_check_box() {
//		retail.clickOnAboutUsCheckBox();
//	
//	}

	@When("User click on Continue button")
	public void user_click_on_continue_button() {
		retail.selectContinueButton();
	 
	}

	@Then("User should see a success messag")
	public void user_should_see_a_success_messag() {
		Assert.assertTrue(retail.userShouldSeeSuccessMessage());
		logger.info("User is on my dashboard");
		WebDriverUtility.takeScreenShot();
	
	}
	@When("User click on Edit your affiliate informationlink")
	public void user_click_on_edit_your_affiliate_informationlink() {
	 retail.clickOnEditYourAffiliateInfo();
	}

	@When("User click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		retail.userSelecetBankTransferRadioButton();
	}

	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable dataTable) {
	  List<Map<String, String>> bank = dataTable.asMaps(String.class, String.class);
	  retail.userInputBankName(bank.get(0).get("bankName"));
	  retail.userInputBankNumber(bank.get(0).get("abaNumber"));
	  retail.userInputSwiftCode(bank.get(0).get("swiftCode"));
	  retail.userInputaccountName(bank.get(0).get("accountName"));
	  retail.userInputAccountNumber(bank.get(0).get("accountNumber"));
	  WebDriverUtility.hardWait();
	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
	retail.isBankModifyingSuccessMessageDisplayed();
	}

	@When("User click on Edit your account information link")
	public void user_click_on_edit_your_account_information_link() {
		retail.userClickOnEditAccountLink();
	  
	}

	@When("User modify below information")
	public void user_modify_below_information(DataTable dataTable) {
	List<Map<String, String>> modify = dataTable.asMaps(String.class, String.class);
	retail.userModifyFName(modify.get(0).get("firstName"));
	retail.usermodifyLastname(modify.get(0).get("lastName"));
	retail.userModifyEmailAdd(modify.get(0).get("email"));
	retail.userModifyTelephoneNum(modify.get(0).get("telephone"));
	logger.info("User modifies information");
	WebDriverUtility.takeScreenShot();
	WebDriverUtility.hardWait();
	}
	
	@When ("User click on continue button")
	public void User_click_on_continue_button() {
		retail.userClickOnSubmitBtn();
	}

	@Then("USer should see a message {string}")
	public void u_ser_should_see_a_message(String string) {
		retail.isSuccessMessageDisplyed();
	 
	}

	}
	

