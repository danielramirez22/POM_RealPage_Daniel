package steps;

import net.thucydides.core.annotations.Step;
import pagesObject.AutomationPageObject;
import pagesObject.LoginPage;

import java.util.List;

public class LoginSteps {

    LoginPage loginPage;

    @Step

    public void openHomePage() {
        loginPage.open();
    }

    @Step
    public void SignIn() {
        loginPage.signIn();
    }

    @Step
    public void userEmail(List<String> parameters) {
        loginPage.userEnterEmail(parameters);
    }

    public void userClicksLogin() {
        loginPage.userLogin();
    }

    @Step
    public void verifyMyAccount(List<String> parameters) {
        loginPage.verifyMyAccount(parameters);
    }
}
