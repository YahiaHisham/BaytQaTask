package com.bayt.pages;

import com.bayt.common.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BaytCareersPage extends PageBase {

    By openedJobTitle = By.xpath("//a[@data-js-aid='jobTitle']");

    public BaytCareersPage(WebDriver driver) {
        super(driver);
    }

    public BaytCareersPage clickOnOpenJobPost() {
        forceClickUsingJavaScript(openedJobTitle, 0);
        return this;
    }

    public BaytCareersPage assertThatUserRedirectedToBaytCareersPage(String url) {
        Assert.assertEquals(driver.getCurrentUrl(), url);
        return this;
    }
}
