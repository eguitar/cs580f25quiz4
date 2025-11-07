package quiz4;

public class Main {
    public static void main(String[] args) {
        
        PaymentGateway paypal = new PayPalAdapter(new PayPalPayment(275.25, "smithj@gmail.com"));
        PaymentGateway stripe = new StripeAdapter(new StripePayment(125.50, "John Smith", "1234-5678-9012-3456", "12/26/25"));
        PaymentGateway square = new SquareAdapter(new SquarePayment(23.60,"Lake Forest, CA"));

        paypal.processPayment();
        System.out.println("---------------------------");
        stripe.processPayment();
        System.out.println("---------------------------");
        square.processPayment();
        System.out.println("---------------------------");
    }
}