package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Custom_Method extends DriverSetup {


    public WebElement getElement(By locator) {
        return driver.findElement(locator);
    }
}