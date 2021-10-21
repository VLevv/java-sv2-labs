package looptypes;

import java.util.Arrays;
import java.util.List;

public class StudyGroup {
    void printStudyGroups(List<String> students){
        String under="";
        String over="";
        for(String letters:students){
            if(letters.length()<=10){
                under+=(letters+"   ");
            }
            else {
                over+=(letters+"   ");
            }
        }
        System.out.println("Rövid nevű emberek: "+under);
        System.out.println("Hosszú nevű emberek: "+over);
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jakab Ábel", "Bornemissza Gergely", "Ács Ferenc");
        StudyGroup studyGroup = new StudyGroup();
        studyGroup.printStudyGroups(names);
    }
}
