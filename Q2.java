package assignment_3;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Q2 {
	WebDriver driver;
	By services = By.xpath("//a[@id=\"h-Services\"]");
	By DA =By.xpath("//a[@href=\"/data-analytics\"]");
	By DE =By.xpath("//a[@id=\"h-Services\"]/following-sibling::ul/li/a[contains(text(),\"Digital Engineering\")]");
	By CD =By.xpath("//a[@href=\"/cloud-devops\"]");
	By CX =By.xpath("//a[@href=\"/cx\"]");
	By OTT=By.xpath("//a[@href=\"/ott-solutions-services\"]");
	By DM =By.xpath("//a[@href=\"/digital-marketing\"]");
	public Q2(WebDriver driver) {
		this.driver = driver;
	}
	

	public void verifyDE() {
		List< WebElement > service = driver.findElements(services);
		List <WebElement> DEl =driver.findElements(DE);
		Actions action = new Actions(driver);
		action.moveToElement(service.get(1)).perform();
		Delay.delay(2);
		action.moveToElement(DEl.get(1)).click().build().perform();
		String t ="Digital Engineering | TO THE NEW";
		Assert.assertEquals(driver.getTitle(), t,"loaded succesfully");		
		
	}
	public void verifyCD() {
		List< WebElement > service = driver.findElements(services);
		List <WebElement> DEl =driver.findElements(CD);
		Actions action = new Actions(driver);
		action.moveToElement(service.get(1)).perform();
		Delay.delay(2);
		action.moveToElement(DEl.get(1)).click().build().perform();
		String t ="Cloud & DevOps | TO THE NEW";
		Assert.assertEquals(driver.getTitle(), t,"loaded succesfully");		
		
	}
	public void verifyOTT() {
		List< WebElement > service = driver.findElements(services);
		List <WebElement> DEl =driver.findElements(OTT);
		Actions action = new Actions(driver);
		action.moveToElement(service.get(1)).perform();
		Delay.delay(2);
		action.moveToElement(DEl.get(1)).click().build().perform();
		String t ="OTT Solutions & Services | TO THE NEW";
		Assert.assertEquals(driver.getTitle(), t,"loaded succesfully");		
		
	}
	public void verifyDA() {
		List< WebElement > service = driver.findElements(services);
		List <WebElement> DEl =driver.findElements(DA);
		Actions action = new Actions(driver);
		action.moveToElement(service.get(1)).perform();
		Delay.delay(2);
		action.moveToElement(DEl.get(1)).click().build().perform();
		String t ="Data & Analytics | TO THE NEW";
		Assert.assertEquals(driver.getTitle(), t,"loaded succesfully");		
		
	}
	public void verifyCX() {
		List< WebElement > service = driver.findElements(services);
		List <WebElement> DEl =driver.findElements(CX);
		Actions action = new Actions(driver);
		action.moveToElement(service.get(1)).perform();
		Delay.delay(2);
		action.moveToElement(DEl.get(1)).click().build().perform();
		String t ="CX, Content & Commerce | TO THE NEW";
		Assert.assertEquals(driver.getTitle(), t,"loaded succesfully");		
	}
	public void verifyDM() {
		List< WebElement > service = driver.findElements(services);
		List <WebElement> DEl =driver.findElements(DM);
		Actions action = new Actions(driver);
		action.moveToElement(service.get(1)).perform();
		Delay.delay(2);
		action.moveToElement(DEl.get(1)).click().build().perform();
		String t ="Digital Marketing Services - DigitDal Marketing Company";
		Assert.assertEquals(driver.getTitle(), t,"loaded succesfully");		
	}
	public void takeScreenShot(int i) {
		String dest = "D://NewFolder//images//ss"+i+".png";
		File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(ss,new File(dest));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
