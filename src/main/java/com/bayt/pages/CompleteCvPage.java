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
    private final By jobTitleField = By.id("experienceForm_jobTitle");
    private final By jobFieldDropdown = By.id("experienceForm_jobRole__r");
    private final By jobLocationDropdown = By.id("experienceForm_country__r");
    private final By startDateMonthDropdown = By.id("experienceForm_startMonth__r");
    private final By startDateYearDropdown = By.id("experienceForm_startYear__r");
    private final By currentlyWorkHereCheckBox = By.id("experienceForm_currentlyWorkHere");
    private final By companyNameField = By.id("experienceForm_company");
    private final By companyIndustryDropdown = By.id("experienceForm_companyInd__r");
    private final By degreeDropdown = By.id("EducationForm_degree__r");
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

    public CompleteCvPage clickOnSkipButton() {
        clickOnElement(skipButton);
        return this;
    }

    public CompleteCvPage selectBirthdateDay(String day) {
        selectByVisibleText(birthdateDayDropdown, day);
        return this;
    }

    public CompleteCvPage selectBirthdateMonth(String month) {
        selectByVisibleText(birthdateMonthDropdown, month);
        return this;
    }

    public CompleteCvPage selectBirthdateYear(String year) {
        selectByVisibleText(birthdateYearDropdown, year);
        return this;
    }

    public CompleteCvPage selectMaleGender() {
        forceClickUsingJavaScript(maleGenderOption);
        return this;
    }

    public CompleteCvPage selectNationality(String nationality) {
        selectByVisibleText(nationalityDropdown, nationality);
        return this;
    }

    public CompleteCvPage selectVisaStatus(String visaStatus) {
        selectByVisibleText(visaStatusDayDropdown, visaStatus);
        return this;
    }

    public CompleteCvPage setJobTitle(String jobTitle) {
        setElementText(jobTitleField, jobTitle);
        selectByVisibleText(jobTitleField,jobTitle);
        return this;
    }

    public CompleteCvPage selectJobField(String jobField) {
        selectByVisibleText(jobFieldDropdown, jobField);
        return this;
    }

    public CompleteCvPage selectJobLocation(String jobLocation) {
        selectByVisibleText(jobLocationDropdown, jobLocation);
        return this;
    }

    public CompleteCvPage selectJobStartDateMonth(String month) {
        selectByVisibleText(startDateMonthDropdown, month);
        return this;
    }

    public CompleteCvPage selectJobStartDateYear(String year) {
        selectByVisibleText(startDateYearDropdown, year);
        return this;
    }

    public CompleteCvPage clickOnCurrentlyWorkHereButton() {
        forceClickUsingJavaScript(currentlyWorkHereCheckBox);
        return this;
    }

    public CompleteCvPage setCompanyName(String companyNme) {
        setElementText(companyNameField, companyNme);
        return this;
    }

    public CompleteCvPage selectCompanyIndustry(String industry) {
        selectByVisibleText(companyIndustryDropdown, industry);
        return this;
    }

    public CompleteCvPage selectEducationDegree(String degree) {
        selectByVisibleText(degreeDropdown, degree);
        return this;
    }

    public CompleteCvPage setEducationUniversity(String universityName) {
        setElementText(universityField, universityName);
        return this;
    }

    public CompleteCvPage selectEducationCountry(String educationCountry) {
        selectByVisibleText(countryDropdown, educationCountry);
        return this;
    }

    public CompleteCvPage selectEducationCity(String educationCity) {
        selectByVisibleText(cityDropdown, educationCity);
        return this;
    }

    public CompleteCvPage setEducationMajor(String major) {
        setElementText(majorField, major);
        return this;
    }

    public CompleteCvPage selectGraduationMonth(String graduationMonth) {
        selectByVisibleText(graduationMonthDropdown, graduationMonth);
        return this;
    }

    public CompleteCvPage selectGraduationYear(String graduationYear) {
        selectByVisibleText(graduationYearDropdown, graduationYear);
        return this;
    }

    public CompleteCvPage clickOnSaveButton() {
        clickOnElement(saveButton);
        return this;
    }

}
