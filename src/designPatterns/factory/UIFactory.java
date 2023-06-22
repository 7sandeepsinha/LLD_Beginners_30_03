package designPatterns.factory;

import designPatterns.factory.components.button.Button;
import designPatterns.factory.components.dropdown.DropDown;
import designPatterns.factory.components.menu.Menu;

//abstract factory
public interface UIFactory {
    Menu createMenu();
    DropDown createDropDown();
    Button createButton();
}
