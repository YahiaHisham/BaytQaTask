package com.bayt.testClasses;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;

import static com.bayt.utilities.JsonReader.getValueFromJsonFile;
import static com.bayt.utilities.Utilities.takeScreenshot;

public class TestBase {
    public WebDriver driver;

    @BeforeMethod
    @Parameters("viewType")
    public void startBrowser(@Optional("web") String viewType) {
        driver = new ChromeDriver();
        driver.get(getValueFromJsonFile("BaytUrl","Urls"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        if ("mobile".equalsIgnoreCase(viewType)) {
            setMobileView();
        } else {
            setWebView();
        }
    }

    private void setMobileView() {
        Dimension mobileWindowSize = new Dimension(414, 896);
        driver.manage().window().setSize(mobileWindowSize);
    }

    private void setWebView() {
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
//        driver.quit();
    }
}
