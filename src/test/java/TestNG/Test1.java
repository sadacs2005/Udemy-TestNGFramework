package TestNG;

import org.testng.annotations.*;

public class Test1 {
    
    @BeforeTest
    public void BeforeTest() {
        System.out.println("This is Before Test");
    }
    
    @BeforeClass
    public void BeforeClass() {
        System.out.println("This is before class Test1");
    }
   
    @Test(groups= {"Sanity"})
    public void Test01() {
        Test3.Test03();
        System.out.println("The test method is Test01 of Test1");
    }
    
    @Test
    public void Test02() {
        System.out.println("The test method is Test02 of Test1");
    }
    
    @Test
    public void Test03() {
        System.out.println("The test method is Test03 of Test1");
    }
    
    @AfterTest
    public void AfterTest() {
        System.out.println("This is After Test of Test1");
    }
    
    @AfterClass
    public void AfterClass() {
        System.out.println("This is after the class Test1");
    }

}
