import java.util.Date;

public class SavingsAccount extends Account {
    public SavingsAccount(String accountNumber, double serviceFee, double interestRate) {
        super(accountNumber, "Savings", serviceFee, interestRate, 0.0);
    }

    @Override
    public void withdrawal(double amount) {
        double totalAmount = amount + getServiceFee();
        if (getBalance() >= totalAmount) {
            setBalance(getBalance() - totalAmount);
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount - getServiceFee());
    }

    public void applyInterest() {
        setBalance(getBalance() + getBalance() * getInterestRate() / 100);
    }
}
