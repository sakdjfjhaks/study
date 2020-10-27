package com.study.practice.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Im {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\4240\\chromedriver.exe");

        // Instantiate a ChromeDriver class.
        WebDriver driver = new ChromeDriver();
        String urlIndex = "E:/dingding_download/im(1).html?customerId=1";
        driver.navigate().to(urlIndex);
        JavascriptExecutor driver_js= ((JavascriptExecutor) driver);
        for(int i = 2;i<100;i++){
            String urlOther = "'file:///E:/dingding_download/im(1).html?customerId=" + i+"'";
            String windowsOpen = "window.open("+urlOther+")";
            System.out.println(windowsOpen);
//            String windowsOpen = "window.open('https://www.baidu.com/','_blank')";
            driver_js.executeScript(windowsOpen);
        }
        for (String handles : driver.getWindowHandles()) {
            driver.switchTo().window(handles);
//            driver.findElement(By.id ("customer_id")).sendKeys("1");
//            driver.findElement(By.id ("first_button")).click();
            driver.findElement(By.id ("message")).sendKeys("nihao");
            driver.findElement(By.id ("send")).click();
        }

        for(int i=0;i<10;i++){
            for(WebElement webElement:   driver.findElements(By.id("send"))){
                webElement.click();
            }
        }

    }
}