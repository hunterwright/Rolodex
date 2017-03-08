/**
 * Stores first name ,last name, addrsess, and phone number of contacts,
 */
public class Person {
    private String firstName = "";
    private String lastName = "";
    private String phoneNumber = "";
    private String address = "";

    public Person(String fName, String lName, String phoneNum, String address) {
        this.firstName = fName;
        this.lastName = lName;
        this.phoneNumber = phoneNum;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return lastName + "," + firstName;
    }
}
