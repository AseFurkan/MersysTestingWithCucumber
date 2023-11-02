package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class _06_us {
    String educationName = RandomStringUtils.randomAlphanumeric(8);//8 harf
    String educationShCo = RandomStringUtils.randomNumeric(4); // 4 rakam
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @Given("Go to positions page Education->Setup->Subject Categories")
    public void goToPositionsPageEducationSetupSubjectCategories() {
        ln.myClick(ln.education);
        ln.myClick(ln.setupedu);
        ln.myClick(ln.subjectcat);
    }

    @When("Add a new category by using name and short name")
    public void addANewCategoryByUsingNameAndShortName() {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nameInput, educationName);
        dc.mySendKeys(dc.codeInput, educationShCo);
        dc.myClick(dc.saveButton);
    }

    @When("Edit category")
    public void editCategory() {
        dc.searchInput.sendKeys(educationName);
        dc.myClick(dc.searchButton);
        dc.myClick(dc.editbutton);
        dc.myClick(dc.activebutton);
        dc.myClick(dc.activebutton);
        dc.nameInput.sendKeys("xx");
        dc.codeInput.sendKeys("11");
        dc.myClick(dc.saveButton);

    }

    @Then("Delete category")
    public void deleteCategory() {
        dc.deleteItem(educationName);


    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.verifyContainsText(dc.successMessage,"success");


    }
}




