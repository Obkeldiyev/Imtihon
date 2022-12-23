package modul;

import java.util.UUID;

public class Teacher {
    private UUID id;
    private static String fullName;
    private String group = Group.getGroupName();
    private String phoneNumber;
    private String password;

    public Teacher(String fullName, String phoneNumber, String password) {
    }

    public Teacher(UUID id) {
        this.id = UUID.randomUUID();
    }

    public Teacher(String fullName, String group, String phoneNumber, String password) {
        this(fullName, phoneNumber, password);
        this.fullName = fullName;
        this.group = group;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public static String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
