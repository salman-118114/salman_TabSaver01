package com.TabSaver.automation.modules.Extension.TabSaver.pages;

import io.opentelemetry.sdk.common.CompletableResultCode;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.io.File;

public class basePage {


    public static void main(String[] args){

        ChromeOptions opts = new ChromeOptions();
        opts.addExtensions(new File("tabSaver.crx"));

        ChromeDriver driver = new ChromeDriver(opts);
        driver.manage().window().maximize();

        driver.get("file:///C:/Users/i7/AppData/Local/Google/Chrome/User%20Data/Default/Extensions/dfbibanlbecdmicflopmmjnfaidejbkg/1.0.0_0/tabSaver.html");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String heading = driver.getTitle();
        System.out.println(heading);

        if(heading.equals("TabSaver") ){
            System.out.println("extension has been opened");
        }
        else{
            Assert.fail("now extension html has been opened");
        }

        driver.close();




        }
}
