package org.sample;

	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.io.File;
	import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

//1
public static WebDriver driver;
public static JavascriptExecutor j;

//2 
public static void chromeBrowser() {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Pradeep\\workspace\\JavaProject\\drivers\\chromedriver.exe");	
driver = new ChromeDriver();
}

//3
public static void maxWindow() {
driver.manage().window().maximize();
}
	
//4
public static void launchUrl(String Url) {
driver.get(Url);
}

//5
public static void getPageUrl() {
String txt = driver.getCurrentUrl();
System.out.println("Page Url : " +txt);
}

//6
public static void getPageTitle() {
String txt2 = driver.getTitle();
System.out.println("Page Title : "+ txt2);
}

//7
public static void passValue(WebElement element, String value) {
element.sendKeys(value);
}

//8
public static void getTargetText(WebElement element) {
System.out.println("Target text : "+element.getText());
}

//9
public static void getTargetAttribute(WebElement element , String attributeValue) {
System.out.println("Passed value : "+element.getAttribute(attributeValue));
}

//10
public static void targetClick(WebElement element2) {
element2.click();
}

//11 Robot class
public static void cut() throws AWTException {
Robot r = new Robot();
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_X);
r.keyRelease(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_X);
}

public static void paste() throws AWTException {
Robot r = new Robot();
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_V);
r.keyRelease(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_V);
}

public static void selectAll() throws AWTException {
Robot r = new Robot();
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_A);
r.keyRelease(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_A);
}

public static void enter() throws AWTException {
Robot r = new Robot();
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_ENTER);
}

public static void copy() throws AWTException {
Robot r = new Robot();
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_C);
r.keyRelease(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_C);
}

//12 Alert

public static void alertAccept() {
Alert a = driver.switchTo().alert();
a.accept();
}

public static void alertDismiss() {
Alert a = driver.switchTo().alert();
a.dismiss();
}

public static void alertPassMessage(String message) {
Alert a = driver.switchTo().alert();
a.sendKeys(message);
a.accept();
}

//13 TakeScreenshot

public static void screenshot(String FileName) throws IOException {

TakesScreenshot t = (TakesScreenshot)driver;
File src = t.getScreenshotAs(OutputType.FILE);
File f = new File ("D:\\java projects\\screenshots\\"+FileName+ ".png");
FileUtils.copyFile(src,f);
}

//14 Javascript Executor 

public static void javaScriptPassValue(WebElement element, String enterValue) {
 j = (JavascriptExecutor)driver;
j.executeScript("arguments[0].setAttribute('value','"+enterValue+"')",element);
}

public static void javaScriptClick(WebElement element) {
 j = (JavascriptExecutor)driver;
j.executeScript("aurguments[0].click()", element);
}

public static void javaScriptGetAttribute(WebElement element) {
JavascriptExecutor j = (JavascriptExecutor)driver;
j.executeScript("return arguments.getAtrribute('value')",element);
}

public static void scrollDown(WebElement element) {
JavascriptExecutor j = (JavascriptExecutor)driver;
j.executeScript("arguments[0].scrollIntoView(true)", element);
}

public static void ScrollUp(WebElement element) {
JavascriptExecutor j = (JavascriptExecutor)driver;
j.executeScript("arguments[0].scrollIntoView(false)", element);

}

//14 waits

public static void implicitWaiting(int sec) {

driver.manage().timeouts().implicitlyWait(Duration.ofMillis(sec));



driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
	
}
//
public static void closeBrowser() {
driver.close();

}



public static void bhun() {

	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
	
	
}


}

	
	

