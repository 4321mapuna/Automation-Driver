import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ExerciseSix {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJITHKUMAR\\eclipse-workspace\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Driver.findElement(By.xpath("//a[@ id='opentab']")).click();
		   Set<String>win = Driver.getWindowHandles();
		   Iterator<String> nxt = win.iterator();
		   String par = nxt.next();
		   String chi = nxt.next();
		   Driver.switchTo().window(chi);//switching to child url
		   Assert.assertTrue( true, Driver.getCurrentUrl());//verifying the correct url
		   Thread.sleep(3000);
		   Driver.close();
		   Driver.switchTo().window(par);// switching  to parent url
		   Assert.assertTrue( true, Driver.getCurrentUrl());//verifying the parent url
		   Thread.sleep(500);
		   

	}

}
