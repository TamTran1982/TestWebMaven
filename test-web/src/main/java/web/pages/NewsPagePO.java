package web.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

import web.interfaces.NewsPageUI;

public class NewsPagePO extends AbstractPage{
	WebDriver driver, driver1;
		
	public NewsPagePO(WebDriver driver_) {
		this.driver = driver_;
	}	
	
	public void clickToSubMenu() {
		waitForControlClickable(driver, NewsPageUI.SUB_NEWS_LINK);
		clickToElement(driver, NewsPageUI.SUB_NEWS_LINK);
	}
	
	public void inputSearch(String search) {
		waitForControlClickable(driver, NewsPageUI.SEARCH_TXT);
		clearToElement(driver, NewsPageUI.SEARCH_TXT);
		sendkeyToElement(driver, NewsPageUI.SEARCH_TXT, search);
	}
	
	public void pressEnter() {
		keyPressAction(driver, Keys.ENTER);
	}
	
	public void clickToResultSearchList() {
		waitForControlClickable(driver, NewsPageUI.RESULT_SEARCH_LINK);
		clickToElement(driver, NewsPageUI.RESULT_SEARCH_LINK);
	}
}
