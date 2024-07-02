package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWith_GetText {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/register");
	System.out.println("text "+driver.findElement(By.xpath("//h1[text()='Register']")).getText());
	Thread.sleep(3000);
	driver.close();
}
}
