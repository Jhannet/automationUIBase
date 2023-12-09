package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.SignUpFormUI;

public class IsLogout {
    public static boolean visible(WebDriver webDriver){
        return WaitUntilElement.isVisible(webDriver, SignUpFormUI.logoutButton);
    }
}
