package com.bayt.pages;

import com.bayt.common.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase {
    By emailField = By.id("LoginForm_username");
    By passwordField = By.id("LoginForm_password");
    By loginButton = By.id("login-button");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage redirectToLoginPage(String url) {
        driver.navigate().to(url);
        return this;
    }

    public LoginPage setEmail(String email) {
        setElementText(emailField, email);
        return this;
    }

    public LoginPage setPassword(String password) {
        setElementText(passwordField, password);
        return this;
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

}
