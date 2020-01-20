package TestNG;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.*;

public class Test2 {
    
    @BeforeSuite
    public void BeforeSuite() {
        System.out.println("This is before Suite Method");
    }
    @Test(dataProvider="getData")
    public void Test01(String uname,String pwd) {
        System.out.println("The test method is Test01 of Test2");
        System.out.println("The username is "+uname+" and the password is "+pwd);
    }
    
    @Test(groups= {"Sanity"})
    public void Test02() {
        System.out.println("The test method is Test02 of Test2");
    }
    
    @Test
    public void Test03() {
        System.out.println("The test method is Test03 of Test2");
    }
    
    @AfterSuite
    public void AfterSuite() {
        System.out.println("This is after Suite Method");
    }
    
    @DataProvider
    public Object[][] getData() {
        Object [][] ob=new Object[3][2];
        ob[0][0]="username1";
        ob[0][1]="password1";
        ob[1][0]="username2";
        ob[1][1]="password2";
        ob[2][0]="username3";
        ob[2][1]="password3";
        return ob;
    }

}
