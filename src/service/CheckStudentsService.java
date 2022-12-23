package service;

import modul.CheckStudents;
import modul.Students;

import java.util.concurrent.Callable;

public class CheckStudentsService {
    private static CheckStudents[] checkStudentList = new CheckStudents[10000];
    private static String[] Checking = new String[100];
    private static int index = 0;

    public static boolean checkStudents(String teacherName, String studentName, String checking){
        for(CheckStudents checkStudents:checkStudentList){
            if(checkStudents != null) {
                if (checkStudents.getTeacherName().equals(teacherName)) {
                    if (checkStudents.getStudentName().equals(studentName)) {
                        Checking[index++] = String.valueOf(new CheckStudents(teacherName, studentName, checking));
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
