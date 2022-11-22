package lt.techin.kristina.praktiniai;

import lt.itakademija.exam.Exercises;
import lt.itakademija.exam.test.BaseTest;

public class TestImplementation extends BaseTest {
    @Override
    protected Exercises createExercises() {
        return new ExercisesImplementation();
    }
}
