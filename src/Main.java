public class Main {
/*
Wyatt Compton
3/17/2024
Exercise 08
wyatt is super cool and i guess killoran is too
 */
    public static void main(String[] args) {
        Contacts contact1 = new Email("Wyatt", "WyattC@gmail.com");
        Contacts contact2 = new Phone("Jimmy John", "614-867-5309");

        contact1.contact();
        contact2.contact();
    }
}

abstract class Contacts{
    private String name;
    abstract void contact();

    public Contacts(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Email extends Contacts{
    private String email;

    public Email(String name, String email) {
        super(name);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    void contact() {
        System.out.println("Name: " + super.getName() + " | Email: " + this.email);
    }
}

class Phone extends Contacts{
    private String phoneNumber;

    public Phone(String name, String phoneNumber) {
        super(name);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    void contact() {
        System.out.println("Name: " + super.getName() + " | Phone number: " + this.phoneNumber);
    }
}