package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.FailLoginSteps;

import java.util.List;

public class FailLoginDefinitions {

        @Steps
        FailLoginSteps failLoginSteps;

        @Given("^The user is on principal page$")
        public void TheUserIsOnPrincipalPage() {
            failLoginSteps.openHomePage();
        }

        @Then("^The user clicks on MyAccount$")
        public void theUserClicksOnMyAccount() {
                failLoginSteps.SignIn();
        }

        @And("^user enters an incorrect email and an incorrect password$")
        public void userEntersAnIncorrectEmailAndAnIncorrectPassword(List<String> parameters) {
                failLoginSteps.userEmail(parameters);
        }

        @And("^The user clicks Login$")
        public void theUserClicksLogin() {
                failLoginSteps.userClicksLogin();
        }

        @Then("^the user can not login in the webside$")
        public void theUserCanNotLoginInTheWebside(List<String> parameters) {
                failLoginSteps.verifyMyAccount(parameters);
        }
}
