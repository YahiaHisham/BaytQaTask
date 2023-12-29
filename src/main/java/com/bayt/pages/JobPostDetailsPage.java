package com.bayt.pages;

import com.bayt.common.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JobPostDetailsPage extends PageBase {
    private final By easyApplyButton = By.id("applyLink_1");

    public JobPostDetailsPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnEasyApplyButton() {
        forceClickUsingJavaScript(easyApplyButton);
    }
}
