package com.bayt.pages;

import com.bayt.common.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase {

    private By searchBox = By.id("text_search");
    private By findJobsButton = By.cssSelector("button.btn");
    private By aboutUsButton = By.linkText("About Us");
    private By countryDropdown = By.id("search_country__r");

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

    public HomePage clickOnFindJobsButton() {
        clickOnElement(findJobsButton);
        return this;
    }

    public HomePage clickOnAboutUsButton() {
        forceClickUsingJavaScript(aboutUsButton);
        return this;
    }


}
