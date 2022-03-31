package definitions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.LoginSteps;

import java.util.List;

public class LoginDefinitions {

        @Steps
        LoginSteps loginSteps;

        @Given("^The user is on Home$")
        public void theUserIsOnHome() {
                loginSteps.openHomePage();
        }

        @Then("^the user clicks on MyAccount$")
        public void theUserClicksOnMyAccount() {
                loginSteps.SignIn();

        }

        @Then("^user enters email and password on login frame$")
        public void userEntersEmailAndPasswordOnLoginFrame(List<String> parameters) {
                loginSteps.userEmail(parameters);

        }

        @Then("^user clicks Login$")
        public void userClicksRegister() {
                loginSteps.userClicksLogin();
        }

        @Then("^the user is taken My Account Page$")
        public void theUserIsTakenMyAccountPage(List<String> parameters) {
                loginSteps.verifyMyAccount(parameters);
        }


}
