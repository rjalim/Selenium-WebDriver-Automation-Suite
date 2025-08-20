package org.example;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class TestNGExamples extends DriverSetup {

    @Test(priority = 2)
    public void Test_case_1(){
        System.out.println("This is a first Test case");
    }

    @Test(priority = 1)
    public void Test_Case_2(){
        System.out.println("This is a Second Test case");
    }

    @BeforeMethod
    public void perform_Method(){
        System.out.println("This will Execute Before The Method");
    }

    @AfterMethod
    public void perform_Method_After(){
        System.out.println("This will Execute After The Method");
    }

    @BeforeClass
    public void perform_Class(){
        System.out.println("This will Execute Before The Class");
    }

    @AfterClass
    public void perform_class_After(){
        System.out.println("This will Execute after the Class");
    }

    @BeforeTest
    public void perform_Test(){
        System.out.println("This will Execute Before The Test");
    }

    @AfterTest
    public void perform_Test_After(){
        System.out.println("This will Execute After The Test");
    }

    @BeforeSuite
    public void perform_Suite(){
        System.out.println("This will Execute Before The Test Suite");
    }

    @AfterSuite
    public void perform_Suite_After(){
        System.out.println("This will Execute After The Test Suite");
    }

    @Test(priority = 3)
    public void Test_Assertion(){

        SoftAssert softAssert = new SoftAssert();


        Assert.assertEquals(11,11);
        System.out.println("Pass Integer");
        softAssert.assertEquals("Abdul","Alim");
        System.out.println("Pass String");
        softAssert.assertEquals("red","red");
        System.out.println("Pass Color");
        softAssert.assertTrue(true);
        System.out.println("Displayed");
        softAssert.assertFalse(false);
        System.out.println("Not Visible");


        softAssert.assertAll();

    }

}
