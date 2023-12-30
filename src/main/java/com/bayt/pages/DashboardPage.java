package com.bayt.pages;

import com.bayt.common.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DashboardPage extends PageBase {

    private final By accountSettingsBullet = By.cssSelector("a > i.is-ellipsis-v");
    private final By accountSettingOption = By.xpath("//a[contains(text(),'Account Settings')]");

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnAccountSettingsButton() {
        clickOnElement(accountSettingsBullet)
                .clickOnElement(accountSettingOption);
    }

    public DashboardPage assertThatUserLoggedInSuccessfully(String pageTitle) {
        Assert.assertEquals(driver.getTitle(), pageTitle);
        return this;
    }

}
