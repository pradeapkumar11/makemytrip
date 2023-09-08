package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MakeMyTrip extends BaseClass{

public static void main(String[] args) throws InterruptedException {
	
chromeBrowser();

launchUrl("https://www.makemytrip.com/");
	
maxWindow();

implicitWaiting(5000);

driver.switchTo().frame(14);

implicitWaiting(5000);

WebElement close1 = driver.findElement(By.xpath("//img[@id='second-img']"));
	
targetClick(close1);

implicitWaiting(55);
}
	
	
}
