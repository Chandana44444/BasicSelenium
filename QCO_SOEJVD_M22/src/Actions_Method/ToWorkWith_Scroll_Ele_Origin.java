package Actions_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class ToWorkWith_Scroll_Ele_Origin {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.linkText("Simple Computer"));
	Actions act=new Actions(driver);
	ScrollOrigin ref=ScrollOrigin.fromElement(ele);
	act.scrollFromOrigin(ref, 0, 200).perform();
//	act.click(ele).perform();
}
}
