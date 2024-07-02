package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWith_findElements {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/register");
	List<WebElement> gender = driver.findElements(By.name("Gender"));
	for(WebElement a:gender) {
		a.click();
		Thread.sleep(4000);
	}
}
}