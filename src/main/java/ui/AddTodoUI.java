package ui;

import org.openqa.selenium.By;

public class AddTodoUI {
    public static By input = By.id("NewItemContentInput");
    public static By addButton = By.id("NewItemAddButton");
    public static By todoItem = By.xpath("//div[.='Tarea completada']");
}
