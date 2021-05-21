package test;

import main.Criterion;
import main.Ruberic;
import main.Student;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class StudentTest {

    ArrayList<Ruberic> ruberics = new ArrayList<>();
    ArrayList<Criterion> criteria = new ArrayList<>();

    @Test
    public void testGetName() {
        Student myStudent = new Student("Oisin", ruberics);
        assertEquals("Oisin", myStudent.getName());
    }

    @Test
    public void testSetNameException() {
        Student myStudent = new Student("Oisin", ruberics);
        try {
            myStudent.setName(null);
        } catch (NullPointerException exception){
            assertEquals("Name must not be null", exception.getMessage());
        }
    }

    @Test
    public void testGetRuberics() {
        Ruberic ruberic = new Ruberic("Python", criteria);
        ruberics.add(ruberic);
        Student myStudent = new Student("Oisin", ruberics);
        assertEquals(ruberics, myStudent.getRuberics());
    }

    @Test
    public void testSetRubericsException() {
        Ruberic ruberic = new Ruberic("Python", criteria);
        ruberics.add(ruberic);
        Student myStudent = new Student("Oisin", ruberics);
        try {
            myStudent.setRuberics(ruberics);
        } catch (NullPointerException exception){
            assertEquals("Ruberics must not be empty", exception.getMessage());
        }
    }

    @Test
    public void testAddRubericException() {
        Ruberic ruberic = null;
        Student myStudent = new Student("Oisin", ruberics);
        try {
            myStudent.addRuberic(ruberic);
        } catch (NullPointerException exception){
            assertEquals("Ruberic must not be null", exception.getMessage());
        }
    }

    @Test
    public void testGetARubric(){
        Criterion myCriteria = new Criterion("Design", 0);
        criteria.add(myCriteria);
        Ruberic ruberic1 = new Ruberic("Python", criteria);
        Ruberic ruberic2 = new Ruberic("Java", criteria);
        ruberics.add(ruberic1);
        ruberics.add(ruberic2);
        Student myStudent = new Student("Oisin", ruberics);
        assertEquals(ruberic1, myStudent.getARuberic("Python",ruberics));
    }
}
