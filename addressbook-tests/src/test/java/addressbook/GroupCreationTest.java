package addressbook;

import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase{

  @Test
  public void testGroupCreation() {

    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("test1", "test22", "test33"));
    submitGroupCreation();
    gotoGroupPage();
  }

}



