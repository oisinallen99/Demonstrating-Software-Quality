package main;

public class Criterion {
    String name;
    int grade;

    public Criterion(String name, int grade){
        this.name = name;
        this.grade = grade;
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

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade > 0 || grade < 6) {
            this.grade = grade;
        }else {
            throw new NullPointerException("Grade must be between 1-5");
        }
    }
}
