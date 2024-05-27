
public class User {
    private String name;
    private String userNameString;
    private String userPasswordString;

    public User(String name) {
        this.name = name;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public String getUserNameString() {
        return userNameString;
    }

    public String getUserPasswordString() {
        // Return the hashed password
        return hashPassword(userPasswordString);
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    // Methods

    private static String hashPassword(String password) {
        // Hash the password with a simple hash function inbuilt in Java
        return Integer.toString(password.hashCode());
    }

    public boolean verifyPassword(String password) {
        return hashPassword(password).equals(this.userPasswordString);
    }

}
