package steps;

import net.thucydides.core.annotations.Step;
import pagesObject.AutomationPageObject;

import java.util.List;

public class AutomationSteps {
    AutomationPageObject automationPageObject;

    @Step

    public void openHomePage() {
        automationPageObject.open();
    }

    @Step
    public void SignIn() {
        automationPageObject.signIn();
    }

    @Step
    public void userEmail(List<String> parameters) {
        automationPageObject.userEnterEmail(parameters);
    }

    public void userClicksRegister() {
        automationPageObject.userRegister();
    }

    @Step
    public void verifyMyAccount(List<String> parameters) {
        automationPageObject.verifyMyAccount(parameters);
    }
}