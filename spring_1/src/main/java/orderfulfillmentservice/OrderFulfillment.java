package orderfulfillmentservice;

import courierservice.CourierService;

public class OrderFulfillment {

    CourierService service;

    public void setService(CourierService service) {
        this.service = service;
    }

    public OrderFulfillment(CourierService service) {
        System.out.println("Creating OrderManagement Service Object");
        this.service = service;
    }

    public void placeOrder(){
        System.out.println("The order is placed");
        service.getOrder();

    }
}
