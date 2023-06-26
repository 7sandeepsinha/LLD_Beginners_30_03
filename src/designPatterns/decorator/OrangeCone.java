package designPatterns.decorator;

public class OrangeCone implements Icecream{
    private Icecream icecream;

    public OrangeCone(Icecream icecream) {
        this.icecream = icecream;
    }

    public OrangeCone() {
    }

    @Override
    public int getCost() {
        if(icecream == null)
            return 30;
        else
            return icecream.getCost() + 30;
    }

    @Override
    public String getDescription() {
        if(icecream == null)
            return " OrangeCone ";
        else
            return icecream.getDescription() + " OrangeCone ";

    }
}
