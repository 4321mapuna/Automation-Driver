import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ExerciseNine {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJITHKUMAR\\eclipse-workspace\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Actions a =new Actions(Driver);
		a.moveToElement(Driver.findElement(By.xpath("//button[@id='mousehover']"))).build().perform();// moving cursor to mouse over button
		WebElement sobj = Driver.findElement(By.xpath("//div[@class='mouse-hover-content']"));//creating a webelement for mouse over 
		sobj.findElement(By.xpath("//div[@class='mouse-hover-content']/a[1]")).click();//selecting top option
	}

}
