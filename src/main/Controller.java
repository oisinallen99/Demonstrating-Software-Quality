package main;

import java.util.ArrayList;

public class Controller {

    public Student createStudent(String name){
        ArrayList<Ruberic> ruberics = new ArrayList<>();
        Student myStudent = new Student(name, ruberics);
        return myStudent;
    }

    public Ruberic createRuberic(String title, ArrayList<Criterion> criteria){
        Ruberic myRuberic = new Ruberic(title, criteria);
        return myRuberic;
    }

    public Criterion createCriterion(String name, int grade){
        Criterion myCriterion = new Criterion(name, grade);
        return myCriterion;
    }

    public void addCriterion(Ruberic ruberic, Criterion criterion){
        ruberic.addCriterion(criterion);
    }

    public void addRuberic(Student student, Ruberic ruberic){
        student.addRuberic(ruberic);
    }

    public Ruberic getARuberic(ArrayList<Ruberic> ruberics, String name){
        Ruberic myRuberic = new Ruberic("title", new ArrayList<Criterion>());
        for (int i = 0; i < ruberics.size(); i++){
            if (ruberics.get(i).getTitle().equalsIgnoreCase(name)){
                myRuberic = ruberics.get(i);
            }
        }
        return myRuberic;
    }

    public ArrayList<Ruberic> getAllRuberics(ArrayList<Ruberic> ruberics){
        return ruberics;
    }

}
