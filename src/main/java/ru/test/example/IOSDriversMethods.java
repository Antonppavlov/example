package ru.test.example;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.net.URL;

public class IOSDriversMethods {
    public AppiumDriver<WebElement> driver;
    public DesiredCapabilities cap;
    public void IOSLounchApp() throws MalformedURLException {
        cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6s");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.2");
        cap.setCapability(MobileCapabilityType.APP, "ru.admitadteam.Cooking-eggs");
//        cap.setCapability("bundleId", "ru.admitadteam.Cooking-eggs");
        driver = new IOSDriver<WebElement>(new URL("http://test:test-password@172.20.10.10:4444/wd/hub"),cap);
        Assert.assertNotNull(driver);

    }

    public void CloseApp(){
        driver.quit();
    }

    public AppiumDriver<WebElement> getDriver() {
        return driver;
    }
}
