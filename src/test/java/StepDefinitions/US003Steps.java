package StepDefinitions;

import Pages.US002Pages;
import Pages.US003Pages;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class US003Steps {

    US003Pages ds = new US003Pages();


    @And("Click on the element")
    public void clickOnTheElement(DataTable element) {
        List<String> strlinkList = element.asList(String.class);

        for (int i = 0; i < strlinkList.size(); i++) {
            WebElement linkWebElement = ds.getWebElement(strlinkList.get(i));
            ds.myClick(linkWebElement);
        }

    }

    @And("User sending the keys")
    public void userSendingTheKeys(DataTable elements) {
        List<List<String>> items = elements.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement e = ds.getWebElement(items.get(i).get(0));
            String yazi = items.get(i).get(1);

            ds.mySendKeys(e, yazi);
        }
    }

    @And("success messages")
    public void successMessages(DataTable elements) {
        List<List<String>> items = elements.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement e = ds.getWebElement(items.get(i).get(0));
            String yazi = items.get(i).get(1);

            ds.verifyContainsText(e, yazi);
        }
    }

    @And("Escape on the element")
    public void escapeOnTheElement(DataTable elements) {
        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
    }

}


