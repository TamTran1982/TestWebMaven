package web.pages;

import org.openqa.selenium.WebDriver;
import commons.AbstractPage;
import web.interfaces.HomePageUI;

public class HomePagePO extends AbstractPage {
	WebDriver driver, driver1;
	
	public HomePagePO(WebDriver driver_) {
		this.driver = driver_;
	}	

	public NewsPagePO clickToNewsMenu() {
		waitForControlClickable(driver, HomePageUI.NEWS_MENU);
		clickToElement(driver, HomePageUI.NEWS_MENU);
		return PageFactoryManager.getNewsPage(driver);
	}
	
	public MerchantPagePO clickToMerchantMenu() {
		waitForControlClickable(driver, HomePageUI.MERCHANT_MENU);
		clickToElement(driver, HomePageUI.MERCHANT_MENU);
		return PageFactoryManager.getMerchantPage(driver);
	}
	
	public PublisherPagePO clickToPublisherMenu() {
		waitForControlClickable(driver, HomePageUI.PUBLISHER_MENU);
		clickToElement(driver, HomePageUI.PUBLISHER_MENU);
		return PageFactoryManager.getPublisherPage(driver);
	}

	public BlogPagePO clickToBlogMenu() {
		waitForControlClickable(driver, HomePageUI.BLOG_MENU);
		clickToElement(driver, HomePageUI.BLOG_MENU);
		return PageFactoryManager.getBlogPage(driver);
	}
	
	public ContactPagePO clickToContactMenu() {
		waitForControlClickable(driver, HomePageUI.CONTACT_MENU);
		clickToElement(driver, HomePageUI.CONTACT_MENU);
		return PageFactoryManager.getContactPage(driver);
	}
	
	public TermsPagePO clickToTermsMenu() {
		waitForControlClickable(driver, HomePageUI.TERMS_MENU);
		clickToElement(driver, HomePageUI.TERMS_MENU);
		return PageFactoryManager.getTermsPage(driver);
	}
	
	public PolicyPagePO clickToPolicyMenu() {
		waitForControlClickable(driver, HomePageUI.POLICY_MENU);
		clickToElement(driver, HomePageUI.POLICY_MENU);
		return PageFactoryManager.getPolicyPage(driver);
	}
	
	public VietNamPagePO clickToVietNamIcon() {
		waitForControlClickable(driver, HomePageUI.VIETNAM_ICON);
		clickToElementByJS(driver, HomePageUI.VIETNAM_ICON);
		return PageFactoryManager.getVietNamPage(driver);
	}
	
	
}
