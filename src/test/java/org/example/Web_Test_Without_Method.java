package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Web_Test_Without_Method extends DriverSetup{

    @Test
    public void Check_Facebook_Url() throws InterruptedException {
        driver.get("https://www.facebook.com/");
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");
    }

    @Test
    public void Check_Facebook_Title(){
        driver.get("https://www.facebook.com/");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Facebook – log in or sign up");
    }
}
