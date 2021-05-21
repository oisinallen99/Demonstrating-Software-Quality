package main;

import java.util.ArrayList;

public class Ruberic {
    String title;
    ArrayList<Criterion> criteria = new ArrayList<>();

    public Ruberic(String title,ArrayList<Criterion> criteria){
        this.title = title;
        this.criteria = criteria;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null) {
            this.title = title;
        } else {
            throw new NullPointerException("Title must not be null");
        }
    }

    public ArrayList<Criterion> getCriteria() {
        return criteria;
    }

    public void setCriteria(ArrayList<Criterion> criteria) {
        if (!criteria.isEmpty()) {
            this.criteria = criteria;
        } else {
            throw new NullPointerException("Criteria must not be empty");
        }
    }

    public void addCriterion(Criterion criterion){
        if (this.criteria.size() > 10){
            throw new ArrayIndexOutOfBoundsException("There cannot be more than 10 Criteria");
        } else {
            if (criterion != null) {
                this.criteria.add(criterion);
            } else {
                throw new NullPointerException("Criterion must not be null");
            }
        }
    }
}
