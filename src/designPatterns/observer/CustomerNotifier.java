package designPatterns.observer;

public class CustomerNotifier implements OrderPlacedSubscriber { //subscriber -> listens to event and takes some action

    public CustomerNotifier() {
        Amazon a = Amazon.getInstance();
        a.registerOrderPlacedSubscriber(this);
    }

    @Override
    public ReturnData orderPlaceEvent() {
        ReturnData data = new ReturnData("Notify the customer regarding order is placed");
        System.out.println("Notify the customer regarding");
        return data;
    }
}
