package TestNG;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Test3 {
    
    @BeforeClass
    public void beforeClass() {
        System.out.println("This is before class Test3");
    }
    
    
    @Test(dependsOnMethods= {"Test02"})
    public void Test01() {
        System.out.println("The test method is Test01 of Test3");
        Assert.assertTrue(false);
    }
    
    @Parameters({
                "URL",
                "Username"}
                )
    @Test
    public void Test02(String url,String uname ) {
        System.out.println("The test method is Test02 of Test3");
        System.out.println("The URL and Username is "+url+"\n"+uname);
    }
   
    @Test(groups= {"Sanity"})
    public static void Test03() {
        System.out.println("The test method is Test03 of Test3");
    }
}
