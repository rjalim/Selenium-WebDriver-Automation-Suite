package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.naming.ldap.Control;

public class Copy_Pest_Using_Action_Class extends DriverSetup{

    @Test
    public void doing_copy_pest() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        Thread.sleep(2000);


        Actions action = new Actions(driver);

        action.sendKeys(getElement(By.xpath("//input[@id='name']")),"Bangladesh").build().perform();
        Thread.sleep(2000);

        action.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
        Thread.sleep(1000);

        action.keyDown(Keys.CONTROL).sendKeys("x").build().perform();
        Thread.sleep(1000);

        action.sendKeys(getElement(By.xpath("//input[@id='displayed-text']"))).sendKeys("v").build().perform();
        Thread.sleep(2000);
    }
}
