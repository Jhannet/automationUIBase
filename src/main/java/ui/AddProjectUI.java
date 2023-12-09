package ui;

import org.openqa.selenium.By;

public class AddProjectUI {
    public static By addNewProject = By.xpath("//*[@id=\"MainTable\"]/tbody/tr/td[1]/div[6]/div");
    public static By input = By.xpath("//*[@id=\"NewProjNameInput\"]");
    public static By addButton = By.id("NewProjNameButton");
    public static By currentProjectTitle = By.id("CurrentProjectTitle");
}
