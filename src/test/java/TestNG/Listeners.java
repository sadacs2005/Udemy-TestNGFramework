package TestNG;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{
    
    public void onTestSuccess(ITestResult result) {
        System.out.println("Executed listener pass code for the test:"+result.getName());
      }
    
    public  void onTestFailure(ITestResult result) {
        System.out.println("Executed listener fail code for the test:"+result.getName());
      }

}
