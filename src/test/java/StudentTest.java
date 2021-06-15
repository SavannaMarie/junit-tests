import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    Student student2;
    Student student1;

    @Before
    public void studentsCreating() {
        student1 = new Student(456L, "Savanna");
        student1.addGrade(100);
        student1.addGrade(87);
        student1.addGrade(75);
        student1.addGrade(98);
        student1.addGrade(90);
    }


    @Test
    public void studentConstructorTest(){
        assertNotNull(student1);
        assertNull(student2);
    }
    @Test
    public void testIfAddGradesWorks(){
        assertEquals(5, student1.getGrades().size());
    }
}
