package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class LaptopNoteBooksPageObject extends Base{
	public LaptopNoteBooksPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	//User click on Laptop &NoteBook tab 
	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement clickOnLaptop;
	public void clickOnLaptopAndNote() {
		clickOnLaptop.click();
		WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait();
	}
	
	//User click on Show all Laptop &NoteBook option 
	@FindBy(xpath="//a[text()='Show All Laptops & Notebooks']")
	private WebElement clickOnShowAllLaptop;
	public void clickOnShowAllLaptopsAndNote() {
		clickOnShowAllLaptop.click();
		WebDriverUtility.hardWait();
	}
	
	//User click on MacBook  item
	@FindBy(xpath="//a[text()='MacBook']")
	private WebElement clickOnMacBookItem;
	
	public void userClickOnMacBookItem() {
		clickOnMacBookItem.click();
	}
	
	//User click add to Cart button
//	@FindBy(xpath="//button[@id='button-cart']")
//	private WebElement userClickAddToCart;
//	
//	public void clickAddToCart() {
//		userClickAddToCart.click();
//	}
	
	//User should see a message 'Success: You have added MacBook to your shopping cart!'
	@FindBy(xpath="//div[text()='Success: You have added ']")
	private WebElement userShouldSeeAMessage;
	
	
	
//	public String successMessageMacBookAdded() {
//		String actual = userShouldSeeAMessage.getText();
//				return actual;
//				
//	}
	public boolean isMacBookAddedToShoppingCart(String successMessage) {
		if(userShouldSeeAMessage.isDisplayed())
			return true;
		else 
			return false;
	}
	
	
	//User should see '1 tem(s)-602.00showed to the cart'
	@FindBy(id="cart-total")
	private WebElement userSeeItemPrice;
	
	public String ItemAddedAndPriceIsVisiable(String itemPrice) {
		String itemVisiable = userSeeItemPrice.getText();
		return itemVisiable;
	}
//	public boolean isItemAddedAndPriceIsVisiable() {
//		if(userSeeItemPrice.isDisplayed())
//			return true;
//		else 
//			return
//					false;
//	}
	//User click on cart option
	@FindBy(id="button-cart")
	private WebElement clickAddToCartButton;

	public void userClickOnCartOption() {
		userSeeItemPrice.click();
		WebDriverUtility.hardWait();
	}
	//And user click on red X button to remove the item from cart
@FindBy(xpath="//button[@title='Remove']")
private WebElement userClickOnRemoveButton;

public void clickOnRemoveFromCart() {
	userClickOnRemoveButton.click();
}
//item should be removed and cart should show 0 item(s)
@FindBy(xpath="//span[@id='cart-total']")
private WebElement itemsShouldBeRemoved;

public boolean isItemRemovedMessageDisplayed() {
	if(itemsShouldBeRemoved.isDisplayed())
		return true;
	else 
		return 
				false;
}

//@Second Scenario:
//User click on product comparison icon on 'MacBook'
@FindBy(xpath="//body/div[@id='product-product']/div[2]/div[1]/div[1]/div[2]/div[1]/button[2]/i[1]")
private WebElement userClickOnCoparison;

public void userClickOnCaparisonIcon() {
	userClickOnCoparison.click();
}

//User click on product comparison icon on 'MacBook Air'
@FindBy(xpath="//div[3]//div[1]//div[2]//div[2]//button[3]//i[1]")
private WebElement userClickOnAirMacBookComparison;

public void clicOnAirMacBookComparison() {
	userClickOnAirMacBookComparison.click();
	WebDriverUtility.hardWait();
}
//User should see a message 'Success: You have added MacBook Air to your product comparison!’
@FindBy(xpath="//body/div[@id='product-category']/div[1]")
private WebElement usserSeeProductAddedToCartMessage;

public void productAddedToCartMessage() {
	usserSeeProductAddedToCartMessage.getText();
	WebDriverUtility.hardWait();
}
	//User click on Product comparison link
	@FindBy(xpath = "//a[contains(text(),'product comparison')]")
	private WebElement userClickOnProductComparisonLink;
	
	public void clickOnProductComparisonLink() {
		userClickOnProductComparisonLink.click();
		WebDriverUtility.hardWait();
		
	}
	//User should see Product Comparison Chart
	@FindBy(id="content")
	private WebElement productComparisonChart;
	
	public boolean isProductCmparisonChartDisplayed() {
		if(productComparisonChart.isDisplayed())
			return true;
		else 
			return false;
	}
	
	
	//@Third Scenario
	//User click on heart icon to add 'Sony VaIO’ laptop to wish list'
	@FindBy(xpath="//div[5]//div[1]//div[2]//div[2]//button[2]//i[1]")
	private WebElement userClickOnSOryVaiOHeartIcon;
	
	public void clickOnSonyVaioWishList() {
		userClickOnSOryVaiOHeartIcon.click();
		WebDriverUtility.hardWait();
	}
	
	//User should get a message 'You must login or create an account to save Sony VAIO to your wish list!’
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement mustLoginOrCreateAccountToSaveSonyTOWishList;
	
	public boolean mustLoginOrCreateAccountMessege() {
		if(mustLoginOrCreateAccountToSaveSonyTOWishList.isDisplayed())
			return true;
		else 
			return false;
		
	}
	
	
	//@Fourth Scenario
	//User click on 'MacBook Pro' item
	@FindBy(xpath="//a[text()='MacBook Pro']")
    private WebElement userClickOnMacBookPro;
	
	public void clickOnMacBookProItem() {
		userClickOnMacBookPro.click();
		WebDriverUtility.hardWait();
	}
	
	//User should see  '$2,000.00' price tag is present on UI
	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement userSeePriceIsPresentOnUI;
	
	public void doublePriceIsPresentOnUI(String value) {
		userSeePriceIsPresentOnUI.getAttribute(value);
		WebDriverUtility.hardWait();
			}
}
