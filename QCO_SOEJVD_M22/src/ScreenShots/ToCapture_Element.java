package ScreenShots;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class ToCapture_Element {
public static void main(String[] args) throws IOException, InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	WebElement ele = driver.findElement(By.xpath("//img[@alt=\"Tricentis Demo Web Shop\"]"));
	File source = ele.getScreenshotAs(OutputType.FILE);
	System.out.println(source);
	LocalDateTime time = LocalDateTime.now();
	System.out.println("time:"+time.toString());
	String TIME_DATE = time.toString().replaceAll(":", "-");
	File destiny=new File("snaps//"+TIME_DATE+"pic.png");
//	File destiny=new File("./snaps/pic_01.png");
	FileHandler.copy(source, destiny);
	System.out.println(destiny);
	Thread.sleep(3000);
	driver.close();
}
}
