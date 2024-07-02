package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWork_ImplicitWait {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	driver.get("https://www.shoppersstack.com/");
	driver.findElement(By.xpath("//span[text()='APPLE']")).click();
	driver.close();
}
}
