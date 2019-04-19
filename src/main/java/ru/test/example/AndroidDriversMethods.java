package ru.test.example;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidDriversMethods {
    public static AppiumDriver<WebElement> driver;
    public static DesiredCapabilities cap;
    public static void AndroidLounchApp() throws MalformedURLException {
        cap = new DesiredCapabilities();
        cap.setCapability("platformName", "Android");
        cap.setCapability("deviceName", "POCOPHONE F1");
        cap.setCapability("platformVersion", "9");
        cap.setCapability("app", "/Users/ivanivanov/Downloads/ru.bcs.premier_2019-03-23.apk");
        driver = new AndroidDriver<WebElement>(new URL("http://test:test-password@172.20.10.10:4444/wd/hub"),cap);
        Assert.assertNotNull(driver);
    }

    public static void CloseApp(){
        driver.quit();
    }

}
