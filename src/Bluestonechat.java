import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Bluestonechat {

	public static void main(String[] args) throws InterruptedException {
		 	  System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		   	 WebDriver  driver=new ChromeDriver();
		   	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 	driver.get("https://www.bluestone.com/");
		   	driver.manage().window().maximize();
// wiz-iframe
		   	driver.switchTo().frame("wiz-iframe");
		   	driver.findElement(By.xpath("//span[@class='CT_BannerClose']")).click();
		   	Thread.sleep(200);
		   	driver.switchTo().defaultContent();
		   	//livechat-compact-view
		   //	driver.switchTo().frame("_hjRemoteVarsFrame");
		  	driver.switchTo().frame("livechat-compact-view");
		   	driver.findElement(By.id("content")).click();
		  	Thread.sleep(200);
		 	driver.switchTo().defaultContent();
		 	driver.switchTo().frame("livechat-full-view");
		  	
		  //div[@id='content']  email  container_4_4  container_10
		  	
		  	WebElement el1=driver.findElement(By.id("name"));
		  			el1.click();
		  	el1.sendKeys("rRanjana");
		  	driver.findElement(By.id("email")).sendKeys("remail@gmail.com");
		  	driver.findElement(By.id("container_4_4")).sendKeys("9912345666");
		  	driver.findElement(By.id("container_10")).click();
		  	//message-placeholder
		  	WebDriverWait wait = new WebDriverWait(driver,30);
		  	WebElement ele2;
		  	ele2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message-placeholder")));
		  	ele2.sendKeys("Good Morning");
		  	
}
}