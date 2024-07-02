package pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWith_FileUpload {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://interimjobs.kornferry.com/candidates/submit-your-resume");
	Thread.sleep(2000);
	
	Thread.sleep(4000);
	driver.quit();
}
}
