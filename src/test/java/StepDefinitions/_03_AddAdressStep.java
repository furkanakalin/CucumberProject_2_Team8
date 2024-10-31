package StepDefinitions;

import Pages._03_DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _03_AddAdressStep {
    _03_DialogContent dc=new _03_DialogContent();

    @And("Click the Element in DialogContent")
    public void clickTheElementInDialogContent(DataTable dtButtons) {
        List<String> buttons=dtButtons.asList();
        for (int i = 0; i < buttons.size() ; i++) {
            dc.myClick(dc.getWebElement(buttons.get(i)));

        }
    }

    @And("User Send keys in DialogContent")
    public void userSendKeysInDialogContent(DataTable dtboxandLetters) {
        List<List<String>> boxandLetters=dtboxandLetters.asLists();
        for (int i = 0; i < boxandLetters.size(); i++) {
            WebElement box= dc.getWebElement(boxandLetters.get(i).get(0));
            dc.mySendKeys(box, boxandLetters.get(i).get(1));
        }
    }
}
