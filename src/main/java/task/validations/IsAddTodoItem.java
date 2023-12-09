package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.AddTodoUI;

public class IsAddTodoItem {
    public static boolean visible(WebDriver webDriver){
        return WaitUntilElement.isVisible(webDriver, AddTodoUI.todoItem);
    }
}
