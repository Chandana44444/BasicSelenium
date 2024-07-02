package pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWith_FileUpload_01 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://resume.naukri.com/cv-submission");
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.id("infile"));
	ele.sendKeys("C:\\Users\\User\\Desktop\\Java_Selenium.pdf");
	Thread.sleep(4000);
//	driver.quit();
}
}
