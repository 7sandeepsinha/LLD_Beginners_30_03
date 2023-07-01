package designPatterns.observer;

public class InventoryManager implements OrderPlacedSubscriber{ //subscriber -> listens to event and takes some action


    public InventoryManager() {
        Amazon a = Amazon.getInstance();
        a.registerOrderPlacedSubscriber(this);
    }

    @Override
    public ReturnData orderPlaceEvent() {
        ReturnData data = new ReturnData("Inventory Updated");
        System.out.println("Inventory being updated");
        return data;
    }
}
