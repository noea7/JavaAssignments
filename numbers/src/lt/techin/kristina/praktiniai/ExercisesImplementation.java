package lt.techin.kristina.praktiniai;

import lt.itakademija.exam.Exercises;
import lt.itakademija.exam.IntegerGenerator;
import lt.itakademija.exam.NumberFilter;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ExercisesImplementation implements Exercises {
    @Override
    public Integer findSmallest(List<Integer> numbers) {
        return numbers.stream().min((int1,int2)->int1-int2).orElse(0);
    }

    @Override
    public Integer findLargest(List<Integer> numbers) {
        return numbers.stream().max((int1,int2)->int1-int2).orElse(0);
    }

    @Override
    public boolean isEqual(Object o, Object o1) {
        return o.equals(o1);
    }

    @Override
    public boolean isSameObject(Object o, Object o1) {
        return o==o1;
    }

    @Override
    public List<Integer> consume(Iterator<Integer> iterator) {

        List<Integer> integerList = new ArrayList<>();
        iterator.forEachRemaining(integerList::add);
        return integerList;
    }

    @Override
    public int computeSumOfNumbers(int number) {

        return IntStream.rangeClosed(1,number).sum();
    }

    @Override
    public int computeSumOfNumbers(int number, NumberFilter numberFilter) {

        return IntStream.rangeClosed(1, number).filter(numberFilter::accept).sum();
    }

    @Override
    public List<Integer> computeNumbersUpTo(int number) {

        return IntStream.range(1,number).boxed().collect(Collectors.toList());
    }

    @Override
    public Map<Integer, Integer> countOccurrences(List<Integer> numbers) {

        return numbers.stream().collect(Collectors.groupingBy(number -> number, Collectors.summingInt(number -> 1)));
    }

    @Override
    public IntegerGenerator createIntegerGenerator(int i, int i1) {
        return new IntegerGeneratorImplementation(i,i1);
    }

    @Override
    public IntegerGenerator createFilteredIntegerGenerator(IntegerGenerator integerGenerator, NumberFilter numberFilter) {
        return new FilteredNumberGenerator(integerGenerator,numberFilter);
    }
}
