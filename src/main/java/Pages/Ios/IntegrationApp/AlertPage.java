package Pages.Ios.IntegrationApp;

import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;

public class AlertPage {
    IOSDriver driver;

    public AlertPage(IOSDriver driver){
        this.driver = driver;
    }

    private By textField = MobileBy.AccessibilityId("textField");

    public AlertPage setValueOnTextField(String value){
        driver.findElement(textField).sendKeys(value);
        return this;
    }
}
