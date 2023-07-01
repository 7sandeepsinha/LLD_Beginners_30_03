package designPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Amazon { // publisher -> where the event actually happens
    private List<OrderPlacedSubscriber> orderPlacedSubscribers;
    private static Amazon instance;

    public Amazon() {
        this.orderPlacedSubscribers = new ArrayList<>();
    }

    public void orderPlaced(){ //event method
//        CustomerNotifier customerNotifier = new CustomerNotifier();
//        customerNotifier.orderPlaceEvent();
//
//        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
//        invoiceGenerator.orderPlaceEvent();
        for(OrderPlacedSubscriber orderPlacedSubscriber : orderPlacedSubscribers){
            orderPlacedSubscriber.orderPlaceEvent();
        }
    }

    public void registerOrderPlacedSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscribers.add(orderPlacedSubscriber);
    }

    public void deRegisterOrderPlacedSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscribers.remove(orderPlacedSubscriber);
    }

    public static Amazon getInstance(){ //TODO : make this thread safe
        if(instance == null){
            instance = new Amazon();
        }
        return instance;
    }

}
