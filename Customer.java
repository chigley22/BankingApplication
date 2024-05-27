public class Customer {

    private String customerId;
    private String customerSSN;
    private String lastName;
    private String firstName;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private Account account;

    public Customer(String customerId, String customerSSN, String lastName, String firstName, String street, String city, String state, String zip, String phone, Account account) {

        this.customerId = customerId;
        this.customerSSN = customerSSN;
        this.lastName = lastName;
        this.firstName = firstName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.account = account;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerSSN() {
        return customerSSN;
    }

    public void setCustomerSSN(String customerSSN) {
        this.customerSSN = customerSSN;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street =street ;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String toString() {
        return "Customer ID: " + customerId + "\n" +
        "SSN: " + customerSSN + "\n" +
        "Last Name: " + lastName + "\n" +
        "First Name: " + firstName + "\n" +
        "Street: " + street + "\n" +
        "City: " + city + "\n" +
        "State: " + state + "\n" +
        "Zip: " + zip + "\n" +
        "Phone: " + phone +
        "Account: " + (account != null ? account.toString() : "No account");
    }
    
}
