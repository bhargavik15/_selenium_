package google;

import org.testng.annotations.*;

public class TestngAnnotations {

    //-------------Flow of Execution------------------
    /*  <BeforeSuite>
     <BeforeTest>
           <BeforeClasses>
                <BeforeMethod>
                     <Test>
                 <AfterMethod>
            <AfterClasses>
      <AfterTest>
<AfterSuite> */

     //---------------------------------------------------

    @Test(priority = 1)
    public void testCase1(){
        System.out.println("in Test Case1");
    }
    @Test(priority = 2)
    public void testCase2(){
        System.out.println("in Test Case2");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("in Before Method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("in After Method");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("in Before Class");
    }
    @AfterClass
    public void AfterClass(){
        System.out.println("in After Class");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("in Before Test");
    }
    @AfterTest
    public void AfterTest(){
        System.out.println("in After Test");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("in Before Suite");
    }
    @AfterSuite
    public void AfterSuite(){
        System.out.println("in After Suite");
    }

}
