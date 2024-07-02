package searchcontext_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWith_Contains_Attribute {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.nykaafashion.com/");
	driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys("kids");
	Thread.sleep(5000);
//	driver.close();
}
}
