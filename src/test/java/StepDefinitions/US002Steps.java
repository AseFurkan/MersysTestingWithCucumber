package StepDefinitions;

import Pages.US002Pages;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US002Steps {

    US002Pages hr = new US002Pages();


    @And("Click on the element")
    public void clickOnTheElement(DataTable element) {
        List<String> strlinkList = element.asList(String.class);

        for (int i = 0; i < strlinkList.size(); i++) {
            WebElement linkWebElement = hr.getWebElement(strlinkList.get(i));
            hr.myClick(linkWebElement);
        }

    }

    @And("User sending the keys")
    public void userSendingTheKeys(DataTable elements) {
        List<List<String>> items = elements.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement e = hr.getWebElement(items.get(i).get(0));
            String yazi = items.get(i).get(1);

            hr.mySendKeys(e, yazi);
        }
    }
    @And("success messages")
    public void successMessages(DataTable elements) {
        List<List<String>> items = elements.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement e = hr.getWebElement(items.get(i).get(0));
            String yazi = items.get(i).get(1);

            hr.verifyContainsText(e, yazi);
        }
    }

}



