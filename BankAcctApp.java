import java.util.Scanner;

public class BankAcctApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create customers with accounts
        Customer customer1 = createCustomerWithAccount(scanner);
        Customer customer2 = createCustomerWithAccount(scanner);

        // Display customer details
        System.out.println("\nCustomer 1 Details:");
        System.out.println(customer1);

        System.out.println("\nCustomer 2 Details:");
        System.out.println(customer2);

        // Perform transactions
        performTransactions(scanner, customer1);
        performTransactions(scanner, customer2);

        scanner.close();
    }

    public static Customer createCustomerWithAccount(Scanner scanner) {
        // Use DataEntry methods to get customer and account details
        System.out.println("Enter details for the new customer:");

        Customer customer = DataEntry.enterCustomer();
        Account account = null;

        while (account == null) {
            try {
                account = DataEntry.enterAccount();
            } catch (Exception e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }

        customer.setAccount(account);

        return customer;
    }

    public static void performTransactions(Scanner scanner, Customer customer) {
        Account account = customer.getAccount();

        // Example transactions
        System.out.println("\nPerforming transactions for Customer ID: " + customer.getCustomerId());

        // Deposit transaction
        System.out.println("Enter deposit amount: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);
        System.out.println("Deposited: $" + depositAmount);
        printTransactionDetails(customer, account, "DEP", depositAmount);

        // Withdrawal transaction
        System.out.println("Enter withdrawal amount: ");
        double withdrawalAmount = scanner.nextDouble();
        account.withdrawal(withdrawalAmount);
        System.out.println("Withdrew: $" + withdrawalAmount);
        printTransactionDetails(customer, account, "WTH", withdrawalAmount);

        // Apply interest
        if (account instanceof CheckingAccount) {
            ((CheckingAccount) account).applyInterest();
        } else if (account instanceof SavingsAccount) {
            ((SavingsAccount) account).applyInterest();
        }
        System.out.println("Applied interest.");
        printTransactionDetails(customer, account, "INT", 0);
    }

    public static void printTransactionDetails(Customer customer, Account account, String transactionType, double amount) {
        System.out.println("Customer ID: " + customer.getCustomerId());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Type: " + account.getAccountType());
        System.out.println("Transaction Type: " + transactionType);
        System.out.println("Transaction Amount: $" + amount);
        System.out.println("Service Fee: $" + account.getServiceFee());
        if (transactionType.equals("WTH") && account.getBalance() < 0) {
            System.out.println("Overdraft Fee: $" + account.getOverdraftFee());
        }
        System.out.println("Balance: $" + account.getBalance());
    }
}



