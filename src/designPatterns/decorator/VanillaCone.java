package designPatterns.decorator;

public class VanillaCone implements Icecream {
    private Icecream icecream;

    public VanillaCone(Icecream icecream) {
        this.icecream = icecream;
    }

    public VanillaCone() {
    }

    @Override
    public int getCost() {
        if(icecream == null)
            return 35;
        else
            return icecream.getCost() + 35;
    }

    @Override
    public String getDescription() {
        if(icecream == null)
            return " VanillaCone ";
        else
            return icecream.getDescription() + " VanillaCone ";

    }
}
