package web.interfaces;

public class ContactPageUI {
	public static final String NAME_TXT = "//form[@name='fmessage']//input[@name='txtName']";
	public static final String EMAIL_TXT = "//form[@name='fmessage']//input[@name='txtEmail']";
	public static final String SUBJECT_TXT = "//form[@name='fmessage']//input[@name='txtSubject']";
	public static final String MESSAGE_TXT = "//form[@name='fmessage']//textarea[@name='txtMessage']";
	public static final String SEND_BTN = "//button[@type='submit']//span[contains(text(), 'Send Inquiry')]";
	
	public static final String NAME_EMPTY_MSG = "//form[@name='fmessage']//div[contains(text(), 'Please enter your name')]";
	public static final String EMAIL_EMPTY_MSG = "//form[@name='fmessage']//div[contains(text(), 'Please enter your email address')]";
	public static final String SUBJECT_EMPTY_MSG = "//form[@name='fmessage']//div[contains(text(), 'Please enter your subject')]";
	public static final String MESSAGE_EMPTY_MSG = "//form[@name='fmessage']//div[contains(text(), 'Please enter your message')]";
	
	public static final String MESSAGE_SUCCESS_MSG = "//div//h2[contains(text(), 'Your Message has been send')]";
}
