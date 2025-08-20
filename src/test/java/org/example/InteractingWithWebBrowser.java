package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InteractingWithWebBrowser extends DriverSetup{

    @Test
    public void Check_Web_Browser() throws InterruptedException {

        driver.get("https://www.google.com/");
        Thread.sleep(3000);

//        WebElement TextTpe = driver.findElement(By.id("APjFqb"));
//        TextTpe.click();
//        Thread.sleep(2000);

//        WebElement TextType2 = driver.findElement(By.name("q"));
//        TextType2.click();
//        Thread.sleep(2000);

//        WebElement TextType3 = driver.findElement(By.className("gLFyf"));
//        TextType3.click();
//        Thread.sleep(2000);

//        WebElement TextTpe4 = driver.findElement(By.tagName("textarea"));
//        TextTpe4.click();
//        Thread.sleep(2000);

        // CSS Selector Create: tagName[id=\"Value of ID\"]
//        WebElement TextType5 = driver.findElement(By.cssSelector("textarea[id=\"APjFqb\"]"));
//        TextType5.click();
//        Thread.sleep(2000);

        //Create Xpath By manually: "//tagName[@id=\"value of ID\]"}"
//        WebElement TextType6 = driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]"));
//        TextType6.sendKeys("Web Automation");
//        TextType6.click();
//        Thread.sleep(2000);


        WebElement Locate_Bangla_lang = driver.findElement(By.linkText("বাংলা"));
        Locate_Bangla_lang.click();
        Thread.sleep(2000);


        WebElement Locate_English_Text = driver.findElement(By.linkText("English"));
        Locate_English_Text.click();
        Thread.sleep(2000);


    }
}
