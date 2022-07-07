package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPageObject extends Base {

	public RetailPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement testEnrionmentLog;

	public boolean isLogoPresent() {
		if (testEnrionmentLog.isDisplayed())
			return true;
		else
			return false;
	}

	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccountOption;

	public void selectMyAccoutnOption() {
		myAccountOption.click();
	}

	@FindBy(xpath = "//a[contains(text(),'Login')]")
	private WebElement loginOption;

	public void clickOnLoginOption() {
		loginOption.click();
	}

	@FindBy(id = "input-email")
	private WebElement emailValue;

	public void enterEmailValue(String emailAdd) {
		emailValue.clear();
		emailValue.sendKeys(emailAdd);
	}

	@FindBy(id = "input-password")
	private WebElement passwordValue;

	public void enterPasswordValue(String password) {
		passwordValue.clear();
		passwordValue.sendKeys(password);
	}

	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginIcon;

	public void clickOnLoginIcon() {
		loginIcon.click();
	}

	@FindBy(id = "account-account")
	private WebElement userLoggedIntoMyAccount;

	public boolean userLoggedToMyAccountDashboard() {
		
		if (userLoggedIntoMyAccount.isDisplayed())
			return true;
		else
			return false;
	}
//	public String getTitle() {
//
//        return driver.getTitle();
        
//
//    }

	@FindBy(xpath = "//a[text()='Edit your affiliate information']")
	private WebElement myAffiliateAccoutLink;

	public void clickOnMyAffiliateLink() {
		myAffiliateAccoutLink.click();
	}

	@FindBy(id = "input-company")
	private WebElement companyNameInputField;

	public void enterCompanyName(String companyName) {
		companyNameInputField.clear();
		companyNameInputField.sendKeys(companyName);
	}

	@FindBy(id = "input-website")
	private WebElement webSiteInputField;

	public void enterCompanyWebsite(String websiteName) {
		webSiteInputField.clear();
		webSiteInputField.sendKeys(websiteName);
	}

	@FindBy(id = "input-tax")
	private WebElement taxInputField;

	public void enterInputIntoTaxField(String taxID) {
		taxInputField.clear();
		taxInputField.sendKeys(taxID);
	}

	@FindBy(xpath = "//input[@value='cheque']")
	private WebElement chequeRadioButton;

	@FindBy(xpath = "//input[@value='paypal']")
	private WebElement payPalRadiButton;

	@FindBy(xpath = "//input[@value='bank']")
	private WebElement bankRadioButton;

	public void bankPaymentMethod(String paymentType) {
		if (paymentType.trim().equalsIgnoreCase("cheque")) {
			chequeRadioButton.click();
		} else if (paymentType.equalsIgnoreCase("paypal")) {
			payPalRadiButton.click();
		} else
			bankRadioButton.click();
	}

	@FindBy(id = "input-cheque")
	private WebElement chequePayeeName;

	public void enterPayeeName(String payeeName) {
		chequePayeeName.clear();
		chequePayeeName.sendKeys(payeeName);
	}

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButtonOption;

	public void selectContinueButton() {
		continueButtonOption.click();
	}

	@FindBy(xpath = "//div[text()=' Success: Your account has been successfully updated.']")
	private WebElement successMessageUpdate;

	public boolean userShouldSeeSuccessMessage() {
		if (successMessageUpdate.isDisplayed())
			return true;
		else
			return false;
	}

	@FindBy(xpath = "//a[text()='Edit your affiliate information']")
	private WebElement editYourAffiliateInfoLink;

	public void clickOnEditYourAffiliateInfo() {
		editYourAffiliateInfoLink.click();
	}

	public boolean isDashBoardPresent() {
		if (userLoggedIntoMyAccount.isDisplayed())
			return true;
		else
			return false;
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public void userSelecetBankTransferRadioButton() {
		bankRadioButton.click();
	}

	public void selectBankTranserBtn(String paymentType) {
		if (paymentType.equals("Bank Transfer")) {
			bankRadioButton.click();
		} else if (paymentType.equals("PayPal")) {
			payPalRadiButton.click();
		} else
			chequeRadioButton.click();
	}

	@FindBy(id = "input-bank-name")
	private WebElement bankNameInputField;

	public void userInputBankName(String bankName) {
		bankNameInputField.click();
		bankNameInputField.sendKeys(bankName);
	}

	@FindBy(id = "input-bank-branch-number")
	private WebElement branchNumberInputField;

	public void userInputBankNumber(String abaNumber) {
		branchNumberInputField.clear();
		branchNumberInputField.sendKeys(abaNumber);

	}

	@FindBy(id = "input-bank-swift-code")
	private WebElement swiftCodeInputField;

	public void userInputSwiftCode(String swiftCode) {
		swiftCodeInputField.clear();
		swiftCodeInputField.sendKeys(swiftCode);

	}

	@FindBy(id = "input-bank-account-name")
	private WebElement accountNameInputFeild;

	public void userInputaccountName(String accountName) {
		accountNameInputFeild.clear();
		accountNameInputFeild.sendKeys(accountName);
	}

	@FindBy(id = "input-bank-account-number")
	private WebElement accountNumberInputField;

	public void userInputAccountNumber(String accountNumber) {
		accountNumberInputField.clear();
		accountNumberInputField.sendKeys(accountNumber);
	}

	@FindBy(xpath = "//input[@class='btn btn-primary']")
	private WebElement continueButtonField;

	public void userClickOnContinueButonOptioon() {
		continueButtonField.click();
	}

	@FindBy(xpath = "//div[text()=' Success: Your account has been successfully updated.']")
	private WebElement accounHasBeenSuccessfullyUpdated;

	public boolean isBankModifyingSuccessMessageDisplayed() {
		if (accounHasBeenSuccessfullyUpdated.isDisplayed())
			return true;
		else
			return false;

	}

	@FindBy(xpath = ("//a[text()='Edit your account information']"))
	private WebElement editYourAccountInfoLink;

	public void userClickOnEditAccountLink() {
		editYourAccountInfoLink.click();
	}

	@FindBy(id = "input-firstname")
	private WebElement modifyFirstName;

	public void userModifyFName(String fName) {
		modifyFirstName.clear();
		modifyFirstName.sendKeys(fName);
	}

	@FindBy(id = "input-lastname")
	private WebElement modifyLastname;

	public void usermodifyLastname(String lName) {
		modifyLastname.clear();
		modifyLastname.sendKeys(lName);
	}

	@FindBy(id = "input-email")
	private WebElement modifyEmailAdd;

	public void userModifyEmailAdd(String email) {
		modifyEmailAdd.clear();
		modifyEmailAdd.sendKeys(email);
	}

	@FindBy(id = "input-telephone")
	private WebElement modityTelephoneNumber;

	public void userModifyTelephoneNum(String telepohen) {
		modityTelephoneNumber.clear();
		modityTelephoneNumber.sendKeys(telepohen);

	}

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement clickOnSubmitBtn;

	public void userClickOnSubmitBtn() {
		clickOnSubmitBtn.click();
	}

	@FindBy(xpath = "//div[text()=' Success: Your account has been successfully updated.']")
	private WebElement successMessageDisplay;

	public boolean isSuccessMessageDisplyed() {
		if (successMessageDisplay.isDisplayed())
			return true;
		else
			return false;

	}

}
