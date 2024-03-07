/**
 * Geometry3D
 */
public class Geometry3D {

    public static void main(String[] args) {

    }

    // Calculate volume for cuboid
    public static float cuboidVolume(float length, float width, float height) {
        float volume = length * width * height;
        return volume;
    }

    // Calculate surface area of cuboid
    public static float cuboidSurface(float length, float width, float height) {
        float one = 2 * length * width;
        float two = 2 * width * height;
        float three = 2 * length * height;

        return one + two + three;
    }

    // Calculate volume of a squared based pyramid
    public static float squaredPyramidVolume(float baseLength, float height) {
        float baseArea = baseLength * baseLength;
        return (baseArea * height) / 3;
    }

    // Calculate the surface area of a squared pyramid
    public static float squaredPyramidArea(float baseLength, float height) {
        float baseArea = baseLength * baseLength;
        float heightArea = height * height;
        float slantHeight = (float) Math.sqrt(baseArea + 4 * heightArea);
        float lateralArea = baseLength * slantHeight;
        return baseArea + lateralArea;
    }

    // Calculate the volume of a tetrahedron
    public static float tetrahedronVolume(float sideLength) {
        return ((float) Math.pow(sideLength, 3)) / (6 * (float) Math.sqrt(2));
    }
}
