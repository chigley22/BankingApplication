public class BankAcctApp {
    public static void main(String[] args) {
        Customer customer1 = DataEntry.enterCustomer();
        Customer customer2 = DataEntry.enterCustomer();

        System.out.println("Customer Information:");
        System.out.println("Customer 1:");
        System.out.println(customer1.toString());
        System.out.println("Customer 2:");
        System.out.println(customer2.toString());

        Account account1 = DataEntry.enterAccount();
        Account account2 = DataEntry.enterAccount();

        System.out.println("Account Information:");
        System.out.println("Account 1:");
        System.out.println(account1.toString());
        System.out.println("Account 2:");
        System.out.println(account2.toString());
    }
}
