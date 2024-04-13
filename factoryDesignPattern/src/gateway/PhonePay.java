package gateway;

public class PhonePay implements PaymentGateway{

    @Override
    public void processPayment() {
        System.out.println("Phone Pay Payment Gateway");
    }
}
