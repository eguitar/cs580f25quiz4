package quiz4;

public class SquareAdapter implements PaymentGateway {
    private SquarePayment square;

    public SquareAdapter(SquarePayment square) {
        this.square = square;
    }

    @Override
    public void processPayment() { square.processPayment(); }
}
