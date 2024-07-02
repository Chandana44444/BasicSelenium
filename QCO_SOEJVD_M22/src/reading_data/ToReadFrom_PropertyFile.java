package reading_data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadFrom_PropertyFile {
public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("./read_data/property.properties");
	Properties prop=new Properties();
	prop.load(fis);
	System.out.println(prop.getProperty("url"));
	System.out.println(prop.getProperty("name"));
	System.out.println(prop.getProperty("44"));
//	String url = prop.getProperty("url");
//	ChromeDriver driver=new ChromeDriver();
//	driver.get("https://demowebshop.tricentis.com/");
//	driver.get(url);
	//write data
	FileOutputStream fos=new FileOutputStream("./read_data/property.properties");
	prop.setProperty("batch", "7-9am");
	prop.store(fos, "adding 1st data using write method");
	System.out.println(prop.getProperty("batch"));
}
}
