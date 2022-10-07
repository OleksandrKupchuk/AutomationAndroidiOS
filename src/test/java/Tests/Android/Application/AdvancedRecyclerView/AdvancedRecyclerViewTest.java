package Tests.Android.Application.AdvancedRecyclerView;

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
        BaseClass.setupApplicationOnBrowserStack(Devices.SAMSUNG_S10PLUS_APP());
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
