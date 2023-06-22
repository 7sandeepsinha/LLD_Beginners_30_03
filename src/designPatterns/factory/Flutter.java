package designPatterns.factory;

public class Flutter {

    private SupportedPlatform platform;

    public Flutter(SupportedPlatform platform) {
        this.platform = platform;
    }

    public void setTheme(){
        System.out.println("Setting some theme");
    }

    public void setRefreshRate(){
        System.out.println("Setting some refresh rate");
    }

    public UIFactory createUIFactory(){
        return UIFactoryFactory.createUIFactory(this.platform);
    }
}
