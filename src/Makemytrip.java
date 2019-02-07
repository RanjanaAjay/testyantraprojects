import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Makemytrip {

	 public static void main(String[] args) throws InterruptedException {
 	   	 System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
   	 WebDriver  driver=new ChromeDriver();
   	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
   	 driver.get("https://www.makemytrip.com/");
  // 	 driver.findElement(By.xpath("//div/div/input[@id='hp-widget__sfrom']")).sendKeys("Bangalore,India");
   	driver.findElement(By.xpath("//div/div/input[@id='hp-widget__sTo']")).sendKeys("Bellary");
   	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	LocalDate localDate = LocalDate.now();
	driver.findElement(By.xpath("//div[@class='inputM depart_input inputHlp inputDateFilter']")).click();
	LocalDate dateplus = localDate.plusDays(30);
	LocalDate monthplus=localDate.plusMonths(1);
  String datexpath="//div[@class='ui-datepicker-group ui-datepicker-group-last']/table/tbody/tr/td[@data-month='2' and @data-year='2019']/a[text()='5']";
	//WebElement date=driver.findElement(By.xpath("//div[@class='inputM depart_input inputHlp inputDateFilter']/input"));
	driver.findElement(By.xpath(datexpath)).click();
//	System.out.println(dtf.format(localDate));
	//verify default departure date
//	String dateinapp=date.getText();
//	System.out.println(dateinapp);
	driver.findElement(By.xpath("//input[@id='hp-widget__return']")).click();
	Thread.sleep(100);
	driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']/table/tbody/tr/td[@data-month='3' and @data-year='2019']/a[text()='5']")).click();
	Thread.sleep(100);
	driver.findElement(By.id("searchBtn")).click();
	Thread.sleep(100);
	
	
	driver.close();
	}

}
