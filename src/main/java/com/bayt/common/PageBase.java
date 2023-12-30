package com.bayt.common;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

public class PageBase {

    public WebDriver driver;

    public PageBase(WebDriver driver) {
        this.driver = driver;
    }

    public PageBase clickOnElement(By elementLocator) {
        waitUntilPresenceOfElement(elementLocator);
        scrollToElementView(elementLocator);
        driver.findElement(elementLocator).click();
        return this;
    }

    public void clickOnElement(By elementLocator, int index) {
        waitUntilPresenceOfElement(elementLocator, index);
        scrollToElementView(elementLocator, index);
        driver.findElements(elementLocator).get(index).click();
    }

    public void setElementText(By elementLocator, String text) {
        waitUntilPresenceOfElement(elementLocator);
        scrollToElementView(elementLocator);
        driver.findElement(elementLocator).sendKeys(text);
    }

    public void selectByVisibleText(By dropdownLocator, By searchBoxLocator, String text) {
        forceClickUsingJavaScript(dropdownLocator);
        setElementText(searchBoxLocator, text);
        forceClickUsingJavaScript(By.xpath("//li[@data-text='" + text + "']"));
    }

    public void selectByOptionLocator(By dropdownLocator, By dropdownOptionLocator) {
        clickOnElement(dropdownLocator);
        forceClickUsingJavaScript(dropdownOptionLocator);
    }

    public String getElementText(By elementLocator) {
        return driver.findElement(elementLocator).getText();
    }

    public void waitUntilRedirectionIsDone(String url) {
        new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.urlContains(url));

    }

    public PageBase forceClickUsingJavaScript(By elementLocator) {
        waitUntilPresenceOfElement(elementLocator);
        scrollToElementView(elementLocator);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(elementLocator);
        jsExecutor.executeScript("arguments[0].click();", element);
        return this;
    }

    public void forceClickUsingJavaScript(By elementLocator, int index) {
        waitUntilPresenceOfElement(elementLocator, index);
        scrollToElementView(elementLocator, index);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        WebElement element = driver.findElements(elementLocator).get(index);
        jsExecutor.executeScript("arguments[0].click();", element);
    }

    public void forceSetElementTextUsingJavaScript(By elementLocator, String text) {
        waitUntilPresenceOfElement(elementLocator);
        scrollToElementView(elementLocator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].value = arguments[1];", driver.findElement(elementLocator), text);
    }

    public void waitUntilPresenceOfElement(By elementLocator) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(elementLocator));
    }

    public void waitUntilPresenceOfElement(By elementLocator, int index) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions
                        .visibilityOf(driver.findElements(elementLocator).get(index)));
    }

    public void scrollToElementView(By elementLocator) {
        WebElement element = driver.findElement(elementLocator);
        int elementPositionY = element.getLocation().getY();
        int viewportHeight = ((Long) ((JavascriptExecutor) driver).executeScript("return window.innerHeight || document.documentElement.clientHeight || document.body.clientHeight;")).intValue();
        int scrollPositionY = elementPositionY - (viewportHeight / 2);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, arguments[0]);", scrollPositionY);
    }

    public void scrollToElementView(By elementLocator, int index) {
        WebElement element = driver.findElements(elementLocator).get(index);
        int elementPositionY = element.getLocation().getY();
        int viewportHeight = ((Long) ((JavascriptExecutor) driver).executeScript("return window.innerHeight || document.documentElement.clientHeight || document.body.clientHeight;")).intValue();
        int scrollPositionY = elementPositionY - (viewportHeight / 2);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, arguments[0]);", scrollPositionY);
    }

    public void moveToTab(int tab) {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tab));
    }
}