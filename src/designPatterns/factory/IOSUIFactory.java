package designPatterns.factory;

import designPatterns.factory.components.button.Button;
import designPatterns.factory.components.button.IOSButton;
import designPatterns.factory.components.dropdown.DropDown;
import designPatterns.factory.components.dropdown.IOSDropDown;
import designPatterns.factory.components.menu.IOSMenu;
import designPatterns.factory.components.menu.Menu;

public class IOSUIFactory implements UIFactory{
    //factory method for creating menu object
    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
    //factory method for creating dropdown object
    @Override
    public DropDown createDropDown() {
        return new IOSDropDown();
    }
    //factory method for creating button object
    @Override
    public Button createButton() {
        return new IOSButton();
    }
}
