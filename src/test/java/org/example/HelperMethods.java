package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HelperMethods extends DriverSetup {


    public WebElement getElement(By locator) {
        return driver.findElement(locator);
    }
}