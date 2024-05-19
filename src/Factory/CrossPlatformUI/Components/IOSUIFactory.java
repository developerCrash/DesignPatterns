package Factory.CrossPlatformUI.Components;

import Factory.CrossPlatformUI.Components.Button.Button;
import Factory.CrossPlatformUI.Components.Button.IOSButton;
import Factory.CrossPlatformUI.Components.DropDown.DropDown;
import Factory.CrossPlatformUI.Components.DropDown.IOSDropDown;
import Factory.CrossPlatformUI.Components.Scroll.IOSScroll;
import Factory.CrossPlatformUI.Components.Scroll.Scroll;

public class IOSUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Scroll createScroll() {
        return new IOSScroll();
    }

    @Override
    public DropDown createDropDown() {
        return new IOSDropDown();
    }
}
