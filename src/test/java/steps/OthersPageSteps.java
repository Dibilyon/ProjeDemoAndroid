package steps;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.OthersPage;
import utils.Driver;

import java.io.File;
import java.net.MalformedURLException;

public class OthersPageSteps {
    public OthersPageSteps() throws MalformedURLException
    {
    }
    OthersPage o1 = new OthersPage();
    @When("Contacts button is clicked")
    public void clickContactsButton(){o1.contactsButtonClick();}
    @And("Create contacts button is clicked")
    public void clickCreateContactBtn(){o1.createContactsButtonClick();}
    @When("Items button is clicked")
    public void clickItemsButton(){o1.itemsButtonClick();}
    @And("Others page button is clicked")
    public void othersPageBtnClick(){o1.navToOthersPage();}
    @Then("Create items button is clicked")
    public void clickCreateItemBtm(){o1.createItemsButtonClick();}

public void ss(Scenario scenario) {
    try {
        if (scenario.isFailed()) {
            File screenShotFile = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenShotFile, new File("test-output" + "appImage" + ".png"));
        }
    }catch (Exception e)
    {
        e.printStackTrace();
    }
}
}
