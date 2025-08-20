package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DriverSetup {

    public WebDriver driver;

    @BeforeSuite
    public void OpenBrowser(){
        driver = new ChromeDriver();
    }

    public WebElement getElement(By locator) {
        return driver.findElement(locator);
    }

    @AfterSuite
    public void CloseBrowser(){
        driver.quit();
    }
}
