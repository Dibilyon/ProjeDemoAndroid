package steps;

import io.cucumber.java.AfterAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.annotations.AfterTest;
import pages.CreateCategoryPage;

import java.net.MalformedURLException;

public class CreateCategorySteps
{
    public CreateCategorySteps() throws MalformedURLException {

    }
    CreateCategoryPage cc = new CreateCategoryPage();
    @And("Create Category Button is clicked")
    public void createCategoryBtnClick(){cc.clickAddCategoryBtn();}
    @And("Category name is filled in")
    public void inputCategoryName(){cc.inputCategoryName();}
    @And("Icon select button is clicked")
    public void clickCategoryIconSelectBtn(){cc.selectIconBtnClick();}
    @And("Icon is selected randomly")
    public void randomIconSelect(){cc.randomIconSelect();}
    @And("Back button is clicked")
    public void clickBackBtn(){cc.backBtnClick();}
    @And("Color select button is clicked")
    public void clickCategoryColorSelectBtn(){cc.selectColorBtnClick();}
    @And("Color is selected Randomly")
    public void randomColorSelect(){cc.randomColorSelect();}
    @Then("Save button is clicked")
    public void clickSaveBtn(){cc.saveBtnClick();}


}
