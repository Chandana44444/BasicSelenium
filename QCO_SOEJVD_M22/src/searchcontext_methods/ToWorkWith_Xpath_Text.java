package searchcontext_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWith_Xpath_Text {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("//a[text()='Register']")).click();
	System.out.println("after clicking on register link:"+driver.getTitle());
	Thread.sleep(5000);
	driver.close();
}
}
