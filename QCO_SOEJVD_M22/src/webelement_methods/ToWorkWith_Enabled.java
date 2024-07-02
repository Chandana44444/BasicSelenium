package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWith_Enabled {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/register");
	System.out.println("buuton is enabled/not?"+driver.findElement(By.id("register-button")).isEnabled());
	Thread.sleep(3000);
	driver.close();
}
}
