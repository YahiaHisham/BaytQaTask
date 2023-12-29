package com.bayt.pages;

import com.bayt.common.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JobSearchResultPage extends PageBase {

    By easyApplyButton = By.cssSelector("div.card a.is-small");

    public JobSearchResultPage(WebDriver driver) {
        super(driver);
    }

    public JobSearchResultPage clickOnEasyApplyButton() {
        clickOnElement(easyApplyButton, 0);
        return this;
    }

}
