package quiz4;

public class SquarePayment {
    private double paymentAmount;
    private String locationID;

    public SquarePayment(double paymentAmount, String locationID) {
        this.paymentAmount = paymentAmount;
        this.locationID = locationID;
    }

    public void processPayment() {
        System.out.println("Thank you for the payment processed!" +
                            "\nPayment Information Confirmation: " + 
                            "\nPayment Amount: $" + paymentAmount +
                            "\nLocation ID: " + locationID);
    }
}
