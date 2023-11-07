package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;

import java.util.List;

import static Utilities.GWD.getDriver;

public class _09US_BankAccounts {


    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();
    @And("The admin click on the edit element Dialog sends the keys into the DialogBox")
    public void theAdminClickOnTheEditElementDialogSendsTheKeysIntoTheDialogBox(DataTable dt) {
        List<List<String>> lists = dt.asLists();

        for (int i = 0; i <lists.size() ; i++) {
            WebElement element = dc.getWebElement(lists.get(i).get(0));
            dc.mySendKeys(element,lists.get(i).get(1));
        }
    }

    @And("Click on the element in DialogBox")
    public void clickOnTheElementInDialogBox(DataTable buttons) {
        List<String> strButtonsList = buttons.asList(String.class);

        for (int i = 0; i < strButtonsList.size(); i++) {
            WebElement linkWebElement = dc.getWebElement(strButtonsList.get(i));
            dc.myClick(linkWebElement);
        }
    }

    @And("Click on the search button")
    public void clickOnTheSearchButton() throws InterruptedException {
        dc.myClick(dc.searchButton);
        Thread.sleep(1500);
    }
 }



