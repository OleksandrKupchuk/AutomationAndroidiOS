package Pages.Ios;

import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;

public class AttributesPage {
    IOSDriver driver;

    public AttributesPage(IOSDriver driver){
        this.driver = driver;
    }

    private  By backButton = MobileBy.AccessibilityId("Back");
    private By slider = MobileBy.xpath("//XCUIElementTypeApplication[@name=\"IntegrationApp\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSlider");

    public AttributesPage setValueOnSlider(String valueBetween0And1){
        driver.findElement(slider).sendKeys(valueBetween0And1);
        return this;
    }

    public  AttributesPage clickBackButton(){
        driver.findElement(backButton).click();
        return this;
    }
}
