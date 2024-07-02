package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToWork_FluentWait {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	FluentWait fw=new FluentWait(driver);
	fw.withTimeout(Duration.ofSeconds(4)).pollingEvery(Duration.ofMillis(100));
	driver.get("https://www.shoppersstack.com/");
	driver.findElement(By.xpath("//span[text()='APPLE']")).click();
	driver.findElement(By.id("Check Delivery")).sendKeys("123456");
	WebElement btn = driver.findElement(By.id("Check"));
	fw.until(ExpectedConditions.elementToBeClickable(btn));
	btn.click();
	driver.close();
}
}
