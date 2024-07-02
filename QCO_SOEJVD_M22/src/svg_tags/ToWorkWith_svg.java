package svg_tags;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWith_svg {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.shoppersstack.com/products_page/6");
	Thread.sleep(8000);
	driver.findElement(By.xpath("//*[name()='svg' and @data-testid=\"InfoOutlinedIcon\"]")).click();
	}
}
