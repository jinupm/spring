package courierservice;

public class BlueDartService implements CourierService{

    public BlueDartService() {
        System.out.println("Creating Blue dart service object");
    }

    @Override
    public void getOrder() {
        System.out.println("Order delivered by Blue Dart Services");
    }
}
