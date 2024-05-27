
/**
 * Bank
 */

public class Bank {

    public String bankName;
    public String bankAddress;

    private Customer[] customers;
    private Employee[] employees;

    private int numberOfCustomers() {
        return this.customers.length;
    }

    private int numberOfEmployees() {
        return this.employees.length;
    }

    public void addCustomer(Customer customer) {
        this.customers[this.numberOfCustomers()] = customer;
        // Output message
        System.out.println("Customer added successfully!");
    }

}
