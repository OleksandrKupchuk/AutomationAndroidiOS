package Pages.Ios.IntegrationApp;

import ActionDriver.DriverAction;
import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;

public class ScrollingPage {
    private IOSDriver driver;
    private DriverAction driverAction;

    public ScrollingPage(IOSDriver driver){
        this.driver = driver;
        driverAction = new DriverAction(driver);
    }

    private By tableViewButton = MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"TableView\"]");
    private By nineNine = MobileBy.xpath("//XCUIElementTypeTable[@name=\"scrollView\"]/XCUIElementTypeCell[100]/XCUIElementTypeOther[1]/XCUIElementTypeOther");

    public ScrollingPage clickTableViewButton(){
        driver.findElement(tableViewButton).click();
        return this;
    }

    public ScrollingPage scrollToNumber(int number){
        driverAction.scrollToObject(number);
        return this;
    }

    public ScrollingPage clickOnNumber(int number){
        driver.findElement(MobileBy.xpath("//XCUIElementTypeTable[@name=\"scrollView\"]/XCUIElementTypeCell[" + (number + 1) + "]/XCUIElementTypeOther[1]/XCUIElementTypeOther"));
        return this;
    }
}
