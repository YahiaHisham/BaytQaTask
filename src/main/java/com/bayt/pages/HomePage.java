package com.bayt.pages;

import com.bayt.common.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase {

    private final By searchBox = By.id("text_search");
    private final By findJobsButton = By.cssSelector("button.btn");
    private final By aboutUsButton = By.linkText("About Us");
    private final By countryDropdown = By.id("search_country__r");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private By countryOption(String country) {
        return By.xpath("//a[contains(text(),'" + country + "')]");
    }

    public HomePage setJobSearchQuery(String searchQuery) {
        forceSetElementTextUsingJavaScript(searchBox, searchQuery);
        return this;
    }

    public HomePage setJobSearchLocation(String location) {
        clickOnElement(countryDropdown);
        forceClickUsingJavaScript(countryOption(location));
        return this;
    }

    public void clickOnFindJobsButton() {
        clickOnElement(findJobsButton);
    }

    public void clickOnAboutUsButton() {
        forceClickUsingJavaScript(aboutUsButton);
    }


}
