package service;

import modul.Teacher;

public class TeacherService {
    private static Teacher[] teacherList = new Teacher[1000];
    private static int index = 0;

    public static boolean addTeacher(String fullName, String phoneNumber, String password){
        Teacher teacher = getCheckTeacher(fullName);
        if(teacher != null){
            return false;
        }
        teacherList[index++] = new Teacher(fullName, phoneNumber, password);
        return true;
    }

    public static Teacher login(String fullName, String password){
        for(Teacher teacher: teacherList){
            if(teacher != null){
                if(teacher.getFullName().equals(fullName) && teacher.getPassword().equals(password)){
                    return teacher;
                }
            }
        }
        return null;
    }

    public static Teacher getCheckTeacher(String fullName){
        for(Teacher teacher:teacherList){
            if(teacher != null){
                if(teacher.getFullName().equals(fullName)){
                    return teacher;
                }
            }
        }
        return null;
    }
}
