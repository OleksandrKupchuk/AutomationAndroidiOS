package Tests.Android.AdvancedRecyclerView;

import Pages.Android.AdvancedRecyclerView.AdvancedRecyclerViewStartPage;
import Pages.Android.AdvancedRecyclerView.DraggableMinimal;
import Pages.Android.BaseAndroid;
import org.testng.annotations.Test;

import static Texts.AndvancedRecyclerViewText.*;

public class AdvancedRecyclerViewTest extends BaseAndroid {

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
