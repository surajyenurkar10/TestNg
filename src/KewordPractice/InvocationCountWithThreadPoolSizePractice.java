package KewordPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationCountWithThreadPoolSizePractice {

	@Test(invocationCount=5,threadPoolSize=5)
	public void OpenBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SQL2019\\SeleniumAlljarfiles\\Chrome_driver_version(104)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		driver.close();
	}
}
