package Pages.Ios;

import Pages.Android.BaseAndroid;
import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IntegrationAppStartPage {
    IOSDriver driver;

    public IntegrationAppStartPage(IOSDriver driver){
        this.driver = driver;
    }

    private String alertButton = "//XCUIElementTypeStaticText[@name='Alerts']";
    private By scrollingButton = MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"Scrolling\"]");
    private By attributesButton = MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"Attributes\"]");

    public IntegrationAppStartPage clickAlertButton(){
        driver.findElementByName("Alerts").click();
        return this;
    }

    public IntegrationAppStartPage clickScrollingButton(){
        driver.findElement(scrollingButton).click();
        return this;
    }

    public IntegrationAppStartPage clickAttributesButton(){
        driver.findElement(attributesButton).click();
        return this;
    }
}
