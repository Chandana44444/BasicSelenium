

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToWorkWith_DragAndDrop {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
	Thread.sleep(2000);
	WebElement ele_drag = driver.findElement(By.id("draggable"));
	WebElement ele_drop = driver.findElement(By.id("droppable"));
	Actions act=new Actions(driver);
	act.dragAndDrop(ele_drag, ele_drop).perform();
}
}
