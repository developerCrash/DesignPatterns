package Factory.CrossPlatformUI.Components;

public class Flutter {

    private SupportedPlatforms platform;

    public Flutter(SupportedPlatforms platform) {
        this.platform = platform;
    }
    public void setTheme(){
        System.out.println("Setting some theme");
    }

    public UIFactory createUIFactory(){
        return UIFactoryFactory.createUIFactory(this.platform);
    }
}
