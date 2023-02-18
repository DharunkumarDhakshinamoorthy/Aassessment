package WeekEndAssessment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UiBank {
	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://uibank.uipath.com/register-account");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.id("firstName")).sendKeys("DHARUN");
		WebElement title = driver.findElement(By.id("title"));
		Select option=new Select(title);
		option.selectByVisibleText("Mr");
		driver.findElement(By.id("middleName")).sendKeys("D");
		driver.findElement(By.id("lastName")).sendKeys("DHAKSHINAMOORTHY");
		WebElement element = driver.findElement(By.id("sex"));
		Select gender=new Select(element);
		gender.selectByVisibleText("Male");
		WebElement emp = driver.findElement(By.id("employmentStatus"));
		Select empstatus=new Select(emp);
		empstatus.selectByVisibleText("Full-time");
		driver.findElement(By.id("username")).sendKeys("DHARUNKUMAR DHAKSHINAMOORTHY");
		driver.findElement(By.id("email")).sendKeys("dharunkumard422@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123123");
		driver.close();
		
	}
}
