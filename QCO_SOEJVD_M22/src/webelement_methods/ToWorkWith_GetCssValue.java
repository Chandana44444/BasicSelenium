package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWith_GetCssValue {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	WebElement ele = driver.findElement(By.linkText("Register"));
	System.out.println("color of web element: "+ele.getCssValue("color"));
	System.out.println("value:"+ele.getCssValue("yguy"));
	Thread.sleep(3000);
	driver.close();
}
}
