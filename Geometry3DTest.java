import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Geometry3DTest {
    public static final float EPSILON = 0.1f;

    @Test
    void testCuboidVolume() {

        // Test case one
        float expected = 48.0f;
        float actual = Geometry3D.cuboidVolume(2.0f, 6.0f, 4.0f);
        assertEquals(expected, actual, EPSILON);

        // Test case two
        expected = 528.0f;
        actual = Geometry3D.cuboidVolume(12.0f, 4.0f, 11.0f);
        assertEquals(expected, actual, EPSILON);

        // Test case three
        expected = 165.0f;
        actual = Geometry3D.cuboidVolume(3.0f, 5.0f, 11.0f);
        assertEquals(expected, actual, EPSILON);
    }

}