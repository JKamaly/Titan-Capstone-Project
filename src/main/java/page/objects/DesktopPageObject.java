package page.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;
import utilities.WebDriverUtility;

public class DesktopPageObject extends Base {
	public DesktopPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktopsTab;

	public void clickOnDesktopsTab() {
		WebDriverUtility.moveToElement(desktopsTab);
		WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait();
		
	}

	@FindBy(xpath = "//a[contains(text(),'Show All Desktops')]")
	private WebElement showAllDestopsOption;

	public void clickOnShowAllDesktops() {
		showAllDestopsOption.click();
		
	}

	@FindBy(tagName = "img")
	private List<WebElement> allItems;

	public List<WebElement> desktopItem() {
		List<WebElement> DesktopsItems = allItems;
		return DesktopsItems;
	}

	@FindBy(xpath = "//a[text()='HP LP3065']")
	private WebElement addToCartHPLP3065;

	public void clickOnHPLP3065AndAddToCard() {
		addToCartHPLP3065.click();
		WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait();
	}

	@FindBy(id = "input-quantity")
	private WebElement userSelectQuantity;

	public void userSelectQuantity(String quantityValue) {
		userSelectQuantity.clear();
		userSelectQuantity.sendKeys(quantityValue);
		WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait();
	}

	@FindBy(id = "button-cart")
	private WebElement addToCartIcon;

	public void clickAddToCartHP() {
		addToCartIcon.click();
	}

	@FindBy(xpath = "(//a[text()='HP LP3065'])[3]")
	private WebElement HPLsuccessMessage;

//	public String SuccessMessageHPLAdded() {
//		String actualResult = "Success: You have added " +HPLsuccessMessage.getText()+" to your shopping cart!";
//		return actualResult;
//	}
	public boolean isSuccessMessagePresent() {
		if(HPLsuccessMessage.isDisplayed())
			return true;
		else 
			return false;
	}


	//Scenario: User add Canon EOS 5D from Desktops tab to the cart
	
	@FindBy(xpath = "//a[text()='Canon EOS 5D Camera']")
	private WebElement addCanonEOSCamera;

	public void userClickOnCanonEOSAddToCart() {
		addCanonEOSCamera.click();
	}
	
	@FindBy(id = "input-option226")
	private WebElement userClickOnDropDownSelct;

	public void clickOnDropDowList() {
		userClickOnDropDownSelct.click();
		WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait();
	}


	@FindBy(xpath = "//option[contains(text(),'Red')]")
	private WebElement userSelectRedColor;
	
	public void selectColorFromDropdown() {
		userSelectRedColor.click();
	}



	@FindBy(id = "input-quantity")
	private WebElement selectQuanityOfCamera;
	
	public void userSelelcQuanityOfCamera() {
		selectQuanityOfCamera.click();
	}

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCartButton;
	
	public void clickAddCameraToCart() {
		addToCartButton.click();
		WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait();
	}

	@FindBy(xpath = "//body/div[@id='product-product']/div[1]/a[1]")
	private WebElement userSeeSuccessMessage;

	public boolean isCanonEOS5dAddedMessagePresent() {
		if (userSeeSuccessMessage.isDisplayed())
			return true;
		else
			return false;
	}

	@FindBy(xpath = "(//a[text()='Canon EOS 5D Camera'])[1]")
	private WebElement userClikOnEoS5DCamera;

	public void ClickOnCanonEOS5DItem() {
		userClikOnEoS5DCamera.click();
	}

	@FindBy(xpath = "//a[contains(text(),'Write a review')]")
	private WebElement userClickOnWriteReviewLink;

	public void ClickOnWriteReviewLink() {
		userClickOnWriteReviewLink.click();
		WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait();
	}

	@FindBy(id = "input-name")
	private WebElement yourNameInputField;

	public void inputYourNameField(String yourName){
		yourNameInputField.sendKeys(yourName);
			
	}

	@FindBy(id = "input-review")
	private WebElement reviewInputField;

	public void writesReview(String review) {
		reviewInputField.sendKeys(review);
	}

	@FindBy(xpath = "//input[@type='radio']")
	private List <WebElement> rating;
	
	public List<WebElement> ratingsSelection() {
		List<WebElement> ratingList = rating;
		return ratingList;
	}
	public void selectRating(String ratingValue) {
		List<WebElement> ratingElement = rating;
		for(WebElement element: ratingElement ) {
			if(element.getAttribute("value").equalsIgnoreCase(ratingValue.trim())) {
				element.click();
				break;
			}
			WebDriverUtility.takeScreenShot();
			WebDriverUtility.hardWait();
		}
	}
	

	@FindBy(id = "button-review")
	private WebElement reviewContinueButton;

	public void clickOnReviewContinueButton() {
		reviewContinueButton.click();
	}

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private String reviewSubmissionMessege;
 
	public String reviewText() {
		return reviewSubmissionMessege;
		
		
	}
	




}
