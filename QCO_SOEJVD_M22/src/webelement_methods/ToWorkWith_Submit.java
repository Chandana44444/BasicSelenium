package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWith_Submit {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/login");
	WebElement login_btn = driver.findElement(By.xpath("//input[@value='Log in']"));
	login_btn.submit();
	Thread.sleep(3000);
	driver.close();
}
}
//css:tagname[attname='attval']
//xpath://tagname[@attname='attval']
