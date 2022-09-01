package Tests.Android;

import Pages.Android.BaseAndroid;
import Pages.Android.Calculator.CalculatorStartPage;
import lombok.SneakyThrows;
import org.testng.annotations.Test;

public class AndroidTest extends BaseAndroid {

    @SneakyThrows
    @Test
    public void findInformationInBrowser() {
//        androidDriver.get("https://www.google.com.ua");
//        androidDriver.findElementByName("q").sendKeys("Automation");
////        androidWait.wait(4000);
//        androidDriver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

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