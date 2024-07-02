package TestNG_Adv;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImplemantation extends BaseClass implements ITestListener {
@Override
public void onTestSuccess(ITestResult result) {
	Reporter.log("on success",true);
}
@Override
public void onTestFailure(ITestResult result) {
	System.out.println(result.getTestClass());//classname
	System.out.println(result.getName());//method name
	String time = LocalDateTime.now().toString().replaceAll(":", "-");
	Reporter.log("on failure",true);
	File src=driver.getScreenshotAs(OutputType.FILE);
	File destiny=new File("snaps//"+time+"pic.png");
//	File destiny=new File("./snaps/ERRORPIC.png");
	try {
		FileHandler.copy(src, destiny);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
@Override
public void onTestStart(ITestResult result) {
	Reporter.log("on start",true);
}
}
