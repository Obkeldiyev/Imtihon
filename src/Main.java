import modul.*;
import service.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerStr = new Scanner(System.in);

        TeacherService teacherService = new TeacherService();
        LearningCentreService learningCentreService = new LearningCentreService();
        StudentsService studentsService = new StudentsService();
        GroupService groupService = new GroupService();
        CheckStudentsService checkStudentsService = new CheckStudentsService();

        int stepCode = 100;
        while (stepCode != 0) {
            System.out.println("1.Add learning center, 2.Login learning center, 0.Exit");
            stepCode = scannerInt.nextInt();
            LearningCentre currentCenter = null;
            switch (stepCode) {
                case 1 -> {
                    System.out.println("Please enter your learning center name");
                    String name = scannerStr.nextLine();

                    System.out.println(LearningCentreService.addCenter(name));
                }
                case 2 -> {
                    System.out.println("Please enter your learning center name");
                    String name = scannerStr.nextLine();

                    currentCenter = LearningCentreService.getCentre(name);
                    if (currentCenter == null) {
                        System.out.println("Please you should register.");
                    } else {
                        int stepCode1 = 100;
                        while (stepCode != 0) {
                            System.out.println("1.Add group, 2.Login group, 0.Exit.");
                            stepCode1 = scannerInt.nextInt();
                            boolean groupCurrent = false;
                            Group groupCurr = null;
                            switch (stepCode1) {
                                case 1 -> {
                                    System.out.println("Please enter your group name.");
                                    String groupName = scannerStr.nextLine();

                                    System.out.println("Please enter your learning center.");
                                    String centerName = scannerStr.nextLine();

                                    System.out.println("please enter teacher full name.");
                                    String teachName = scannerStr.nextLine();

                                    groupCurrent = GroupService.addGroup(groupName, centerName, teachName);
                                    if (groupCurrent != false) {
                                        System.out.println(true);
                                    } else {
                                        System.out.println("We haven't this teacher or learning center.");
                                    }
                                }
                                case 2 -> {
                                    System.out.println("Please enter your group name.");
                                    String groupName = scannerStr.nextLine();

                                    System.out.println("Please enter your learning center.");
                                    String centerName = scannerStr.nextLine();

                                    System.out.println("please enter teacher full name.");
                                    String teachName = scannerStr.nextLine();

                                    groupCurr = GroupService.getGroup(groupName, centerName, teachName);
                                    if (groupCurr == null) {
                                        System.out.println("We haven't this group.");
                                    } else {
                                        int stepCode3 = 100;
                                        while (stepCode3 != 0) {
                                            System.out.println("1.Add teacher, 2.login teacher,  3.Add student, 4.login student, 5.Check students, 0.Exit");
                                            stepCode3 = scannerInt.nextInt();
                                            switch (stepCode3) {
                                                case 1 -> {
                                                    System.out.println("Enter your name.");
                                                    String n = scannerStr.nextLine();

                                                    System.out.println("Enter your password.");
                                                    String p = scannerStr.nextLine();

                                                    System.out.println("enter your phone number.");
                                                    String ph = scannerStr.nextLine();

                                                    System.out.println(TeacherService.addTeacher(n, p, ph));
                                                }
                                                case 2 -> {
                                                    System.out.println("Enter your name.");
                                                    String n = scannerStr.nextLine();

                                                    System.out.println("Enter your password.");
                                                    String p = scannerStr.nextLine();

                                                    System.out.println("enter your phone number.");
                                                    String ph = scannerStr.nextLine();

                                                    System.out.println(TeacherService.login(n, p));
                                                }
                                                case 3 -> {
                                                    System.out.println("Enter your name.");
                                                    String n = scannerStr.nextLine();

                                                    System.out.println("Enter your password.");
                                                    String p = scannerStr.nextLine();

                                                    System.out.println("enter your phone number.");
                                                    String ph = scannerStr.nextLine();

                                                    System.out.println("enter your group.");
                                                    String g = scannerStr.nextLine();

                                                    System.out.println(StudentsService.addStudent(n, p, ph, g));
                                                }

                                                case 4 ->{
                                                    System.out.println("Enter your name.");
                                                    String n = scannerStr.nextLine();

                                                    System.out.println("Enter your password.");
                                                    String p = scannerStr.nextLine();

                                                    System.out.println("enter your group.");
                                                    String ph = scannerStr.nextLine();

                                                    System.out.println(StudentsService.login(n, p, ph));
                                                }
                                                case 5 ->{
                                                    System.out.println("Enter your name.");
                                                    String n = scannerStr.nextLine();

                                                    System.out.println("Enter your student.");
                                                    String p = scannerStr.nextLine();

                                                    System.out.println("enter your ball.");
                                                    String ph = scannerStr.nextLine();

                                                    System.out.println(CheckStudentsService.checkStudents(n, p, ph));
                                                }
                                            }
                                        }

                                    }
                                }

                            }
                        }
                    }
                }
            }
        }
    }
}