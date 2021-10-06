import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExerciseSeven {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJITHKUMAR\\eclipse-workspace\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 Driver.findElement(By.xpath("//input[@id='name']")).sendKeys("John");// sending text 
		   Driver.findElement(By.xpath("//input[@id='alertbtn']")).click();//selecting the alert message
		   Thread.sleep(500);
		   Driver.switchTo().alert().accept();//accepting the alert box
	}

}
