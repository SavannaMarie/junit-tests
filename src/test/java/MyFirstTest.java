import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class MyFirstTest {

    @Test
    public void isCodeupCodeUp() {
        String expected = "Codeup";
        String commonly = "CodeUp";

//        assertEquals(expected, actual); //test fails because they are not equal
        assertNotEquals(expected, commonly); //test passes b/c they are not equal
    }

    @Test
    public void testIfObjectsAreNotSame() {
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(languages, moreLanguages); //test passes because they are different
    }

    @Test
    public void arraysAreEquals() {
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];

        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers, otherNumbers); //test passes because the arrays are different
    }

    @Test
    public void funWithPHP() {
        String language = "PHP";

        language.contains("H"); // use assertTrue for this statement
        language.contains("J"); // use assertFalse for this statement

        assertTrue("The language contains H",language.contains("H")); //test passes b/c language does have an H
        assertFalse("The language DOES NOT contain J", language.contains("J")); //test passes b/c language DOES NOT have a J
    }
}
