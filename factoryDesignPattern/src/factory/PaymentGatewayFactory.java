package factory;

import gateway.GooglePay;
import gateway.PaymentGateway;
import gateway.Paytm;
import gateway.PhonePay;

public class PaymentGatewayFactory {

    public static PaymentGateway createPaymentGateway(String paymentGatewayType){
        switch(paymentGatewayType.toLowerCase()){
            case "googlepay":
                return new GooglePay();
            case "phonepay":
                return new PhonePay();
            case "paytm":
                return new Paytm();
            default:
                throw new IllegalArgumentException("Invalid payment gateway type");
        }
    }
}
