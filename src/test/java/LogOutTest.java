import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.LogOut;
import task.validations.IsTodoHome;

public class LogOutTest extends BaseTest {
    @Test
    public void logoutSuccessTest(){
        LogOut.as(webDriver,"Jhannet100@gmail.com","Control123");
        Assert.assertTrue(IsTodoHome.visible(webDriver));
    }
}
