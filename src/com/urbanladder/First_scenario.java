package com.urbanladder;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class First_scenario {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://www.urbanladder.com");

driver.findElement(By.partialLinkText("Close")).click();
System.out.println("first element");
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
List<WebElement> mainmenu = driver.findElements(By.xpath("//div/ul[@class='topnav bodytext']/li"));

System.out.println("Number of elements:" +mainmenu.size());

for (int i=0; i<mainmenu.size();i++){
  System.out.println("main menu is:" + mainmenu.get(i).getText());
 
 // String text=mainmenu.get(i).getText();
  String xpath_parameter="//div/div/ul[@class='inline-list left']";
		  // "//li/span[contains(text(),'"+text+"')]";
		  
	WebElement submenu=driver.findElement(By.xpath(xpath_parameter));
	Actions mouseover=new Actions(driver);
	mouseover.moveToElement(submenu).build().perform();
	List<WebElement> submenulist = driver.findElements(By.xpath(xpath_parameter));
	System.out.println("Number of elements:" +submenulist.size());

	for (int j=0; j<submenulist.size();j++){
	  System.out.println("sub menu is:" + submenulist.get(j).getText());
  
}
//for ( WebElement menu: mainmenu) {
//	String text = menu.getText();
//	System.out.println("text is"+text);
//}
	


}

		
		
	}

}