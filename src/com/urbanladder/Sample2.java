package com.urbanladder;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/TYSS/Desktop/page1.html");
		
		System.out.println("num of people working in whale project");
		List<WebElement> Whaleproject=driver.findElements(By.xpath("//tr/td[text()='Whale']"));
		int count=Whaleproject.size();
		System.out.println(count);
		
		System.out.println("Time spent by girish on project whale");
		WebElement time=driver.findElement(By.xpath("//*[text()='girish']/parent::tr/td[text()='Whale']/parent::tr/td[3]"));
		System.out.println(time.getText());	
		
		System.out.println("Time spent by girish on all project");
		List<WebElement> time1=driver.findElements(By.xpath("//*[text()='girish']/parent::tr/td[3]"));
		Double t=(double) 0;
	
		for(int h=0;h<time1.size();h++) {
			String tme=time1.get(h).getText();
			Double f=Double.parseDouble(tme);
			t=t+f;
		
			}
		System.out.println(t);
		
		
		System.out.println("Unique names");
		List<WebElement> Uniquenames=driver.findElements(By.xpath("//tr/td[1]"));
		HashSet<String> un=new HashSet<>();
		for(int j=0;j<Uniquenames.size();j++) {
		String text=Uniquenames.get(j).getText();
		un.add(text);
		}
		System.out.println(un);
		
		System.out.println("Print the project worked by Girish");
		List<WebElement> Projects=driver.findElements(By.xpath("//tr/td[text()='girish']/parent::tr/td[2]"));
		for(int i=0;i<Projects.size();i++) {
			System.out.println(Projects.get(i).getText());
		}
		
		driver.close();
		
	}

}
