package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Interacting_With_Alert extends DriverSetup{

    @Test
    public void Interaction_With_Alert() throws InterruptedException {
        driver.get("https://testing-and-learning-hub.vercel.app/WebAutomation/pages/javascript_alerts.html");
        Thread.sleep(3000);

        WebElement Test_Show_Alert = driver.findElement(By.xpath("//button[normalize-space()='Show Alert']"));
        Test_Show_Alert.click();
        Thread.sleep(2000);
        Alert alert1 = driver.switchTo().alert();
        alert1.accept();
        Thread.sleep(2000);
        System.out.println(Test_Show_Alert.getText());

        WebElement Test_Confirm_Alert = driver.findElement(By.xpath("//button[normalize-space()='Show Confirm']"));
        Test_Confirm_Alert.click();
        Thread.sleep(2000);
        Alert alert2 = driver.switchTo().alert();
        alert2.accept();
        Thread.sleep(2000);
        System.out.println(Test_Confirm_Alert.getText());

        WebElement Test_Show_prompt_Alert = driver.findElement(By.xpath("//button[normalize-space()='Show Prompt']"));
        Test_Show_prompt_Alert.click();
        Thread.sleep(2000);
        Alert alert3 = driver.switchTo().alert();
        alert3.sendKeys("Abdul Alim");
        alert3.accept();
        Thread.sleep(2000);
        System.out.println(Test_Show_prompt_Alert.getText());

        WebElement Test_Multiple_Alerts = driver.findElement(By.xpath("//button[normalize-space()='Show Multiple Alerts']"));
        Test_Multiple_Alerts.click();
        Thread.sleep(2000);
        Alert alert5 = driver.switchTo().alert();
        alert5.accept();
        Thread.sleep(2000);
        alert5.accept();
        Thread.sleep(2000);
        alert5.accept();
        Thread.sleep(2000);
        System.out.println(Test_Multiple_Alerts.getText());

    }
}
