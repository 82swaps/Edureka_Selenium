import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.id("u_0_n")).click();
		driver.findElement(By.name("firstname")).click();
		//driver.findElement(By.id("u_0_n")).sendKeys("Swapnil");
		driver.findElement(By.name("firstname")).sendKeys("Swapnil");
		//driver.findElement(By.id("u_0_p")).sendKeys("Shrivastava");
		driver.findElement(By.name("lastname")).sendKeys("Shrivastava");
		//driver.findElement(By.className("inputtext _58mg _5dba _2ph-")).sendKeys("82swaps@gmail.com");
		driver.findElement(By.name("reg_email__")).sendKeys("82swaps@gmail.com");
		//driver.findElement(By.id("u_0_z")).sendKeys("NewPassword1");
		driver.findElement(By.name("reg_passwd__")).sendKeys("NewPassword1");
		driver.findElement(By.linkText("Forgotten account?")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.quit();
		// TODO Auto-generated method stub
	}

}
