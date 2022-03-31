package steps;

import net.thucydides.core.annotations.Step;
import pagesObject.FailLoginPage;
import pagesObject.LoginPage;

import java.util.List;

public class FailLoginSteps {
    FailLoginPage failLoginPage;

    @Step

    public void openHomePage() {
        failLoginPage.open();
    }

    @Step
    public void SignIn() {
        failLoginPage.signIn();
    }

    @Step
    public void userEmail(List<String> parameters) {
        failLoginPage.userEnterEmail(parameters);
    }

    public void userClicksLogin() {
        failLoginPage.userLogin();
    }

    @Step
    public void verifyMyAccount(List<String> parameters) {
        failLoginPage.verifyMyAccount(parameters);
    }
}
