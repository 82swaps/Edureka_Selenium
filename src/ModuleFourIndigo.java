import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModuleFourIndigo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goindigo.in/?linkNav=home_header");
		driver.findElement(By.id("oneWayTrip")).click();
		driver.findElement(By.name("or-src")).click();
		driver.findElement(By.name("or-src")).sendKeys("Bengaluru");
		driver.findElement(By.className("BLR")).click();
		driver.findElement(By.name("or-dest")).click();
		driver.findElement(By.name("or-src")).sendKeys("Lucknow");
		driver.findElement(By.className("LKO")).click();
		driver.findElement(By.className("Departure Date")).click();
		
		
		// TODO Auto-generated method stub

	}

}
