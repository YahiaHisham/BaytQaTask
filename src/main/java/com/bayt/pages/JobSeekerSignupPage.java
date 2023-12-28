package com.bayt.pages;

import com.bayt.common.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class JobSeekerSignupPage extends PageBase {

    private By firstNameField = By.id("JsApplicantRegisterForm_firstName");
    private By lastNameField = By.id("JsApplicantRegisterForm_lastName");
    private By emailField = By.id("JsApplicantRegisterForm_email");
    private By passwordField = By.id("JsApplicantRegisterForm_password");
    private By mobileField = By.id("JsApplicantRegisterForm_mobPhone");
    private By applyNowButton = By.id("register");

    public JobSeekerSignupPage(WebDriver driver) {
        super(driver);
    }

    public void assertThatJobSeekerSignupPageIsDisplayed(String title) {
        Assert.assertEquals(driver.getTitle(), title);
    }

    public JobSeekerSignupPage setFirstName(String firstName) {
        setElementText(firstNameField, firstName);
        return this;
    }

    public JobSeekerSignupPage setLastName(String lastName) {
        setElementText(lastNameField, lastName);
        return this;
    }

    public JobSeekerSignupPage setEmail(String email) {
        setElementText(emailField, email);
        return this;
    }

    public JobSeekerSignupPage setPassword(String password) {
        setElementText(passwordField, password);
        return this;
    }

    public JobSeekerSignupPage setMobileNumber(String mobileNumber) {
        setElementText(mobileField, mobileNumber);
        return this;
    }

    public JobSeekerSignupPage clickOnApplyNowButton() {
        clickOnElement(applyNowButton);
        return this;
    }

}
