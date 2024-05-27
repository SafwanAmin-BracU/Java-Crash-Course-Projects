/**
 * Employee
 */
public class Employee extends User {
    private String employeeId;
    private String designation;

    public Employee(String name, String employeeId, String designation) {
        super(name);
        this.employeeId = employeeId;
        this.designation = designation;
    }

    // Getters
    public String getEmployeeId() {
        return this.employeeId;
    }

    public String getDesignation() {
        return this.designation;
    }

}
