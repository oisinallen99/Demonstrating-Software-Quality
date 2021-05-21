package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

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

    public void addGrade(Student student, String title, String name, int grade){
        Ruberic myRuberic = student.getARuberic(title, student.getRuberics());
        Criterion myCriterion = myRuberic.getACriterion(myRuberic.getCriteria(), name);
        myCriterion.setGrade(grade);
    }

    public ArrayList<Integer> allGradesRuberic(ArrayList<Ruberic> ruberics, String title){
        ArrayList<Integer> grades = new ArrayList<>();
        ArrayList<Criterion> criteria = new ArrayList<>();
        int grade = 0;
        for (int i = 0; i < ruberics.size(); i++){
            if (ruberics.get(i).getTitle().equalsIgnoreCase(title)){
               criteria = ruberics.get(i).getCriteria();
            }
        }
        for (int i = 0; i < criteria.size(); i++){
            grade = criteria.get(i).getGrade();
            grades.add(grade);
        }
        return grades;
    }

    public int calculateAverage(ArrayList<Ruberic> ruberics, String title){
        ArrayList<Criterion> criteria = new ArrayList<>();
        int grades = 0;
        int count = 0;
        for (int i = 0; i < ruberics.size(); i++){
            if (ruberics.get(i).getTitle().equalsIgnoreCase(title)){
                criteria = ruberics.get(i).getCriteria();
            }
        }
        for (int i = 0; i < criteria.size(); i++){
            count = criteria.size();
            grades =  grades + criteria.get(i).getGrade();
        }
        return grades/count;
    }

    public double calculateStandardDeviation(ArrayList<Ruberic> ruberics, String title){
        ArrayList<Criterion> criteria = new ArrayList<>();
        ArrayList<Integer> ints = new ArrayList<Integer>();
        ArrayList<Double> doubles = new ArrayList<Double>();
        int grades = 0;
        int count = 0;
        for (int i = 0; i < ruberics.size(); i++){
            if (ruberics.get(i).getTitle().equalsIgnoreCase(title)){
                criteria = ruberics.get(i).getCriteria();
            }
        }
        for (int i = 0; i < criteria.size(); i++){
            count = criteria.size();
            grades =  grades + criteria.get(i).getGrade();
            ints.add(criteria.get(i).getGrade());
        }
        int average = grades/count;

        for (int i = 0; i < ints.size(); i++){
            double d = ints.get(i) - average;
            double d2 = d*d;
            doubles.add(d2);
        }

        double total = 0;

        for (int i = 0; i < doubles.size(); i++){
            total = total + doubles.get(i);
        }

        double totalavg = total/doubles.size();
        double stdev = Math.sqrt(Math.sqrt(totalavg));
        return stdev;
    }

    public int calculateMin(ArrayList<Ruberic> ruberics, String title){
        ArrayList<Integer> grades = new ArrayList<>();
        ArrayList<Criterion> criteria = new ArrayList<>();
        int grade = 0;
        for (int i = 0; i < ruberics.size(); i++){
            if (ruberics.get(i).getTitle().equalsIgnoreCase(title)){
                criteria = ruberics.get(i).getCriteria();
            }
        }
        for (int i = 0; i < criteria.size(); i++){
            grade = criteria.get(i).getGrade();
            grades.add(grade);
        }
        int min = Collections.min(grades);
        return min;
    }

    public int calculateMax(ArrayList<Ruberic> ruberics, String title){
        ArrayList<Integer> grades = new ArrayList<>();
        ArrayList<Criterion> criteria = new ArrayList<>();
        int grade = 0;
        for (int i = 0; i < ruberics.size(); i++){
            if (ruberics.get(i).getTitle().equalsIgnoreCase(title)){
                criteria = ruberics.get(i).getCriteria();
            }
        }
        for (int i = 0; i < criteria.size(); i++){
            grade = criteria.get(i).getGrade();
            grades.add(grade);
        }
        int max = Collections.max(grades);
        return max;
    }

    public int calculateAverageCriterion(ArrayList<Ruberic> ruberics, String title, String name){
        ArrayList<Criterion> criteria = new ArrayList<>();
        int grades = 0;
        int count = 0;
        for (int i = 0; i < ruberics.size(); i++){
            if (ruberics.get(i).getTitle().equalsIgnoreCase(title)){
                criteria = ruberics.get(i).getCriteria();
            }
        }
        for (int i = 0; i < criteria.size(); i++) {
            if (criteria.get(i).getName().equalsIgnoreCase(name)) {
                count ++;
                grades =  grades + criteria.get(i).getGrade();
            }
        }
        return grades/count;
    }

    public double calculateStandardDeviationCriterion(ArrayList<Ruberic> ruberics, String title, String name){
        ArrayList<Criterion> criteria = new ArrayList<>();
        ArrayList<Integer> ints = new ArrayList<Integer>();
        ArrayList<Double> doubles = new ArrayList<Double>();
        int grades = 0;
        int count = 0;
        for (int i = 0; i < ruberics.size(); i++){
            if (ruberics.get(i).getTitle().equalsIgnoreCase(title)){
                criteria = ruberics.get(i).getCriteria();
            }
        }
        for (int i = 0; i < criteria.size(); i++){
            if (criteria.get(i).getName().equalsIgnoreCase(name)) {
                count ++;
                grades = grades + criteria.get(i).getGrade();
                ints.add(criteria.get(i).getGrade());
            }
        }
        int average = grades/count;

        for (int i = 0; i < ints.size(); i++){
            double d = ints.get(i) - average;
            double d2 = d*d;
            doubles.add(d2);
        }

        double total = 0;

        for (int i = 0; i < doubles.size(); i++){
            total = total + doubles.get(i);
        }

        double totalavg = total/doubles.size();
        double stdev = Math.sqrt(Math.sqrt(totalavg));
        return stdev;
    }

    public int calculateMinCriterion(ArrayList<Ruberic> ruberics, String title, String name){
        ArrayList<Integer> grades = new ArrayList<>();
        ArrayList<Criterion> criteria = new ArrayList<>();
        int grade = 0;
        for (int i = 0; i < ruberics.size(); i++){
            if (ruberics.get(i).getTitle().equalsIgnoreCase(title)){
                criteria = ruberics.get(i).getCriteria();
            }
        }
        for (int i = 0; i < criteria.size(); i++){
            if (criteria.get(i).getName().equalsIgnoreCase(name))
            grade = criteria.get(i).getGrade();
            grades.add(grade);
        }
        int min = Collections.min(grades);
        return min;
    }

    public int calculateMaxCriterion(ArrayList<Ruberic> ruberics, String title, String name){
        ArrayList<Integer> grades = new ArrayList<>();
        ArrayList<Criterion> criteria = new ArrayList<>();
        int grade = 0;
        for (int i = 0; i < ruberics.size(); i++){
            if (ruberics.get(i).getTitle().equalsIgnoreCase(title)){
                criteria = ruberics.get(i).getCriteria();
            }
        }
        for (int i = 0; i < criteria.size(); i++){
            if (criteria.get(i).getName().equalsIgnoreCase(name))
            grade = criteria.get(i).getGrade();
            grades.add(grade);
        }
        int max = Collections.max(grades);
        return max;
    }
}
