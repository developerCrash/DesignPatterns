package Factory.CrossPlatformUI.Components;

import Factory.CrossPlatformUI.Components.Button.AndroidButton;
import Factory.CrossPlatformUI.Components.Button.Button;
import Factory.CrossPlatformUI.Components.DropDown.AndroidDropDown;
import Factory.CrossPlatformUI.Components.DropDown.DropDown;
import Factory.CrossPlatformUI.Components.Scroll.AndroidScroll;
import Factory.CrossPlatformUI.Components.Scroll.Scroll;

public class AndroidUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Scroll createScroll() {
        return new AndroidScroll();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }
}
