package ua.ithilell.hw3;

public class Employee {

    private final String lastName;

    private final String firstName;

    private final String middleName;

    private final String position;

    private final String email;

    private final String phone;

    private final short age;

    public Employee(String lastName,
                    String firstName,
                    String middleName,
                    String position,
                    String email,
                    String phone,
                    short age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public short getAge() {
        return age;
    }

}
