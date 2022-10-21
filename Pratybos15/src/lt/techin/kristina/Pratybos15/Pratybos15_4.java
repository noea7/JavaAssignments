package lt.techin.kristina.Pratybos15;

import java.util.Arrays;

public class Pratybos15_4 {
    public static void main(String[] args) {
        Vector vector1 = new Vector(1,2,3);
        System.out.println(vector1);
        System.out.println(vector1.calculateLength());
        Vector vector2 = new Vector(1,2,5);
        System.out.println(vector1.scalarMultiplication(vector2));
        System.out.println(vector1.calculateAngle(vector2));
        Vector vector3 = vector1.addVector(vector2);
        System.out.println(vector3);
        System.out.println(vector1.subtractVector(vector2));
        Vector[] vectors = Vector.generateRandomVectors(3);
        System.out.println(Arrays.toString(vectors));
    }
}
