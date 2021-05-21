package test;

import main.Criterion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CriterionTest {

    @Test
    public void testGetName() {
        Criterion myCriterion = new Criterion("Design", 3);
        assertEquals("Design", myCriterion.getName());

    }

    @Test
    public void testSetNameException() {
        Criterion myCriterion = new Criterion("", 3);
        try {
            myCriterion.setName(null);
        } catch (NullPointerException exception){
            assertEquals("Name must not be null", exception.getMessage());
        }
    }

    @Test
    public void testGetGrade() {
        Criterion myCriterion = new Criterion("Design", 3);
        assertEquals(3, myCriterion.getGrade());

    }

    @Test
    public void testSetGradeException() {
        Criterion myCriterion = new Criterion("", 6);
        try {
            myCriterion.setGrade(6);
        } catch (NullPointerException exception){
            assertEquals("Grade must be between 1-5", exception.getMessage());
        }
    }
}
