package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToWork_ExplicitWait {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	WebDriverWait explicitwait=new WebDriverWait(driver,Duration.ofSeconds(3));
	driver.get("https://www.shoppersstack.com/");
	driver.findElement(By.xpath("//span[text()='APPLE']")).click();
	driver.findElement(By.id("Check Delivery")).sendKeys("123456");
	WebElement btn = driver.findElement(By.id("Check"));
	explicitwait.until(ExpectedConditions.elementToBeClickable(btn));
	btn.click();
	driver.close();
}
}
