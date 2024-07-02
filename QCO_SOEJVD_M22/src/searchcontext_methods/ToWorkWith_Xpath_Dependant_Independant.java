package searchcontext_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWith_Xpath_Dependant_Independant {
public static void main(String[] args) throws InterruptedException {
	//launch empty chrome browser
	ChromeDriver driver=new ChromeDriver();
	//maximising the window
	driver.manage().window().maximize();
	//navigating to an application
	driver.get("https://demowebshop.tricentis.com/");
	//finding an element and clicking on it
	driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']/../../..//input[@value='Add to cart']")).click();
	//waiting 
	Thread.sleep(5000);
	//closing the browser
	driver.close();
}
}
