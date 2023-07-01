package designPatterns.observer;

public class CashBackGenerator implements  OrderPlacedSubscriber{
    public CashBackGenerator() {
        Amazon a = Amazon.getInstance();
        a.registerOrderPlacedSubscriber(this);
    }

    @Override
    public ReturnData orderPlaceEvent() {
        ReturnData data = new ReturnData("Cashback");
        System.out.println("Cashback is being generated");
        return data;
    }
}
