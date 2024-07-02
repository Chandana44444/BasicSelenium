package testng_concepts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToCheck_TestNG {//testng class
@Test(priority = -1)
public void method_02() {//test case/testng method
	Reporter.log("selenium");//on report
	Reporter.log("selenium-2",true);//on console
	//test steps
}
@Test(priority = 0)
public void method_01() {//test case/testng method
	Reporter.log("selenium");//on report
	Reporter.log("selenium-1",true);//on console
	//test steps
}
@Test(priority = 0)
public void method_03() {//test case/testng method
	Reporter.log("selenium");//on report
	Reporter.log("selenium-3",true);//on console
	//test steps
}
}

//ascii value
//m  e  t  h  o  d _ 0  2=>add:788
//                       1=>add:787
//low high
