package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWith_SendKeys_Clear {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	WebElement search_text_field= driver.findElement(By.id("small-searchterms"));
	search_text_field.sendKeys("b","o","o","k","s",Keys.ENTER);
	Thread.sleep(3000);
//	search_text_field.clear();
//	Thread.sleep(3000);
//	search_text_field.sendKeys("computers");
//	Thread.sleep(3000);
	driver.close();
}
}
