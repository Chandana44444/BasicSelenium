package pop_up;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWith_ChildWindow {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Twitter")).click();
	Set<String> all_windows_id = driver.getWindowHandles();
	for(String id:all_windows_id) {
		driver.switchTo().window(id);
		System.out.println(driver.getTitle());
		if(driver.getTitle().contains("X")) {
		System.out.println(driver.findElement(By.xpath("//span[text()='nopCommerce']")).isDisplayed());
	}	
	}
	Thread.sleep(3000);
	driver.quit();
}
}
