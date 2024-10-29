package StepDefinitions;

import Pages.LeftNav;
import Pages._01_DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;

import java.util.List;

public class dataTable {
    LeftNav ln=new LeftNav();
    _01_DialogContent dc=new _01_DialogContent();


    @And("Click on the Element in LeftNav")
    public void clickOnTheElementInLeftNav(DataTable dtLinks) {
        List<String> links=dtLinks.asList();
        for (int i = 0; i < links.size(); i++) {
            ln.myClick(ln.getWebElement(links.get(i)));
        }


    }

    @And("Click on the Element in DialogContent")
    public void clickOnTheElementInDialogContent(DataTable dtButtons) {
        List<String> buttons=dtButtons.asList();
        for (int i = 0; i < buttons.size() ; i++) {
            ln.myClick(dc.getWebElement(buttons.get(i)));

        }
    }


    @And("User Sending the keys in DialogContent")
    public void userSendingTheKeysInDialogContent(DataTable dtboxandLetters) {
    List<List<String>> boxandLetters=dtboxandLetters.asLists();

        for (int i = 0; i < boxandLetters.size(); i++) {
            WebElement box= dc.getWebElement(boxandLetters.get(i).get(0));
            dc.mySendKeys(box, boxandLetters.get(i).get(1));
        }



    }

}
