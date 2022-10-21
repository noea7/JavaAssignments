package lt.techin.kristina.Pratybos15;

import java.util.Random;

public class Vector {

    private int x;
    private int y;
    private int z;


    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double calculateLength() {
        return Math.sqrt(x*x + y*y + z*z);
    }

    public double calculateAngle(Vector vector) {
        double cosA = (this.x * vector.x + this.y * vector.y + this.z * vector.z) / (Math.sqrt(this.x * this.x + this.y
                * this.y + this.z * this.z) * Math.sqrt(vector.x * vector.x + vector.y * vector.y + vector.z * vector.z));
        return Math.acos(cosA) * 180 / Math.PI;
    }

    public double scalarMultiplication(Vector vector) {
        return (this.x * vector.x + this.y * vector.y + this.z * vector.z);
    }

    public Vector addVector(Vector vector) {
        int resultX = this.x + vector.x;
        int resultY = this.y + vector.y;
        int resultZ = this.z + vector.z;
        return new Vector (resultX, resultY, resultZ);
    }

    public Vector subtractVector(Vector vector) {
        int resultX = this.x - vector.x;
        int resultY = this.y - vector.y;
        int resultZ = this.z - vector.z;
        return new Vector (resultX, resultY, resultZ);
    }

    public static Vector[] generateRandomVectors (int n) {
        Random random = new Random();
        Vector[] result = new Vector[n];
        for (int i = 0; i < n; i++) {
            int resultX = random.nextInt(100);
            int resultY = random.nextInt(100);
            int resultZ = random.nextInt(100);
            result[i] = new Vector(resultX, resultY, resultZ);
        }
        return result;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}
