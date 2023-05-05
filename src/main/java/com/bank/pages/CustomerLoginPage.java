package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CustomerLoginPage extends Utility {
    By customerLoginTab = By.xpath("//button[contains(text(),'Customer Login')]");
    By nameField = By.xpath("//select[@id='userSelect']");
    By loginTab = By.xpath("//button[contains(text(),'Login')]");
    By loginOnCustomerLoginPageTab = By.xpath("//button[contains(text(),'Login')]");
    By logoutTab = By.xpath("//button[contains(text(),'Logout')]");
    By yourNameField = By.xpath("//select[@id='userSelect']");
    By yourNameText = By.xpath("//label[contains(text(),'Your Name :')]");



    public void clickOnCustomerLogin(){
       mouseHoverToElementAndClick(customerLoginTab);
    }

    public void selectName(){
    mouseHoverToElementAndClick(nameField);
        selectByVisibleTextFromDropDown(nameField,"John Wick");
    }
    public void clickOnLogin(){
        clickOnElement(loginTab);
    }
    public void clickOnLogout(){
        clickOnElement(logoutTab);
    }
    public void clickOnLoginOnCustomerLoginPage(){
        clickOnElement(loginOnCustomerLoginPageTab);
    }
    public String verifyLogoutButton(){

        return getTextFromElement(logoutTab);
    }
    public void isLogoutDisplayed(){
        WebElement element = driver.findElement(logoutTab);
        if (element.isSelected()) {
            System.out.println("Logout has not displayed");
            element.click();
        } else {
            System.out.println("Logout has displayed");
        }
    }


        public void selectYourNameField(){
        clickOnElement(yourNameField);
        selectByContainsTextFromDropDown(yourNameField,"John Wick");

    }
    public void isYourNameTextDisplayed() {
        WebElement element = driver.findElement(yourNameText);
        if (element.isSelected()) {
            System.out.println("Logout has not displayed");
            element.click();
        } else {
            System.out.println("Logout has displayed");
        }
    }
   public String verifyYourName(){

        return getTextFromElement(yourNameText);
    }



}
