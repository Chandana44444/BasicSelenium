package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWith_GetTagName {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	WebElement text_field = driver.findElement(By.id("small-searchterms"));
	System.out.println("tag used for developing is: "+text_field.getTagName());
	Thread.sleep(4000);
	driver.close();
}
}
