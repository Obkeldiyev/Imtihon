package service;

import modul.Students;

public class StudentsService {
    private static Students[] studentList = new Students[10000];
    private static int index = 0;

    public static boolean addStudent(String fullName, String password, String phoneNumber, String group){
        Students students = getCheckStudent(fullName);
        if(students != null){
            return false;
        }
        studentList[index++] = new Students(fullName, password, phoneNumber, group);
        return true;
    }

    public static Students login(String fullName, String password, String group){
        for(Students students: studentList){
            if(students != null){
                if(students.getFullName().equals(fullName) &&
                students.getPassword().equals(password) && students.getGroup().equals(group)){
                    return students;
                }
            }
        }
        return null;
    }

    public static Students getCheckStudent(String fullName){
        for(Students students: studentList){
            if(students != null){
                if(students.getFullName().equals(fullName)){
                    return students;
                }
            }
        }
        return null;
    }
}
