package pagesObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.logging.Logger;

@DefaultUrl("http:/practice.automationtesting.in/")
public class AutomationPageObject extends PageObject {

    @FindBy(id = "menu-item-50")
    WebElementFacade btnMyAccount;

    @FindBy(id = "reg_email")
    WebElementFacade txtEmailCreate;

    @FindBy(id = "reg_password")
    WebElementFacade txtPasswordCreate;

    @FindBy(name = "register")
    WebElementFacade btnRegister;

    @FindBy(xpath = "//*[@id='page-36']/div/div[1]/div/p[1]/strong")
    WebElementFacade labelValidation;


    public void signIn() {
        btnMyAccount.click();
    }

    public void userEnterEmail(List<String> parameters) {
        txtEmailCreate.waitUntilVisible();
        txtEmailCreate.type(parameters.get(0));
        txtPasswordCreate.type(parameters.get(1));

    }

    public void userRegister() {
        btnRegister.click();
    }


    public void verifyMyAccount(List<String> parameters) {

        String textToVerify = labelValidation.getText();
        if (textToVerify.equals(parameters.get(0))) {
            Logger.getLogger("TEST SUCCESS");
        } else {
            Assert.fail("TEST FAILED");
        }
    }
/*
    public void emailRegister(List<String> parameters) {
        txtEmailRegister.sendKeys(parameters.get(0));
    }


    public void enterPassword(List<String> parameters) {
        txtPasswdRegister.sendKeys(parameters.get(0));
    }



    public void selectProductoAddCart() {
        txtProduct.isVisible();
        Actions actions = new Actions(getDriver());
        actions.moveToElement(txtProduct).perform();
        btnAddCart.click();
    }

    public void clickOnPreceed() {
        btnProceedChk.isVisible();
        btnProceedChk.click();
        btnProceedChkSummary.click();
    }

    public void signInPayAuthentication(List<String> parameters) {
        txtEmailRegister.sendKeys(parameters.get(0));
        txtPasswdRegister.sendKeys(parameters.get(1));
    }

    public void clickSignInRegister() {
        btnSignInRegister.click();
    }

    public void goPaymentProduct() {
        btnProceedChkSummary.click();
        btnTermsService.click();
        btnProceedChkSummary.click();
        txtBankWire.click();
        btnConfirmOrder.click();

    }

    public void verifyMyOrder(List<String> parameters) {
        String textToVerify = txtOrderComplete.getText();
        if (textToVerify.equals(parameters.get(0))) {
            Logger.getLogger("TEST SUCCESS");
        } else {
            Assert.fail("TEST FAILED");
        }
    }
 */
}
