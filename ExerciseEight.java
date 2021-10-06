import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExerciseEight {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJITHKUMAR\\eclipse-workspace\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)Driver;
		js.executeScript("window.scrollBy(0,700)");
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=500");
		

	}

}
