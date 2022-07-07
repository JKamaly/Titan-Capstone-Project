package page.objects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class HomePageObject extends Base{
	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="form-currency")
	private WebElement userClickOnCurrency;
	
	public void clickOnCurrency() {
		userClickOnCurrency.click();
		WebDriverUtility.hardWait();
	}
	
	@FindBy(xpath="//button[@name='EUR']")
	private WebElement choseEuroFromDropdown;
	
	public void choseEuro() {
		choseEuroFromDropdown.click();
		WebDriverUtility.hardWait();
	}
	@FindBy(xpath = "//strong[contains(text(),'€')]")
	private WebElement currencyValueChangeToEuro;
	
	public boolean isCurrencyValueCHangedToEuro() {
		if(currencyValueChangeToEuro.isDisplayed())
			return true;
		else 
			return false;
	}
	@FindBy(xpath="//span[contains(text(),'Shopping Cart')]")
	private WebElement userClickOnShoppingCart;
	
	public void clickOnShoppingCart() {
		userClickOnShoppingCart.click();
		WebDriverUtility.hardWait();
	}
	
	@FindBy(xpath="(//p[contains(text(),'Your shopping cart is empty!')])[2]")
	private WebElement yourShoppingCartIsEmpty;
	
	public String shoppingCartMessage() {
	String actual = yourShoppingCartIsEmpty.getText();
	return actual;

	
			

	}
	
	
	

}
