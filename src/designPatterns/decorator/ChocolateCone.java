package designPatterns.decorator;

public class ChocolateCone implements Icecream{ //can be base or a topping
    private Icecream icecream;

    public ChocolateCone(Icecream icecream) {
        this.icecream = icecream;
    }

    public ChocolateCone() {
    }

    @Override
    public int getCost() {
        if(icecream == null)
            return 40;
        else
            return icecream.getCost() + 40;
    }

    @Override
    public String getDescription() {
        if(icecream == null)
            return " ChocolateCone ";
        else
            return icecream.getDescription() + " ChocolateCone ";

    }
}
