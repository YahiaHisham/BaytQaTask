package com.bayt.pages;

import com.bayt.common.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FindJobsListingPage extends PageBase {

    private final By easyApplyButton = By.cssSelector(".jb-easy-apply > a");

    public FindJobsListingPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnEasyApplyButton() {
        clickOnElement(easyApplyButton, 0);
    }

}
