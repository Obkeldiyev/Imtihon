package service;

import modul.Group;
import modul.LearningCentre;
import modul.Teacher;

public class LearningCentreService{
    private static LearningCentre[] learningCentreList = new LearningCentre[100];
    private Group[] groups = new Group[500];
    private static int index = 0;
    private int index1 = 0;

    public static boolean addCenter(String name){
        LearningCentre learningCentre = getCheckCenter(name);
        if(learningCentre != null){
            return false;
        }
        learningCentreList[index++] = new LearningCentre(name);
        return true;
    }

    public static LearningCentre getCentre(String name){
        for (LearningCentre learningCentre: learningCentreList) {
            if(learningCentre != null){
                if(learningCentre.getName().equals(name)){
                    return learningCentre;
                }
            }
        }
        return null;
    }

    public static LearningCentre getCheckCenter(String name){
        for(LearningCentre learningCentre: learningCentreList){
            if(learningCentre != null){
                if(learningCentre.getName().equals(name)){
                    return learningCentre;
                }
            }
        }
        return null;
    }

}
