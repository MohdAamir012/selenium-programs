package assignment_3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import caseStudy.Browser;

public class Q2Test {
	WebDriver driver;
	Q2 q2;
		@BeforeClass
public void starBrowser() {
	driver=Browser.StartBrowser("Chrome", "https://www.tothenew.com/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	q2 = new Q2(driver);
}
	@Test
	public void test()
	{
		int i=10;
		q2.verifyDE();
		q2.takeScreenShot(i++);
		Delay.delay(2);
		q2.verifyCD();
		q2.takeScreenShot(i++);
		Delay.delay(2);
		q2.verifyOTT();
		q2.takeScreenShot(i++);
		Delay.delay(2);
		q2.verifyDA();
		q2.takeScreenShot(i++);
		Delay.delay(2);
		q2.verifyCX();
		q2.takeScreenShot(i++);
		Delay.delay(2);
		q2.verifyDM();
		q2.takeScreenShot(i++);
	}
	@AfterClass
	public void close() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}
}
