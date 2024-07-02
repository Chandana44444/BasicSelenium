package searchcontext_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWith_Contains_Text {
public static void main(String[] args) throws InterruptedException {
	//launch empty chrome browser
	ChromeDriver driver=new ChromeDriver();
	//maximising the window
	driver.manage().window().maximize();
	//navigating to an application
	driver.get("https://demowebshop.tricentis.com/");
	//finding an element and clicking on it
	driver.findElement(By.xpath("(//a[contains(text(),'Build')])[3]")).click();
	//waiting 
	Thread.sleep(5000);
	//closing the browser
	driver.close();
}
}
