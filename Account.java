public abstract class Account {
    private String accountNumber;
    private String accountType;
    private double serviceFee;
    private double interestRate;
    private double overdraftFee;
    private double balance;

    public Account(String accountNumber, String accountType, double serviceFee, double interestRate, double overdraftFee) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.serviceFee = serviceFee;
        this.interestRate = interestRate;
        this.overdraftFee = overdraftFee;
        this.balance = 0.0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getServiceFee() {
        return serviceFee;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double getOverdraftFee() {
        return overdraftFee;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract void withdrawal(double amount);

    public abstract void deposit(double amount);

    @Override
    public String toString() {
        return "Account Number: " + accountNumber + "\n" +
                "Account Type: " + accountType + "\n" +
                "Service Fee: " + serviceFee + "\n" +
                "Interest Rate: " + interestRate + "\n" +
                "Overdraft Fee: " + overdraftFee + "\n" +
                "Balance: " + balance;
    }
}

