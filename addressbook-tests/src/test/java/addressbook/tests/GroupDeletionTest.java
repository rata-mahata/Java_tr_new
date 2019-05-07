package addressbook.tests;

import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase{
    @Test

    public void groupDeletionTest (){
        app.getNavigationHelper().gotoGroupPage();

        app.getGroupHelper().selectGroups();
        app.getGroupHelper().deleteSelectedGroups();
        app.getNavigationHelper().gotoGroupPage();
        }

}
