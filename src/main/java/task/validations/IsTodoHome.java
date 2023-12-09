package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;

public class IsTodoHome {
    public static boolean visible(WebDriver webDriver){
        return WaitUntilElement.isVisible(webDriver, HomePageUI.loginLink);
    }
}
