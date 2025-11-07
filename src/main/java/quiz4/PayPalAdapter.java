package quiz4;

public class PayPalAdapter implements PaymentGateway {
    private PayPalPayment paypal;

    public PayPalAdapter(PayPalPayment paypal) {
        this.paypal = paypal;
    }

    @Override
    public void processPayment() { paypal.processPayment(); }
}
