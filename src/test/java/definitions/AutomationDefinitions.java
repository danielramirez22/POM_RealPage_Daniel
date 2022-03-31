package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.AutomationSteps;

import java.util.List;

public class AutomationDefinitions {
    @Steps
    AutomationSteps automationSteps;
    @Given("^The user is on Homepage$")
    public void theUserIsOnHomepage() {
        automationSteps.openHomePage();
    }

    @Then("^the user clicks on Sign in$")
    public void theUserClicksOnSignIn() {
        automationSteps.SignIn();

    }

    @Then("^user enters email and password$")
    public void userEntersEmailAndPassword(List<String> parameters) {
        automationSteps.userEmail(parameters);

    }

    @Then("^user clicks register$")
    public void userClicksRegister() {
        automationSteps.userClicksRegister();
    }

    @Then("^the user is taken my account page$")
    public void theUserIsTakenMyAccountPage(List<String> parameters) {
        automationSteps.verifyMyAccount(parameters);
    }

}
