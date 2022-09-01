package Pages.Ios;

import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;

import java.util.HashMap;

public class ScrollingPage {
    IOSDriver driver;

    public ScrollingPage(IOSDriver driver){
        this.driver = driver;
    }

    private By tableViewButton = MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"TableView\"]");
    private By nineNine = MobileBy.xpath("//XCUIElementTypeTable[@name=\"scrollView\"]/XCUIElementTypeCell[100]/XCUIElementTypeOther[1]/XCUIElementTypeOther");

    public ScrollingPage clickTableViewButton(){
        driver.findElement(tableViewButton).click();
        return this;
    }

    public ScrollingPage scrollTo99(){
        HashMap<String, Object> scrollObject = new HashMap<>();
        scrollObject.put("direction", "down");
        scrollObject.put("name", "99");
        driver.executeScript("mobile:scroll", scrollObject);
        return this;
    }

    public ScrollingPage clickOn99(){
        driver.findElement(nineNine).click();
        return this;
    }
}
