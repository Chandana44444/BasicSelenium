package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWith_Selected {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/register");
	System.out.println("before:gender is selected/not?"+driver.findElement(By.id("gender-female")).isSelected());
	driver.findElement(By.id("gender-female")).click();
	System.out.println("after:gender is selected/not?"+driver.findElement(By.id("gender-female")).isSelected());
	Thread.sleep(3000);
	driver.close();
}
}
