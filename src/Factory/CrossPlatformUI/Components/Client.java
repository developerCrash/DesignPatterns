package Factory.CrossPlatformUI.Components;

import Factory.CrossPlatformUI.Components.Button.Button;
import Factory.CrossPlatformUI.Components.DropDown.DropDown;
import Factory.CrossPlatformUI.Components.Scroll.Scroll;

public class Client {

    public static void main(String[] args){
        Flutter flutter = new Flutter(SupportedPlatforms.ANDROID);
        UIFactory uiFactory = flutter.createUIFactory();
        Button button = uiFactory.createButton();
        DropDown dropDown = uiFactory.createDropDown();
        Scroll scroll = uiFactory.createScroll();
    }
}
