import java.util.Date;

public class Transaction {
    private String transactionDate;
    private String transactionType;
    private double transactionAmount;

    public Transaction(String transactionDate, String transactionType, double transactionAmount) {
        this.transactionDate = transactionDate;
        this.transactionType = transactionType;
        this.transactionAmount = transactionAmount;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }
}
