package pagesObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;

import java.util.List;
import java.util.logging.Logger;

@DefaultUrl("http:/practice.automationtesting.in/")
public class LoginPage extends PageObject {

    @FindBy(id = "menu-item-50")
    WebElementFacade btnMyAccount;

    @FindBy(id = "username")
    WebElementFacade txtUserName;

    @FindBy(id = "password")
    WebElementFacade txtPassword;

    @FindBy(xpath = "//*[@id='customer_login']/div[1]/form/p[3]/input[3]")
    WebElementFacade btnLogin;

    @FindBy(xpath = "//*[@id='page-36']/div/div[1]/div/p[1]/strong")
    WebElementFacade labelValidation;

    public void signIn() {
        btnMyAccount.click();
    }

    public void userEnterEmail(List<String> parameters) {
        txtUserName.waitUntilVisible();
        txtUserName.type(parameters.get(0));
        txtPassword.type((parameters.get(1)));

    }

    public void userLogin() {
        btnLogin.click();
    }

    public void verifyMyAccount(List<String> parameters) {

        String textToVerify = labelValidation.getText();
        if (textToVerify.contains(parameters.get(0))) {
            Logger.getLogger("TEST SUCCESS");
        } else {
            Assert.fail("TEST FAILED");
        }
    }

}
