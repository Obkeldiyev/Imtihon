package modul;

public class CheckStudents {
    private String studentName = Students.getFullName();
    private String teacherName = Teacher.getFullName();
    private static String checking;

    public CheckStudents() {
    }

    public CheckStudents(String studentName, String teacherName, String checking) {
        this.studentName = studentName;
        this.teacherName = teacherName;
        this.checking = checking;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public static String getChecking() {
        return checking;
    }

    public void setChecking(String checking) {
        this.checking = checking;
    }
}
