package designPatterns.observer;

public class Client {
    public static void main(String[] args) {
        Amazon a = Amazon.getInstance(); //publisher
        CustomerNotifier customerNotifier = new CustomerNotifier();
        InventoryManager inventoryManager = new InventoryManager();
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        CashBackGenerator cashBackGenerator = new CashBackGenerator();
        a.orderPlaced();
        a.deRegisterOrderPlacedSubscriber(cashBackGenerator);
        System.out.println("---------------");
        a.orderPlaced();

    }
}
