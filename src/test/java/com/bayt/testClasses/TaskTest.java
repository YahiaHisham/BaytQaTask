package com.bayt.testClasses;

import com.bayt.pages.*;
import org.testng.annotations.Test;

import static com.bayt.utilities.Generators.generateRandomNumbers;
import static com.bayt.utilities.Generators.generateRandomText;
import static com.bayt.utilities.JsonReader.getValueFromJsonFile;
import static com.bayt.utilities.JsonReader.updateValueInJsonFile;
import static com.bayt.utilities.Utilities.takeScreenshot;

public class TaskTest extends TestBase {

    @Test
    public void registerAndApplyForJob() {
        updateValueInJsonFile("email", "Automation" + generateRandomText(5) + "@email.com", "LoginCredentials");
        updateValueInJsonFile("password", generateRandomText(4) + generateRandomNumbers(4), "LoginCredentials");
        String email = getValueFromJsonFile("email", "LoginCredentials");
        String password = getValueFromJsonFile("password", "LoginCredentials");
        takeScreenshot(driver, "Register User Home Page");
        new HomePage(driver)
                .clickOnAboutUsButton();
        takeScreenshot(driver, "Register User About Us Page");
        new NavigationBarPage(driver)
                .clickOnCareersButton();
        takeScreenshot(driver, "Register User Careers Page");
        new BaytCareersPage(driver)
                .assertThatUserRedirectedToBaytCareersPage(getValueFromJsonFile("BaytCareerPageUrl", "Validations"))
                .clickOnOpenJobPost()
                .moveToTab(1);
        takeScreenshot(driver, "Register User Job Details Page");
        new JobPostDetailsPage(driver)
                .clickOnEasyApplyButton();
        takeScreenshot(driver, "Register User Job Seeker Page");
        new JobSeekerSignupPage(driver)
                .setFirstName(generateRandomText(5))
                .setLastName(generateRandomText(5))
                .setEmail(email)
                .setPassword(password)
                .setMobileNumber("1" + generateRandomNumbers(9));
        new JobSeekerSignupPage(driver)
                .clickOnApplyNowButton();
        takeScreenshot(driver, "Register User Experience Page");
        new CompleteCvPage(driver)
                .clickOnSkipButton()
                .selectBirthdateDay()
                .selectBirthdateMonth()
                .selectBirthdateYear()
                .selectMaleGender()
                .selectNationality()
                .selectVisaStatus("Citizen")
                .setJobTitle("Software Engineer")
                .selectJobField("Quality Control")
                .selectJobLocation()
                .selectJobStartDateMonth()
                .selectJobStartDateYear()
                .clickOnCurrentlyWorkHereButton()
                .setCompanyName(generateRandomText(5))
                .selectCompanyIndustry("Advertising")
                .selectEducationDegree("Higher diploma")
                .setEducationUniversity("Harvard University")
                .selectEducationCountry()
                .selectEducationCity()
                .setEducationMajor("Computer Science")
                .selectGraduationMonth()
                .selectGraduationYear()
                .clickOnSaveButton();
        new ApplicationStatusPage(driver)
                .clickOnApplyNowButton();
        new ApplicationStatusPage(driver)
                .assertThatApplicationSentSuccessfully(getValueFromJsonFile("ApplicationStatus", "Validations"));
        takeScreenshot(driver, "Register User Applications Status Page");
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
