package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class iFrame_Using_Action_Class extends DriverSetup{


    By iFrame = By.xpath("//legend[normalize-space()='iFrame Example']");


    @Test
    public void Interacting_With_iFrame() throws InterruptedException {

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        Thread.sleep(3000);

        Actions actions = new Actions(driver);
//      actions.scrollByAmount(0,700).build().perform();
//      Thread.sleep(2000);

        actions.scrollToElement(getElement(iFrame)).build().perform();
        Thread.sleep(2000);

        actions.moveToElement(getElement(By.xpath("//button[@id='mousehover']"))).build().perform();
        Thread.sleep(2000);

        actions.click(getElement(By.xpath("//a[normalize-space()='Top']"))).build().perform();
        Thread.sleep(2000);


    }
}
