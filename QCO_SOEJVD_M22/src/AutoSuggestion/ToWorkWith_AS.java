package AutoSuggestion;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWith_AS {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.id("small-searchterms")).sendKeys("comp");
	Thread.sleep(2000);
	driver.findElement(By.linkText("Computing and Internet")).click();
}
}
