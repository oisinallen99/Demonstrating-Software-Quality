package test;

import main.Criterion;
import main.Ruberic;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RubericTest {

    ArrayList<Criterion> criteria = new ArrayList<>();

    @Test
    public void testGetTitle() {
        Ruberic myRuberic = new Ruberic("Python", criteria);
        assertEquals("Python", myRuberic.getTitle());
    }

    @Test
    public void testSetTitleException() {
        Ruberic myRuberic = new Ruberic("", criteria);
        try {
            myRuberic.setTitle(null);
        } catch (NullPointerException exception){
            assertEquals("Title must not be null", exception.getMessage());
        }
    }

    @Test
    public void testGetCriteria() {
        Criterion criterion = new Criterion("Design", 3);
        criteria.add(criterion);
        Ruberic myRuberic = new Ruberic("Python", criteria);
        assertEquals(criteria, myRuberic.getCriteria());
    }

    @Test
    public void testSetCriteriaException() {
        Criterion criterion = new Criterion("Design", 3);
        criteria.add(criterion);
        Ruberic myRuberic = new Ruberic("", criteria);
        try {
            myRuberic.setCriteria(criteria);
        } catch (NullPointerException exception){
            assertEquals("Criteria must not be empty", exception.getMessage());
        }
    }

    @Test
    public void testAddCriterionException() {
        Criterion criterion = null;
        Ruberic myRuberic = new Ruberic("", criteria);
        try {
            myRuberic.addCriterion(criterion);
        } catch (NullPointerException exception){
            assertEquals("Criterion must not be null", exception.getMessage());
        }
    }

    @Test
    public void testGetACriterion(){
        Criterion criterion1 = new Criterion("Design", 3);
        Criterion criterion2 = new Criterion("Implementation", 5);
        criteria.add(criterion1);
        criteria.add(criterion2);
        Ruberic myRuberic = new Ruberic("Python", criteria);
        assertEquals("Design", myRuberic.getACriterion(criteria,"Design").getName());
    }
}
