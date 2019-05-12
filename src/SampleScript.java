import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleScript {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("#u_0_j")).click();
		driver.findElement(By.cssSelector("#u_0_j")).sendKeys("Swapnil");
		
		// TODO Auto-generated method stub

	}

}
