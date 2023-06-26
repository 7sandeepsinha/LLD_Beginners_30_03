package designPatterns.decorator;

public class Bowl implements Icecream { //ONLY A BASE

    public Bowl() {
    }

    @Override
    public int getCost() {
        return 50;
    }

    @Override
    public String getDescription() {
        return "Bowl";
    }
}
