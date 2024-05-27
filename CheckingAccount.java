import java.util.Date;

public class CheckingAccount extends Account {
    public CheckingAccount(String accountNumber, double serviceFee, double overdraftFee, double interestRate) {
        super(accountNumber, "Checking", serviceFee, interestRate, overdraftFee);
    }

    @Override
    public void withdrawal(double amount) {
        double totalAmount = amount + getServiceFee();
        if (getBalance() >= totalAmount) {
            setBalance(getBalance() - totalAmount);
        } else {
            setBalance(getBalance() - totalAmount - getOverdraftFee());
            System.out.println("Overdraft fee applied.");
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

