package webelement_methods;

import java.io.Serial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWith_GetAttribute {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	WebElement search_text_field = driver.findElement(By.id("small-searchterms"));
	System.out.println("value:"+search_text_field.getAttribute("value"));
	search_text_field.sendKeys("computers");
	System.out.println("value:"+search_text_field.getAttribute("value"));
	Thread.sleep(3000);
	driver.close();
}
}
