package ScreenShots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class ToCapture_Screen {
public static void main(String[] args) throws IOException, InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	File source = driver.getScreenshotAs(OutputType.FILE);
	System.out.println(source);
	File destiny=new File("./snaps/pic.png");
	FileHandler.copy(source, destiny);
	System.out.println(destiny);
	Thread.sleep(3000);
	driver.close();
}
}
