import factory.PaymentGatewayFactory;
import gateway.PaymentGateway;

public class Client {
    public static void main(String[] args) {

        PaymentGateway paymentGateway = PaymentGatewayFactory.createPaymentGateway("googlepay");

        paymentGateway.processPayment();

    }
}