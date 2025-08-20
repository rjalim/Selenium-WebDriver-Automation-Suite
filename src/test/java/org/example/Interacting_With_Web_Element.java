package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Interacting_With_Web_Element extends DriverSetup{

    @Test
    public void Interaction_With_Element() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        Thread.sleep(3000);

       WebElement Page_Name =driver.findElement(By.xpath("//h1[normalize-space()='Practice Page']"));
       String PageTitle = Page_Name.getText();
       System.out.println(PageTitle);
       System.out.println(Page_Name.isDisplayed());


       WebElement Radio_Button_Example = driver.findElement(By.xpath("//legend[normalize-space()='Radio Button Example']"));
       String text = Radio_Button_Example.getText();
       System.out.println(text);
       System.out.println(Radio_Button_Example.isDisplayed());

       WebElement Insert_Value_BlankBox = driver.findElement(By.xpath("//input[@id='autocomplete']"));
       Insert_Value_BlankBox.click();
       Insert_Value_BlankBox.sendKeys("Abdul Alim");
       Thread.sleep(2000);
       Insert_Value_BlankBox.clear();

       WebElement Insert_value_on_AlertBox = driver.findElement(By.xpath("//input[@id='name']"));
       Insert_value_on_AlertBox.clear();
       Insert_value_on_AlertBox.sendKeys("Upset");
       Thread.sleep(2000);
       Insert_value_on_AlertBox.clear();

       WebElement Radio_Button_Work = driver.findElement(By.xpath("//input[@value='radio1']"));
       System.out.println("Before Select: "+Radio_Button_Work.isSelected());
       Radio_Button_Work.click();
       Thread.sleep(2000);
       System.out.println("After Select: "+Radio_Button_Work.isSelected());
       System.out.println(Radio_Button_Work.isEnabled());

       WebElement Click_Hide_Button = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
       Click_Hide_Button.click();
       Thread.sleep(2000);
       System.out.println(Click_Hide_Button.isDisplayed());


      WebElement Place_Holder_Text = driver.findElement(By.xpath("//input[@id='name']"));
      String Holder_Text = Place_Holder_Text.getAttribute("placeholder");
      System.out.println(Holder_Text);


      WebElement Home_Button_color = driver.findElement(By.xpath("//button[normalize-space()='Home']"));
      String CSS_value = Home_Button_color.getCssValue("background-color");
      System.out.println(CSS_value);




    }
}
