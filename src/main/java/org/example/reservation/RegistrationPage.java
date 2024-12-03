package org.example.reservation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

    private WebDriver driver;

    @FindBy(id = "firstname")
    private WebElement enterFirstName;

    @FindBy(id = "lastname")
    private WebElement enterLastName;

    @FindBy(id = "email")
    private WebElement enterEmail;

    @FindBy(id = "password")
    private WebElement enterPassword;

    @FindBy(name = "street")
    private WebElement enterStreetAddress;

    @FindBy(name = "city")
    private WebElement enterCityAddress;

    @FindBy(name = "zip")
    private WebElement enterZipAddress;

    @FindBy(id = "register-btn")
    private WebElement registerButton;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void accessRegistrationPage(String url) {
        this.driver.get(url);
    }

    public void enterFullName(String firstName, String lastName) {
        this.enterFirstName.sendKeys(firstName);
        this.enterLastName.sendKeys(lastName);
    }

    public void enterCredentials(String email, String password) {
        this.enterEmail.sendKeys(email);
        this.enterPassword.sendKeys(password);
    }

    public void enterAddress(String street, String city, String zip) {
        this.enterStreetAddress.sendKeys(street);
        this.enterCityAddress.sendKeys(city);
        this.enterZipAddress.sendKeys(zip);
    }

    public void registerButton(){
        this.registerButton.click();
    }


}
