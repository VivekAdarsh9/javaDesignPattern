package gateway;

public class Paytm implements PaymentGateway{

    @Override
    public void processPayment() {
        System.out.println("Paytm Payment Gateway");
    }
}
