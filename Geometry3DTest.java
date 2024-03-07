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

    @Test
    void testCuboidSurface() {

        // Test case one
        float expected = 52.0f;
        float actual = Geometry3D.cuboidSurface(2.0f, 3.0f, 4.0f);
        assertEquals(expected, actual, EPSILON);

        // Test case 2
        expected = 214.0f;
        actual = Geometry3D.cuboidSurface(5.0f, 6.0f, 7.0f);
        assertEquals(expected, actual, EPSILON);

        // Test case 3
        expected = 238.0f;
        actual = Geometry3D.cuboidSurface(4.0f, 5.0f, 11.0f);
        assertEquals(expected, actual, EPSILON);
    }

    @Test
    public void testSquaredPyramidVolume() {
        // Test case 1
        double expected = 170.6;
        double actual = Geometry3D.squaredPyramidVolume(8.0f, 8.0f);
        assertEquals(expected, actual, EPSILON);
        
        // Test case 2
        expected = 16.0;
        actual = Geometry3D.squaredPyramidVolume(4.0f, 3.0f);
        assertEquals(expected, actual, EPSILON);
        
        // Test case 3
        expected = 4.0;
        actual = Geometry3D.squaredPyramidVolume(2.0f, 3.0f);
        assertEquals(expected, actual, EPSILON);
    }
}
