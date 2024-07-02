package pop_up;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToWorkWith_Notification {
public static void main(String[] args) throws InterruptedException, AWTException {
//	ChromeOptions settings=new ChromeOptions();
//	settings.addArguments("--disable-notifications");//avoid
//	ChromeDriver driver=new ChromeDriver(settings);
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://in.puma.com/in");
	Thread.sleep(4000);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_TAB);//X
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_TAB);//Allow
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_TAB);//Block
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_ENTER);//click on Block
	r.keyRelease(KeyEvent.VK_TAB);//X
	r.keyRelease(KeyEvent.VK_ENTER);//X
	Thread.sleep(4000);
	driver.quit();
}
}
