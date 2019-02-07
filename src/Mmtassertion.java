	import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	
public class Mmtassertion {
	

		public static void main(String[] args) throws InterruptedException {
	 	   	 System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
	   	 WebDriver  driver=new ChromeDriver();
	   	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	   	 driver.get("https://www.makemytrip.com/");
	   	driver.manage().window().maximize();
	   	driver.findElement(By.xpath("//div/div/input[@id='hp-widget__sTo']")).sendKeys("Bellary");
	   	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
	//	String xp="//div[@class='dateFilter hasDatepicker']/descendant::table/tbody/descendant::tr/td[@class=' ui-datepicker-days-cell-over  ui-datepicker-current-day ui-datepicker-today']"
		driver.findElement(By.xpath("//div[@class='inputM depart_input inputHlp inputDateFilter']")).click();
	String day=driver.findElement(By.xpath("//tr/td[@class=' ui-datepicker-days-cell-over  ui-datepicker-current-day ui-datepicker-today']/a[@class='ui-state-default ui-state-highlight ui-state-active ui-state-hover']")).getText();
	String month=driver.findElement(By.xpath("//div[@class='dateFilter hasDatepicker']/descendant::div[@class='ui-datepicker-title'][1]/span[@class='ui-datepicker-month']")).getText();
	String year=driver.findElement(By.xpath("//div[@class='dateFilter hasDatepicker']/descendant::div[@class='ui-datepicker-title'][1]/span[@class='ui-datepicker-year']")).getText();
System.out.println(day);
	String mmm=month.substring(0, 3);
String m=mmm.substring(0, 1);
String mm=mmm.substring(1).toLowerCase();
String Mmm=m+mm;
String date=day+" "+Mmm+" "+year;
System.out.println(date);
LocalDate wdate=LocalDate.parse(date,DateTimeFormatter.ofPattern("d MMM uuuu"));
System.out.println(wdate);
if(wdate.equals(localDate))
{
	wdate=localDate.plusDays(30);
}
else
{
	System.out.println("app date is not same as current date");
}
String webNextmnth = driver.findElement(By.xpath("//div[@class='dateFilter hasDatepicker']/descendant::div[@class='ui-datepicker-title'][2]/span[@class='ui-datepicker-month']")).getText();
String webyear = driver.findElement(By.xpath("//div[@class='dateFilter hasDatepicker']/descendant::div[@class='ui-datepicker-title'][2]/span[@class='ui-datepicker-year']")).getText();
 Month nextMonth = wdate.getMonth();
int dDay = wdate.getDayOfMonth();
 System.out.println("month is "+nextMonth.toString());
 System.out.println("xpath month is "+webNextmnth);
int nextMyear=wdate.getYear();
if(webNextmnth.equalsIgnoreCase(nextMonth.toString()))
{
	driver.findElement(By.xpath("//div[@class='dateFilter hasDatepicker']/descendant::div[@class='ui-datepicker-group ui-datepicker-group-last']/descendant::td[@data-handler='selectDay']/a[.='"+dDay+"']")).click();;
}
//<a class="ui-state-default ui-state-hover" href="#">7</a>
		driver.close();
	}

}
