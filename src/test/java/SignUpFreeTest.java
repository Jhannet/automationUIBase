import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.SignUpFree;
import task.validations.IsLogout;

public class SignUpFreeTest extends BaseTest{
    @Test
    public void signUpSuccessTest(){
        SignUpFree.as(webDriver,"Juanito125","juan1215@test.com","Control125");
        Assert.assertTrue(IsLogout.visible(webDriver));
    }
}
