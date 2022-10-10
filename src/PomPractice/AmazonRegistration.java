package PomPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AmazonRegistration {

	@FindBy(xpath="//a[@aria-label='Amazon']") private  WebElement amazon_logo;
	@FindBy(xpath="//a[@data-nav-role='signin']") private WebElement sign_in;
	@FindBy(xpath="//span[@id='auth-create-account-link']") private WebElement signup_btn;
	@FindBy(xpath="//input[@autocomplete='name']") private WebElement fistname;
	@FindBy(xpath="//input[@name='email']") private WebElement mobile_no;
	@FindBy(xpath="//input[@id='ap_email']") private WebElement email;
	@FindBy(name="password") private WebElement password;
	@FindBy(xpath="//span[@id='auth-continue']") private WebElement continue_btn;
	
	
	public AmazonRegistration(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void VerifyAmazonLogo() {
		
		Assert.assertTrue(amazon_logo.isDisplayed(), "Logo not displayed");
	}
	
	public void ClickOnSignLink() {
		sign_in.click();
	}
	
	public void ClickOnSignUpBtn() {
		signup_btn.click();
	}
	
	public void SetAmazonRegistrationPageFirstname() {
		fistname.sendKeys("Suraj");
	}
	
	public void SetAmazonRegistrationPageMobileNo() {
		mobile_no.sendKeys("1234567890");
	}
	
	public void SetAmazonRegistrationPageEmail() {
		email.sendKeys("abc123@gmail.com");
	}
	
	public void SetAmazonRegistrationPagePassword() {
		password.sendKeys("abc123");
	}
	
	public void ClickAmazonRegistrationPageContinuebtn() {
		continue_btn.click();
	}
}
