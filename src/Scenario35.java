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
	   	WebElement slider = driver.findElement(By.xpath("//div[@id='slider']/span"));
	    Actions builder = new Actions(driver);
	 //   org.openqa.selenium.Dimension cursor=slider.getSize();
	  //  int width=cursor.getWidth();
	//    int x=slider.getLocation().getX();
	    for(int i=0;i<101;i+=10) {
	    	Thread.sleep(200);
	    	builder.clickAndHold(slider).moveByOffset(i,0).perform();
	    	//x=x+width;
	    }
	 //   int y=slider.getLocation().getX();
	    for(int j=100;j>0;j-=10) {
	    	Thread.sleep(300);
	    	builder.clickAndHold(slider).moveByOffset(-j,0).perform();
	    //	y=y+width;
	    }
	    
Thread.sleep(1000);	
driver.close();
}
}
