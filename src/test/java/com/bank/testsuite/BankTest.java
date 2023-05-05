package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {

    AccountPage accountPage = new AccountPage();
    AddCustomerPage addCustomerPage = new AddCustomerPage();
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();
    CustomersPage customersPage = new CustomersPage();
    HomePage homePage = new HomePage();
    OpenAccountPage openAccountPage = new OpenAccountPage();

    @Test
    public void bankManagerShouldAddCustomerSuccessfully() {
        // click On "Bank Manager Login" Tab
        bankManagerLoginPage.clickOnBankManagerLogin();
        //click On "Add Customer" Tab
        addCustomerPage.clickOnAddCustomer();
        //enter FirstName
        addCustomerPage.enterFirstName();
        //enter LastName
        addCustomerPage.enterLastName();
        //enter PostCode
        addCustomerPage.enterPostcode();
        //click On "Add Customer" Button
        addCustomerPage.clickAddCustomer();
        //Verify popup display
        addCustomerPage.verifyPopUpText();
        //click on "ok" button on popup.
        addCustomerPage.acceptpopAlert();


    }

    @Test
    public void bankManagerShouldOpenAccountSuccessfully() {
        //bankManagerShouldAddCustomerSuccessfully();
        //Click on Home
        homePage.clickOnHome();
        //click On "Bank Manager Login" Tab
        bankManagerLoginPage.clickOnBankManagerLogin();
        //click On "Open Account" Tab
        openAccountPage.clickOnOpenAccount();
        //Search customer that created in first test
        openAccountPage.selectCustomer();
        //Select currency "Pound"
        openAccountPage.selectCurrency();
        //click on "process" button
        openAccountPage.clickOnProcess();
        //popup displayed
        openAccountPage.verifyPopUpText();

        //	verify message "Account created successfully"

        //	click on "ok" button on popup.
        openAccountPage.acceptpopAlert();


    }

    @Test
    public void customerShouldLoginAndLogoutSuceessfully() {
        bankManagerShouldOpenAccountSuccessfully();
        //Click on Home
        homePage.clickOnHome();
        //click on "Customer Login" Tab
        customerLoginPage.clickOnCustomerLogin();
        //search customer that you created.
        customerLoginPage.selectYourNameField();
        //click on "Login" Button
        customerLoginPage.clickOnLoginOnCustomerLoginPage();
        //verify "Logout" Tab displayed.
        customerLoginPage.isLogoutDisplayed();
        //click on "Logout"
        customerLoginPage.clickOnLogout();
        //verify "Your Name" text displayed.
        customerLoginPage.isYourNameTextDisplayed();

}
@Test
    public void customerShouldDepositMoneySuccessfully(){
    bankManagerShouldOpenAccountSuccessfully();
    //Click on Home
    homePage.clickOnHome();
    //click on "Customer Login" Tab
    customerLoginPage.clickOnCustomerLogin();
    //search customer that you created.
    customerLoginPage.selectYourNameField();
    //click on "Login" Button
    customerLoginPage.clickOnLogin();
    //click on "Deposit" Tab
    accountPage.clickOnDeposit();
    //Enter amount 100
    accountPage.enterDepositAmount();
    //click on "Deposit" Button
    accountPage.ClickOnSubmitDeposit();
    //verify message "Deposit Successful"
    Assert.assertEquals(accountPage.verifydepositeText(),"Deposit Successful");

}
@Test
public void customerShouldWithdrawMoneySuccessfully(){
    //Click on Home
    homePage.clickOnHome();
    //bankManagerShouldOpenAccountSuccessfully();

    //click on "Customer Login" Tab
    customerLoginPage.clickOnCustomerLogin();
    //search customer that you created.
    customerLoginPage.selectYourNameField();
    //click on "Login" Button
    customerLoginPage.clickOnLogin();
    //click on "Withdrawal" Tab
    accountPage.clickOnWithdrawl();
    //Enter amount 50
    accountPage.enterWithdrawlAmount();
    //click on "Withdrawal" Button
    accountPage.clickOnSubmitWithdrawl();
    //verify message "Withdrawal Successful"
    Assert.assertEquals(accountPage.verifyWithdrawlText(),"Transaction successful");

}


}