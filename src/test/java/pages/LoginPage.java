package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.net.MalformedURLException;

import static org.testng.AssertJUnit.assertTrue;

public class LoginPage
{

    public LoginPage() throws MalformedURLException {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()),this);
    }
    Actions pwaction = new Actions(Driver.getDriver());
    @AndroidFindBy(id = "com.norma.android.debug:id/btnLogin")
    public AndroidElement loginBtn;
    @AndroidFindBy(id = "com.norma.android.debug:id/textViewSubTitle")
    public AndroidElement phoneTxt;
    @AndroidFindBy(id = "com.norma.android.debug:id/input")
    public AndroidElement phoneInpt;
    @AndroidFindBy(id = "com.norma.android.debug:id/icon")
    public AndroidElement chkboxRemember;
    @AndroidFindBy(id = "com.norma.android.debug:id/btnContinue")
    public AndroidElement btnContinue;
    @AndroidFindBy(id = "com.norma.android.debug:id/line1")
    public AndroidElement placeHolder1;
    @AndroidFindBy (id ="com.norma.android.debug:id/line2" )
    public AndroidElement placeHolder2;
    @AndroidFindBy (id = "com.norma.android.debug:id/line3")
    public AndroidElement placeHolder3;
    @AndroidFindBy (id = "com.norma.android.debug:id/line4")
    public AndroidElement placeHolder4;
    @AndroidFindBy(id = "com.norma.android.debug:id/line5")
    public AndroidElement placeHolder5;
    @AndroidFindBy (id = "com.norma.android.debug:id/line5")
    public AndroidElement placeHolder6;
    @AndroidFindBy(id = "com.norma.android.debug:id/codeHolder")
    public AndroidElement otpHolder;
    @AndroidFindBy(id = "com.norma.android.debug:id/textViewHello")
    public AndroidElement loginHeader;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]")
    AndroidElement code1;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]")
    AndroidElement code2;
    @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]" )
    AndroidElement code3;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[4]")
    AndroidElement code4;



    public void clickForLoginPage() {
        loginBtn.click();
    }
    public void verifyLoginPage() {
        verifyPages(phoneTxt);

    }

    public void fillPhone() {phoneInpt.sendKeys("5412000005");}
    public void isRememberMe()
    {
        if (chkboxRemember.isSelected())
        {
            assertTrue("Remember me enabled",true);
        }

    }
    public void clickContinueBtn(){btnContinue.click();}
    public void enterPassword()
    {
        placeHolder1.getText();
        pwaction.sendKeys("1").perform();
        placeHolder2.getText();
        pwaction.sendKeys("1").perform();
        placeHolder3.getText();
        pwaction.sendKeys("2").perform();
        placeHolder4.getText();
        pwaction.sendKeys("2").perform();
        placeHolder5.getText();
        pwaction.sendKeys("3").perform();
        placeHolder6.getText();
        pwaction.sendKeys("3").perform();

    }

    public void verifyPassword()
    {
        verifyPages(otpHolder);

    }

    public void fillOtp()
    {
        placeHolder1.getText();
        pwaction.sendKeys("1").perform();
        placeHolder2.getText();
        pwaction.sendKeys("2").perform();
        placeHolder3.getText();
        pwaction.sendKeys("3").perform();
        placeHolder4.getText();
        pwaction.sendKeys("4").perform();


    }


    public void isLoginSuccess()
    {
        verifyPages(loginHeader);
    }



    public String verifyPages(AndroidElement element)
    {
        if (element.getSize().getWidth()!=0)
        {
            assertTrue("Page verified",true);
        }

        return element.getText();
    }
}