package relativelocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class ToWorkWith_Right {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/register");
    WebElement text = driver.findElement(By.xpath("//label[text()='Male']"));
    WebElement check_box_gender = driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(text));
    check_box_gender.click();//female radio button
    Thread.sleep(5000);
    driver.close();
}
}
