package Pages.Ios.uikitcatalog;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.List;

public class DataPickerPage {
    IOSDriver driver;

    public DataPickerPage(IOSDriver driver){
        this.driver = driver;
    }

    public DataPickerPage setDayHoursMinutes(){
        WebElement piker = driver.findElement(By.xpath("//XCUIElementTypePicker"));
        List<WebElement> columns = piker.findElements(By.xpath("//XCUIElementTypePickerWheel"));

        WebElement day = columns.get(0);
        WebElement hours = columns.get(1);
        WebElement minutes = columns.get(2);

        int amountScrollDownForDay = 4;
        int amountScrollDownForHours = 5;
        int amountScrollDownForMinutes = 15;

        scrollData(day, amountScrollDownForDay);
        scrollData(hours, amountScrollDownForHours);
        scrollData(minutes, amountScrollDownForMinutes);

        return this;
    }

    private void scrollData(WebElement nameElement, int amountScrollDown){
        HashMap<String, Object> dayObject = new HashMap<>();
        for (int i = 0; i < amountScrollDown; i++){
            dayObject.put("order", "next");
            dayObject.put("offset", 0.15);
            dayObject.put("element", nameElement);
            driver.executeScript("mobile: selectPickerWheelValue", dayObject);
        }
    }
}
