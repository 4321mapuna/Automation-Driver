import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;








public class ExerciseOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AJITHKUMAR\\eclipse-workspace\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//Selecting radiobutton 1
		Driver.findElement(By.xpath("//div[@id='radio-btn-example']/fieldset/label[1]/input ")).click();
		//verifying selection
        Assert.assertTrue( Driver.findElement(By.xpath("//div[@id='radio-btn-example']/fieldset/label[1]/input ")).isSelected());
        //Selecting radiobutton 2
        Driver.findElement(By.xpath("//div[@id='radio-btn-example']/fieldset/label[2]/input ")).click();
        //verifying selection
        Assert.assertTrue( Driver.findElement(By.xpath("//div[@id='radio-btn-example']/fieldset/label[2]/input ")).isSelected());
        //Selecting radiobutton 3
        Driver.findElement(By.xpath("//div[@id='radio-btn-example']/fieldset/label[3]/input ")).click();
        //verifying selection
        Assert.assertTrue( Driver.findElement(By.xpath("//div[@id='radio-btn-example']/fieldset/label[3]/input ")).isSelected());
	}

}
