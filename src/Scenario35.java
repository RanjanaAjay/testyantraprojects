import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Scenario35 {

	public static void main(String[] args) throws InterruptedException {
		// //div/span[@class='ui-slider-handle ui-corner-all ui-state-default']
		System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
	   	 WebDriver  driver=new ChromeDriver();
	   	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	 	driver.get("https://jqueryui.com/slider/");
	   	driver.manage().window().maximize();
	   	WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	   	driver.switchTo().frame(frame);
	   	WebElement slider = driver.findElement(By.id("slider"));
	    Actions builder = new Actions(driver);
	    org.openqa.selenium.Dimension cursor=slider.getSize();
	    int width=cursor.getWidth();
	    int x=slider.getLocation().getX();
	    for(int i=1;i<=2;i++) {
	    	Thread.sleep(2000);
	    	builder.clickAndHold(slider);
	    	builder.moveByOffset(x,0).build().perform();
	    	x=x+width;
	    }
	    int y=slider.getLocation().getX();
	    for(int j=2;j>=1;j--) {
	    	Thread.sleep(3000);
	    	builder.clickAndHold(slider);
	    	builder.moveByOffset(-y,0).build().perform();
	    	y=y+width;
	    }
	    
Thread.sleep(1000);	
driver.close();
}
}
