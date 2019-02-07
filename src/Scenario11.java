import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario11 {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		   	 WebDriver  driver=new ChromeDriver();
		   	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 	driver.get("https://www.bluestone.com/");
		   	driver.manage().window().maximize();
		   WebElement offers=driver.findElement(By.xpath("//nav/ul/li/a[contains(text(),'Offers ')]"));
			   Actions mouse_hover=new Actions(driver);
			   mouse_hover.moveToElement(offers).perform();
			   Thread.sleep(500);
			   driver.findElement(By.xpath("//div/ul/li/span[contains(text(),'0% Making Charge')]")).click();
			   Thread.sleep(100);
			   List<WebElement> offer=driver.findElements(By.xpath("//div[@class='pr-i lazy-bg']/span[@class='offers-wrapper']/span/span[contains(text(),'0% making charge')]"));
			   String text=offer.get(1).getText();
			   String Expres="0% MAKING CHARGE";
			   if(text.contains(Expres)) {
				   System.out.println("0% MAKING CHARGE");
			   } 
			   int count=0;
			   for(int i=0;i<offer.size();i++)
			   {
				   if(text.contains(offer.get(i).getText())) {
					  count++;
				   } 
				   else {
					   System.out.println("All products are not 0% making charges");
					   break;
				   }
				
			   }
			   if(offer.size()==count) {
				   System.out.println("sAll products are of 0% making charges");
			   }
			   driver.close();
	}

}
