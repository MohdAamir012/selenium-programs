package assignment_3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import caseStudy.Browser;

public class Q4Test {
	WebDriver driver;
	Q4 q4;

	public void delay(int n) {
		try {
			Thread.sleep(n * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@BeforeClass
	public void startBrowser() {
		driver = Browser.StartBrowser("Chrome", "https://www.tothenew.com/ ");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		q4 = new Q4(driver);
	}

	@Test(priority = -1)
	public void scrollToBottm() {
		q4.scrollToBottom();
		delay(2);
	}
	@Test(priority = 0)
	public void scrollToTop() {
		q4.scrollToTop();
		delay(2);
	}
	@Test(priority = 2)
	public void scrollDown() {
		q4.scrollDownByPixel();
		delay(2);
	}
	@Test(priority = 3)
	public void scrollUp() {
		q4.scrollUpByPixel();
		delay(2);
	}
	@AfterClass
	public void close() {
		delay(2);
		driver.close();
	}
}
