package designPatterns.factory;

public class UIFactoryFactory {
    //factory method for creating factory objects
    public static UIFactory createUIFactory(SupportedPlatform platform){
        return switch (platform){
            case IOS -> new IOSUIFactory();
            case ANDROID -> new AndroidUIFactory();
            case WINDOWS -> new WindowsUIFactory();
        };
    }
}
