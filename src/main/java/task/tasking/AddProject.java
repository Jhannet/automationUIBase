package task.tasking;

import Helpers.helper.ScreenShotHelper;
import actions.Click;
import actions.Enter;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import ui.AddProjectUI;
import ui.HomePageUI;
import ui.LoginUI;

public class AddProject {
    public static void as(WebDriver webDriver, String email, String pass, String project) {
        Click.on(webDriver, HomePageUI.loginLink);
        Enter.text(webDriver, LoginUI.email, email);
        Enter.text(webDriver, LoginUI.password, pass);
        Click.on(webDriver, LoginUI.loginButton);
        Click.on(webDriver, AddProjectUI.addNewProject);
        Enter.text(webDriver, AddProjectUI.input, project);
        Click.on(webDriver, AddProjectUI.addButton);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(webDriver, Status.INFO, "Create project");
    }
}
