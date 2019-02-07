import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario12 {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		   	 WebDriver  driver=new ChromeDriver();
		   	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 	driver.get("https://www.bluestone.com/");
		   	driver.manage().window().maximize();
		   WebElement offers=driver.findElement(By.xpath("//nav/ul/li/a[contains(text(),'Offers ')]"));
			   Actions mouse_hover=new Actions(driver);
			   mouse_hover.moveToElement(offers).build().perform();
			   Thread.sleep(500);
			   driver.findElement(By.xpath("//div/ul/li/span[contains(text(),'75% off on Making Charge')]")).click();
			   Thread.sleep(100);
			   List<WebElement> offer=driver.findElements(By.xpath("//div[@class='pr-i lazy-bg']/span[@class='offers-wrapper']/span/span[contains(text(),'75% off on making charge')]"));
			   String text=offer.get(1).getText();
			//   System.out.println(text);
			  String Expres="75% OFF ON MAKING CHARGE";
			   if(text.contains(Expres)) {
			  System.out.println("75% OFF ON MAKING CHARGE is verified");
			   } 
			   driver.close();
	}

}
