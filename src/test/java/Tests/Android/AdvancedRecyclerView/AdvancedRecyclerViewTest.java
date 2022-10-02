package Tests.Android.AdvancedRecyclerView;

import Base.BaseClass;
import ConfigDevices.Devices;
import Pages.Android.AdvancedRecyclerView.AdvancedRecyclerViewStartPage;
import Pages.Android.AdvancedRecyclerView.DraggableMinimal;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static Data.AppPath.*;
import static Texts.AndvancedRecyclerViewText.*;

public class AdvancedRecyclerViewTest extends BaseClass {

    @BeforeMethod
    public void setup(){
        BaseClass.setupApplication(Devices.XIAOMI_REDMI_NOTE_5(ANDROID_APP_PACKAGE_ADVRECYCLERVIEW,
                ANDROID_APP_ACTIVITY_ADVRECYCLERVIEW));
    }

    @Test
    public void dragItemToNewPosition(){

        new AdvancedRecyclerViewStartPage(androidDriver)
                .clickDraggableMinimal();

        new DraggableMinimal(androidDriver)
                .getCoordinatesItem(1)
                .dragItemTo(5, 1)
                .assertItemName(1, item_4_name);
    }
}
