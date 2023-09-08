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

maxWindow();

<<<<<<< HEAD
//exit the pgm
=======
implicitWaiting(25);

implicitWaiting(10111111);
>>>>>>> eda43252d75a5fc3aa7532950c6cf55401d2c7a4
}
	
	
}
