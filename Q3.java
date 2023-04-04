package assignment_3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Q3 {

	WebDriver driver;
	By from = By.xpath("//input[@name=\"form_fields[travel_from]\"]");
	By to = By.xpath("//input[@name=\"form_fields[travel_to]\"]");
	By dot = By.xpath("//input[@name=\"form_fields[travel_comp_date]\"]");
	By incMonth =By.xpath("//span[@class=\"flatpickr-next-month\"]");
	By date =By.xpath("//div[@class=\"dayContainer\"]/child::span[30]");
	By duration = By.xpath("//select[@name=\"form_fields[travel_comp_date_between]\"]");
	By airLine =By.xpath("//select[@name=\"form_fields[travel_comp_airline]\"]");
	By language =By.xpath("//select[@name=\"form_fields[travel_comp_language]\"]");
	By submit = By.xpath("//span[@class=\"elementor-button-text\"]");
	public Q3(WebDriver driver) {
		this.driver=driver;
	}
	
	public void setFrom(String s) {
		driver.findElement(from).sendKeys(s);
		Delay.delay(2);
		Robot r;
		try {
			r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void setTO(String s) {
		driver.findElement(to).sendKeys(s);
		Delay.delay(2);
		Robot r;
		try {
			r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void setDate() {
	Actions a =new Actions(driver);
		driver.findElement(dot).click();
		Delay.delay(1);
		driver.findElement(incMonth).click();
		Delay.delay(1);
		driver.findElement(date).click();
	}
	public void setDuration (String s) {
		WebElement dur = driver.findElement(duration);
		Select sel =new Select(dur);
		sel.selectByVisibleText(s);
	}
	public void setAirline (String s) {
		WebElement al = driver.findElement(airLine);
		al.isEnabled();
		Select sel =new Select(al);
		sel.selectByVisibleText(s);
	}
	public void setLanguage (String s) {
		WebElement l = driver.findElement(language);
		Select sel =new Select(l);
		sel.selectByVisibleText(s);
	}
	public void submit() {
		driver.findElement(submit).click();
	}
	public void takeScreenShot(int i) {
		String dest = "D://NewFolder//images//ss"+i+".png";
		File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(ss,new File(dest));
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
