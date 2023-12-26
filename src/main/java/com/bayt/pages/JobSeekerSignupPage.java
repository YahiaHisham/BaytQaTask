package com.bayt.pages;

import com.bayt.common.PageBase;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class JobSeekerSignupPage extends PageBase {

    public JobSeekerSignupPage(WebDriver driver) {
        super(driver);
    }

    public void assertThatJobSeekerSignupPageIsDisplayed(String title) {
        Assert.assertEquals(driver.getTitle(),title);
    }

}
