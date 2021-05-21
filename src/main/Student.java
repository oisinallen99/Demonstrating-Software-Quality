package main;

import java.util.ArrayList;

public class Student {
    String name;
    ArrayList<Ruberic> ruberics = new ArrayList<>();

    public Student(String name, ArrayList<Ruberic> ruberics){
        this.name = name;
        this.ruberics = ruberics;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            throw new NullPointerException("Name must not be null");
        }
    }

    public ArrayList<Ruberic> getRuberics() {
        return ruberics;
    }

    public void setRuberics(ArrayList<Ruberic> ruberics) {
        if (!ruberics.isEmpty()) {
            this.ruberics = ruberics;
        } else {
            throw new NullPointerException("Ruberics must not be empty");
        }
    }

    public void addRuberic(Ruberic ruberic){
            if (ruberic != null) {
                this.ruberics.add(ruberic);
            } else {
                throw new NullPointerException("Ruberic must not be null");
            }
    }
}
