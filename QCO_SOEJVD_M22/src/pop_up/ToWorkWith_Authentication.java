package pop_up;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToWorkWith_Authentication {
public static void main(String[] args) throws InterruptedException, AWTException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
//	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");//avoid
	driver.get("https://the-internet.herokuapp.com/basic_auth");//avoid
	Thread.sleep(4000);
	Robot r=new Robot();//handle
//	r.keyPress(KeyEvent.VK_CAPS_LOCK);
	r.keyPress(KeyEvent.VK_A);
	r.keyPress(KeyEvent.VK_D);
	r.keyPress(KeyEvent.VK_M);
	r.keyPress(KeyEvent.VK_I);
	r.keyPress(KeyEvent.VK_N);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_A);
	r.keyPress(KeyEvent.VK_D);
	r.keyPress(KeyEvent.VK_M);
	r.keyPress(KeyEvent.VK_I);
	r.keyPress(KeyEvent.VK_N);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	r.keyRelease(KeyEvent.VK_A);
	r.keyRelease(KeyEvent.VK_D);
	r.keyRelease(KeyEvent.VK_M);
	r.keyRelease(KeyEvent.VK_I);
	r.keyRelease(KeyEvent.VK_N);
	r.keyRelease(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(4000);
	driver.quit();
}
}
