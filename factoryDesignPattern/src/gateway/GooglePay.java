package gateway;

public class GooglePay implements PaymentGateway {

    @Override
    public void processPayment() {
        System.out.println("Google Pay Payment Gateway");
    }
}
