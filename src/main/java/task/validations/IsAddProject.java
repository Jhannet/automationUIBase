package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.AddProjectUI;

public class IsAddProject {
    public static boolean visible(WebDriver webDriver){
        return WaitUntilElement.isVisible(webDriver, AddProjectUI.currentProjectTitle);
    }
    public static String getProjectTitle(WebDriver webDriver) {
        WebElement element = webDriver.findElement(AddProjectUI.currentProjectTitle);
        return element.getText();
    }
}
