package assignment_3;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import caseStudy.Browser;

public class Q1Test {
WebDriver driver;
Q1 q1;
@BeforeClass
public void startBrowser() {
	driver=Browser.StartBrowser("Chrome","https://demo.automationtesting.in/Register.html");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	q1 = new Q1(driver);
}

@Test 
public void fillForm()  {
	q1.setFirstName("Mohd");
	q1.setLastName("Aamir");
	q1.setAdd("Karol Bagh Delhi");
	q1.setEmail("aamir@ttn.com");
	q1.setPhone("9999999999");
	q1.setGender();
	q1.setHobby();
	q1.setLanguage();
	q1.setSkill();
	q1.selectCountry();
	q1.selectDOB();
	q1.setPassword("Aamir@123");
	q1.submit();
}

@AfterClass
public void close() {
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.close();
}
}
