package steps;

import io.cucumber.java.After;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

import java.net.MalformedURLException;

public class LoginUserSteps
{
    public LoginUserSteps() throws MalformedURLException
    {
    }

    LoginPage r1 = new LoginPage();


    @When("Login button is clicked")
    public void LoginrBtn(){r1.clickForLoginPage();}
    @And("E-mail screen is displayed")
    public void phoneTxtVerify(){r1.verifyLoginPage();}
    @And("Email textbox is filled")
    public void fillPhoneBox(){r1.fillPhone();}
    @And("Checkboxes are clicked")
    public void FillChkBoxes(){r1.isRememberMe();}
    @And("Continue button is clicked")
    public void btnContinue(){r1.clickContinueBtn();}
    @And ("Password is filled")
    public void fillPwd(){r1.enterPassword();}
    @And("Otp screen is displayed")
    public void verifyPwd(){r1.verifyPassword();}
    @And("Otp is filled in" )
    public void fillOtp(){r1.fillOtp();}
    @And("Continue button2 is clicked")
    public void ContinueBtn(){r1.clickContinueBtn();}
    @Then("Login is completed")
    public void isLoginSuccess(){r1.isLoginSuccess();}

}
