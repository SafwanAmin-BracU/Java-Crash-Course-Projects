
/**
 * Account
 */

enum AccountType {
    SAVINGS, CURRENT, FIXED_DEPOSIT, RECURRING_DEPOSIT
}

public class Account {
    private String accountNumber;
    private Customer customer;
    private double balance = 0.0;
    private AccountType accountType = AccountType.CURRENT;

    // Getters
    public String getAccountNumber() {
        return this.accountNumber;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    // Setters
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    // Methods
    public void displayAccountDetails() {
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Type: " + this.accountType);
        System.out.println("Balance: " + this.balance);
        System.out.println("Customer: " + this.customer.getName());
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (this.balance - amount >= 0) {
            this.balance -= amount;
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void transfer(Account account, double amount) {
        if (this.balance - amount >= 0) {
            this.balance -= amount;
            account.deposit(amount);
            System.out.println("Transfer successful!");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

}
