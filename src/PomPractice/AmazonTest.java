package PomPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AmazonTest {

	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver",  "C:\\SQL2019\\SeleniumAlljarfiles\\Chrome_driver_version(104)\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void teardown() {
		driver.close();
	}
	
	@Test
	public void AmazonRegistrationPageTest() {
		
		AmazonRegistration ar = new AmazonRegistration(driver);
		ar.VerifyAmazonLogo();
		ar.ClickOnSignLink();
		ar.ClickOnSignUpBtn();
		ar.SetAmazonRegistrationPageFirstname();
		ar.SetAmazonRegistrationPageMobileNo();
		ar.SetAmazonRegistrationPageEmail();
		ar.SetAmazonRegistrationPagePassword();
		ar.ClickAmazonRegistrationPageContinuebtn();
	}
}
