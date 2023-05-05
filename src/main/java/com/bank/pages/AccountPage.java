package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {
    By depositTab = By.xpath("//button[normalize-space()='Deposit']");
    By amountField = By.xpath("//input[@placeholder='amount']");
    By submitDeposit = By.xpath("//button[@type='submit']");
    By depositText = By.xpath("//span[@class='error ng-binding']");

    By withdrawlTab = By.xpath("//button[normalize-space()='Withdrawl']");
    By submitWithdrawl = By.xpath("//button[@type='submit']");
    By withdrawlText = By.xpath("//span[@class='error ng-binding']");


    public void clickOnDeposit() {
        clickOnElement(depositTab);

    }

    public void enterDepositAmount() {
        sendTextToElement(amountField, "100");

    }

    public void ClickOnSubmitDeposit() {
        clickOnElement(submitDeposit);
    }

    public String verifydepositeText() {
        return getTextFromElement(depositText);
    }

    public void clickOnWithdrawl() {
        clickOnElement(withdrawlTab);
    }

    public void enterWithdrawlAmount() {
        sendTextToElement(amountField, "50");
    }

    public void clickOnSubmitWithdrawl() {
        clickOnElement(submitWithdrawl);
    }

    public String verifyWithdrawlText() {
        return getTextFromElement(withdrawlText);

    }
}