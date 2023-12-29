package com.bayt.pages;

import com.bayt.common.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ApplicationStatusPage extends PageBase {
    private final By applyNowButton = By.name("submit");
    private final By applicationStatusMessage = By.tagName("h1");

    public ApplicationStatusPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnApplyNowButton() {
        waitUntilRedirectionIsDone("www.bayt.com/en/job/apply/index");
        clickOnElement(applyNowButton);
    }

    public void assertThatApplicationSentSuccessfully(String message) {
        waitUntilRedirectionIsDone("www.bayt.com/en/job/applied");
        Assert.assertEquals(getElementText(applicationStatusMessage), message);
    }

}
