package Pages.Android.AdvancedRecyclerView;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class AdvancedRecyclerViewStartPage {
    private AndroidDriver androidDriver;

    public AdvancedRecyclerViewStartPage(AndroidDriver driver){
        androidDriver = driver;
    }

    private By draggableMinimal = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.Button[1]");

    public AdvancedRecyclerViewStartPage clickDraggableMinimal(){
        androidDriver.findElement(draggableMinimal).click();
        return this;
    }
}
