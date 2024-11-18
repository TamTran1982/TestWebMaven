package web.pages;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import web.interfaces.NewsPageUI;
import web.interfaces.VietNamPageUI;

public class VietNamPagePO extends AbstractPage{
	WebDriver driver, driver1;
	
	public VietNamPagePO(WebDriver driver_) {
		this.driver = driver_;
	}
	
	public void clickToClosePopup() {
		waitForControlClickable(driver, VietNamPageUI.X_BTN);
		clickToElement(driver, VietNamPageUI.X_BTN);
	}
	
	public void clickToRegisterButton() {
		waitForControlClickable(driver, VietNamPageUI.REGISTER_BTN);
		clickToElementByJS(driver, VietNamPageUI.REGISTER_BTN);		
	}
	
	public RegisterPagePO clickToRegisterPopupButton() {
		waitForControlClickable(driver, VietNamPageUI.REGISTER_POPUP_BTN);
		clickToElementByJS(driver, VietNamPageUI.REGISTER_POPUP_BTN);		
		return PageFactoryManager.getRegisterPage(driver);
	}
	
}
