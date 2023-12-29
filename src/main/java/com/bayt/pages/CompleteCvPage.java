package com.bayt.pages;

import com.bayt.common.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompleteCvPage extends PageBase {
    private final By skipButton = By.id("skip-btn");
    private final By birthdateDayDropdown = By.id("personalInformationForm_birthDay__r");
    private final By birthdateMonthDropdown = By.id("personalInformationForm_birthMonth__r");
    private final By birthdateYearDropdown = By.id("personalInformationForm_birthYear__r");
    private final By maleGenderOption = By.id("personalInformationForm_gender_1");
    private final By nationalityDropdown = By.id("personalInformationForm_nationalityCitizenAc__r");
    private final By visaStatusDayDropdown = By.id("personalInformationForm_visaStatus__r");
    private final By visaStatusDayDropdownSearchBox = By.cssSelector("div[data-bayt-popover='38'] input.is-small");
    private final By jobTitleField = By.id("experienceForm_jobTitle");
    private final By jobFieldDropdown = By.id("experienceForm_jobRole__r");
    private final By jobFieldDropdownSearchBox = By.cssSelector("div[data-bayt-popover='44'] input.is-small");
    private final By jobLocationDropdown = By.id("experienceForm_country__r");
    private final By startDateMonthDropdown = By.id("experienceForm_startMonth__r");
    private final By startDateYearDropdown = By.id("experienceForm_startYear__r");
    private final By currentlyWorkHereCheckBox = By.id("experienceForm_currentlyWorkHere");
    private final By companyNameField = By.id("experienceForm_company");
    private final By companyIndustryDropdown = By.id("experienceForm_companyInd__r");
    private final By companyIndustryDropdownSearchBox = By.cssSelector("div[data-bayt-popover='65'] input.is-small");
    private final By degreeDropdown = By.id("EducationForm_degree__r");
    private final By degreeDropdownSearchBox = By.cssSelector("div[data-bayt-popover='68'] input.is-small");
    private final By universityField = By.id("EducationForm_institution");
    private final By countryDropdown = By.id("EducationForm_educationCountry__r");
    private final By cityDropdown = By.id("EducationForm_educationCity__r");
    private final By majorField = By.id("EducationForm_major");
    private final By graduationMonthDropdown = By.id("EducationForm_completionMonth__r");
    private final By graduationYearDropdown = By.id("EducationForm_completionYear__r");
    private final By saveButton = By.name("submit");

    public CompleteCvPage(WebDriver driver) {
        super(driver);
    }

    private By dropdownOption(int dataBaytPopoverValue, int index) {
        return By.cssSelector("div[data-bayt-popover='" + dataBaytPopoverValue + "'] ul > li:nth-child(" + index + ")");
    }

    public CompleteCvPage clickOnSkipButton() {
        clickOnElement(skipButton);
        return this;
    }

    public CompleteCvPage selectBirthdateDay() {
        selectByOptionLocator(birthdateDayDropdown, dropdownOption(20, 10));
        return this;
    }

    public CompleteCvPage selectBirthdateMonth() {
        selectByOptionLocator(birthdateMonthDropdown, dropdownOption(23, 10));
        return this;
    }

    public CompleteCvPage selectBirthdateYear() {
        selectByOptionLocator(birthdateYearDropdown, dropdownOption(26, 22));
        return this;
    }

    public CompleteCvPage selectMaleGender() {
        forceClickUsingJavaScript(maleGenderOption);
        return this;
    }

    public CompleteCvPage selectNationality() {
        selectByOptionLocator(nationalityDropdown, dropdownOption(29, 7));
        return this;
    }

    public CompleteCvPage selectVisaStatus(String visaStatus) {
        selectByVisibleText(visaStatusDayDropdown, visaStatusDayDropdownSearchBox, visaStatus);
        return this;
    }

    public CompleteCvPage setJobTitle(String jobTitle) {
        selectByVisibleText(jobTitleField, jobTitleField, jobTitle);
        return this;
    }

    public CompleteCvPage selectJobField(String jobField) {
        selectByVisibleText(jobFieldDropdown, jobFieldDropdownSearchBox, jobField);
        return this;
    }

    public CompleteCvPage selectJobLocation() {
        selectByOptionLocator(jobLocationDropdown, dropdownOption(47, 10));
        return this;
    }

    public CompleteCvPage selectJobStartDateMonth() {
        selectByOptionLocator(startDateMonthDropdown, dropdownOption(50, 7));
        return this;
    }

    public CompleteCvPage selectJobStartDateYear() {
        selectByOptionLocator(startDateYearDropdown, dropdownOption(53, 8));
        return this;
    }

    public CompleteCvPage clickOnCurrentlyWorkHereButton() {
        forceClickUsingJavaScript(currentlyWorkHereCheckBox);
        return this;
    }

    public CompleteCvPage setCompanyName(String companyName) {
        selectByVisibleText(companyNameField, companyNameField, companyName);
        return this;
    }

    public CompleteCvPage selectCompanyIndustry(String industry) {
        selectByVisibleText(companyIndustryDropdown, companyIndustryDropdownSearchBox, industry);
        return this;
    }

    public CompleteCvPage selectEducationDegree(String degree) {
        selectByVisibleText(degreeDropdown, degreeDropdownSearchBox, degree);
        return this;
    }

    public CompleteCvPage setEducationUniversity(String universityName) {
        selectByVisibleText(universityField, universityField, universityName);
        return this;
    }

    public CompleteCvPage selectEducationCountry() {
        selectByOptionLocator(countryDropdown, dropdownOption(74, 11));
        return this;
    }

    public CompleteCvPage selectEducationCity() {
        selectByOptionLocator(cityDropdown, dropdownOption(77, 7));
        return this;
    }

    public CompleteCvPage setEducationMajor(String major) {
        selectByVisibleText(majorField, majorField, major);
        return this;
    }

    public CompleteCvPage selectGraduationMonth() {
        selectByOptionLocator(graduationMonthDropdown, dropdownOption(83, 4));
        return this;
    }

    public CompleteCvPage selectGraduationYear() {
        selectByOptionLocator(graduationYearDropdown, dropdownOption(86, 10));
        return this;
    }

    public void clickOnSaveButton() {
        forceClickUsingJavaScript(saveButton);
    }

}
