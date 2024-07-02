package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWith_GetRect {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/login");
	WebElement email_field = driver.findElement(By.id("Email"));
	WebElement pwd_field = driver.findElement(By.id("Password"));
	System.out.println("x value of email: "+email_field.getRect().getX());
	System.out.println("x value of pwd: "+pwd_field.getRect().getPoint().getX());
	System.out.println("***************");
	System.out.println("Height of email:"+email_field.getRect().getHeight());
	System.out.println("Width of email:"+email_field.getRect().getWidth());
	System.out.println("***************");
	System.out.println("Height of pwd:"+pwd_field.getRect().getHeight());
	System.out.println("Width of pwd:"+pwd_field.getRect().getWidth());//instead of getDimension can call like this also
	Thread.sleep(4000);
	driver.close();
}
}
