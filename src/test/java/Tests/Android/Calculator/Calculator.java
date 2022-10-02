package Tests.Android.Calculator;

import Base.BaseClass;
import ConfigDevices.Devices;
import Pages.Android.Calculator.CalculatorStartPage;
import lombok.SneakyThrows;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static Data.AppPath.*;

public class Calculator extends BaseClass {

    @BeforeMethod
    public void setup(){
        BaseClass.setupApplication(Devices.XIAOMI_REDMI_NOTE_5(ANDROID_APP_PACKAGE_CALCULATOR, ANDROID_APP_ACTIVITY_CALCULATOR));
    }

//    @SneakyThrows
//    @Test
//    public void findInformationInBrowser() {
//        androidDriver.get("https://www.google.com.ua");
//        androidDriver.findElementByName("q").sendKeys("Automation");
////        androidWait.wait(4000);
//        androidDriver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//    }

    @Test
    public void openCalculator() {
        System.out.println("Calculator is open");
    }

    @Test
    public void addTwoNumber(){
        new CalculatorStartPage(androidDriver)
                .clickOnNumber(5)
                .clickOnPlus()
                .clickOnNumber(9)
                .clickOnEqual()
                .assertResult(14);
    }
}