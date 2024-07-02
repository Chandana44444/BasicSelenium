package Actions_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToWorkWith_Scroll {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	Actions act=new Actions(driver);
	act.scrollByAmount(0, 400).perform();//down
	Thread.sleep(2000);
	act.scrollByAmount(0, -400).perform();//up
}
}
