package modul;

import java.util.UUID;

public class Group {
    private UUID id;
    private static String groupName;
    private int groupNum;
    private String centerName;
    private int groupPlace;
    private String teacher = Teacher.getFullName();
    private String groupStudents = Students.getFullName();

    public Group(String groupName, String centreName, String groupNum) {
    }

    public Group(UUID id) {
        this.id = UUID.randomUUID();
    }

    public Group(String groupName, int groupNum, String centerName, int groupPlace) {
        this(groupName, centerName, String.valueOf(groupNum));
        this.groupName = groupName;
        this.groupNum = groupNum;
        this.centerName = centerName;
        this.groupPlace = groupPlace;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public static String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(int groupNum) {
        this.groupNum = groupNum;
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public int getGroupPlace() {
        return groupPlace;
    }

    public void setGroupPlace(int groupPlace) {
        this.groupPlace = groupPlace;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", groupName='" + groupName + '\'' +
                ", groupNum=" + groupNum +
                ", centerName='" + centerName + '\'' +
                ", groupPlace=" + groupPlace +
                ", teacher='" + teacher + '\'' +
                '}';
    }
}
