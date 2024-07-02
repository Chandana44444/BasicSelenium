package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Query {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Log in")).click();
	System.out.println("after clicking:"+driver.getTitle());
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@value=\"Register\"]")).submit();
	Thread.sleep(3000);
	driver.close();
}
}
