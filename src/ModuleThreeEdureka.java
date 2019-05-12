import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModuleThreeEdureka {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		//Launch Chrome browser using Selenium WebDriver
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//Navigate to “https://www.edureka.co/”
		//driver.get("https://www.edureka.co/");
		driver.navigate().to("https://www.edureka.co/");
		//Maximise the Browser Window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		//driver.manage().window().setTimeout(arguments[arguments. Length-1], 500);
		driver.findElement(By.id("search-inp")).click();
		driver.findElement(By.id("search-inp")).sendKeys("Selenium");
		driver.findElement(By.id("search-button-top"));
		assertTrue(driver.getTitle().contains("Selenium 3.0 WebDriver Online Training"));
		driver.navigate().back();
		
		// TODO Auto-generated method stub

	}

	private static void assertTrue(boolean contains) {
		// TODO Auto-generated method stub
		
	}

}
