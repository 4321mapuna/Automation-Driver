import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ExerciseThree {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJITHKUMAR\\eclipse-workspace\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//Selecting dropdown option 1
		Driver.findElement(By.xpath("//select[@id='dropdown-class-example']/option[2]")).click();
		//verifying selection
		Assert.assertTrue(Driver.findElement(By.xpath("//select[@id='dropdown-class-example']/option[2]")).isSelected());
		 Thread.sleep(2000);
		//Selecting dropdown option 2
		 Driver.findElement(By.xpath("//select[@id='dropdown-class-example']/option[3]")).click();
		 //verifying selection
		 Assert.assertTrue(Driver.findElement(By.xpath("//select[@id='dropdown-class-example']/option[3]")).isSelected());
		 Thread.sleep(2000);
		//Selecting dropdown option 2
		 Driver.findElement(By.xpath("//select[@id='dropdown-class-example']/option[4]")).click();
		 //verifying selection
		 Assert.assertTrue(Driver.findElement(By.xpath("//select[@id='dropdown-class-example']/option[4]")).isSelected());
		   
	}

}
