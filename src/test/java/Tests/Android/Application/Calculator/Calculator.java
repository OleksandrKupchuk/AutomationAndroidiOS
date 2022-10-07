package Tests.Android.Application.Calculator;

import Base.BaseClass;
import ConfigDevices.Devices;
import Pages.Android.Calculator.CalculatorStartPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static Data.AppPath.*;

public class Calculator extends BaseClass {

    @BeforeMethod
    public void setup() {
        BaseClass.setupAndroidApplicationOnlocalhost(Devices.XIAOMI_REDMI_NOTE_5(), ANDROID_APP_PACKAGE_CALCULATOR, ANDROID_APP_ACTIVITY_CALCULATOR);
    }

    @Test
    public void addTwoNumber(){
        new CalculatorStartPage(androidDriver)
                .clickOnNumber(5)
//                .clickOn9()
                .clickOnPlus()
                .clickOnNumber(9)
//                .clickOn9()
                .clickOnEqual()
                .assertResult(14);
    }
}