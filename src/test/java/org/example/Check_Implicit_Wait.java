package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Check_Implicit_Wait extends DriverSetup{

    @Test
    public  void Check_Implicit_Wait() throws InterruptedException {

        driver.get("https://testing-and-learning-hub.vercel.app/WebAutomation/pages/slow_resources_page.html");
        Thread.sleep(3000);

        WebElement Locate_Trigger_button = driver.findElement(By.xpath("//button[normalize-space()='Trigger Slow Request']"));
        Locate_Trigger_button.click();
//      Thread.sleep(15000);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        WebElement Response_Message = driver.findElement(By.xpath("//p[normalize-space()='Success: The slow request has completed.']"));
        System.out.println(Response_Message.getText());
        Assert.assertTrue(Response_Message.isDisplayed());
        Assert.assertEquals(Response_Message.getText(), "Success: The slow request has completed.");

    }



    @Test
    public void Check_Explicit_Wait(){

        driver.get("https://qavbox.github.io/demo/delay/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement Find_element = driver.findElement(By.xpath("//input[@name='commit']"));
        Find_element.click();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        WebElement Response_Message2 = driver.findElement(By.xpath("//h2[@id='two']"));
        wait.until(ExpectedConditions.textToBePresentInElement(Response_Message2, "I am here!"));

        Assert.assertTrue(Response_Message2.isDisplayed());
        Assert.assertEquals(Response_Message2.getText(), "I am here!");


    }
}
