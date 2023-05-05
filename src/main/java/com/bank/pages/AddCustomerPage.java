package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AddCustomerPage extends Utility {
    By addCustomerTab = By.xpath("//button[normalize-space()='Add Customer']");
    By firstNameTab = By.xpath("//input[@placeholder='First Name']");
    By lastNameTab = By.xpath("//input[@placeholder='Last Name']");
    By postcodeTab = By.xpath("//input[@placeholder='Post Code']");
    By clickCustomerTab = By.xpath("//button[@type='submit']");



    public void clickOnAddCustomer(){
        clickOnElement(addCustomerTab);
    }
    public void enterFirstName(){

        sendTextToElement(firstNameTab,"Kiara");
    }
    public void enterLastName(){

        sendTextToElement(lastNameTab,"Parikh");
    }
    public void enterPostcode(){
        sendTextToElement(postcodeTab,"HA3 0XY");
    }
    public void clickAddCustomer(){
        clickOnElement(clickCustomerTab);
    }
    public String verifyPopUpText(){
        return getTextFromAlert();
    }
    public void acceptpopAlert(){
        acceptAlert();
    }


}
