package web.pages;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import web.interfaces.HomePageUI;
import web.interfaces.MerchantPageUI;

public class MerchantPagePO extends AbstractPage{
	WebDriver driver, driver1;
	
	public MerchantPagePO(WebDriver driver_) {
		this.driver = driver_;
	}	
	
	public void clickToVietNamIcon() {
		waitForControlClickable(driver, MerchantPageUI.VIETNAM_ICON);
		clickToElementByJS(driver, MerchantPageUI.VIETNAM_ICON);		
	}
	
	public VietNamPagePO clickToRegisterButton() {
		waitForControlClickable(driver, MerchantPageUI.REGISTER_BTN);
		clickToElementByJS(driver, MerchantPageUI.REGISTER_BTN);
		return PageFactoryManager.getVietNamPage(driver);
	}
}
