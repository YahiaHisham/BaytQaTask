package com.bayt.pages;

import com.bayt.common.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationBarPage extends PageBase {
    private final By careersButton = By.xpath("//a[contains(@href, '/careers/')]");

    public NavigationBarPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnCareersButton() {
        clickOnElement(careersButton);
    }

}
