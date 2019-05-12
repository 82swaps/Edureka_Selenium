import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModuleFiveEdureka {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
		driver.get("https://www.edureka.co/");
		//driver.findElement(By.className("signin top-signin giTrackElementHeader hidden-xs")).click();
		driver.findElement(By.xpath("//*[@id=\"header-II\"]/section/nav/div/a[2]")).click();
		//driver.switchTo().alert().dismiss();
		//Alert alert = driver.switchTo().alert();
		//1.Login to the edureka
		driver.findElement(By.xpath("//*[@id=\"si_popup_email\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"si_popup_email\"]")).sendKeys("82swaps@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"si_popup_passwd\"]")).sendKeys("Singapore@2019");
		driver.findElement(By.xpath("//*[@id=\"new_sign_up_mode\"]/div/div/div[2]/div[3]/form/button")).click();
		//2. click on username to Navigate to My Profile
		driver.findElement(By.xpath("//*[@id=\"footauto\" ]/app-root/app-mycourse-main/section/app-header/header/nav/div/div[3]/ul/li[8]/div/button/span")).click();
		//clicking on my profile
		driver.findElement(By.xpath("//*[@id=\"footauto\"]/app-root/app-mycourse-main/section/app-header/header/nav/div/div[3]/ul/li[8]/div/ul/li[1]/a")).click();
		//clicking on edit button of professional details on my profile page 
		driver.findElement(By.xpath("//*[@id=\"professional_details\"]/i")).click();
		//editing professional details company name
		driver.findElement(By.xpath("//*[@id=\"onboarding\"]/div/div[1]/div[2]/div[2]/app-onboarding-professional-details/accordion/accordion-group/div/div[2]/div/form/div[1]/input")).click();
		//clicking on personal details
		driver.findElement(By.xpath("//*[@id=\"onboarding\"]/div/div[1]/div[1]/app-onboarding-leftnav/ul/li[4]/a")).click();
		//editing personal details current role
		driver.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/div/form/div[4]/input")).click();
		//clicking on continue
		driver.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/div/form/button")).click();
		//Clicking on next
		driver.findElement(By.xpath("//*[@id=\"onboarding\"]/div/div[1]/div[2]/div[2]/app-onboarding-professional-details/accordion/accordion-group/div/div[2]/div/form/button[2]")).click();
		//Clicking on next again
		driver.findElement(By.xpath("//*[@id=\"onboarding\"]/div/div[1]/div[2]/div[2]/app-onboarding-career-interests/accordion/accordion-group/div/div[2]/div/form/button[2]")).click();
		//Clicking on save
		driver.findElement(By.xpath("//*[@id=\"onboarding\"]/div/div[1]/div[2]/div[2]/app-onboarding-other-details/accordion/accordion-group/div/div[2]/div/form/div/button[1]")).click();
		//clicking on blog
		driver.findElement(By.xpath("//*[@id=\"footauto\"]/app-root/app-profile-main/app-footer/footer/div/div/div/div[1]/div[1]/ul/li[4]/a")).click();
		//clikcing on edureka logo to go to home page
		driver.findElement(By.xpath("/html/body/header/nav/a[2]/i")).click();
		//click on username to Navigate to My Profile
				driver.findElement(By.xpath("//*[@id=\"footauto\" ]/app-root/app-mycourse-main/section/app-header/header/nav/div/div[3]/ul/li[8]/div/button/span")).click();
		//clicking on logout
				driver.findElement(By.xpath("//*[@id=\"header-II\"]/section/nav/div/ul[2]/li[1]/ul/li[7]/a")).click();
	        
		// TODO Auto-generated method stub

	}

}
