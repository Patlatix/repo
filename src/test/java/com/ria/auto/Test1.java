package com.ria.auto;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {

    public ChromeDriver driver;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/home/patlatix/Downloads/chromedriver");
        driver = new ChromeDriver();

        System.out.println("test start");
    }
    @Test
    public void test1 () {
    driver.get("https://auto.ria.com/");
    String title = driver.getTitle();
    Assert.assertTrue(title.equals("AUTO.RIA™ — Автобазар №1. Купить и продать авто легко как никогда"));
    }
    @Test
    public void test2 () {
        driver.get("https://auto.ria.com/");
        String title = driver.getTitle();

        Assert.assertTrue(title.equals("AUTO.RIA™ — Автобазар №1. Купить и продать авто легко как никогда"));
    }
    @AfterTest
    public void close() {
        System.out.println("test close");
        driver.quit();
    }
}

