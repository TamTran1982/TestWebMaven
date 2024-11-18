package web.pages;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import web.interfaces.ContactPageUI;

public class ContactPagePO extends AbstractPage{
	WebDriver driver, driver1;
	
	public ContactPagePO(WebDriver driver_) {
		this.driver = driver_;
	}	
	
	public void inputName(String name) {
		waitForControlClickable(driver, ContactPageUI.NAME_TXT);
		clearToElement(driver, ContactPageUI.NAME_TXT);
		sendkeyToElement(driver, ContactPageUI.NAME_TXT, name);
	}
	public void inputEmail(String email) {
		waitForControlClickable(driver, ContactPageUI.EMAIL_TXT);
		clearToElement(driver, ContactPageUI.EMAIL_TXT);
		sendkeyToElement(driver, ContactPageUI.EMAIL_TXT, email);
	}
	public void inputSubject(String subject) {
		waitForControlClickable(driver, ContactPageUI.SUBJECT_TXT);
		clearToElement(driver, ContactPageUI.SUBJECT_TXT);
		sendkeyToElement(driver, ContactPageUI.SUBJECT_TXT, subject);
	}
	public void inputMessages(String msg) {
		waitForControlClickable(driver, ContactPageUI.MESSAGE_TXT);
		clearToElement(driver, ContactPageUI.MESSAGE_TXT);
		sendkeyToElement(driver, ContactPageUI.MESSAGE_TXT, msg);
	}
	
	public void clickToSendButton() {
		waitForControlClickable(driver, ContactPageUI.SEND_BTN);
		clickToElement(driver, ContactPageUI.SEND_BTN);
	}
	
	public boolean checkNameEmptyMessage() {
		waitForControlClickable(driver, ContactPageUI.NAME_EMPTY_MSG);
		return isControlDisplayed(driver, ContactPageUI.NAME_EMPTY_MSG);
	}
	public boolean checkEmailEmptyMessage() {
		waitForControlClickable(driver, ContactPageUI.EMAIL_EMPTY_MSG);
		return isControlDisplayed(driver, ContactPageUI.EMAIL_EMPTY_MSG);
	}
	public boolean checkSubjectEmptyMessage() {
		waitForControlClickable(driver, ContactPageUI.SUBJECT_EMPTY_MSG);
		return isControlDisplayed(driver, ContactPageUI.SUBJECT_EMPTY_MSG);
	}
	public boolean checkMsgEmptyMessage() {
		waitForControlClickable(driver, ContactPageUI.MESSAGE_EMPTY_MSG);
		return isControlDisplayed(driver, ContactPageUI.MESSAGE_EMPTY_MSG);
	}
	public boolean checkMsgSuccessMessage() {
		waitForControlClickable(driver, ContactPageUI.MESSAGE_SUCCESS_MSG);
		return isControlDisplayed(driver, ContactPageUI.MESSAGE_SUCCESS_MSG);
	}
	
	
	
}
