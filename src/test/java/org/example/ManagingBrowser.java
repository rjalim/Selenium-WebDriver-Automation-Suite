package org.example;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ManagingBrowser extends DriverSetup{

    @Test
    public void Control_Web_browser() throws InterruptedException {
        driver.get("https://www.google.com/");
        Thread.sleep(3000);

        driver.manage().window().fullscreen();
        Thread.sleep(1000);

        driver.manage().window().maximize();
        Thread.sleep(1000);

        driver.manage().window().minimize();
        Thread.sleep(1000);

        driver.manage().window().maximize();
        Thread.sleep(1000);

        driver.manage().window().fullscreen();
        Thread.sleep(1000);

        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(1000);

        driver.navigate().to("https://www.google.com/");
        Thread.sleep(1000);

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://web.whatsapp.com/");
        Thread.sleep(2000);

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://mvnrepository.com/");
        Thread.sleep(2000);

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.instagram.com/");
        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(2000);

        driver.navigate().forward();
        Thread.sleep(2000);

        driver.navigate().refresh();
        Thread.sleep(2000);

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.linkedin.com/");
        Thread.sleep(2000);
        String Current_Tab_handle = driver.getWindowHandle();
        System.out.println(Current_Tab_handle);
        List<String> handles = new ArrayList<>(driver.getWindowHandles());

        for(String Handle: handles){
            System.out.println(Handle);
        }

        driver.switchTo().window(handles.get(0));
        Thread.sleep(2000);
        System.out.println(driver.getCurrentUrl());


        driver.switchTo().window(handles.get(1));
        Thread.sleep(2000);
        System.out.println(driver.getCurrentUrl());

        driver.switchTo().window(handles.get(2));
        Thread.sleep(2000);
        System.out.println(driver.getCurrentUrl());



    }
}
