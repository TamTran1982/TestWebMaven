package web.testscript;

import commons.AbstractTest;
import web.pages.BlogPagePO;
import web.pages.ContactPagePO;
import web.pages.HomePagePO;
import web.pages.MerchantPagePO;
import web.pages.NewsPagePO;
import web.pages.PageFactoryManager;
import web.pages.PolicyPagePO;
import web.pages.PublisherPagePO;
import web.pages.RegisterPagePO;
import web.pages.TermsPagePO;
import web.pages.VietNamPagePO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestScriptForWeb extends AbstractTest {
	private WebDriver driver;
	private HomePagePO homePage;
	private NewsPagePO newsPage;
	private MerchantPagePO merchantPage;
	private BlogPagePO blogPage;
	private ContactPagePO contactPage;
	private PublisherPagePO publisherPage;
	private TermsPagePO termsPage;
	private PolicyPagePO policyPage;
	private VietNamPagePO vietnamPage;
	private RegisterPagePO registerPage;
	private String parent1, parent2, parent;
	
	@Parameters({ "browser", "url", "version" })
	@BeforeClass
	public void beforeClass(String browser, String url, String version) {
		driver = openMultiBrowser(browser, url, version);
		homePage = PageFactoryManager.getHomePage(driver);		
		
	}

	/*@Test
	public void TC_01_CheckWithMenu() throws Exception {		
		newsPage=homePage.clickToNewsMenu();
		newsPage.sleepInSeconds(3);
		merchantPage=homePage.clickToMerchantMenu();
		merchantPage.sleepInSeconds(3);
		publisherPage=homePage.clickToPublisherMenu();
		publisherPage.sleepInSeconds(3);
		blogPage=homePage.clickToBlogMenu();
		blogPage.sleepInSeconds(3);
		contactPage=homePage.clickToContactMenu();
		contactPage.sleepInSeconds(3);
		termsPage=homePage.clickToTermsMenu();
		termsPage.sleepInSeconds(3);
		policyPage=homePage.clickToPolicyMenu();
		policyPage.sleepInSeconds(3);
	}
	
	@Test
	public void TC_02_CheckSearchAndClickResult() throws Exception {
		newsPage=homePage.clickToNewsMenu();
		newsPage.inputSearch("APAC");
		newsPage.pressEnter();
		newsPage.sleepInSeconds(3);
		newsPage.clickToResultSearchList();
		newsPage.sleepInSeconds(3);
	}
	
	@Test
	public void TC_03_CheckContactUsValidateEmpty() throws Exception {
		contactPage=homePage.clickToContactMenu();
		contactPage.sleepInSeconds(3);
		contactPage.inputName("");
		contactPage.inputEmail("");
		contactPage.inputSubject("");
		contactPage.inputMessages("");
		contactPage.clickToSendButton();
		verifyTrue(contactPage.checkNameEmptyMessage());
		verifyTrue(contactPage.checkEmailEmptyMessage());
		verifyTrue(contactPage.checkSubjectEmptyMessage());
		verifyTrue(contactPage.checkMsgEmptyMessage());
		contactPage.sleepInSeconds(3);
	}

	@Test
	public void TC_04_CheckContactUsSuccess() throws Exception {
		contactPage=homePage.clickToContactMenu();
		contactPage.sleepInSeconds(3);
		contactPage.inputName("Tâm Trần");
		contactPage.inputEmail("tamtran@gmail.com");
		contactPage.inputSubject("Test 123");
		contactPage.inputMessages("I'm testing on your website...");
		contactPage.clickToSendButton();
		verifyTrue(contactPage.checkMsgSuccessMessage());
		contactPage.sleepInSeconds(3);
	}*/

	@Test
	public void TC_05_CheckRegister() throws Exception {
		vietnamPage=homePage.clickToVietNamIcon();
		
		parent1=driver.getTitle();
		System.out.println("Window 1: "+parent1);
		vietnamPage.switchToWindowByTitle(driver, parent1);		
					
		//
		vietnamPage.clickToRegisterButton();
		registerPage=vietnamPage.clickToRegisterPopupButton(); 
		parent2=driver.getTitle();
		registerPage.switchToWindowByTitle(driver, parent2);		
		System.out.println("Window 2: "+parent2);		
		registerPage.sleepInSeconds(5);
		 
		
	}
	
	@Parameters({ "browser" })
	@AfterClass
	public void afterClass(String browser) {
		closeBrowser(browser);
	}

	
}
