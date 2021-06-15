import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    Student student1 = new Student(456L, "Savanna");
    Student student2;

    @Test
    public void studentConstructorTest(){
        assertNotNull(student1);
        assertNull(student2);
    }
}
