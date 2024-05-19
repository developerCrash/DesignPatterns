package Factory.CrossPlatformUI.Components;


public class UIFactoryFactory {

    public static UIFactory createUIFactory(SupportedPlatforms platform){
        return switch (platform){
            case IOS -> new IOSUIFactory();
            case ANDROID -> new AndroidUIFactory();
        };
    }
}
