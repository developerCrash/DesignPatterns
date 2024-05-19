package Factory.CrossPlatformUI.Components;

import Factory.CrossPlatformUI.Components.Button.Button;
import Factory.CrossPlatformUI.Components.DropDown.DropDown;
import Factory.CrossPlatformUI.Components.Scroll.Scroll;

public interface UIFactory {
    Button createButton();
    Scroll createScroll();
    DropDown createDropDown();
}
