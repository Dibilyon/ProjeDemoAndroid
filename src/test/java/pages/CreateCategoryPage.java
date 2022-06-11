package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.net.MalformedURLException;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import static pages.HelperClass.generateString;

public class CreateCategoryPage
{
    Random r = new Random();

    public CreateCategoryPage()throws MalformedURLException{
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()),this);

    }
    @AndroidFindBy(id = "com.norma.android.debug:id/buttonAdd")
    AndroidElement addCategoryBtn;
    @AndroidFindBy(uiAutomator = "resourceId(\"com.norma.android.debug:id/inputCategoryName\").childSelector(resourceId(\"com.norma.android.debug:id/input\"))")
    AndroidElement categoryNameTxt;
    @AndroidFindBy(id = "com.norma.android.debug:id/viewSelectCategoryIcon")
    AndroidElement selectIconBtn;
    @AndroidFindBy(id = "com.norma.android.debug:id/viewSelectCategoryColor")
    AndroidElement selectColorBtn;
    @AndroidFindBy(id = "com.norma.android.debug:id/imageViewBack")
    AndroidElement backBtn;
    @AndroidFindBy(className = "android.widget.FrameLayout")
    List<AndroidElement> iconSelector;
    @AndroidFindBy(className = "android.widget.FrameLayout")
    List<AndroidElement> colorSelector;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().resourceIdMatches(\"android:id/navigationBarBackground\"))")
    AndroidElement scrollToBottom;
    @AndroidFindBy(id = "com.norma.android.debug:id/btnEnd")
    AndroidElement saveBtn;


    public void clickAddCategoryBtn(){addCategoryBtn.click();}
    public void inputCategoryName(){categoryNameTxt.sendKeys(generateString(8));}
    public void selectIconBtnClick(){selectIconBtn.click();}
    public void randomIconSelect(){
        int randomIcon = r.nextInt(iconSelector.size());
        if (iconSelector.isEmpty())
        {
            scrollToBottom.getText();


            iconSelector.get(randomIcon).click();
        }
        else
        {
            iconSelector.get(randomIcon).click();

        }


    }
    public void backBtnClick(){backBtn.click();}
    public void selectColorBtnClick(){selectColorBtn.click();}
    public void randomColorSelect(){
        int randomColor= r.nextInt(colorSelector.size());
        colorSelector.get(randomColor).click();
    }

public void saveBtnClick()
{
    saveBtn.click();
}

}
