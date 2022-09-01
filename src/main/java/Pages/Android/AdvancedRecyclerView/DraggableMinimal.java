package Pages.Android.AdvancedRecyclerView;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.time.Duration;

import static java.time.Duration.ofMillis;

public class DraggableMinimal {

    private AndroidDriver androidDriver;

    public DraggableMinimal(AndroidDriver driver){
        androidDriver = driver;
    }

    private String itemXpath = "/hierarchy/android.widget.FrameLayout/android.widget." +
            "LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget." +
            "FrameLayout[2]/android.widget.FrameLayout/androidx.recyclerview.widget." +
            "RecyclerView/android.widget.FrameLayout[%s]/android.widget.TextView";

    public DraggableMinimal getCoordinatesItem(int positionItem){
        System.out.println(androidDriver.findElement(MobileBy.xpath(String.format(itemXpath, positionItem))).getLocation());
        return this;
    }

    public DraggableMinimal dragItemTo(int fromPositionItem, int toPositionItem){
        MobileElement toItem = (MobileElement)androidDriver.findElement(MobileBy.xpath(String.format(itemXpath, toPositionItem)));
        moveToCoordinates(MobileBy.xpath(String.format(itemXpath, fromPositionItem)),
                toItem.getLocation().getX(), toItem.getLocation().getY(),3000);
        return this;
    }

    public DraggableMinimal longPress(By locator, int timeOfMillis){
//        new TouchAction(androidDriver)
//                .longPress(new LongPressOptions()
//                        .withElement(ElementOption.element(androidDriver.findElement(By.xpath(itemXpath))))
//                        .withDuration(ofMillis(1000)))
//                .release()
//                .perform();

        TouchAction touchAction = new TouchAction(androidDriver);
        touchAction.longPress(LongPressOptions.longPressOptions()
                        .withElement(ElementOption.element(androidDriver.findElement(locator)))
                        .withDuration(Duration.ofMillis(4000)))
//                .waitAction(WaitOptions.waitOptions(ofMillis(timeOfMillis)))
                .release()
                .perform();
        return this;
    }

    public DraggableMinimal moveToItem(By fromLocator, By toLocator, int timeOfMillis){
        TouchAction touchAction = new TouchAction(androidDriver);
        touchAction.longPress(LongPressOptions.longPressOptions()
                        .withElement(ElementOption.element(androidDriver.findElement(fromLocator))))
                .moveTo(ElementOption.element(androidDriver.findElement(toLocator)))
                .release()
                .perform();
        return this;
    }

    public DraggableMinimal moveToCoordinates(By fromLocator, int posX, int posY, int timeOfMillis){
        TouchAction touchAction = new TouchAction(androidDriver);
        touchAction.longPress(LongPressOptions.longPressOptions()
                        .withElement(ElementOption.element(androidDriver.findElement(fromLocator))))
                .moveTo(PointOption.point(posX, posY))
                .release()
                .perform();
        return this;
    }

    @SneakyThrows
    public DraggableMinimal assertItemName(int positionItem, String nameItem){
        Thread.sleep(5000);
        String name = androidDriver.findElement(By.xpath(String.format(itemXpath, positionItem))).getText();
        Assert.assertEquals(name, nameItem);
        return this;
    }
}
