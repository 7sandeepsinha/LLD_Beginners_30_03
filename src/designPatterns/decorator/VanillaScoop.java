package designPatterns.decorator;

public class VanillaScoop implements Icecream { //cant be base
    private Icecream icecream;

    public VanillaScoop(Icecream icecream) {
        this.icecream = icecream;
    }

    @Override
    public int getCost() {
        return icecream.getCost() + 70;
    }

    @Override
    public String getDescription() {
        return icecream.getDescription() + " VanillaScoop ";
    }
}
