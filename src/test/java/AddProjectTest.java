import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.AddProject;
import task.tasking.LogOut;
import task.validations.IsAddProject;
import task.validations.IsTodoHome;

public class AddProjectTest extends BaseTest {
    @Test
    public void createProjectTest(){
        AddProject.as(webDriver,"Jhannet100@gmail.com","Control123", "Diplomado V5");
        Assert.assertTrue(IsAddProject.visible(webDriver));
    }
}
