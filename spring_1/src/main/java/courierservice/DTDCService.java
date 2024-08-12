package courierservice;

public class DTDCService implements CourierService{

    public DTDCService() {
        System.out.println("Creating DTDC service object");
    }

    @Override
    public void getOrder() {
        System.out.println("Order is delivered by DTDC services");
    }
}
