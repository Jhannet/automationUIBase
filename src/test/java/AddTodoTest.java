import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.AddProject;
import task.validations.IsAddTodoItem;

public class AddTodoTest extends BaseTest {
    @Test
    public void createTodoItemTest(){
        AddProject.as(webDriver,"Jhannet100@gmail.com","Control123", "Tarea completada");
        Assert.assertTrue(IsAddTodoItem.visible(webDriver));
    }
}
