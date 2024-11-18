package web.pages;

import org.openqa.selenium.WebDriver;

public class PageFactoryManager {

	private static HomePagePO homePage;
	private static NewsPagePO newsPage;
	private static MerchantPagePO merchantPage;
	private static BlogPagePO blogPage;
	private static ContactPagePO contactPage;
	private static PublisherPagePO publisherPage;
	private static VietNamPagePO vietnamPage;
	private static RegisterPagePO registerPage;
	private static TermsPagePO termsPage;
	private static PolicyPagePO policyPage;
	
	public static HomePagePO getHomePage(WebDriver driver_) {
		if (homePage == null) {
			return new HomePagePO(driver_);
		}
		return homePage;
	}

	public static NewsPagePO getNewsPage(WebDriver driver_) {
		if (newsPage == null) {
			return new NewsPagePO(driver_);
		}
		return newsPage;
	}
	
	public static MerchantPagePO getMerchantPage(WebDriver driver_) {
		if (merchantPage == null) {
			return new MerchantPagePO(driver_);
		}
		return merchantPage;
	}

	public static BlogPagePO getBlogPage(WebDriver driver_) {
		if (blogPage == null) {
			return new BlogPagePO(driver_);
		}
		return blogPage;
	}
	
	public static ContactPagePO getContactPage(WebDriver driver_) {
		if (contactPage == null) {
			return new ContactPagePO(driver_);
		}
		return contactPage;
	}
	
	public static PublisherPagePO getPublisherPage(WebDriver driver_) {
		if (publisherPage == null) {
			return new PublisherPagePO(driver_);
		}
		return publisherPage;
	}
	
	public static VietNamPagePO getVietNamPage(WebDriver driver_) {
		if (vietnamPage == null) {
			return new VietNamPagePO(driver_);
		}
		return vietnamPage;
	}
	
	public static RegisterPagePO getRegisterPage(WebDriver driver_) {
		if (registerPage == null) {
			return new RegisterPagePO(driver_);
		}
		return registerPage;
	}
	
	public static TermsPagePO getTermsPage(WebDriver driver_) {
		if (termsPage == null) {
			return new TermsPagePO(driver_);
		}
		return termsPage;
	}
	
	public static PolicyPagePO getPolicyPage(WebDriver driver_) {
		if (policyPage == null) {
			return new PolicyPagePO(driver_);
		}
		return policyPage;
	}
}
