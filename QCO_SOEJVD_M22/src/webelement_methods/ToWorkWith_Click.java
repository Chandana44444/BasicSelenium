package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWith_Click {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	WebElement register_link = driver.findElement(By.linkText("Register"));
	register_link.click();
	System.out.println(driver.getTitle());
	Thread.sleep(3000);
	driver.close();
}
}
