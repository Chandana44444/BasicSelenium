package relativelocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class ToWorkWith_Above {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/register");
    WebElement lname_field = driver.findElement(By.id("LastName"));
    WebElement fname_field = driver.findElement(RelativeLocator.with(By.tagName("input")).above(lname_field));
    fname_field.sendKeys("selenium");
    Thread.sleep(5000);
    driver.close();
}
}
