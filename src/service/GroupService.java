package service;

import modul.Group;

public class GroupService {
    private static Group[] groupList =  new Group[500];
    private static int index = 0;
    private static int GroupNum = 0;
    private static int place = 30;

    public static boolean addGroup(String groupName, String centerName, String teacher){
        Group group = getCheckGroup(centerName, groupName, teacher);
        if(group != null){
            return false;
        }
        groupList[index++] = new Group(groupName, centerName, teacher);
        place--;
        GroupNum++;
        if(place == 0){
            return false;
        }
        return true;
    }

    public static Group getGroup(String groupName, String centerName, String teacher){
        for(Group group: groupList){
            if(group != null){
                if(group.getGroupName().equals(groupName)
                   && group.getCenterName().equals(centerName)
                   && group.getTeacher().equals(teacher)){
                    return group;
                }
            }
        }
        return null;
    }

    public static Group getCheckGroup(String learningCentre, String groupName, String groupNum){
        for(Group group: groupList){
            if(group != null){
                if(group.getGroupName().equals(groupName) && group.getCenterName().equals(learningCentre)){
                    return group;
                }
            }
        }
        return null;
    }
}
