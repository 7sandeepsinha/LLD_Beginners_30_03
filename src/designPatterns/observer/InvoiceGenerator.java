package designPatterns.observer;

public class InvoiceGenerator implements OrderPlacedSubscriber{ //subscriber -> listens to event and takes some action


    public InvoiceGenerator() {
        Amazon a = Amazon.getInstance();
        a.registerOrderPlacedSubscriber(this);
    }

    @Override
    public ReturnData orderPlaceEvent() {
        ReturnData data = new ReturnData("Invoice");
        System.out.println("Invoice is being generated");
        return data;
    }
}
