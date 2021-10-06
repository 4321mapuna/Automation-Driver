import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ExerciseFour {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJITHKUMAR\\eclipse-workspace\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 Assert.assertFalse(Driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());//verifying not selected
		   System.out.println((Driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected()));
		   Driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();//selecting checkbox 1
		   System.out.println((Driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected()));
		   Assert.assertTrue(Driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		   Thread.sleep(500);
		   
		   Driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();//deselecting checkbox 1
		   Thread.sleep(500);
		   Driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();//selecting checkbox 2
		   Assert.assertTrue(Driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).isSelected());//verifying selection
		   Thread.sleep(500);
		   Driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();//dselecting checkbox 2
		   Thread.sleep(500);
		   Driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();//selecting checkbox 3
		   Assert.assertTrue(Driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).isSelected());//verifying selection
		   Thread.sleep(500);
		   Driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();//dselecting checkbox 3
		   Thread.sleep(500);
		   
		   
		   //code for selecting all checkboxes
		   List<WebElement> opts = Driver.findElements(By.xpath("//input[@type='checkbox']"));
		   for(WebElement opt : opts)
		   {
			   opt.click(); 
			   Assert.assertTrue(Driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected());
		   }
		   Thread.sleep(500);
		  //Code for deselecting the checkboxes
		   for(WebElement opt : opts)
		   {
			   opt.click(); 
			   Assert.assertFalse(Driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected());
		   }
		   Thread.sleep(500);
	}

}
