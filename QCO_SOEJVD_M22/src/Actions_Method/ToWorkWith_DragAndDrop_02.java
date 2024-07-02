package Actions_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToWorkWith_DragAndDrop_02 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/s?k=amazon+prime+membership&adgrpid=1320515078795879&hvadid=82532458763367&hvbmt=bb&hvdev=c&hvlocphy=157319&hvnetw=o&hvqmt=b&hvtargid=kwd-82533075230534%3Aloc-90&hydadcr=5653_2377271&tag=msndeskstdin-21&ref=pd_sl_6iluw3gs69_b");
	Thread.sleep(4000);
//	WebElement ele_drag = driver.findElement(By.id("p_36/range-slider_slider-item_lower-bound-slider"));
//	WebElement ele_drop = driver.findElement(By.id("p_36/range-slider_slider-item_upper-bound-slider"));
	WebElement ele_drag = driver.findElement(By.xpath("//input[@type=\"range\"]"));
//	WebElement ele_drop = driver.findElement(By.id("(//input[@type=\"range\"])[2]"));
	Actions act=new Actions(driver);
	act.dragAndDropBy(ele_drag,12,0).perform();
}
}
