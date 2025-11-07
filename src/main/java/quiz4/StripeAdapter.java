package quiz4;

public class StripeAdapter implements PaymentGateway {
    private StripePayment stripe;

    public StripeAdapter(StripePayment stripe) {
        this.stripe = stripe;
    }

    @Override
    public void processPayment() { stripe.processPayment(); }
}
