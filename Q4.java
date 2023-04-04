package assignment_3;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Q4 {
WebDriver driver;

public Q4(WebDriver driver) {
	this.driver=driver;
}

public void scrollToBottom() {
	JavascriptExecutor js =(JavascriptExecutor) driver;
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
}
public void scrollToTop() {
	JavascriptExecutor js =(JavascriptExecutor) driver;
	js.executeScript("window.scrollTo(0,0)");
}
public void scrollDownByPixel() {
	JavascriptExecutor js =(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,500)");
}
public void scrollUpByPixel() {
	JavascriptExecutor js =(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,-500)");
}
}
