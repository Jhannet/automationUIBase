import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.LoginTodoly;
import task.tasking.SignUpFree;
import task.validations.IsLogout;

public class LoginTodolyTest extends BaseTest {
    @Test
    public void loginSuccessTest(){
        LoginTodoly.as(webDriver,"Jhannet100@gmail.com","Control123");
        Assert.assertTrue(IsLogout.visible(webDriver));
    }
}
