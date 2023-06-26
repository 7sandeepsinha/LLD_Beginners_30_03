package designPatterns.decorator;

public class Client {
    public static void main(String[] args) {
        Icecream icecream = new ChocolateChip(
                                new ChocolateScoop(
                                    new VanillaScoop(
                                        new VanillaCone(
                                            new ChocolateChip(
                                                new ChocolateCone())))));
        System.out.println(icecream.getCost());
        System.out.println(icecream.getDescription());
    }
}

// Icecream -> ChocolateCone -> 10, ChocolateCone
// Icecream -> VanillaScoop[30, VanillaScoop] -> 40, ChocolateCone + Vanilla Scoop
// Icecream -> ChocoChip[25, ChocoChip] -> 65, ChocolateCone + Vanilla Scoop + ChocoChip

// Cone -> has to be base, it can be topping : ex -> VanillaCone + ChocolateSyrup + ChocolateCone
// anything else -> cant be the base

// Base -> there was no ice-cream prior to it, first part of the ice-cream
// Topping -> there was some ice-cream[base] prior to it