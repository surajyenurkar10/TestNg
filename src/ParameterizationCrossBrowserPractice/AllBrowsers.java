package ParameterizationCrossBrowserPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AllBrowsers {

	WebDriver driver;
	
	@Parameters("browser")
	@Test(priority = 1)
	public void CrossBrowserTesting(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\SQL2019\\SeleniumAlljarfiles\\Chrome_driver_version(104)\\chromedriver.exe");
			driver =new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\SQL2019\\SeleniumAlljarfiles\\Firefox\\geckodriver.exe");
		    driver = new FirefoxDriver();
		}else {
			System.out.println("Wrong Browser Name Selected");
		}
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(priority = 2)
	public void VerifyCurrentUrl() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");
	}
	
	@Test(priority = 3)
	public void VerifyPageTitle() {
		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
		}
	
	@Test(priority = 4)
	public void VerifyUsernameField() {
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		Assert.assertTrue(username.isDisplayed());
		username.sendKeys("suraj");
	}
	
	@Test(priority = 5)
	public void VerifyPasswordField() {
		WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		Assert.assertTrue(password.isDisplayed());
		password.sendKeys("suraj123");
	}
	
	@Test(priority = 6)
	public void VerifyLoginBtn() {
		WebElement loginbtn = driver.findElement(By.xpath("//button[@type='submit']"));
		Assert.assertTrue(loginbtn.isEnabled());
		loginbtn.click();
	}
	}
