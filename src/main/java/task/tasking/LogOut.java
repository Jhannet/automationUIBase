package task.tasking;

import Helpers.helper.ScreenShotHelper;
import actions.Click;
import actions.Enter;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;
import ui.LoginUI;
import ui.SignUpFormUI;

public class LogOut {
    public static void as(WebDriver webDriver, String email, String pass) {
        Click.on(webDriver, HomePageUI.loginLink);
        Enter.text(webDriver, LoginUI.email, email);
        Enter.text(webDriver, LoginUI.password, pass);
        Click.on(webDriver, LoginUI.loginButton);
        Click.on(webDriver, SignUpFormUI.logoutButton);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(webDriver, Status.INFO, "LogOut Todoly");
    }
}
