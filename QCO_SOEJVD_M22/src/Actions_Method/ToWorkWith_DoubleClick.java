package Actions_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToWorkWith_DoubleClick {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/product.php?product=testing");
	WebElement add_btn = driver.findElement(By.id("add"));
	Actions act=new Actions(driver);
	act.doubleClick(add_btn).perform();
}
}
