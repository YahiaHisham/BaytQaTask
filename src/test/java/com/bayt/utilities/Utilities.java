package com.bayt.utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Utilities {

    static String screenshotLocation = "src/test/java/com/bayt/data/screenshots/";

    public static void takeScreenshot(WebDriver driver, String imageName) {
        try {
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshotFile, new File(screenshotLocation + imageName + ".png"));
            System.out.println("Screenshot taken: " + imageName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
