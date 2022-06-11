package steps;

import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.*;



import java.net.MalformedURLException;

public class OnboardingStepDefs {

    public OnboardingStepDefs() throws MalformedURLException{
    }

    DemoPage1 d1 = new DemoPage1();
    DemoPage2 d2 = new DemoPage2();
    DemoPage3 d3 = new DemoPage3();
    DemoPage4 d4 = new DemoPage4();
    DemoPage5 d5 = new DemoPage5();
    @Given("Launched app")

    @When("Arrow button is clicked")
    public void ClickArrrowBtnPage1(){d1.clickForNextPage();}
    @And("Arrow button is clicked in second page")
    public void ClickArrrowBtnPage2(){d2.clickForNextPage();}
    @And("Arrow button is clicked in third page")
    public void ClickArrrowBtnPage3(){d3.clickForNextPage();}
    @And("Arrow button is clicked in fourth page")
    public void ClickArrrowBtnPage4(){d4.clickForNextPage();}
    @And("Arrow button is clicked in fifth page")
    public void ClickArrrowBtnPage5() throws InterruptedException {d5.clickForNextPage();}
    @Then("User Demo Scenario completed")
    public void verifyLoginScrn(){d5.verifyLoginPage();}

}

