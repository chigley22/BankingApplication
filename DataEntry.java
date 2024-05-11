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
            if (input.isEmpty()) {
                System.out.println("Input cannot be empty:");
            } else if (input.length() > limit) {
                System.out.println("Please enter a string with a maximum length of " + limit + ":");
            }
        } while (input.isEmpty() || input.length() > limit);
        return input;
    }
    

    public static String enterSSN() {
        String input;
        do {
            input = scanner.nextLine();
            if (!input.matches("[0-9]{9}")) {
                System.out.println("Please enter 9 numbers only:");
            }
        }while (!input.matches("[0-9]{9}"));
        return input;
    }

    public static String enterZip() {
        String input;
        do {
            input = scanner.nextLine();
            if (!input.matches("[0-9]{5}")) {
                System.out.println("Please enter 5 numbers only:");
            }
        }while (!input.matches("[0-9]{5}"));
        return input;
    }

    public static String enterPhone() {
        String input;
        do {
            input = scanner.nextLine();
            if (!input.matches("[0-9]{10}")) {
                System.out.println("Please enter 10 digit number no dashes:");
            }
        }while (!input.matches("[0-9]{10}"));
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
    public static String enterCustomerId() {
        String customerId;
        do {
            customerId = scanner.nextLine().trim();
            if (customerId.isEmpty()) {
                System.out.println("Customer ID cannot be blank.");
            } else if (customerId.length() > 5) {
                System.out.println("Customer ID must be at most 5 characters.");
            }
        } while (customerId.isEmpty() || customerId.length() > 5);
        return customerId;
    }

    public static Customer enterCustomer() {
        System.out.println("Enter Customer ID: ");
        String customerId = enterCustomerId();

        System.out.println("Enter Customer SSN (Numbers Only): ");
        String customerSSN = enterSSN();

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
        String zip = enterZip();

        System.out.println("Enter Customer Phone Number (Number Only)");
        String phone = enterPhone();

        return new Customer(customerId, customerSSN, lastName, firstName, street, city, state, zip, phone);
    }
    

    public static Account enterAccount() {
        System.out.println("Enter Account Number (max 5 characters): ");
        String accountNumber = enterStringWithLimit(5);

        System.out.println("Enter Account Type (CHK or SAV): ");
        String accountType;
        do {
            accountType = enterString().toUpperCase();
            if (!accountType.equals("CHK") && !accountType.equals("SAV")) {
                System.out.println("Account Type must be CHK or SAV.");
            }
        } while (!accountType.equals("CHK") && !accountType.equals("SAV"));

        System.out.println("Enter Service Fee (0.00 - 10.00): ");
        double serviceFee = enterDoubleWithRange(0.00, 10.00);

        System.out.println("Enter Interest Rate (0.00 - 10.00): ");
        double interestRate = enterDoubleWithRange(0.00, 10.00);

        System.out.println("Enter Overdraft Fee: ");
        double overdraftFee = enterDouble();

        return new Account(accountNumber, accountType, serviceFee, interestRate, overdraftFee);
    }   
}
