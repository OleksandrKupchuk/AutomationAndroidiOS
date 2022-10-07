package Pages.Android.Calculator;

import Base.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.testng.Assert;

public class CalculatorStartPage {
    AndroidDriver driver;

    public CalculatorStartPage(AndroidDriver driver){
        this.driver = driver;
    }

    private By result = MobileBy.id("result");
    private By plus = MobileBy.AccessibilityId("плюс");
    private By equal = MobileBy.id("btn_equal_s");
//    private By equal = MobileBy.AccessibilityId("дорівнює");
//    private String number = "//android.widget.TextView[@text=\'%s\']";

    public CalculatorStartPage clickOnNumber(int numberBetween0and9){
//        String test = "com.miui.calculator:id/btn_" + numberBetween0and9 + "_s";
//        driver.findElementByXPath("//android.widget.TextView[@text='4']").click();
        String test = "btn_" + numberBetween0and9 + "_s";
        driver.findElementById(test).click();

//        String test2 = String.format(number, numberBetween0and9);
//        driver.findElementByXPath(test2).click();
        return this;
    }

    public CalculatorStartPage clickOn9(){
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.TextView[1]").click();
        return this;
    }

    public CalculatorStartPage clickOnPlus(){
        driver.findElement(plus).click();
        return this;
    }

    public CalculatorStartPage clickOnEqual(){
        driver.findElement(equal).click();
        return this;
    }

    public CalculatorStartPage assertResult(int expect){
        String number = driver.findElement(result).getText();
        Assert.assertEquals(number, "= " + expect);
        return this;
    }
}
