import java.util.Scanner;

public class DataEntry {
    private static Scanner scanner = new Scanner(System.in);

    public static String enterString(){
        return scanner.nextLine();
    }

    public static String enterStringWithLimit(int limit) {
        String input;
        do {
            input = scanner.nextLine();
            if (input.length() > limit) {
                System.out.println("Please enter a maximum length of " + limit + ":");
            }
        }while (input.length() > limit);
        return input;
    }

    public static String enterNumericString() {
        String input;
        do {
            input = scanner.nextLine();
            if (!input.matches("[0-9]+")) {
                System.out.println("Please enter numbers only:");
            }
        }while (!input.matches("[0-9]+"))
        return input;
    }

    public static int enterInt() {
        return scanner.nextInt();
    }

    public static int enterIntWithRange(int min, int max) {
        int input;
        do {
            input = scanner.nextInt();
            if (input < min || input > max) {
                System.out.println("Please enter a minimum of " + min + " but no more than " + max);
            }
        } while (input < min || input > max);
        return input; 
    }

    public static double enterDouble() {
        return scanner.nextDouble();
    }

    public static double enterDoubleWithRange(double min, double max) {
        double input;
        do {
            input = scanner.nextDouble();
            if(input < min || input > max) {
                System.out.println("Please enter a decimal with a minimum of " + min + " but no more than " + max + ".");
            }
        } while (input < min || input > max);
        return input;
    }

    public static String enterDate() {
        System.out.println("Enter date (Format: MM/DD/YYYY): ");
        return scanner.nextLine();
    }

    public static Customer enterCustomer() {
        System.out.println("Enter Customer ID: ");
        String customerId = enterStringWithLimit(5);

        System.out.println("Enter Customer SSN (Numbers Only): ");
        String customerSSN = enterNumericString();

        System.out.println("Enter Customer Last Name: ");
        String lastName = enterStringWithLimit(20);

        System.out.println("Enter Customer First Name: ");
        String firstName = enterStringWithLimit(15);

        System.out.println("Enter Customer Street Address: ");
        String street = enterStringWithLimit(20);

        System.out.println("Enter Customer City: ");
        String city = enterStringWithLimit(20);

        System.out.println("Enter Customer State: ");
        String state = enterStringWithLimit(2);

        System.out.println("Enter Customer Zip Code: ");
        String zip = enterNumericString() + enterIntWithRange(5, 5);

        System.out.println("Enter Customer Phone Number (Number Only)");
        String phone = enterNumericString() + enterIntWithRange(10, 10);

        return new Customer(customerId, customerSSN, lastName, firstName, street, city, state, zip, phone);
    }
    
}
