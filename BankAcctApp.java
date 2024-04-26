public class BankAcctApp {
    public static void main(String[] args) {
        Customer customer1 = DataEntry.enterCustomer();
        Customer customer2 = DataEntry.enterCustomer();

        System.out.println("Customer Information: " + "\n");
        System.out.println("Customer 1: ");
        System.out.println(customer1.toString() + "\n");
        System.out.println("Customer 2: " + "\n");
        System.out.println(customer2.toString() + "\n");
    }
}