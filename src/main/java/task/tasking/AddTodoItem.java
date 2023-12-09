package task.tasking;

import Helpers.helper.ScreenShotHelper;
import actions.Click;
import actions.Enter;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import ui.AddProjectUI;
import ui.AddTodoUI;
import ui.HomePageUI;
import ui.LoginUI;

public class AddTodoItem {
    public static void as(WebDriver webDriver, String email, String pass, String todo) {
        Click.on(webDriver, HomePageUI.loginLink);
        Enter.text(webDriver, LoginUI.email, email);
        Enter.text(webDriver, LoginUI.password, pass);
        Click.on(webDriver, LoginUI.loginButton);
        Enter.text(webDriver, AddTodoUI.input, todo);
        Click.on(webDriver, AddTodoUI.addButton);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(webDriver, Status.INFO, "Create todo");
    }
}
