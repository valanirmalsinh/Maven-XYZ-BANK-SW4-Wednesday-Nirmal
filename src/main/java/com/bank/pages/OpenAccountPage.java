package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility {
    By openAccountTab = By.xpath("//button[normalize-space()='Open Account']");
    By customerField = By.xpath("//select[@id='userSelect']");
    By currencyField = By.xpath("//select[@id='currency']");
    By processTab = By.xpath("//button[contains(text(),'Process')]");


    public void clickOnOpenAccount(){
        clickOnElement(openAccountTab);
    }
    public void selectCustomer(){
       mouseHoverToElementAndClick(customerField);
        selectByVisibleTextFromDropDown(customerField,"Kiara Parikh");
    }
    public void selectCurrency(){
        clickOnElement(currencyField);
        selectByVisibleTextFromDropDown(currencyField,"Pound");
    }
    public void clickOnProcess(){

        clickOnElement(processTab);
    }
    public String verifyPopUpText(){
        return getTextFromAlert();
    }
    public void acceptpopAlert(){
        acceptAlert();
    }
}
