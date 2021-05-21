package test;

import main.Controller;
import main.Criterion;
import main.Ruberic;
import main.Student;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ControllerTest {

    ArrayList<Criterion> criteria = new ArrayList<>();
    ArrayList<Criterion> criteria2 = new ArrayList<>();
    ArrayList<Ruberic> ruberics = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    Controller controller = new Controller();

    @Test
    public void testCreateStudent() {
        Student myStudent = controller.createStudent("Oisin");
        assertEquals("Oisin", myStudent.getName());

    }

    @Test
    public void testCreateRuberic() {
        Ruberic myRuberic = controller.createRuberic("Python", new ArrayList<>());
        assertEquals("Python", myRuberic.getTitle());

    }

    @Test
    public void testCreateCriterion() {
        Criterion myCriterion = controller.createCriterion("Design", 5);
        assertEquals("Design", myCriterion.getName());

    }

    @Test
    public void testAddCriterion() {
        Ruberic myRuberic = controller.createRuberic("Python", new ArrayList<>());
        Criterion myCriterion = controller.createCriterion("Design", 5);
        Criterion myCriterion2 = controller.createCriterion("Implementation", 5);
        controller.addCriterion(myRuberic, myCriterion);
        assertEquals("Design", myCriterion.getName());
    }

    @Test
    public void testAddRuberic() {
        Student myStudent = controller.createStudent("Oisin");
        Ruberic myRuberic = controller.createRuberic("Python", new ArrayList<>());
        Ruberic myRuberic2 = controller.createRuberic("Java", new ArrayList<>());
        controller.addRuberic(myStudent, myRuberic);
        assertEquals("Python", myRuberic.getTitle());
    }

    @Test
    public void testGetARuberic() {
        Ruberic myRuberic = new Ruberic("Python", new ArrayList<>());
        Ruberic myRuberic2 = new Ruberic("Java", new ArrayList<>());
        Ruberic myRuberic3 = new Ruberic("HTML", new ArrayList<>());
        ruberics.add(myRuberic);
        ruberics.add(myRuberic2);
        ruberics.add(myRuberic3);
        assertEquals(myRuberic3, controller.getARuberic(ruberics, "HTML"));
    }

    @Test
    public void testGetAllRuberic() {
        Ruberic myRuberic = new Ruberic("Python", new ArrayList<>());
        Ruberic myRuberic2 = new Ruberic("Java", new ArrayList<>());
        Ruberic myRuberic3 = new Ruberic("HTML", new ArrayList<>());
        ruberics.add(myRuberic);
        ruberics.add(myRuberic2);
        ruberics.add(myRuberic3);
        assertEquals(ruberics, controller.getAllRuberics(ruberics));
    }

    @Test
    public void testAddGrade() {
        Criterion criterion1 = new Criterion("Design",2);
        Criterion criterion2 = new Criterion("Implementation",4);
        criteria.add(criterion1);
        criteria.add(criterion2);

        Ruberic ruberic1 = new Ruberic("Python",criteria);
        Ruberic ruberic2 = new Ruberic("Java", new ArrayList<>());
        ruberics.add(ruberic1);
        ruberics.add(ruberic2);

        Student myStudent = new Student("Oisin", ruberics);
        students.add(myStudent);

        controller.addGrade(myStudent, "Python", "Design", 2);
        assertEquals(2, criterion1.getGrade());
    }

    @Test
    public void testAllGradesRuberic() {
        Criterion criterion1 = new Criterion("Design",2);
        Criterion criterion2 = new Criterion("Implementation",4);
        criteria.add(criterion1);
        criteria.add(criterion2);

        Ruberic ruberic1 = new Ruberic("Python",criteria);
        Ruberic ruberic2 = new Ruberic("Java", new ArrayList<>());
        ruberics.add(ruberic1);
        ruberics.add(ruberic2);

        Student myStudent = new Student("Oisin", ruberics);
        students.add(myStudent);

        controller.addGrade(myStudent, "Python", "Design", 2);
        controller.addGrade(myStudent, "Python", "Implementation", 4);

        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(2);
        grades.add(4);
        assertEquals(grades, controller.allGradesRuberic(ruberics, "Python"));
    }

    @Test
    public void testCalculateAverage() {
        Criterion criterion1 = new Criterion("Design",2);
        Criterion criterion2 = new Criterion("Implementation",2);
        Criterion criterion3 = new Criterion("Testing",4);
        Criterion criterion4 = new Criterion("Documentation",4);
        criteria.add(criterion1);
        criteria.add(criterion2);
        criteria.add(criterion3);
        criteria.add(criterion4);
        Ruberic ruberic1 = new Ruberic("Python",criteria);
        ruberics.add(ruberic1);
        assertEquals(3, controller.calculateAverage(ruberics,"Python"));
    }

    @Test
    public void testCalculateStandardDeviation() {
        Criterion criterion1 = new Criterion("Design",2);
        Criterion criterion2 = new Criterion("Implementation",2);
        Criterion criterion3 = new Criterion("Testing",4);
        Criterion criterion4 = new Criterion("Documentation",4);
        criteria.add(criterion1);
        criteria.add(criterion2);
        criteria.add(criterion3);
        criteria.add(criterion4);
        Ruberic ruberic1 = new Ruberic("Python",criteria);
        ruberics.add(ruberic1);
        assertEquals("1.0", String.valueOf(controller.calculateStandardDeviation(ruberics,"Python")));
    }

    @Test
    public void testCalculateMin() {
        Criterion criterion1 = new Criterion("Design",1);
        Criterion criterion2 = new Criterion("Implementation",2);
        Criterion criterion3 = new Criterion("Testing",4);
        Criterion criterion4 = new Criterion("Documentation",5);
        criteria.add(criterion1);
        criteria.add(criterion2);
        criteria.add(criterion3);
        criteria.add(criterion4);
        Ruberic ruberic1 = new Ruberic("Python",criteria);
        ruberics.add(ruberic1);
        assertEquals(1, controller.calculateMin(ruberics,"Python"));
    }

    @Test
    public void testCalculateMax() {
        Criterion criterion1 = new Criterion("Design",1);
        Criterion criterion2 = new Criterion("Implementation",2);
        Criterion criterion3 = new Criterion("Testing",4);
        Criterion criterion4 = new Criterion("Documentation",5);
        criteria.add(criterion1);
        criteria.add(criterion2);
        criteria.add(criterion3);
        criteria.add(criterion4);
        Ruberic ruberic1 = new Ruberic("Python",criteria);
        ruberics.add(ruberic1);
        assertEquals(5, controller.calculateMax(ruberics,"Python"));
    }

    @Test
    public void testCalculateAverageCriterion() {
        Criterion criterion1 = new Criterion("Design",2);
        Criterion criterion2 = new Criterion("Design",2);
        Criterion criterion3 = new Criterion("Design",4);
        Criterion criterion4 = new Criterion("Design",4);
        Criterion criterion5 = new Criterion("Implementation",5);
        criteria.add(criterion1);
        criteria.add(criterion2);
        criteria.add(criterion3);
        criteria.add(criterion4);
        criteria.add(criterion5);
        Ruberic ruberic = new Ruberic("Python",criteria);
        ruberics.add(ruberic);
        assertEquals(3, controller.calculateAverageCriterion(ruberics,"Python","Design"));
    }

    @Test
    public void testCalculateStandardDeviationCriterion() {
        Criterion criterion1 = new Criterion("Design",2);
        Criterion criterion2 = new Criterion("Design",2);
        Criterion criterion3 = new Criterion("Design",4);
        Criterion criterion4 = new Criterion("Design",4);
        Criterion criterion5 = new Criterion("Implementation",5);
        criteria.add(criterion1);
        criteria.add(criterion2);
        criteria.add(criterion3);
        criteria.add(criterion4);
        criteria.add(criterion5);
        Ruberic ruberic = new Ruberic("Python",criteria);
        ruberics.add(ruberic);
        assertEquals("1.0", String.valueOf(controller.calculateStandardDeviationCriterion(ruberics,"Python", "Design")));
    }

    @Test
    public void testCalculateMinCriterion() {
        Criterion criterion1 = new Criterion("Design",2);
        Criterion criterion2 = new Criterion("Design",3);
        Criterion criterion3 = new Criterion("Design",4);
        Criterion criterion4 = new Criterion("Design",4);
        Criterion criterion5 = new Criterion("Implementation",1);
        criteria.add(criterion1);
        criteria.add(criterion2);
        criteria.add(criterion3);
        criteria.add(criterion4);
        criteria.add(criterion5);
        Ruberic ruberic = new Ruberic("Python",criteria);
        ruberics.add(ruberic);
        assertEquals(2, controller.calculateMinCriterion(ruberics,"Python","Design"));
    }

    @Test
    public void testCalculateMaxCriterion() {
        Criterion criterion1 = new Criterion("Design",2);
        Criterion criterion2 = new Criterion("Design",3);
        Criterion criterion3 = new Criterion("Design",4);
        Criterion criterion4 = new Criterion("Design",4);
        Criterion criterion5 = new Criterion("Implementation",5);
        criteria.add(criterion1);
        criteria.add(criterion2);
        criteria.add(criterion3);
        criteria.add(criterion4);
        criteria.add(criterion5);
        Ruberic ruberic = new Ruberic("Python",criteria);
        ruberics.add(ruberic);
        assertEquals(4, controller.calculateMaxCriterion(ruberics,"Python","Design"));
    }
}
