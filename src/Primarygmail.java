
	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Primarygmail {

	    public static void main(String[] args) throws InterruptedException {
	 	   	 System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
	   	 WebDriver  driver=new ChromeDriver();
	   	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	   	
	   	 
	   	 driver.get("http://www.gmail.com");
	   	 //login to app
	   	 driver.findElement(By.id("identifierId")).sendKeys("vranjana7");
	   	 driver.findElement(By.className("CwaK9")).click();
	   	 driver.findElement(By.name("password")).sendKeys("manual@7",Keys.ENTER);
	   	 Thread.sleep(500);
	    //    driver.findElement(By.xpath("(//div[@class='Vwe4Vb MbhUzd'])[1]")).click();
	   	 WebElement primary=driver.findElement(By.xpath("//div[@aria-label='Primary']"));
	   	 String str=primary.getAttribute("aria-selected");
	   	 if(str.equals("true"));
	   	 else
	   		 primary.click();
	   	 List<WebElement> mails=driver.findElements(By.xpath("//div[@class='Cp']/div/table/tbody/tr"));
	   //---count of emails
	   	 int count=mails.size();
	   	 System.out.println(count);
	   	 
	   	 
	   	 
	   	 
	   	 driver.close();
	    }

	}

