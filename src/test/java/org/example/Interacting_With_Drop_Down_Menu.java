package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class Interacting_With_Drop_Down_Menu extends DriverSetup{

    @Test
    public void Interaction_With_Drop_Down() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        Thread.sleep(2000);

        WebElement Locating_Dropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
        Locating_Dropdown.click();
        Thread.sleep(3000);


        Select select = new Select(Locating_Dropdown);
        select.selectByValue("option1");
        Thread.sleep(2000);
        select.selectByIndex(2);
        Thread.sleep(2000);
        select.selectByVisibleText("Option3");
        Thread.sleep(2000);
        System.out.println("First selected option is: " +select.getFirstSelectedOption().getText());


       List<WebElement> Options = select.getOptions();
       for (WebElement el: Options){

           System.out.println(el.getText());
           System.out.println(el.getAttribute("Value"));
       }
        }


    }
