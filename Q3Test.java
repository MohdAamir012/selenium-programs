package assignment_3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import caseStudy.Browser;

public class Q3Test {

	WebDriver driver;
	Q3 q3;
	
	@BeforeClass
	public void startBrowser() {
		driver = Browser.StartBrowser("Chrome", "https://www.path2usa.com/travel-companion/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		q3 =new Q3(driver);
	}
	
	@Test
	public void fillForm() {
		int i=0;
		q3.setFrom("del");
		q3.takeScreenShot(i++);
		q3.setTO("bom");
		q3.takeScreenShot(i++);
		q3.setDate();
		q3.takeScreenShot(i++);
		q3.setDuration("+ - 2 Weeks");
		q3.takeScreenShot(i++);
		q3.setAirline("Air India");
		q3.takeScreenShot(i++);
		q3.setLanguage("English");
		q3.takeScreenShot(i++);
		q3.submit();
		q3.takeScreenShot(i++);
	}
	@AfterClass
	public void close() {
		Delay.delay(5);
		driver.close();
	}
}
