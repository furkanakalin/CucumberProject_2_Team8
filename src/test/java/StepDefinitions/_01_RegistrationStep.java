package StepDefinitions;

import Pages._01_DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _01_RegistrationStep {
    _01_DialogContent dc=new _01_DialogContent();


    @And("Click on Element in DialogContent")
    public void clickOnTheElementInDialogContent(DataTable dtButtons) {
        List<String> buttons=dtButtons.asList();
        for (int i = 0; i < buttons.size() ; i++) {
            dc.myClick(dc.getWebElement(buttons.get(i)));

        }
    }

    @And("User Sending keys in DialogContent")
    public void userSendingTheKeysInDialogContent(DataTable dtboxandLetters) {
        List<List<String>> boxandLetters=dtboxandLetters.asLists();

        for (int i = 0; i < boxandLetters.size(); i++) {
            WebElement box= dc.getWebElement(boxandLetters.get(i).get(0));
            dc.mySendKeys(box, boxandLetters.get(i).get(1));
        }
    }

    @Then("Success message should be displayed")
    public void success_message_should_be_displayed() {
        dc.verifyMessageContainsText("MY Account");

    }
}
