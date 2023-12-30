package com.bayt.pages;

import com.bayt.common.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AccountSettingsPage extends PageBase {
    private final By deleteAccountButton = By.xpath("//a[contains(text(),'Delete My Account')]");
    private final By confirmDeleteAccountButton = By.cssSelector("button.is-danger");
    private final By confirmDeleteAccountButtonPopup = By.cssSelector("button.non-aid");

    public AccountSettingsPage(WebDriver driver) {
        super(driver);
    }

    public AccountSettingsPage deleteAccount() {
        forceClickUsingJavaScript(deleteAccountButton)
                .forceClickUsingJavaScript(confirmDeleteAccountButton)
                .forceClickUsingJavaScript(confirmDeleteAccountButtonPopup);
        return this;
    }

    public void assertThatAccountIsDeleted(String title) {
        waitUntilRedirectionIsDone("https://www.bayt.com/en/egypt/");
        Assert.assertEquals(driver.getTitle(), title);
    }
}
