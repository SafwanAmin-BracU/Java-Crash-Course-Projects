/**
 * Customer
 */

public class Customer extends User {
    private String address;
    private String phoneNumber;

    public Customer(String name, String address, String phoneNumber) {
        super(name);
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Getters
    public String getAddress() {
        return this.address;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    // Setters
    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Methods
    public void displayCustomerDetails() {
        System.out.println("Name: " + this.getName());
        System.out.println("Address: " + this.address);
        System.out.println("Phone Number: " + this.phoneNumber);
    }

}
