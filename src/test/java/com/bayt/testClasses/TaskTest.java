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
    public void registerAndApplyForJob() throws InterruptedException {
        updateValueInJsonFile("email", generateRandomText(9) + "@email.com", "LoginCredentials");
        updateValueInJsonFile("password", generateRandomText(4) + generateRandomNumbers(4), "LoginCredentials");
        String email = getValueFromJsonFile("email", "LoginCredentials");
        String password = getValueFromJsonFile("password", "LoginCredentials");
        new HomePage(driver)
                .clickOnAboutUsButton();
        new NavigationBarPage(driver)
                .clickOnCareersButton();
        new BaytCareersPage(driver)
                .assertThatUserRedirectedToBaytCareersPage(getValueFromJsonFile("BaytCareerPageUrl", "Validations"))
                .clickOnOpenJobPost()
                .moveToTab(1);
        new JobPostDetailsPage(driver)
                .clickOnEasyApplyButton();
        new JobSeekerSignupPage(driver)
                .setFirstName(generateRandomText(5))
                .setLastName(generateRandomText(5))
                .setEmail(email)
                .setPassword(password)
                .setMobileNumber("1"+generateRandomNumbers(9));
//        Thread.sleep(20000);
        new JobSeekerSignupPage(driver)
                .clickOnApplyNowButton();
        new CompleteCvPage(driver)
                .clickOnSkipButton()
                .selectBirthdateDay("11")
                .selectBirthdateMonth("August")
                .selectBirthdateYear("1997")
                .selectMaleGender()
                .selectNationality("Egypt")
                .selectVisaStatus("Citizen")
                .setJobTitle("Software Engineer")
                .selectJobField("Quality Control")
                .selectJobLocation("Egypt")
                .selectJobStartDateMonth("March")
                .selectJobStartDateYear("2020")
                .clickOnCurrentlyWorkHereButton()
                .setCompanyName(generateRandomText(5))
                .selectCompanyIndustry("Banking")
                .selectEducationDegree("Bachelor's degree")
                .setEducationUniversity("university")
                .selectEducationCountry("Egypt")
                .selectEducationCity("Cairo")
                .setEducationMajor("major")
                .selectGraduationMonth("May")
                .selectGraduationYear("2005")
                .clickOnSaveButton();
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
