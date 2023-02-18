package WeekEndAssessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tamilmatrimony {
	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tamilmatrimony.in/");
		WebElement element = driver.findElement(By.xpath("//select[@id='REGISTERED_BY']"));
        Select option=new Select(element);
		option.selectByVisibleText("Myself");
		driver.findElement(By.xpath("//input[@id='NAME']")).sendKeys("Dharun");
		driver.findElement(By.xpath("//input[@id='gendermale']")).click();
        WebElement date = driver.findElement(By.id("DOBDAY"));
        Select date1=new Select(date);
        date1.selectByVisibleText("4");
        WebElement mon = driver.findElement(By.id("DOBMONTH"));
        Select month=new Select(mon);
        month.selectByVisibleText("Feb");
        WebElement yer = driver.findElement(By.id("DOBYEAR"));
        Select year=new Select(yer);
        year.selectByVisibleText("2002");
        WebElement reg = driver.findElement(By.id("RELIGION"));
        Select relegion=new Select(reg);
        relegion.selectByVisibleText("Hindu");
        WebElement lag = driver.findElement(By.id("MOTHERTONGUE"));
        Select language=new Select(lag);
        language.selectByVisibleText("Tamil");
        WebElement con = driver.findElement(By.id("COUNTRY"));
        Select country=new Select(con);
        country.selectByVisibleText("India");
        driver.findElement(By.xpath("//input[@id='MOBILENO']")).sendKeys("9488083682");
        driver.findElement(By.xpath("//input[@id='EMAIL']")).sendKeys("dharunkumard422@gmail.com");
        driver.close();
        }
	

}
