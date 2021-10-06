import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ExerciseFive {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJITHKUMAR\\eclipse-workspace\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 Driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		   Set<String> windows =Driver.getWindowHandles();
	      Iterator<String> it=windows.iterator();
	      String parent=it.next();// getting parent window url
	      String child = it.next();//getting child window url
		   Driver.switchTo().window(child);// switching to child window
		   Thread.sleep(500);
		   Assert.assertTrue( true, Driver.getCurrentUrl());// verifying the urls are same
		   Driver.close();
		  
		   Driver.switchTo().window(parent);

	}

}
