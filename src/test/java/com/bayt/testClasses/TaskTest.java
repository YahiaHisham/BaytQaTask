package com.bayt.testClasses;

import com.bayt.pages.FindJobsListingPage;
import com.bayt.pages.HomePage;
import com.bayt.pages.JobSeekerSignupPage;
import org.testng.annotations.Test;

import static com.bayt.utilities.JsonReader.getValueFromJsonFile;
import static com.bayt.utilities.Utilities.takeScreenshot;

public class TaskTest extends TestBase {

    @Test
    public void one() {

    }

    @Test
    public void applyForJobInMobileView() {
        takeScreenshot(driver, "mobile view home page");
        new HomePage(driver)
                .setJobSearchQuery("Quality Assurance Engineer")
                .setJobSearchLocation("United Arab Emirates")
                .clickOnFindJobsButton();
        takeScreenshot(driver, "mobile view find jobs page");
        new FindJobsListingPage(driver)
                .clickOnEasyApplyButton();
        takeScreenshot(driver, "mobile view job seeker page");
        new JobSeekerSignupPage(driver)
                .assertThatJobSeekerSignupPageIsDisplayed(getValueFromJsonFile("SignupPageTitle", "Validations"));
    }

}
