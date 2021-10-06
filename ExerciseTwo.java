import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ExerciseTwo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJITHKUMAR\\eclipse-workspace\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 Driver.findElement(By.id("autocomplete")).sendKeys("united states");
	       Thread.sleep(500);
	       List <WebElement> options = Driver.findElements(By.xpath("//li[@class='ui-menu-item'][2]"));
		   for(WebElement option : options)
		   {
			   if(option.getText().equalsIgnoreCase("United States Minor Outlying Islands"))
			   {
				   option.click();
				   break;
			   }
		   
		   }
		  Assert.assertFalse(Driver.findElement(By.xpath("//li[@class='ui-menu-item'][2]")).getText().equalsIgnoreCase("United States Minor Outlying Islands")); 

	}

}
