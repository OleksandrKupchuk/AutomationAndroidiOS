package Pages.Ios.uikitcatalog;

import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;

public class ToolBarsPage {
    IOSDriver driver;

    public ToolBarsPage(IOSDriver driver){
        this.driver = driver;
    }

    private By tintedButton = MobileBy.AccessibilityId("Tinted");

    public ToolBarsPage clickTintedButton(){
        driver.findElement(tintedButton).click();
        return this;
    }
}
