package Tests.Android.Application.Calculator;

import Base.BaseClass;
import Pages.Android.Calculator.CalculatorStartPage;
import org.testng.annotations.Test;

public class Calculator extends BaseClass {

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