package addressbook.model;

public class ContactData {
    private final String name;
    private final String surname;
    private final String mobile;

    public ContactData(String name, String surname, String mobile) {
        this.name = name;
        this.surname = surname;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMobile() {
        return mobile;
    }
}
