package quiz4;

import java.util.*;

public class StripePayment {
    private double paymentAmount;
    private String cardholderName;
    private String cardNumber;
    private Date expirationDate;
    
    public StripePayment(double paymentAmount, String cardholderName, String cardNumber, Date expirationDate) {
        this.paymentAmount = paymentAmount;
        this.cardholderName = cardholderName;
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
    }

    public void processPayment() {
        
    }
}
