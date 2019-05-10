package addressbook.tests;

import addressbook.model.GroupData;
import org.testng.annotations.Test;


public class GroupModifyTest extends TestBase{
    @Test
    private void testGroupModification(){
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroups();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("test1", "test22", "test33"));
        app.getGroupHelper().submitGroupModification();
        app.getNavigationHelper().gotoGroupPage();
    }
}
