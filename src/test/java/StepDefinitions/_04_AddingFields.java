package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _04_AddingFields {
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();
    String name = "ASDF";
    String code = "1020";
    String nameUpdated = "asdf";


    @Given("Navigate to fields")
    public void navigateToFields() {
        ln.myClick(ln.setup);
        ln.myClick(ln.parameters);
        ln.myClick(ln.fields);
    }

    @When("Add a new field")
    public void addANewField() {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nameInput, name);
        dc.mySendKeys(dc.codeInput, code);
        dc.myClick(dc.saveButton);
    }

    @Then("Edit the field")
    public void editTheField() {
        dc.myClick(dc.edit);
        dc.mySendKeys(dc.nameInput, nameUpdated);
        dc.myClick(dc.saveButton);
    }

    @And("Delete the field")
    public void deleteTheField() {
        dc.deleteItem(nameUpdated);
    }

    @And("The field should be deleted successfully")
    public void theFieldShouldBeDeletedSuccessfully() {
        dc.verifyContainsText(dc.successMessage,"success");
    }

}
