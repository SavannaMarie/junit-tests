import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CohortTest {

    Cohort emptyCohort;
    Cohort cohortWOne;
    Cohort cohortWMany;

    Student savanna;
    Student marky;
    Student killer;
    Student mark;

    @Before
    public void setup(){

        emptyCohort = new Cohort();
        cohortWOne = new Cohort();
        cohortWMany = new Cohort();

        savanna = new Student(145L, "Savanna");
        marky = new Student(146L, "Marky");
        killer = new Student(148L, "Killer");
        mark = new Student(147L, "Mark");

        savanna.addGrade(100);
        savanna.addGrade(40);

        marky.addGrade(80);
        marky.addGrade(90);


        mark.addGrade(80);
        mark.addGrade(90);


        killer.addGrade(80);
        killer.addGrade(90);

        cohortWOne.addStudent(savanna);

        cohortWMany.addStudent(marky);
        cohortWMany.addStudent(mark);
        cohortWMany.addStudent(killer);
    }

    @Test
    public void addStudentWorks(){
        assertEquals(1, cohortWOne.getStudents().size());
        assertEquals(3, cohortWMany.getStudents().size());
    }

    @Test
    public void getStudentsWork(){
        assertEquals("Mark", cohortWMany.getStudents().get(1).getName());
        assertEquals("Savanna", cohortWOne.getStudents().get(0).getName());
    }

    @Test
    public void cohortAvgWorks(){
        assertEquals(85, cohortWMany.getCohortAverage(), 0);
    }


}
