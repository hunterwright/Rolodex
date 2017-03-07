/**
 * Stores first name ,last name, addrsess, and phone number of contacts,
 */
public class Person {
    String firstName = "";
    String lastName = "";
    String phoneNumber = "";
    String address = "";

    public Person(String fName, String lName, String phoneNum, String address) {
        this.firstName = fName;
        this.lastName = lName;
        this.phoneNumber = phoneNum;
        this.address = address;
    }

    private String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String getPhoneNumber() {
        return phoneNumber;
    }

    private void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private String getAddress() {
        return address;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return lastName + "," + firstName;
    }
}
