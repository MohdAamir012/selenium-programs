package assignment_3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Q1 {
WebDriver driver;
By fn=By.xpath("//input[@placeholder=\"First Name\"]");
By ln=By.xpath("//input[@placeholder=\"Last Name\"]");
By add=By.xpath("//textarea[@ng-model=\"Adress\"]");
By emailAdd =By.xpath("//input[@ng-model=\"EmailAdress\"]");
By phone =By.xpath("//input[@ng-model=\"Phone\"]");
By gender =By.xpath("//input[@value=\"FeMale\"]");
By hobbies =By.xpath("//input[@value=\"Movies\"]");
By langClick =By.xpath("//div[@id=\"msdd\"]"); //handle by robot class
By selectSkill =By.xpath("//select[@id=\"Skills\"]");
By selectCountry1 =By.xpath("//select[@id=\"countries\"]");
By selectCounry2 =By.xpath("//span[@class=\"select2-selection select2-selection--single\"]");
By selectCountryValue = By.xpath("//input[@class=\"select2-search__field\"]");
By selectYear =By.xpath("//select[@placeholder=\"Year\"]");
By selectMonth =By.xpath("//select[@placeholder=\"Month\"]");
By selectDays =By.xpath("//select[@placeholder=\"Day\"]");
By passwd = By.xpath("//input[@id=\"firstpassword\"]");
By confPasswd =By.xpath("//input[@id=\"secondpassword\"]");
By submitBtn = By.xpath("//button[@id=\"submitbtn\"]");

public Q1(WebDriver driver) {
	this.driver=driver;
}

public void setFirstName(String s) {
	driver.findElement(fn).sendKeys(s);
}
public void setLastName(String s) {
	driver.findElement(ln).sendKeys(s);
}
public void setAdd(String s) {
	driver.findElement(add).sendKeys(s);
}
public void setEmail(String s) {
	driver.findElement(emailAdd).sendKeys(s);
}
public void setPhone(String s) {
	driver.findElement(phone).sendKeys(s);
}
public void setGender() {
	driver.findElement(gender).click();
}
public void setHobby() {
	driver.findElement(hobbies).click();
}

public void setLanguage()  {
	driver.findElement(langClick).click();
	driver.findElement(By.xpath(" //a[contains(text(),\"Hindi\")]")).click();
}
public void setSkill() {
	Select objSelect =new Select(driver.findElement(selectSkill));
	objSelect.selectByVisibleText("C");
}
public void selectCountry(){
	driver.findElement(selectCounry2).click();
	driver.findElement(selectCountryValue).sendKeys("ind");
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
public void selectDOB() {
	Select objSelect1 =new Select(driver.findElement(selectYear));
	objSelect1.selectByVisibleText("1999");
	Select objSelect2 =new Select(driver.findElement(selectMonth));
	objSelect2.selectByVisibleText("April");
	Select objSelect3 =new Select(driver.findElement(selectDays));
	objSelect3.selectByVisibleText("19");
}
public void setPassword(String s) {
	driver.findElement(passwd).sendKeys(s);
	driver.findElement(confPasswd).sendKeys(s);
}
public void submit() {
	driver.findElement(submitBtn).click();
}

}