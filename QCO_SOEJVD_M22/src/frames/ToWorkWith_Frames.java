package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWith_Frames {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.dream11.com/");
//	driver.switchTo().frame(0);
//	driver.switchTo().frame("send-sms-iframe");
	WebElement frame = driver.findElement(By.cssSelector("iframe[id=\"send-sms-iframe\"]"));
	driver.switchTo().frame(frame);
	driver.findElement(By.id("regEmail")).sendKeys("iubhuj");
	driver.switchTo().defaultContent();//main html
	driver.findElement(By.id("hamburger")).click();
	
}
}
