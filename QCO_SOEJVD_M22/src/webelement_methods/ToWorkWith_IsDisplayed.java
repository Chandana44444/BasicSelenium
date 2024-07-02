package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToWorkWith_IsDisplayed {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	WebElement logo = driver.findElement(By.cssSelector("img[alt='Tricentis Demo Web Shop']"));
	System.out.println("logo is displayed/not?"+logo.isDisplayed());
	Thread.sleep(3000);
	driver.close();
}
}
//css:tagname[attname='attval']
//xpath://tagname[@attname='attval']
