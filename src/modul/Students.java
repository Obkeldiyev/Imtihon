package modul;

import java.util.UUID;

public class Students {
    private UUID id;
    private static String fullName;
    private String phoneNumber;
    private String password;
    private String daily = CheckStudents.getChecking();
    private String group = Group.getGroupName();

    public Students() {
    }

    public Students(UUID id) {
        this.id = UUID.randomUUID();
    }

    public Students(String fullName, String phoneNumber, String password, String group) {
        this();
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.group = group;
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

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getDaily() {
        return daily;
    }

    public void setDaily(String daily) {
        this.daily = daily;
    }
}
