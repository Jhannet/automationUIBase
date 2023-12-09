package task.tasking;

import Helpers.helper.ScreenShotHelper;
import actions.Click;
import actions.Enter;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;
import ui.SignUpFormUI;

public class SignUpFree {

    public static void as(WebDriver webDriver, String fullName, String email, String pass){
        Click.on(webDriver, HomePageUI.signUpFree);
        Enter.text(webDriver, SignUpFormUI.fullName, fullName);
        Enter.text(webDriver, SignUpFormUI.email, email);
        Enter.text(webDriver, SignUpFormUI.password, pass);
        Click.on(webDriver, SignUpFormUI.termsCheck);
        Click.on(webDriver, SignUpFormUI.signUpButton);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(webDriver, Status.INFO, "Sign Up Free");
    }
}
