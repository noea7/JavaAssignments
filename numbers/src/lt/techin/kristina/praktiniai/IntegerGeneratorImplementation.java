package lt.techin.kristina.praktiniai;

import lt.itakademija.exam.IntegerGenerator;

public class IntegerGeneratorImplementation implements IntegerGenerator {

    private int startNumber;
    private int endNumber;
    private int currentNumber;

    public IntegerGeneratorImplementation(int from, int to) {
        this.startNumber = from;
        this.endNumber = to;
    }

    @Override
    public Integer getNext() {
        Integer nextNumber = null;
        if (startNumber <= endNumber) {
            nextNumber = startNumber;
            startNumber++;
        }
        return nextNumber;
    }
}
