package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _10_us_GradeLevels {
    DialogContent dc = new DialogContent();
    LeftNav ln=new LeftNav();

    @And("Click on the element in the LeftNav")
    public void clickOnTheElementInTheLeftNav(DataTable links) {
        List<String> strlinkList = links.asList(String.class);

        for (int i = 0; i < strlinkList.size(); i++) {
            WebElement linkWebElement = ln.getWebElement(strlinkList.get(i));
            ln.myClick(linkWebElement);
        }
    }

    @And("Click on the element in the DialogContent")
    public void clickOnTheElementInTheDialogContent(DataTable buttons) {
        List<String> strButtonsList = buttons.asList(String.class);

        for (int i = 0; i < strButtonsList.size(); i++) {
            WebElement buttonWebElement = dc.getWebElement(strButtonsList.get(i));
            dc.myClick(buttonWebElement);
        }
    }

    @And("User sends the keys into the DialogBox")
    public void userSendsTheKeysIntoTheDialogBox(DataTable data) {
        List<List<String>> items = data.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement element = dc.getWebElement(items.get(i).get(0));
            dc.mySendKeys(element, items.get(i).get(1));
        }
    }

    @Then("The admin user sending new locations information in Dialog")
    public void theAdminUserSendingNewLocationsInformationInDialog(DataTable dataTable) {
        List<List<String>> lists = dataTable.asLists();

        for (int i = 0; i < lists.size() ; i++) {
            WebElement element = dc.getWebElement(lists.get(i).get(0));
            dc.mySendKeys(element,lists.get(i).get(1));
        }
    }

    @And("Click on the element in Dialog")
    public void clickOnTheElementInDialog(DataTable dataTable) {
        List<String> list = dataTable.asList();

        for (int i = 0; i < list.size() ; i++) {
            WebElement element = dc.getWebElement(list.get(i));
            dc.myClick(element);
        }
    }


    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() throws InterruptedException {
        dc.verifyContainsText(dc.successMessage, "success");
        Thread.sleep(1000);
    }

    @And("Click on the edit button in the DialogContent")
    public void clickOnTheEditButtonInTheDialogContent() throws InterruptedException {
        Thread.sleep(1500);
        dc.myClick(dc.edit2);
    }

    @And("Click on the element in Dialog for deleting")
    public void clickOnTheElementInTheDialogContentForDeleting(DataTable dt) {
        List<String> list = dt.asList();

        for (int i = 0; i <list.size() ; i++) {
            WebElement element = dc.getWebElement(list.get(i));
            dc.myClick(element);
        }
    }

    @And("Enter shortname {string} and {string}")
    public void enterShortnameAndAnd(String shortname, String order) {
        dc.mySendKeys(dc.ShortName, shortname);
        dc.mySendKeys(dc.order, order);
    }



    @And("Click on the last edit button")
    public void clickOnTheLastEditButton() throws InterruptedException {
        Thread.sleep(500);
        dc.myClick(dc.lastEdit);
    }

    @And("Enter shortname {string} for update")
    public void enterShortnameForUpdate(String shortname) {
        dc.mySendKeys(dc.ShortName, shortname);
    }


}

